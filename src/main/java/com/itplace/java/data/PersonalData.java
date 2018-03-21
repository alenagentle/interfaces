package com.itplace.java.data;

public class PersonalData {
    private String FIO;
    private String DOB;
    private String phone;
    private String email;
    private String skype;
    private String target;
    private String experiences;
    private String educations;

    public PersonalData(
            String FIO,
            String DOB,
            String phone,
            String email,
            String skype,
            String target,
            String experiences,
            String educations) {
        this.FIO = FIO;
        this.DOB = DOB;
        this.phone = phone;
        this.email = email;
        this.skype = skype;
        this.target = target;
        this.experiences = experiences;
        this.educations = educations;
    }
    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getExperiences() {
        return experiences;
    }

    public void setExperiences(String experiences) {
        this.experiences = experiences;
    }

    public String getEducations() {
        return educations;
    }

    public void setEducations(String educations) {
        this.educations = educations;
    }

}
