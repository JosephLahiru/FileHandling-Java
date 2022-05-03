/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filehandling2;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josephlahiru
 */
public class MyBinaryFileWriting {
    public static void main(String[] args) {
        File f = new File("/Users/josephlahiru/Documents/writeBinaryStudent.dat");
        try {
            FileOutputStream fos = new FileOutputStream(f);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream out = new DataOutputStream(bos);
            
            String str = "Hello World";
            out.writeUTF(str);
            int num = 69;
            out.writeInt(num);
            
            out.flush();
            out.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyBinaryFileWriting.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MyBinaryFileWriting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
