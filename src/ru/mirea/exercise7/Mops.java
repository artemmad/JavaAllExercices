package ru.mirea.exercise7;

public class Mops extends Dog {
    private String voice;

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public void Voice(){
        System.out.println(voice);
    }
}
