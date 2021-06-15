package com.company;

public class Over60Member extends DefaultMember {

    private int age;


    public Over60Member(String membershipNo, String membername, String memberNicNo, String memberBirthday, String membershipPrice, String membershipStartDate) {
        super(membershipNo, membername, memberNicNo, memberBirthday, membershipPrice, membershipStartDate);
    }
    public Over60Member(){
        super();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 60) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid age");
        }

    }
}
