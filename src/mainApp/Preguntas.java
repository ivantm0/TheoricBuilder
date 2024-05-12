package mainApp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
    public Preguntas() throws IOException, FileNotFoundException, CsvValidationException {
        initComponents();
        //setImageLabel(Fondo, "src/images/Cuadrado_off.png");
        
    }
    
    public void setImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }
    
    public int longitud(String ruta) throws FileNotFoundException, IOException, CsvValidationException{
        String archCSV = ruta;
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
        
        int z=0,x=1,c=2,v=3,b=4;
        return fila2.size()/5;
    }
    
    public JPanel leerCSV(String ruta, int index) throws FileNotFoundException, IOException, CsvValidationException{
        String archCSV = ruta;
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
        
        int z=0,x=1,c=2,v=3,b=4;
        String[] elementos = new String[fila2.size()/5];
        for(int i=0; i<fila2.size()/5; i++){
            elementos[i] = fila2.get(z) + ", " + fila2.get(x) + ", " + fila2.get(c) + ", " + fila2.get(v) + ", " + fila2.get(b);
            z+=5; x+=5; c+=5;  v+=5; b+=5;
        }
        
        String[] preguntas = elementos[index].split(",");
 
        TextoPregunta.setText(preguntas[0]);
        jLabel1.setText(preguntas[1]);
        jLabel3.setText(preguntas[2]);
        jLabel4.setText(preguntas[3]);
        jLabel5.setText(preguntas[4]);
        
        csvReader.close();
        return this;
    }
    
    public JPanel cargarPanel(JPanel panel, JPanel donde) throws IOException, FileNotFoundException, CsvValidationException{
        donde.add(panel);
        return donde;
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

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Pregunta");
        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, -1));

        TextoPregunta.setForeground(new java.awt.Color(255, 255, 255));
        add(TextoPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 300, 20));

        TituloPreg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangulo_On.png"))); // NOI18N
        add(TituloPreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 320, 40));

        Titulo1.setForeground(new java.awt.Color(255, 255, 255));
        Titulo1.setText("Respuesta correcta");
        add(Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 300, 20));

        Correcta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangulo_On.png"))); // NOI18N
        add(Correcta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 320, 20));

        Titulo2.setForeground(new java.awt.Color(255, 255, 255));
        Titulo2.setText("Respuestas incorrectas");
        add(Titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 140, 20));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 300, 20));

        Incorrecta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangulo_On.png"))); // NOI18N
        add(Incorrecta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 320, 20));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 300, 20));

        Incorrecta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangulo_On.png"))); // NOI18N
        add(Incorrecta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 320, 20));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 300, 20));

        Incorrecta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangulo_On.png"))); // NOI18N
        add(Incorrecta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 320, 20));

        Menos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menos_Off.png"))); // NOI18N
        Menos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenosMouseReleased(evt);
            }
        });
        add(Menos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 20, 20));

        Fondo.setBackground(new java.awt.Color(102, 102, 255));
        Fondo.setForeground(new java.awt.Color(102, 102, 255));
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void MenosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenosMouseReleased

        
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
