package com.degiv.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic music;
    private String name;
    private int volume;
    @Autowired
    public MusicPlayer(ClassicalMusic music) {
        this.music = music;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusic(ClassicalMusic music) {
        this.music = music;
    }

    public Music getMusic() {
        return music;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic() {
        System.out.println("PLaying: " + music.getSong());
    }
}
