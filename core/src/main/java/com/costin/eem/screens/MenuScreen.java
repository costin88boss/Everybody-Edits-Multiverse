package com.costin.eem.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Align;
import com.costin.eem.Config;
import com.costin.eem.Game;
import com.costin.eem.game.world.World;
import com.costin.eem.net.Network;
import com.costin.eem.net.client.GameClient;
import com.costin.eem.net.server.GameServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class MenuScreen extends Screen {
    private static final Logger log = LoggerFactory.getLogger(MenuScreen.class);
    private ScrollPane favoritedServersTab, historyServerTab, savedWorldsTab;
    private Window infoWindow, joinServerWindow;
    private Label infoWindowLabel;
    private Stage stage;
    private Skin skin;
    private TextureRegion bg1, bg2, bg3;
    private Texture backgroundVignette;
    private int bgIndex;
    private float bgTimer, bgAlpha, bgOffsetX;

    public boolean isInfoWindowShown() {
        return infoWindow.isVisible();
    }

    public void showInfoWindow(String title, String message) {
        infoWindow.getTitleLabel().setText(title);
        infoWindowLabel.setText(message);
        infoWindow.pack();
        infoWindow.setPosition((Config.WIDTH - infoWindow.getWidth()) / 2f, (Config.HEIGHT - infoWindow.getHeight()) / 2f);
        infoWindow.setVisible(true);

        // just in case it was visible
        joinServerWindow.setVisible(false);
    }

    private void refreshSaves() {
        VerticalGroup saveStack = (VerticalGroup) savedWorldsTab.getActor();
        saveStack.clearChildren();
        String[] saveNames = World.listSaves();
        for (String saveName : saveNames) {
            HorizontalGroup horizontalGroup = new HorizontalGroup();

            Label text = new Label(saveName, skin);

            Button joinBtn = new Button(skin);
            joinBtn.add("Join");
            joinBtn.addListener(new ClickListener() {
                @Override
                public void clicked(InputEvent event, float x, float y) {
                    try {
                        GameServer.setConfig(Network.defaultPort, Config.rootFolder + "saves/" + saveName + ".eelvl");
                        GameServer.start();
                        GameClient.connectTo(InetAddress.getLoopbackAddress().getHostName(), Network.defaultPort);
                    } catch (Exception e) {
                        log.error(e.toString());
                        GameServer.serverClose();
                        showInfoWindow("An error has occurred", e.toString());
                        Game.instance().changeScreen(Type.MENU);
                    }
                }
            });

            horizontalGroup.setSize(50, 25);
            horizontalGroup.addActor(joinBtn);
            horizontalGroup.addActor(text);
            horizontalGroup.pack();

            saveStack.addActor(horizontalGroup);
            saveStack.columnAlign(Align.left);
        }
        saveStack.left();
        saveStack.setWidth(50);
    }

    @Override
    public void preload() {
        Game.instance().assetLoad("lobby/bg_overlay.png", Texture.class);
        Game.instance().assetLoad("lobby/bg_new.png", Texture.class);
        Game.instance().assetRootLoad("skin/cloud-form-ui.json", Skin.class);
    }

    @Override
    public void postload() {
        stage = new Stage();
        stage.setViewport(Game.instance().getViewport());

        skin = Game.instance().assetRootGet("skin/cloud-form-ui.json");

        backgroundVignette = Game.instance().assetGet("lobby/bg_overlay.png");
        Texture bg = Game.instance().assetGet("lobby/bg_new.png");
        bg1 = new TextureRegion(bg, 0, 0, bg.getWidth() / 3, bg.getHeight());
        bg2 = new TextureRegion(bg, bg.getWidth() / 3, 0, bg.getWidth() / 3, bg.getHeight());
        bg3 = new TextureRegion(bg, bg.getWidth() / 3 * 2, 0, bg.getWidth() / 3, bg.getHeight());
        float bgWidthGap = Config.WIDTH - bg1.getRegionWidth();
        bgOffsetX = bgWidthGap;

        HorizontalGroup tabButtons = new HorizontalGroup();

        Label currentTabName = new Label("Saved worlds", skin);
        currentTabName.setPosition(0, Config.HEIGHT - 50);
        currentTabName.setSize(bgWidthGap, 20);
        currentTabName.setAlignment(Align.center);

        Label dragTip = new Label("Tip: you can drag the list below", skin);
        dragTip.setPosition(0, Config.HEIGHT - 80);
        dragTip.setSize(bgWidthGap, 20);
        dragTip.setAlignment(Align.center);

        favoritedServersTab = new ScrollPane(new VerticalGroup());
        favoritedServersTab.setPosition(0, 0);
        favoritedServersTab.setVisible(true);
        favoritedServersTab.setSize(bgWidthGap, Config.HEIGHT - 100);

        historyServerTab = new ScrollPane(new VerticalGroup());
        historyServerTab.setPosition(0, 0);
        historyServerTab.setVisible(true);
        historyServerTab.setSize(bgWidthGap, Config.HEIGHT - 100);

        savedWorldsTab = new ScrollPane(new VerticalGroup());
        savedWorldsTab.setPosition(0, 0);
        savedWorldsTab.setVisible(true);
        savedWorldsTab.setSize(bgWidthGap, Config.HEIGHT - 100);

        Image tabsBackground = new Image(Game.instance().pixel());
        tabsBackground.setPosition(0, 0);
        tabsBackground.setSize(bgWidthGap, Config.HEIGHT);
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
                currentTabName.setText("GameServer history");

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
        tabButtons.setPosition(0, (Config.HEIGHT) - 30);
        tabButtons.setSize(bgWidthGap, 25);
        tabButtons.center();

        joinServerWindow = new Window("Join server..", skin);
        joinServerWindow.setSize(350, 350);
        joinServerWindow.setPosition((Config.WIDTH - joinServerWindow.getWidth()) / 2f, (Config.HEIGHT - joinServerWindow.getHeight()) / 2f);
        joinServerWindow.setResizable(false);
        joinServerWindow.setVisible(false);
        joinServerWindow.setModal(true);
        joinServerWindow.setClip(false);
        joinServerWindow.setTransform(true);
        joinServerWindow.setLayoutEnabled(false);

        Label serverPortFieldTitle = new Label("GameServer Port", skin);
        serverPortFieldTitle.setPosition((joinServerWindow.getWidth() - 150) / 2, 125);
        serverPortFieldTitle.setSize(150, 25);
        serverPortFieldTitle.setAlignment(Align.center);

        TextField serverPortField = new TextField(String.valueOf(Network.defaultPort), skin);
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
                    GameClient.connectTo(text, port);
                } catch (IOException e) {
                    errorMessage.setText("Couldn't connect to server.");
                    Game.instance().changeScreen(Screen.Type.MENU);
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
        joinServerButton.setPosition(bgOffsetX, Config.HEIGHT - 30);
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

        stage.addActor(dragTip);

        stage.addActor(joinServerButton);
        stage.addActor(joinServerWindow);
        stage.addActor(infoWindow);
    }

    @Override
    public void start() {
        Gdx.input.setInputProcessor(stage);
        refreshSaves();
    }

    @Override
    public void logic() {

    }

    //@Override
    public void logic_() {
        bgTimer -= Gdx.graphics.getDeltaTime();
        if (bgTimer <= 2f) {
            bgAlpha = bgTimer / 2;
        }
        if (bgTimer >= 5f) {
            bgAlpha = 1 - (bgTimer - 5f) / 2;
        }
        if (bgTimer <= 0) {
            bgIndex++;
            if (bgIndex == 4) bgIndex = 1;
            bgTimer = 7;
        }
    }

    @Override
    public void render(SpriteBatch batch) {
        logic_();

        stage.act(); // can't put in logic as it's tick-based and limited

        batch.begin();
        batch.setColor(1, 1, 1, bgAlpha);
        switch (bgIndex) {
            case 1:
                batch.draw(bg1, bgOffsetX, 0);
                break;
            case 2:
                batch.draw(bg2, bgOffsetX, 0);
                break;

            case 3:
                batch.draw(bg3, bgOffsetX, 0);
                break;
        }

        batch.setColor(1, 1, 1, 1);
        //batch.draw(backgroundVignette, 0, 0);
        // HEIGHT and WIDTH are supposed to be like that!!!
        batch.draw(backgroundVignette, Config.WIDTH, 0, 0, 0, Config.HEIGHT, Config.WIDTH, 1, 1, 90, 0, 0, backgroundVignette.getWidth(), backgroundVignette.getHeight(), false, false);
        batch.end();

        stage.draw();
    }

    @Override
    public void end() {

    }

    @Override
    public void gameClose() {

    }
}
