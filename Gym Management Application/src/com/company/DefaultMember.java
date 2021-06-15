package com.company;

public class DefaultMember implements Comparable<DefaultMember> {

    private String membershipNo;
    private String membername;
    private String memberNicNo;
    private String memberBirthday;
    private String membershipPrice;
    private String membershipStartDate;

    public DefaultMember(String membershipNo, String membername, String memberNicNo, String memberBirthday, String membershipPrice, String membershipStartDate) {
        this.membershipNo = membershipNo;
        this.membername = membername;
        this.memberNicNo = memberNicNo;
        this.memberBirthday = memberBirthday;
        this.membershipPrice = membershipPrice;
        this.membershipStartDate = membershipStartDate;
    }
    public DefaultMember(){
        super();
    }


    public String getMembershipNo() {
        return membershipNo;
    }

    public void setMembershipNo(String membershipNo) {
        this.membershipNo = membershipNo;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername;
    }

    public String getMemberNicNo() {
        return memberNicNo;
    }

    public void setMemberNicNo(String memberNicNo) {
        this.memberNicNo = memberNicNo;
    }

    public String getMemberBirthday() {
        return memberBirthday;
    }

    public void setMemberBirthday(String memberBirthday) {
        this.memberBirthday = memberBirthday;
    }

    public String getMembershipPrice() {
        return membershipPrice;
    }

    public void setMembershipPrice(String membershipPrice) {
        this.membershipPrice = membershipPrice;
    }

    public String getMembershipStartDate() {
        return membershipStartDate;
    }

    public void setMembershipStartDate(String membershipStartDate) {
        this.membershipStartDate = membershipStartDate;
    }

    @Override
    public int compareTo(DefaultMember o) {
        return 0;
    }
}

