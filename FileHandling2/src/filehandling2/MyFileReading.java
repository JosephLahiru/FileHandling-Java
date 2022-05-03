/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filehandling2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josephlahiru
 */
public class MyFileReading {
    public static void main(String[] args) {
        File f = new File("/Users/josephlahiru/Documents/students_write.txt");
        FileReader fr = null;
        BufferedReader in = null;
        try{
            fr = new FileReader(f);
            in = new BufferedReader(fr);
            
            String line = in.readLine();
            
            while(line != null){
                System.out.println(line);
                line = in.readLine();
            }
        }
        catch(FileNotFoundException ex){
            Logger.getLogger(MyFileReading.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(IOException ex){
            Logger.getLogger(MyFileReading.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                in.close();
            }
            catch(IOException ex){
                Logger.getLogger(MyFileReading.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
}
