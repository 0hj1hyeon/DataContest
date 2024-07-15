package com.example.model;

public class Member {
    private String accountId;
    private String password;
    private String name;
    private String gender;
    private int age;
    private String email;
    private String call_info;
    private String address;
    private String intro;
    private long disabled_id;

    public Member(String accountId, String memberPassword) {
        this.accountId = accountId;
        this.password = memberPassword;
    }

    public Member(String accountId, String memberPassword, String name, String gender, int age,
                  String email, String call_info, String address, String intro, long disabled_id) {
        this.accountId = accountId;
        this.password = memberPassword;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.call_info = call_info;
        this.address = address;
        this.intro = intro;
        this.disabled_id = disabled_id;
    }


    /* Getters and setters if needed
    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCall() {
        return call;
    }

    public String getAddress() {
        return address;
    }

    public String[] getIntro() {
        return intro;
    }

    public BigInteger getDisabled_id() {
        return disabled_id;
    }
    */
}
