package com.example.model;

import java.math.BigInteger;

public class Member {
    private String memberId;
    private String memberPassword;
    private String memberName;
    private String memberGender;
    private int memberAge;
    private String memberEmail;
    private String memberCall;
    private String memberAddress;
    private String[] memberIntro;
    private long memeberDisabled_id;

    public Member(String memberId, String memberPassword) {
        this.memberId = memberId;
        this.memberPassword = memberPassword;
    }

    public Member(String memberId, String memberPassword, String memberName, String memberGender, int memberAge,
                  String memberEmail, String memberCall, String memberAddress, String[] memberIntro, long memeberDisabled_id) {
        this.memberId = memberId;
        this.memberPassword = memberPassword;
        this.memberName = memberName;
        this.memberGender = memberGender;
        this.memberAge = memberAge;
        this.memberEmail = memberEmail;
        this.memberCall = memberCall;
        this.memberAddress = memberAddress;
        this.memberIntro = memberIntro;
        this.memeberDisabled_id = memeberDisabled_id;
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
