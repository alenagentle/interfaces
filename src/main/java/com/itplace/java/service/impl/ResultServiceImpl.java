package com.itplace.java.service.impl;

import com.itplace.java.service.api.ResultService;
import com.itplace.java.data.PersonalData;
import com.itplace.java.service.api.PersonStore;
import java.io.*;

public class ResultServiceImpl implements ResultService {
    private PersonalData personalData;

    public ResultServiceImpl(String propertyFilePath) {
        PersonStore personRepository = new PersonStoreImpl(propertyFilePath);
        this.personalData = personRepository.getPersonalData();
    }

    public void createHtmlFile(String pathHtmlFile) {
        System.out.println("path = " + pathHtmlFile);
        if (this.personalData != null) {
            String html = "<!DOCTYPE html>\n"
                    + "<html lang=\"ru\">\n"
                    + "<head>\n"
                    + "    <meta charset=\"UTF-8\">\n"
                    + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                    + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
                    + "    <title>Резюме</title>\n"
                    + "</head>\n"+
                    "<body>\n" +
                    "        <h4 class=\"text-center\"><strong>Резюме</strong><p>на должность Java-стажер</p></h4>\n" +
                    "                    <dt>ФИО:</dt><dd>" + personalData.getFIO() + "</dd>\n" +
                    "                    <dt>Дата рождения:</dt><dd>" + personalData.getDOB() + "</dd>\n" +
                    "                    <dt>Телефон:</dt><dd>" + personalData.getPhone() + "</dd>\n" +
                    "                    <dt>e-mail:</dt><dd>" + personalData.getEmail() + "</dd>\n" +
                    "                    <dt>Skype:</dt><dd>" + personalData.getSkype() + "</dd>\n" +
                    "            <h4 class=\"card-title\"><strong>Цель:</strong></h4>\n" +
                    "            <p class=\"card-text\">" + personalData.getTarget() + "</p>\n" +
                    "            <h4 class=\"card-title\"><strong>Опыт работы:</strong></h4>\n" +
                    "            <ol class=\"card-text\">\n" + personalData.getExperiences() + "</ol>\n" +
                    "            <h4 class=\"card-title\"><strong>Образование:</strong></h4>\n" +
                    "            <p class=\"card-text\">" + personalData.getEducations() + "</p>\n" +
                    "</body>\n" +
                    "</html>";
            try {
                File file = new File(pathHtmlFile);
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter writer = new FileWriter (pathHtmlFile, false);
                writer.write(html);
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        else System.out.println("personalData = null");
    }
}


