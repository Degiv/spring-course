package com.degiv.springcourse;

import org.springframework.stereotype.Component;

@Component("musicBean")
public class ClassicalMusic implements Music {
    private ClassicalMusic() {}
    static public ClassicalMusic getClassicMusic() {
        return new ClassicalMusic();
    }
    public void doMyInit() {
        System.out.println("init");
    }
    public void doMyDestroy() {
        System.out.println("destroy");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
