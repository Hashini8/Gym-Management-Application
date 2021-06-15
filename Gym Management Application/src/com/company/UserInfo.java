package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInfo {
    static String memberId;
    static String infor;
    public  static Scanner sc =new Scanner(System.in);
    public   static List<DefaultMember> memberList = new ArrayList<DefaultMember>();
    public static DefaultMember addDefaultMember() {

        DefaultMember defaultMember = new DefaultMember();

        System.out.println("Enter membership Id ->");
        memberId = sc.next();
        defaultMember.setMembershipNo(memberId);

        System.out.println("Enter  member Name :");
        defaultMember.setMembername(sc.next());

        System.out.println("Enter member NIC number :");
        defaultMember.setMemberNicNo(sc.next());

        System.out.println("Enter member Birth day : ");
        defaultMember.setMemberBirthday(sc.next());

        System.out.println("Enter membership price : ");
        defaultMember.setMembershipPrice(sc.next());

        System.out.println("Enter membership start date :  ");
        defaultMember.setMembershipStartDate(sc.next());
        memberList.add(defaultMember);
        infor ="member's id " +defaultMember.getMembershipNo()+
       " \nMember Name "+defaultMember.getMembername()+ " \nmembers NiC number" +defaultMember.getMemberNicNo()+
        " \nmembers birth day "+defaultMember.getMemberBirthday()+
        " \nmembership price" +defaultMember.getMembershipPrice()+
        " \nmembership starting date" +defaultMember.getMembershipStartDate()+"\n";



        return defaultMember;
    }

    public static void addStudentMember() {

        StudentMember studentMember = new StudentMember();


        System.out.println("Enter membership Id ->");
        memberId = sc.next();
        studentMember.setMembershipNo(memberId);

        System.out.println("Enter  member Name :");
        studentMember.setMembername(sc.next());

        System.out.println("Enter member NIC number :");
        studentMember.setMemberNicNo(sc.next());

        System.out.println("Enter member birth day : ");
        studentMember.setMemberBirthday(sc.next());

        System.out.println("Enter member School Name : ");
        studentMember.setSchoolName(sc.next());

        System.out.println("Enter member Index number  : ");
        studentMember.setStudentIndex(sc.next());

        System.out.println("Enter member contact number :  ");
        studentMember.setContactNumber(sc.next());

        System.out.println("Enter membership price : ");
        studentMember.setMembershipPrice(sc.next());

        System.out.println("Enter membership start date :  ");
        studentMember.setMembershipStartDate(sc.next());
        memberList.add(studentMember);
        infor ="member's id " +studentMember.getMembershipNo()+
                "\nMember Name "+studentMember.getMembername()+ "\nmembers NiC number" +studentMember.getMemberNicNo()+
                "\nmembers birth day "+studentMember.getMemberBirthday()+
                "\nmembership price" +studentMember.getMembershipPrice()+
                "\nmembership starting date" +studentMember.getMembershipStartDate()+"\n";



    }

    public static void addOver60Member() {

        Over60Member over60Member = new Over60Member();

        System.out.println("Enter membership Id ->");
        memberId = sc.next();
        over60Member.setMembershipNo(memberId);

        System.out.println("Enter  member Name :");
        over60Member.setMembername(sc.next());

        System.out.println("Enter member NIC number :");
        over60Member.setMemberNicNo(sc.next());

        System.out.println("Enter member birth day : ");
        over60Member.setMemberBirthday(sc.next());

        System.out.println("Enter member Age : ");
        over60Member.setAge(sc.nextInt());

        System.out.println("Enter membership price : ");
        over60Member.setMembershipPrice(sc.next());

        System.out.println("Enter membership start date :  ");
        over60Member.setMembershipStartDate(sc.next());
        memberList.add(over60Member);
        infor ="member's id " +over60Member.getMembershipNo()+
                "\nMember Name "+over60Member.getMembername()+ "\nmembers NiC number" +over60Member.getMemberNicNo()+
                "\nmembers birth day "+over60Member.getMemberBirthday()+
                "\nmembership price" +over60Member.getMembershipPrice()+
                "\nmembership starting date" +over60Member.getMembershipStartDate()+"\n";


    }
}
