package com.costin.eem.client.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
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

    private ScrollPane favoritedServersTab, historyServerTab, savedWorldsTab;
    private final Window infoWindow;
    private final Label infoWindowLabel;
    private final Stage stage;
    private final Skin skin;
    private final TextureRegion bg1,bg2,bg3;
    private int bgIndex;
    private float bgTimer;
    private float bgAlpha;
    private float bgOffsetX;
    private final Texture backgroundVignette;

    public void showWindow(String title, String message) {
        infoWindow.getTitleLabel().setText(title);
        infoWindowLabel.setText(message);
        infoWindow.pack();
        infoWindow.setPosition((Config.width() - infoWindow.getWidth()) / 2f, (Config.height() - infoWindow.getHeight()) / 2f);
        infoWindow.setVisible(true);
    }

    private void refreshSaves() {
        VerticalGroup saveStack = (VerticalGroup) savedWorldsTab.getActor();
        saveStack.clearChildren();
        String[] saveNames = LevelLoader.listSaves();
        for (String saveName : saveNames) {
            HorizontalGroup horizontalGroup = new HorizontalGroup();

            Label text = new Label(saveName, skin);
            text.setAlignment(Align.topLeft);

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

            horizontalGroup.setSize(50, 25);
            horizontalGroup.addActor(text);
            horizontalGroup.addActor(joinBtn);
            horizontalGroup.align(Align.left);
            horizontalGroup.rowAlign(Align.left);

            saveStack.addActor(horizontalGroup);
            saveStack.columnAlign(Align.left);
        }
        saveStack.left();
        saveStack.setWidth(50);
    }

    @Override
    public void start() {
        bgTimer = 7;
        bgAlpha = 1;
        bgIndex = MathUtils.random(1, 3);
        Gdx.input.setInputProcessor(stage);
        stage.setViewport(viewport);
        refreshSaves();
    }
    @Override
    public void tick() {

    }

    @Override
    public void render(double elapsedTime) {
        stage.act(Gdx.graphics.getDeltaTime());

        bgTimer -= Gdx.graphics.getDeltaTime();
        if(bgTimer <= 2f) {
            bgAlpha = bgTimer / 2;
        }
        if(bgTimer >= 5f) {
            bgAlpha = 1 - (bgTimer - 5f) / 2;
        }
        if(bgTimer <= 0) {
            bgIndex++;
            if(bgIndex == 4) bgIndex = 1;
            bgTimer = 7;
        }

        batch.begin();
        batch.setColor(1, 1, 1, bgAlpha);
        switch (bgIndex) {
            case 1:
                batch.draw(bg1, bgOffsetX, 0);
                break;
            case 2:
                batch.draw(bg2, bgOffsetX ,0);
                break;

            case 3:
                batch.draw(bg3, bgOffsetX, 0);
                break;
        }
        batch.setColor(1,1,1,1);
        batch.draw(backgroundVignette, 0, 0);
        batch.end();

        stage.draw();
    }

    private static MenuScreen singleton;
    public static MenuScreen instance() {
        if (singleton == null) {
            singleton = new MenuScreen();
        }
        return singleton;
    }

    private MenuScreen() {
        stage = new Stage();

        skin = new Skin(Gdx.files.internal("skin/cloud-form-ui.json"));

        backgroundVignette = new Texture("media/lobby/bg_overlay.png");
        Texture bg = new Texture("media/lobby/bg_new.png");
        bg1 = new TextureRegion(bg, 0, 0, bg.getWidth() / 3, bg.getHeight());
        bg2 = new TextureRegion(bg, bg.getWidth() / 3, 0, bg.getWidth() / 3, bg.getHeight());
        bg3 = new TextureRegion(bg, bg.getWidth() / 3 * 2, 0, bg.getWidth() / 3, bg.getHeight());
        float bgWidthGap = Config.width() - bg1.getRegionWidth();
        bgOffsetX = bgWidthGap;
        log.info(String.valueOf(bgOffsetX));

        HorizontalGroup tabButtons = new HorizontalGroup();

        Label currentTabName = new Label("Saved worlds", skin);
        currentTabName.setPosition(0, Config.height() - 50);
        currentTabName.setSize(bgWidthGap, 20);
        currentTabName.setAlignment(Align.center);

        favoritedServersTab = new ScrollPane(new VerticalGroup());
        favoritedServersTab.setPosition(0, 25);
        favoritedServersTab.setVisible(true);
        favoritedServersTab.setSize(200, Config.height() - 130);

        historyServerTab = new ScrollPane(new VerticalGroup());
        historyServerTab.setPosition(0, 25);
        historyServerTab.setVisible(true);
        historyServerTab.setSize(200, Config.height() - 130);

        savedWorldsTab = new ScrollPane(new VerticalGroup());
        savedWorldsTab.setPosition(0, 25);
        savedWorldsTab.setVisible(true);
        savedWorldsTab.setSize(bgWidthGap, Config.height() - 100);

        Image tabsBackground = new Image(new Texture("pixel.png"));
        tabsBackground.setPosition(0, 0);
        tabsBackground.setSize(bgWidthGap, Config.height());
        float colorVal = 0.8f;
        tabsBackground.setColor(colorVal, colorVal, colorVal, 1);

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
        tabButtons.setPosition(0, (Config.height()) - 30);
        tabButtons.setSize(bgWidthGap, 25);
        tabButtons.center();

        Window joinServerWindow = new Window("Join server..", skin);
        joinServerWindow.setSize(350, 350);
        joinServerWindow.setPosition((Config.width() - joinServerWindow.getWidth()) / 2f, (Config.height() - joinServerWindow.getHeight()) / 2f);
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
                    //text = "localhost";
                    errorMessage.setText("IP can't be empty!");
                    return;
                }
                try {
                    InetAddress.getByName(text); // used to check if it's a valid IP address in the first place
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
        joinServerButton.setPosition(275, (25 + Config.height()) - 130);
        joinServerButton.setSize(100, 25);
        joinServerButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                joinServerWindow.setVisible(true);
            }
        });

        infoWindow = new Window("Example Title", skin);
        Button infoWindowButton = new Button(skin);
        infoWindowLabel = new Label("Example Label", skin);
        infoWindowButton.add(new Label("Close", skin));
        infoWindowButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                infoWindow.setVisible(false);
            }
        });
        infoWindow.add(infoWindowButton).bottom();
        infoWindow.add(infoWindowLabel).top();
        infoWindow.setMovable(false);
        infoWindow.setModal(true);
        infoWindow.setVisible(false);

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
        stage.addActor(infoWindow);

        refreshSaves();

        stage.setDebugAll(true);
    }

    @Override
    public void resize(int width, int height) {

    }
}
