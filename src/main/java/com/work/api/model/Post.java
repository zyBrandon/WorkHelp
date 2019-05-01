package com.work.api.model;

public class Post {
    private String username;
    private String title;
    private String content;
    private String post_time;
    private int like_num;

    public Post(){

    }

    public Post(String username,String title,String content,String post_time,int like_num){
        this.username = username;
        this.title = title;
        this.content = content;
        this.post_time = post_time;
        this.like_num = like_num;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLike_num() {
        return like_num;
    }

    public String getPost_time() {
        return post_time;
    }

    public void setLike_num(int like_num) {
        this.like_num = like_num;
    }

    public void setPost_time(String post_time) {
        this.post_time = post_time;
    }
}
