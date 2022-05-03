package filehandling2;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josephlahiru
 */
public class MyBinaryFileReading {
    public static void main(String[] args) {
        File f = new File("/Users/josephlahiru/Documents/writeBinaryStudent.dat");
        try {
            FileInputStream fis = new FileInputStream(f);
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream in = new DataInputStream(bis);
            
            String str = in.readUTF();
            int num = in.readInt();
            
            System.out.println(str + " " + num);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyBinaryFileReading.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MyBinaryFileReading.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
