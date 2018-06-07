package com.example.myapplication;

public class readrecipe {
    public int id;
    public String recipeName;
    public String publisher;
    public String comment;
    public String hard;
    public String ingredient;
    public String people;
    public String picture;
    public String step;
    public String taste;
    public String time;
    public String tool;
    public String topic;
    public String type;
    public String visible;
    public readrecipe(){

    }

    public readrecipe(int id, String recipeName, String publisher, String comment, String hard, String ingredient, String people, String picture, String step, String taste, String time, String tool, String topic, String type, String visible) {
        this.id = id;
        this.recipeName = recipeName;
        this.publisher = publisher;
        this.comment = comment;
        this.hard = hard;
        this.ingredient = ingredient;
        this.people = people;
        this.picture = picture;
        this.step = step;
        this.taste = taste;
        this.time = time;
        this.tool = tool;
        this.topic = topic;
        this.type = type;
        this.visible = visible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }
}
