package org.example;

public interface MusicType {
    void play();
}
class Guitar implements MusicType{
    public void play() {
        System.out. println("Play guitar..");
    }
}
class Piano implements MusicType{
    public void play() {
        System.out.println("Play Paiano..");
    }
}
