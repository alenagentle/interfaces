package com.itplace.java.service.impl;

import com.itplace.java.data.PersonalData;
import com.itplace.java.service.api.PersonStore;
import java.util.Properties;
import java.io.*;

public class PersonStoreImpl implements PersonStore {
    private Properties personDataFile;

    public PersonStoreImpl(String propertyFilePath) {
        this.personDataFile = getProperties(propertyFilePath);
    }

    private Properties getProperties(String configFileInput) {
        Properties property = new Properties();
        try {
            property.load(new BufferedReader(new InputStreamReader(new FileInputStream(configFileInput), "UTF-8")));
            return property;
        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл настроек");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public PersonalData getPersonalData() {
        PersonalData personalData = null;
        if (this.personDataFile != null) {
            personalData = new PersonalData(
                    personDataFile.getProperty("FIO"),
                    personDataFile.getProperty("DOB"),
                    personDataFile.getProperty("phone"),
                    personDataFile.getProperty("email"),
                    personDataFile.getProperty("skype"),
                    personDataFile.getProperty("target"),
                    personDataFile.getProperty("experiences"),
                    personDataFile.getProperty("educations")
            );
        }
        return personalData;
    }
}
