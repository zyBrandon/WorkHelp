package com.work.api.controller;

import com.work.api.mapper.UserMapper;
import com.work.api.model.*;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Vector;

@RequestMapping("user/")
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    //登录
    @RequestMapping(value = "/userLand",method = RequestMethod.GET)
    public int userLand(@RequestParam String username,@RequestParam String pass){
        int i = userMapper.userLand(username,pass);
        return i;
    }

    //获取学习币数量
    @RequestMapping(value = "/getCoin",method = RequestMethod.GET)
    public Coin getCoin(@RequestParam String username){
        Coin coin = userMapper.getCoin(username);
        return coin;
    }

    //获取每日一篇好文章
    @RequestMapping(value = "/getArticle",method = RequestMethod.GET)
    public Article getArticle(@RequestParam String article_time){
        Article article = userMapper.getArticle(article_time);
        return article;
    }

    //获取用户资料
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public User getUser(@RequestParam String username){
        User user = userMapper.getUser(username);
        return user;
    }

    //修改用户资料
    @RequestMapping(value = "/updateUser",method = RequestMethod.GET)
    public int updateUser(@RequestParam String username,@RequestParam String pass,
                          @RequestParam String name,@RequestParam String sex,@RequestParam String phone){
        int i = userMapper.updateUser(username,pass,name,sex,phone);
        return i;
    }

    //获取新闻
    @RequestMapping(value = "/getNews",method = RequestMethod.GET)
    public Vector<News> getNews(){
        Vector<News> news = userMapper.getNews();
        return news;
    }


    //获取介绍
    @RequestMapping(value = "/getExam",method = RequestMethod.GET)
    public Exam getExam(){
        Exam exam = userMapper.getExam();
        return exam;
    }

    //发帖
    @RequestMapping(value = "/insertPost",method = RequestMethod.GET)
    public int insertPost(@RequestParam String username,@RequestParam String title,@RequestParam String content,
                          @RequestParam String post_time){
        int i = userMapper.insertPost(username,title,content,post_time);
        return i;
    }

    //获取所有帖子
    @RequestMapping(value = "/getPost",method = RequestMethod.GET)
    public Vector<Post> getPost(){
        Vector<Post> posts = userMapper.getPost();
        return posts;
    }




}
