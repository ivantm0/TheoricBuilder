/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainApp;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ivant
 */
public class PreguntasCSV {
    
    public static ArrayList leerCSV() throws FileNotFoundException, IOException, CsvValidationException{
        String archCSV = "src/javaapplication15/Preguntas.csv";
        CSVReader csvReader = new CSVReader(new FileReader(archCSV));
        String[] fila = null;
        ArrayList<String> fila2 = new ArrayList<>();
        
        while((fila = csvReader.readNext()) != null) {
            //System.out.println(fila[0] + " | " + fila[1] + " |  " + fila[2]);
            fila2.add(fila[0]);
            fila2.add(fila[1]);
            fila2.add(fila[2]);
            fila2.add(fila[3]);
            fila2.add(fila[4]);
        }
        
        csvReader.close();
        return fila2;
    }
    
    public static void cargarPanel(ArrayList lista){
        
    }
}
