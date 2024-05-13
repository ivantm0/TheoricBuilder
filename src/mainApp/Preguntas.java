package mainApp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */


import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ivant
 */
public class Preguntas extends javax.swing.JPanel {

    /**
     * Creates new form Preguntas2
     */
    int indexSimulador;
    public Preguntas(int indexSimulador) throws IOException, FileNotFoundException, CsvValidationException {
        initComponents();
        this.indexSimulador = indexSimulador;
        setImageLabel(Menos, "src/images/Menos_on.png", 20, 20);
        setImageLabel(Fondo, "src/images/Cuadrado_off.png", 390, 288);
        setImageLabel(TituloPreg, "src/images/Rectangulo_on.png", 320, 40);
        setImageLabel(Correcta, "src/images/Rectangulo_on.png", 320, 20);
        setImageLabel(Incorrecta1, "src/images/Rectangulo_on.png", 320, 20);
        setImageLabel(Incorrecta2, "src/images/Rectangulo_on.png", 320, 20);
        setImageLabel(Incorrecta3, "src/images/Rectangulo_on.png", 320, 20);
    }
    
    public void setImageLabel(JLabel labelName, String root, int width, int height){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }
    
    public void cargarCSV(int index, String ruta) throws IOException, FileNotFoundException, CsvValidationException{
        ArrayList<String> datos = new ArrayList<>();
        datos = datosCSV(ruta);
        String texto = datos.get(index);
        
        String[] partes = texto.split(",");
        
        TextoPregunta.setText(partes[0].replaceAll("\\[", ""));
        jLabel1.setText(partes[1]);
        jLabel3.setText(partes[2]);
        jLabel4.setText(partes[3]);
        jLabel5.setText(partes[4].replaceAll("\\]", ""));
    }
    
    public ArrayList<String> datosCSV(String ruta) throws FileNotFoundException, IOException, CsvValidationException{
        BufferedReader br = null;         
        br =new BufferedReader(new FileReader(ruta));
        String line = br.readLine();
        ArrayList <String> datos = new ArrayList<>();
        
        while (null!=line) {
            String [] fields = line.split(";");           
            datos.add(Arrays.toString(fields));            
            line = br.readLine();
        }
        
        return datos;
    }
    
    public void eliminarDato(String datoEliminar, String ruta) throws IOException, FileNotFoundException, CsvValidationException{
        File inputFile = new File(ruta);
        File tempFile = new File("src/mainApp/simulador5/Preguntas2.csv");
    
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
        
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            if (currentLine.contains(datoEliminar)) {
                continue;
            }
            writer.write(currentLine + "\n");
        }
        writer.close();
        reader.close();
        inputFile.delete();
        tempFile.renameTo(inputFile);
    }
    
    public int longitudCSV(String ruta) throws IOException, FileNotFoundException, CsvValidationException{
        ArrayList<String> datos = new ArrayList<>();
        datos = datosCSV(ruta);
        
        return datos.size();
    }
    
    public void anadirDatos(String ruta, String[] datos, ArrayList todo) throws IOException{
        CSVWriter writer = new CSVWriter(new FileWriter(ruta));
        todo.add(datos);
        writer.writeNext(datos);
        writer.close();
    }
    
    void escribirCSV(String file, String[] datos){
        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println(datos[0] + "," + datos[1] + "," + datos[2] + "," + datos[3] + "," + datos[4]);

            printWriter.flush();
            printWriter.close();

        }catch (IOException e){
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        TextoPregunta = new javax.swing.JLabel();
        TituloPreg = new javax.swing.JLabel();
        Titulo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Correcta = new javax.swing.JLabel();
        Titulo2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Incorrecta1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Incorrecta2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Incorrecta3 = new javax.swing.JLabel();
        Menos = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Pregunta");
        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, -1));

        TextoPregunta.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        TextoPregunta.setForeground(new java.awt.Color(5, 19, 36));
        add(TextoPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 300, 40));

        TituloPreg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangulo_On.png"))); // NOI18N
        add(TituloPreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 320, 40));

        Titulo1.setForeground(new java.awt.Color(255, 255, 255));
        Titulo1.setText("Respuesta correcta");
        add(Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, -1));

        jLabel1.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 19, 36));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 300, 20));

        Correcta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangulo_On.png"))); // NOI18N
        add(Correcta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 320, 20));

        Titulo2.setForeground(new java.awt.Color(255, 255, 255));
        Titulo2.setText("Respuestas incorrectas");
        add(Titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 140, 20));

        jLabel3.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(5, 19, 36));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 300, 20));

        Incorrecta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangulo_On.png"))); // NOI18N
        add(Incorrecta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 320, 20));

        jLabel4.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(5, 19, 36));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 300, 20));

        Incorrecta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangulo_On.png"))); // NOI18N
        add(Incorrecta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 320, 20));

        jLabel5.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(5, 19, 36));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 300, 20));

        Incorrecta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangulo_On.png"))); // NOI18N
        add(Incorrecta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 320, 20));

        Menos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menos_Off.png"))); // NOI18N
        Menos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenosMouseReleased(evt);
            }
        });
        add(Menos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 20, 20));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo.png"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void MenosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenosMouseReleased
        //String d = TextoPregunta.getText() + ";" + jLabel1.getText() + ";" + jLabel3.getText() + ";" + jLabel4.getText() + ";" + jLabel5.getText();

        try {
            eliminarDato(TextoPregunta.getText(), "src/mainApp/simulador" + indexSimulador +"/Preguntas.csv");
        } catch (IOException ex) {
            Logger.getLogger(Preguntas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CsvValidationException ex) {
            Logger.getLogger(Preguntas.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.removeAll();
        this.revalidate();
        this.repaint();

    }//GEN-LAST:event_MenosMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Correcta;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Incorrecta1;
    private javax.swing.JLabel Incorrecta2;
    private javax.swing.JLabel Incorrecta3;
    private javax.swing.JLabel Menos;
    private javax.swing.JLabel TextoPregunta;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel TituloPreg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
