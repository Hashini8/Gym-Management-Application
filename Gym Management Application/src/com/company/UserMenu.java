package com.company;

import java.io.IOException;
import java.util.Scanner;

public class UserMenu {
static Scanner sc = new Scanner(System.in);
    public static void mainWindow() throws IOException {


        System.out.println("                    GYM MANAGEMENT SYSTEM  ");
        System.out.println();
        System.out.println("                  1) Add a New Member             ");
        System.out.println("                  2) Delete a Member               ");
        System.out.println("                  3) Print Member List              ");
        System.out.println("                  4) Save & Write File             ");
        System.out.println("                  5) Exit                     ");


        System.out.println("    _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  ");


        int userCho = sc.nextInt();

        switch (userCho) {
            case 1:
                addmember.addMember();
                break;

            case 2:
                System.out.println("Delete member No : \n Enter q for back");
                String deleteNo = sc.next();
                if(deleteNo.equals("q")){
                    UserMenu.mainWindow();
                }else{
                deleteMember.deleteMember(deleteNo);
                break;}

            case 3:
               PrintMember.printMembersList();
                UserMenu.mainWindow();
                break;

            case 4:
                saveInfo.Write_SaveFile(UserInfo.infor);
                UserMenu.mainWindow();
                break;

            case 5:
                System.out.println("Thank you");
                break;

            default:
                System.out.println("Invalid input!");
                UserMenu.mainWindow();

        }
    }


}

