package com.jason.learn.swagger2inaction.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class JsonResult {

    private String status = null;

    private Object result = null;

}