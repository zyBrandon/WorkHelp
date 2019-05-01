package com.work.api.model;

public class Exam {
    private String name;
    private String intro;
    private String request;
    private String situation;
    private String exam_time;

    public Exam(){

    }

    public Exam(String name,String intro,String request,String situation,String exam_time){
        this.name = name;
        this.intro = intro;
        this.request = request;
        this.situation = situation;
        this.exam_time = exam_time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getExam_time() {
        return exam_time;
    }

    public String getIntro() {
        return intro;
    }

    public String getRequest() {
        return request;
    }

    public String getSituation() {
        return situation;
    }

    public void setExam_time(String exam_time) {
        this.exam_time = exam_time;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }
}
