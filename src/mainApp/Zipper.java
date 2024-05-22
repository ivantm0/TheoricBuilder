/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainApp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zipper {
    File zip;
    ZipOutputStream output;

    public Zipper(File zip) throws FileNotFoundException{
        this.output = new ZipOutputStream(new FileOutputStream(zip));
    }

    private boolean zipFile(File file){
        try {
            byte[] buf = new byte[1024];
            output.putNextEntry(new ZipEntry(file.getPath()));
            FileInputStream fis = new FileInputStream(file);
              int len;
              while ((len = fis.read(buf)) > 0) {
                output.write(buf, 0, len);
              }
              fis.close();
              output.closeEntry();
              return true;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    private boolean zipDir(File file) {
        try {
            output.putNextEntry(new ZipEntry(file.getPath()+File.pathSeparator));
            output.closeEntry();
            return true;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    private boolean add(File... files){
        for (File file : files){
            if (file.isDirectory()){
                zipDir(file);
                add(file.listFiles());
            } else {
                zipFile(file);
            }
        }
        return true;
    }

    public void zip(File... files) throws IOException{
        add(files);
        output.finish();
        output.close();
    }
}
