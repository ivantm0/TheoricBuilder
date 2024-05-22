package mainApp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

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
    int indexSim;
    JPanel panel = new JPanel();
    public Preguntas(int indexSimulador, JPanel panel) throws IOException, FileNotFoundException{
        initComponents();
        this.panel = panel;
        this.indexSim = indexSimulador;
        setImageLabel(Menos, "src/images/Menos_on.png", 20, 20);
        setImageLabel(Fondo, "src/images/Cuadrado_off.png", 390, 293);
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
    
    public void showPanel(JPanel p, JPanel p2){
        p.setSize(p2.getWidth(), p2.getHeight());
        p.setLocation(0, 0);
        //p2.removeAll();
        p2.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        p2.revalidate();
        p2.repaint();
    }
    
    public ArrayList<String> datosCSV(String ruta) throws FileNotFoundException, IOException{
        File archivoPreguntas = new File(ruta);
        
        if(!archivoPreguntas.exists()){
            archivoPreguntas.createNewFile();
        }
        
        BufferedReader br = null;         
        br =new BufferedReader(new FileReader(archivoPreguntas));
        String line = br.readLine();
        ArrayList <String> datos = new ArrayList<>();
        
        while (null!=line) {
            String [] campos = line.split(";");           
            datos.add(Arrays.toString(campos));            
            line = br.readLine();
        }
        br.close();
        
        return datos;
    }

    public ArrayList<Preguntas> cargarCSV(ArrayList datosCargar, JPanel panel, int index) throws IOException, FileNotFoundException{
        ArrayList<String> datos = new ArrayList<>();
        datos = datosCargar;
        ArrayList<Preguntas> paneles= new ArrayList<>();
        panel.removeAll();
        
        for(int i=0; i<datos.size(); i++){
            paneles.add(new Preguntas(index, panel));
            String texto = datos.get(i);
            String[] partes = texto.split(",");            
            paneles.get(i).TextoPregunta.setText(partes[0].replaceAll("\\[", ""));
            paneles.get(i).jLabel1.setText(partes[1]);
            paneles.get(i).jLabel3.setText(partes[2]);
            paneles.get(i).jLabel4.setText(partes[3]);
            paneles.get(i).jLabel5.setText(partes[4].replaceAll("\\]", ""));            
            showPanel(paneles.get(i), panel);
        }
        
        return paneles;
    }
    
    public void altCargarCSV(JPanel panel, int index) throws IOException, FileNotFoundException{
        ArrayList<String> datos = new ArrayList<>();
        datos = datosCSV("src/mainApp/simulador" + index + "/Preguntas.csv");
        ArrayList<Preguntas> paneles= new ArrayList<>();
        panel.removeAll();
        
        for(int i=0; i<datos.size(); i++){
            paneles.add(new Preguntas(index, panel));
            String texto = datos.get(i);
            String[] partes = texto.split(",");            
            paneles.get(i).TextoPregunta.setText(partes[0].replaceAll("\\[", ""));
            paneles.get(i).jLabel1.setText(partes[1]);
            paneles.get(i).jLabel3.setText(partes[2]);
            paneles.get(i).jLabel4.setText(partes[3]);
            paneles.get(i).jLabel5.setText(partes[4].replaceAll("\\]", ""));            
            showPanel(paneles.get(i), panel);
        }
    }
    
    public ArrayList leerVacio(ArrayList arrayPreguntas, ArrayList preguntas) throws FileNotFoundException, IOException{
        ArrayList<String> datos = new ArrayList<>();
        ArrayList<String> nuevosDatos = new ArrayList<>();
        datos = arrayPreguntas;
        ArrayList<Preguntas> paneles = new ArrayList<>();
        paneles = preguntas;
        
        /*for(int i=0; i<datos.size(); i++){
            System.out.println(datos.get(i));
        }*/
        
        for(int i=0; i<datos.size(); i++){
            String[] partes = new String[5];
            partes[0] = paneles.get(i).TextoPregunta.getText();
            partes[1] = paneles.get(i).jLabel1.getText();
            partes[2] = paneles.get(i).jLabel3.getText();
            partes[3] = paneles.get(i).jLabel4.getText();
            partes[4] = paneles.get(i).jLabel5.getText();
            nuevosDatos.add(partes[0] + "," + partes[1] + "," + partes[2] + "," + partes[3] + "," + partes[4]);
        }
        return nuevosDatos;
    }
    
    public boolean arrayVacio(ArrayList comprobar){
        boolean flag = false;
        for(int i=0; i<comprobar.size(); i++){
            if(comprobar.get(i).equals(" , , , , ") || comprobar.get(i).equals(",,,,")){
                return true;
            }
        }
        
        return flag;
    }
    
    public void escribirCSV(String file, String[] datos){
        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println(datos[0] + ";" + datos[1] + ";" + datos[2] + ";" + datos[3] + ";" + datos[4]);

            printWriter.flush();
            printWriter.close();

        }catch (IOException e){
            System.out.println(e);
        }
    }
    
    public void eliminarDato(String datoEliminar, int indexSimulador) throws IOException, FileNotFoundException{
        File archivoPreguntas = new File("src/mainApp/simulador" + indexSimulador + "/Preguntas.csv");
        File archivoAux = new File("src/mainApp/simulador" + indexSimulador + "/Preguntas2.csv");
    
        BufferedReader reader = new BufferedReader(new FileReader(archivoPreguntas));
        BufferedWriter writer = new BufferedWriter(new FileWriter(archivoAux));
        
        String linea;
        while ((linea = reader.readLine()) != null) {
            if (linea.replaceAll(" ", "").contains(datoEliminar.replaceAll(" ", ""))) {
                continue;
            }
            writer.write(linea + "\n");
        }
        writer.close();
        reader.close();
        archivoPreguntas.delete();
        archivoAux.renameTo(archivoPreguntas);      
    }
    
    public void eliminarDato2(ArrayList arrayNuevo, int indexSimulador) throws IOException{
        File archivoPreguntas = new File("src/mainApp/simulador" + indexSimulador + "/Preguntas.csv");
        File archivoAux = new File("src/mainApp/simulador" + indexSimulador + "/Preguntas2.csv");
    
        //BufferedReader reader = new BufferedReader(new FileReader(archivoPreguntas));
        BufferedWriter writer = new BufferedWriter(new FileWriter(archivoAux));
        
        for(int i=0; i<arrayNuevo.size(); i++){
            writer.write(arrayNuevo.get(i)+ "\n");
        }
        
        writer.close();
        archivoPreguntas.delete();
        archivoAux.renameTo(archivoPreguntas);      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JTextField();
        TextoPregunta = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        TituloPreg = new javax.swing.JLabel();
        Titulo1 = new javax.swing.JLabel();
        Correcta = new javax.swing.JLabel();
        Titulo2 = new javax.swing.JLabel();
        Incorrecta1 = new javax.swing.JLabel();
        Incorrecta2 = new javax.swing.JLabel();
        Incorrecta3 = new javax.swing.JLabel();
        Menos = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(181, 225, 249));
        jLabel5.setForeground(new java.awt.Color(5, 19, 36));
        jLabel5.setBorder(null);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 248, 300, 20));

        jLabel4.setBackground(new java.awt.Color(181, 225, 249));
        jLabel4.setForeground(new java.awt.Color(5, 19, 36));
        jLabel4.setBorder(null);
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 300, 20));

        jLabel3.setBackground(new java.awt.Color(181, 225, 249));
        jLabel3.setForeground(new java.awt.Color(5, 19, 36));
        jLabel3.setBorder(null);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 300, 20));

        jLabel1.setBackground(new java.awt.Color(181, 225, 249));
        jLabel1.setForeground(new java.awt.Color(5, 19, 36));
        jLabel1.setToolTipText("");
        jLabel1.setBorder(null);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 300, 20));

        TextoPregunta.setBackground(new java.awt.Color(181, 225, 249));
        TextoPregunta.setForeground(new java.awt.Color(5, 19, 36));
        TextoPregunta.setToolTipText("");
        TextoPregunta.setBorder(null);
        add(TextoPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 300, 40));

        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Pregunta");
        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, -1));

        TituloPreg.setBackground(new java.awt.Color(181, 225, 249));
        TituloPreg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangulo_On.png"))); // NOI18N
        add(TituloPreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 320, 40));

        Titulo1.setForeground(new java.awt.Color(255, 255, 255));
        Titulo1.setText("Respuesta correcta");
        add(Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, -1));

        Correcta.setBackground(new java.awt.Color(181, 225, 249));
        Correcta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangulo_On.png"))); // NOI18N
        add(Correcta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 320, 20));

        Titulo2.setForeground(new java.awt.Color(255, 255, 255));
        Titulo2.setText("Respuestas incorrectas");
        add(Titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 140, 20));

        Incorrecta1.setBackground(new java.awt.Color(181, 225, 249));
        Incorrecta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangulo_On.png"))); // NOI18N
        add(Incorrecta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 320, 20));

        Incorrecta2.setBackground(new java.awt.Color(181, 225, 249));
        Incorrecta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangulo_On.png"))); // NOI18N
        add(Incorrecta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 320, 20));

        Incorrecta3.setBackground(new java.awt.Color(181, 225, 249));
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
        String d = TextoPregunta.getText() + "," + jLabel1.getText() + "," + jLabel3.getText() + "," + jLabel4.getText() + "," + jLabel5.getText();
        try {
            eliminarDato(d, indexSim);
            this.removeAll();
        this.revalidate();
        this.repaint();
            altCargarCSV(panel, indexSim);
            
        } catch (IOException ex) {
            Logger.getLogger(Preguntas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        //colocarPanel("src/mainApp/simulador" + indexSimulador +"/Preguntas.csv");
    }//GEN-LAST:event_MenosMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Correcta;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Incorrecta1;
    private javax.swing.JLabel Incorrecta2;
    private javax.swing.JLabel Incorrecta3;
    private javax.swing.JLabel Menos;
    private javax.swing.JTextField TextoPregunta;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel TituloPreg;
    private javax.swing.JTextField jLabel1;
    private javax.swing.JTextField jLabel3;
    private javax.swing.JTextField jLabel4;
    private javax.swing.JTextField jLabel5;
    // End of variables declaration//GEN-END:variables
}
