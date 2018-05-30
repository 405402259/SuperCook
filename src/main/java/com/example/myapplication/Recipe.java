package com.example.myapplication;

import java.util.List;

public class Recipe {

    private String recipeName;  //0
    private String tool;//1
    private String time;//2
    private String hard;//3
    private String ingredient;//4
    private String type;//5
    private String taste;//6
    private String topic;//7
    private String people;//8
    private List<String> comment;//9
    private String step;//10
    private String picture;//11
    private String publisher;//12
    private boolean visible;//13

    public Recipe(String recipeName, String tool, String time, String hard, String ingredient, String type, String taste, String topic, String people, List<String> comment, String step, String picture, String publisher, boolean visible) {
        this.recipeName = recipeName;
        this.tool = tool;
        this.time = time;
        this.hard = hard;
        this.ingredient = ingredient;
        this.type = type;
        this.taste = taste;
        this.topic = topic;
        this.people = people;
        this.comment = comment;
        this.step = step;
        this.picture = picture;
        this.publisher = publisher;
        this.visible = visible;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getHard() {
        return hard;
    }

    public void setHard(String hard) {
        this.hard = hard;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }


    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public List<String> getComment() {
        return comment;
    }

    public void setComment(List<String> comment) {
        this.comment = comment;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}

