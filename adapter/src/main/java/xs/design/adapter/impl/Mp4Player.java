package xs.design.adapter.impl;

import xs.design.adapter.AdvancedMediaPlayer;

/**
 * Created by hasee on 2017/2/22.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
