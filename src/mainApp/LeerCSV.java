/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainApp;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ivant
 */
public class LeerCSV {
    
    public static ArrayList<String> datosCSV() throws FileNotFoundException, IOException, CsvValidationException{
        BufferedReader br = null;         
        br =new BufferedReader(new FileReader("src/mainApp/simulador1/Preguntas.csv"));
        String line = br.readLine();
        ArrayList <String> datos = new ArrayList<>();
        
        while (null!=line) {
            String [] fields = line.split(";");           
            datos.add(Arrays.toString(fields));            
            line = br.readLine();
        }
        
        return datos;
    }
}
