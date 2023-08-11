package com.costin.eem.screens;

import com.badlogic.gdx.InputAdapter;
import com.costin.eem.Config;
import com.costin.eem.net.Network;
import com.costin.eem.net.client.GameClient;

public class WorldScreenInput extends InputAdapter {
    private boolean leftDown = false;
    private boolean rightDown = false;
    private boolean upDown = false;
    private boolean downDown = false;
    private boolean spaceDown = false;

    public void tick() {
        if(GameClient.getThisPlayer().updateControls(leftDown, rightDown, upDown, downDown, spaceDown)) {
            Network.LocalPlayerUpdate update = new Network.LocalPlayerUpdate();
            update.leftDown = leftDown;
            update.rightDown = rightDown;
            update.upDown = upDown;
            update.downDown = downDown;
            update.spaceDown = spaceDown;
            GameClient.getEndpoint().sendTCP(update);
        }
    }

    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Config.KEY_DOWN || keycode == Config.KEY_DOWN_2) {
            downDown = true;
            return true;
        }
        if (keycode == Config.KEY_UP || keycode == Config.KEY_UP_2) {
            upDown = true;
            return true;
        }
        if (keycode == Config.KEY_LEFT || keycode == Config.KEY_LEFT_2) {
            leftDown = true;
            return true;
        }
        if (keycode == Config.KEY_RIGHT || keycode == Config.KEY_RIGHT_2) {
            rightDown = true;
            return true;
        }

        if (keycode == Config.KEY_JUMP) {
            spaceDown = true;
            return true;
        }

        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        if (keycode == Config.KEY_DOWN || keycode == Config.KEY_DOWN_2) {
            downDown = false;
            return true;
        }
        if (keycode == Config.KEY_UP || keycode == Config.KEY_UP_2) {
            upDown = false;
            return true;
        }
        if (keycode == Config.KEY_LEFT || keycode == Config.KEY_LEFT_2) {
            leftDown = false;
            return true;
        }
        if (keycode == Config.KEY_RIGHT || keycode == Config.KEY_RIGHT_2) {
            rightDown = false;
            return true;
        }

        if (keycode == Config.KEY_JUMP) {
            spaceDown = false;
            return true;
        }

        return false;
    }
}
