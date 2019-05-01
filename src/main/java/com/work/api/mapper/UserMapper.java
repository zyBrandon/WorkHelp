package com.work.api.mapper;

import com.work.api.model.*;
import org.apache.ibatis.annotations.*;

import java.util.Vector;

@Mapper
public interface UserMapper {
    @Select("select count(*) from user_tbl where username=#{username} and pass=#{pass}")
    int userLand(@Param("username") String username,@Param("pass") String pass);

    @Select("select * from coin_tbl where username=#{username}")
    Coin getCoin(@Param("username") String username);

    @Select("select * from article_tbl where article_time=#{article_time}")
    Article getArticle(@Param("article_time") String article_time);

    @Select("select * from user_tbl where username=#{username}")
    User getUser(@Param("username") String username);

    @Update("update user_tbl set pass=#{pass},name=#{name},sex=#{sex},phone=#{phone} where username=#{username}")
    int updateUser(@Param("username") String username,@Param("pass") String pass,@Param("name") String name,@Param("sex") String sex,@Param("phone") String phone);

    @Select("select * from news_tbl")
    Vector<News> getNews();

    @Select("select * from exam_tbl")
    Exam getExam();

    @Insert("insert into post_tbl values(#{username},#{title},#{content},#{post_time},0)")
    int insertPost(@Param("username") String username,@Param("title") String title,@Param("content") String content,@Param("post_time") String post_time);

    @Select("select * from post_tbl")
    Vector<Post> getPost();

    @Insert("insert into user_tbl values(#{username},#{pass},#{name},#{sex},#{phone})")
    int register(@Param("username") String username,@Param("pass") String pass,@Param("name") String name,@Param("sex") String sex,@Param("phone") String phone);
}
