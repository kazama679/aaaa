package com.data.ss8.ra.model;

public class Question {
    private static int idAuto=0;
    private int id;
    private String imageUrl;
    private String answer;

    public Question() {
        this.id = ++idAuto;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Question(String answer, String imageUrl) {
        this.answer = answer;
        this.id = ++idAuto;
        this.imageUrl = imageUrl;
    }
}
