package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class addmember {
static Scanner sc = new Scanner(System.in);

    public static void addMember() throws IOException {
        System.out.println("Number of occupied slots : " +UserInfo.memberList.size());
        System.out.println("Number of free slots : " + (100 - UserInfo.memberList.size()));

        if (UserInfo.memberList.size() < 100) {
            System.out.println("  1) Number 1 for Student Member");
            System.out.println("  2) Number 2 for Default Member");
            System.out.println("  3) Number 3 for Over60 Member");
            System.out.println(" enter your member type  : ");
            int User_Input = sc.nextInt();
            switch (User_Input) {
                case 1:
                   UserInfo.addStudentMember();
                    saveInfo.Write_SaveFile(UserInfo.infor);
                    UserMenu.mainWindow();
                    break;
                case 2:
                    UserInfo.addDefaultMember();
                    saveInfo.Write_SaveFile(UserInfo.infor);
                    UserMenu.mainWindow();
                    break;
                case 3:
                    UserInfo.addOver60Member();
                    saveInfo.Write_SaveFile(UserInfo.infor);
                    UserMenu.mainWindow();
                    break;

                default:
                    System.out.println("Invalid Input !");
                   UserMenu.mainWindow();

            } }else{
                System.out.println("No free slots available for new members");
            }
        }
    }
