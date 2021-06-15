package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class saveInfo {
    static void Write_SaveFile(String Memberinf) throws IOException {

        File fil = new File("INFO.txt");
        FileWriter fileWr= null;
        PrintWriter printWr = null;
        try {
            fileWr = new FileWriter(fil,true);
            printWr = new PrintWriter(fileWr,true);
            printWr.print(Memberinf);
            printWr.println("");
            System.out.println("Success!.");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            fileWr.close();
            printWr.close();
        }
    }
}
