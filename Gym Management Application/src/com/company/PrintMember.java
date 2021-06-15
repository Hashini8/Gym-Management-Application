package com.company;

public class PrintMember {
    public static void printMembersList() {
        for (DefaultMember member : UserInfo.memberList) {
            System.out.println("--------------- MEMBER INFO --------------------------");
            System.out.println("Membership ID: " +member.getMembershipNo());
            System.out.println(" Name: " + member.getMembername());
            System.out.println("NIC Number: " +member.getMemberNicNo());
            System.out.println("Birth day: " + member.getMemberBirthday());
            System.out.println("starting date : " + member.getMembershipStartDate());
            System.out.println("Membership Price: " + member.getMembershipPrice());
            System.out.println("--------------------");
        }
        if (UserInfo.memberList.size() == 0) System.out.println("empty list!");
    }
}
