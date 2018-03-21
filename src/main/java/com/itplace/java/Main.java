package com.itplace.java;

import com.itplace.java.service.api.ResultService;
import  com.itplace.java.service.impl.ResultServiceImpl;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        ResultService resultService = new ResultServiceImpl("resources/person.properties");
        resultService.createHtmlFile("src/main/summary.html");
    }
}
