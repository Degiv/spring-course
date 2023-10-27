package com.degiv.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Value("${musicPlayer.name}")
    private String name;

    private int volume;
    public MusicPlayer(@Qualifier("classicalMusic()") Music music1, @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic() {
        System.out.println("PLaying: " + music1.getSong() + music2.getSong());
    }
}
