package com.costin.eem.client.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Align;
import com.costin.eem.Config;
import com.costin.eem.client.LocalConnection;
import com.costin.eem.client.MainClient;
import com.costin.eem.utils.LevelLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class MenuScreen extends Screen {
    private static final Logger log = LoggerFactory.getLogger(MenuScreen.class);
    ScrollPane favoritedServersTab, historyServerTab, savedWorldsTab;
    private Stage stage;
    private Skin skin;

    private void refreshSaves() {
        VerticalGroup saveStack = (VerticalGroup) savedWorldsTab.getActor();
        saveStack.clearChildren();
        String[] saveNames = LevelLoader.listSaves();
        for (String saveName : saveNames) {
            HorizontalGroup horizontalGroup = new HorizontalGroup();

            Label text = new Label(saveName, skin);
            text.setAlignment(Align.top);

            Button joinBtn = new Button(skin);
            joinBtn.add("Join");
            joinBtn.addListener(new ClickListener() {
                @Override
                public void clicked(InputEvent event, float x, float y) {
                    try {
                        LocalConnection.instance().startLocalServer(33466, Config.GameData + Config.GameSaves + saveName + ".eelvl");
                        LocalConnection.instance().connectTo(InetAddress.getLoopbackAddress().getHostName(), 33466);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            });

            horizontalGroup.addActor(text);
            horizontalGroup.addActor(joinBtn);

            saveStack.addActor(horizontalGroup);
        }
    }

    @Override
    public void start() {
        if(init) return;
        init = true;
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);

        skin = new Skin(Gdx.files.internal("skin/cloud-form-ui.json"));

        HorizontalGroup tabButtons = new HorizontalGroup();

        Label currentTabName = new Label("Saved worlds", skin);
        currentTabName.setPosition(35, Config.HEIGHT - 100);

        favoritedServersTab = new ScrollPane(new VerticalGroup());
        favoritedServersTab.setPosition(35, 25);
        favoritedServersTab.setVisible(true);
        favoritedServersTab.setSize(235, Config.HEIGHT - 130);

        historyServerTab = new ScrollPane(new VerticalGroup());
        historyServerTab.setPosition(35, 25);
        historyServerTab.setVisible(true);
        historyServerTab.setSize(235, Config.HEIGHT - 130);

        savedWorldsTab = new ScrollPane(new VerticalGroup());
        savedWorldsTab.setPosition(35, 25);
        savedWorldsTab.setVisible(true);
        savedWorldsTab.setSize(235, Config.HEIGHT - 130);

        List tabsBackground = new List(skin);
        tabsBackground.setPosition(25, 25);
        tabsBackground.setSize(250, Config.HEIGHT - 100);
        tabsBackground.setColor(0.65f, 0.65f, 0.65f, 1);

        Button savedTabButton = new Button(skin);
        savedTabButton.add(new Label("Saves", skin));
        savedTabButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                currentTabName.setText("Saved worlds");

                savedWorldsTab.setVisible(true);
                favoritedServersTab.setVisible(false);
                historyServerTab.setVisible(false);

                refreshSaves();
            }
        });

        Button historyTabButton = new Button(skin);
        historyTabButton.add(new Label("History", skin));
        historyTabButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                currentTabName.setText("Server history");

                savedWorldsTab.setVisible(false);
                favoritedServersTab.setVisible(false);
                historyServerTab.setVisible(true);
            }
        });

        Button favTabButton = new Button(skin);
        favTabButton.add(new Label("Favorited", skin));
        favTabButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                currentTabName.setText("Favorited servers");

                savedWorldsTab.setVisible(false);
                favoritedServersTab.setVisible(true);
                historyServerTab.setVisible(false);
            }
        });

        tabButtons.addActor(savedTabButton);
        tabButtons.addActor(historyTabButton);
        tabButtons.addActor(favTabButton);
        tabButtons.setPosition(25, (25 + Config.HEIGHT) - 100);
        tabButtons.setSize(250, 25);
        tabButtons.center();

        Window joinServerWindow = new Window("Join server..", skin);
        joinServerWindow.setSize(350, 350);
        joinServerWindow.setPosition((Config.WIDTH - joinServerWindow.getWidth()) / 2f, (Config.HEIGHT - joinServerWindow.getHeight()) / 2f);
        joinServerWindow.setResizable(false);
        joinServerWindow.setVisible(false);
        joinServerWindow.setModal(true);
        joinServerWindow.setClip(false);
        joinServerWindow.setTransform(true);
        joinServerWindow.setLayoutEnabled(false);

        Label serverPortFieldTitle = new Label("Server Port", skin);
        serverPortFieldTitle.setPosition((joinServerWindow.getWidth() - 150) / 2, 125);
        serverPortFieldTitle.setSize(150, 25);
        serverPortFieldTitle.setAlignment(Align.center);

        TextField serverPortField = new TextField("33466", skin);
        serverPortField.setPosition((joinServerWindow.getWidth() - 150) / 2, 100);
        serverPortField.setSize(150, 25);

        Label serverIPFieldTitle = new Label("IP Address", skin);
        serverIPFieldTitle.setPosition((joinServerWindow.getWidth() - 150) / 2, 75);
        serverIPFieldTitle.setSize(150, 25);
        serverIPFieldTitle.setAlignment(Align.center);

        TextField serverIPField = new TextField("", skin);
        serverIPField.setPosition((joinServerWindow.getWidth() - 150) / 2, 50);
        serverIPField.setSize(150, 25);

        Label errorMessage = new Label("", skin);
        errorMessage.setPosition((joinServerWindow.getWidth() - 150) / 2, 30);
        errorMessage.setSize(150, 25);
        errorMessage.setAlignment(Align.center);

        Button joinServerWindowCloseButton = new Button(skin);
        joinServerWindowCloseButton.add("Cancel");
        joinServerWindowCloseButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                joinServerWindow.setVisible(false);
            }
        });
        joinServerWindowCloseButton.setPosition(joinServerWindow.getWidth() - 150, 0);
        joinServerWindowCloseButton.setSize(100, 25);

        Button joinServerWindowConnectButton = new Button(skin);
        joinServerWindowConnectButton.add("Connect");
        joinServerWindowConnectButton.setPosition(50, 0);
        joinServerWindowConnectButton.setSize(100, 25);
        joinServerWindowConnectButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                errorMessage.setText("");
                String text = serverIPField.getText().trim();
                if (text.length() == 0) {
                    text = "localhost";
                    //errorMessage.setText("IP can't be empty!");
                    //return;
                }
                try {
                    InetAddress.getByName(text);
                } catch (UnknownHostException e) {
                    errorMessage.setText("Couldn't find IP Address");
                    return;
                }
                int port;
                try {
                    port = Integer.parseInt(serverPortField.getText());
                } catch (NumberFormatException ex) {
                    errorMessage.setText("Invalid port");
                    return;
                }
                try {
                    LocalConnection.instance().connectTo(text, port);
                } catch (IOException e) {
                    errorMessage.setText("Couldn't connect to server.");
                }
            }
        });

        joinServerWindow.add(joinServerWindowCloseButton);
        joinServerWindow.add(joinServerWindowConnectButton);
        joinServerWindow.add(serverIPField);
        joinServerWindow.add(serverIPFieldTitle);
        joinServerWindow.add(errorMessage);
        joinServerWindow.add(serverPortFieldTitle);
        joinServerWindow.add(serverPortField);

        Button joinServerButton = new Button(skin);
        joinServerButton.add(new Label("Join server", skin));
        joinServerButton.setPosition(275, (25 + Config.HEIGHT) - 130);
        joinServerButton.setSize(100, 25);
        joinServerButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                joinServerWindow.setVisible(true);
            }
        });

        stage.addActor(tabsBackground);

        stage.addActor(tabButtons);
        stage.addActor(currentTabName);

        favoritedServersTab.setVisible(false);
        historyServerTab.setVisible(false);

        stage.addActor(favoritedServersTab);
        stage.addActor(historyServerTab);
        stage.addActor(savedWorldsTab);

        stage.addActor(joinServerButton);
        stage.addActor(joinServerWindow);

        refreshSaves();
    }

    @Override
    public void resize(int width, int height) {
        stage.getViewport().update(width, height, true);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(double elapsedTime) {
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();

        MainClient.mainBatch().begin();

        MainClient.mainBatch().end();
    }
}
