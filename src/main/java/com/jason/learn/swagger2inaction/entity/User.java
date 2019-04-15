package com.jason.learn.swagger2inaction.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
public class User {

    private int id;
    private String username;
    private int age;
    private Date ctm;

}
