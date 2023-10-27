package com.degiv.springcourse;

import org.springframework.stereotype.Component;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}
    //fabric method just to learn how it interacts with spring
    static public ClassicalMusic createClassicalMusic() {
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
