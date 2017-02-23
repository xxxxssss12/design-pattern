package xs.design.adapter.impl;

import xs.design.adapter.AdvancedMediaPlayer;

/**
 * Created by hasee on 2017/2/22.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
