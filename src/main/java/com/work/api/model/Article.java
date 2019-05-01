package com.work.api.model;

public class Article {
    private String title;
    private String writer;
    private String content;
    private String article_time;

    public Article(){

    }

    public Article(String title,String writer,String content,String article_time){
        this.title = title;
        this.writer = writer;
        this.content = content;
        this.article_time = article_time;
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

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getWriter() {
        return writer;
    }

    public String getArticle_time() {
        return article_time;
    }

    public void setArticle_time(String article_time) {
        this.article_time = article_time;
    }
}
