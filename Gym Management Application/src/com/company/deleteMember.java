package com.company;

import java.io.IOException;
public class deleteMember {
    public static void deleteMember(String membershipNo) throws IOException {
            for (int s=0; s< UserInfo.memberList.size();s++) {
                if (membershipNo.equals( UserInfo.memberList.get(s).getMembershipNo())) {
                    UserInfo.memberList.remove(s);
                    System.out.println("Successfully removed the member ! ");
                    UserMenu.mainWindow();

                    break;
                }else{
                    System.out.println("Member Not Found !");
                    UserMenu.mainWindow();
                }
            }
    }

}
