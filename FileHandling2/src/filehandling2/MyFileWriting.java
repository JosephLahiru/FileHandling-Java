/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josephlahiru
 */
public class MyFileWriting {
    public static void main(String[] args) {
        File f = new File("/Users/josephlahiru/Documents/students_write.txt");
        try {
            FileWriter fw = new FileWriter(f, true); //append on
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw, true); //auto flush on
            
            String line1 = "ID\t\tName";
            out.println(line1);
            String line2 = "1\t\tMeena";
            out.println(line2);
            String line3 = "1\t\tSeetha";
            out.println(line3);
            String line4 = "1\t\tPolbee";
            out.println(line4);
            String line5 = "1\t\tMuunaa";
            out.println(line5);
            
            //out.flush();
            out.close();
            
        } catch (IOException ex) {
            Logger.getLogger(MyFileWriting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
