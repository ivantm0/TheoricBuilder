/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainApp;

import com.opencsv.exceptions.CsvValidationException;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ivant
 */
public class MainApp extends javax.swing.JFrame {

    /**
     * Creates new form prueba
     */
    private GridLayout layout;
    Preguntas p = new Preguntas();
    Preguntas p2 = new Preguntas();
    public MainApp() throws IOException, FileNotFoundException, CsvValidationException {
        initComponents();
        ContDesp.setVisible(false);
        PanelInfo.setVisible(false);
        Anadir.setVisible(false);
        setImageLabel(Mas, "src/images/Mas_off.png");
        setImageLabel(Info, "src/images/Info_off.png");
        setImageLabel(Desplegable, "src/images/Desplegable_on.png");
        setImageLabel(FondoDesp, "src/images/Cuadrado_off.png");
        setImageLabel(Menos, "src/images/Menos_off.png");
        setImageLabel(Fondo, "src/images/Cuadrado_off.png");
        Panel.getViewport().setOpaque(false);
        Panel.setViewportBorder(null);
        //Panel.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));
        
        //setImageLabel(Crear, "src/images/Cilindrico_off.png");
        //jPanel2.setLayout(new GridLayout(p.longitud("src/mainApp/simulador1/Preguntas.csv"), 0));
        layout = new GridLayout(p.longitud("src/mainApp/simulador1/Preguntas.csv"), 0);
        jPanel2.setLayout(layout);
        
        jPanel2.removeAll();
        
        JPanel asdf = new JPanel();
        JPanel asdf2 = new JPanel();
        asdf=p.leerCSV("src/mainApp/simulador1/Preguntas.csv",0);
        asdf2=p.leerCSV("src/mainApp/simulador1/Preguntas.csv",1);
        jPanel2.add(asdf);
        jPanel2.add(asdf2);
        jPanel2.revalidate();
        jPanel2.repaint();
        /*for(int i=0; i<p.longitud("src/mainApp/simulador1/Preguntas.csv"); i++){
            //jPanel2.removeAll();
            System.out.println(i);
            
            contenedor.add(p.leerCSV("src/mainApp/simulador1/Preguntas.csv",i));
            contenedor.add(p.leerCSV("src/mainApp/simulador1/Preguntas.csv",i));
        }*/
    }
    
    public void setImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenido = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        frase1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Display = new javax.swing.JLabel();
        Desplegable = new javax.swing.JLabel();
        frase2 = new javax.swing.JLabel();
        Mas = new javax.swing.JLabel();
        Info = new javax.swing.JLabel();
        Anadir = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
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
        Panel = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        PanelInfo = new javax.swing.JPanel();
        Texto1 = new javax.swing.JLabel();
        Texto2 = new javax.swing.JLabel();
        Texto3 = new javax.swing.JLabel();
        FondoInfo = new javax.swing.JLabel();
        ContDesp = new javax.swing.JPanel();
        Opcion1 = new javax.swing.JLabel();
        Opcion2 = new javax.swing.JLabel();
        Opcion3 = new javax.swing.JLabel();
        Opcion4 = new javax.swing.JLabel();
        Opcion5 = new javax.swing.JLabel();
        FondoDesp = new javax.swing.JLabel();
        Crear = new javax.swing.JLabel();
        EtiqCrear = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(430, 932));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        Contenido.setBackground(new java.awt.Color(5, 19, 36));

        titulo.setFont(new java.awt.Font("Raleway", 1, 20)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Crea tu simulador teórico");

        frase1.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        frase1.setForeground(new java.awt.Color(255, 255, 255));
        frase1.setText("Tipo de simulador");

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Display.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        Display.setForeground(new java.awt.Color(255, 255, 255));
        Display.setText("Ahora aprendo");
        jPanel1.add(Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 350, 30));

        Desplegable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Desplegable_Off.png"))); // NOI18N
        Desplegable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DesplegableMouseReleased(evt);
            }
        });
        jPanel1.add(Desplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 50));

        frase2.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        frase2.setForeground(new java.awt.Color(255, 255, 255));
        frase2.setText("Añadir una pregunta");

        Mas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Mas_Off.png"))); // NOI18N
        Mas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MasMouseReleased(evt);
            }
        });

        Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Mas_Off.png"))); // NOI18N
        Info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                InfoMouseReleased(evt);
            }
        });

        Anadir.setOpaque(false);
        Anadir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBorder(null);
        Anadir.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 56, 300, 20));

        jTextField2.setBorder(null);
        Anadir.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 300, 20));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setForeground(new java.awt.Color(153, 153, 153));
        jTextField3.setBorder(null);
        Anadir.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 300, 20));

        jTextField4.setBorder(null);
        Anadir.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 300, 20));

        jTextField5.setBorder(null);
        Anadir.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 300, 20));

        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Pregunta");
        Anadir.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, -1));

        TituloPreg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Panel_Info.png"))); // NOI18N
        Anadir.add(TituloPreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 320, 50));

        Titulo1.setForeground(new java.awt.Color(255, 255, 255));
        Titulo1.setText("Respuesta correcta");
        Anadir.add(Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 120, -1));

        Correcta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Panel_Info.png"))); // NOI18N
        Anadir.add(Correcta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 320, 30));

        Titulo2.setForeground(new java.awt.Color(255, 255, 255));
        Titulo2.setText("Respuestas incorrectas");
        Anadir.add(Titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 140, 20));

        Incorrecta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Panel_Info.png"))); // NOI18N
        Anadir.add(Incorrecta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 320, 30));

        Incorrecta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Panel_Info.png"))); // NOI18N
        Anadir.add(Incorrecta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 320, 30));

        Incorrecta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Panel_Info.png"))); // NOI18N
        Anadir.add(Incorrecta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 320, 30));

        Menos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menos_Off.png"))); // NOI18N
        Anadir.add(Menos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 20, 20));
        Anadir.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 290));

        Panel.setBackground(new java.awt.Color(0, 0, 204));
        Panel.setBorder(null);
        Panel.setForeground(new java.awt.Color(255, 51, 51));
        Panel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        Panel.setOpaque(false);

        jPanel2.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        Panel.setViewportView(jPanel2);

        PanelInfo.setOpaque(false);
        PanelInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Texto1.setBackground(new java.awt.Color(255, 255, 255));
        Texto1.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        Texto1.setForeground(new java.awt.Color(255, 255, 255));
        Texto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto1.setText("Añade las preguntas que quieres que aparezcan durante");
        PanelInfo.add(Texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 343, -1));

        Texto2.setBackground(new java.awt.Color(255, 255, 255));
        Texto2.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        Texto2.setForeground(new java.awt.Color(255, 255, 255));
        Texto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto2.setText("la simulación. Luego pulsa el botón crear para exportar");
        PanelInfo.add(Texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 343, -1));

        Texto3.setBackground(new java.awt.Color(255, 255, 255));
        Texto3.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        Texto3.setForeground(new java.awt.Color(255, 255, 255));
        Texto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto3.setText("El archivo zip que deberas subir SharePoint");
        PanelInfo.add(Texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 343, -1));

        FondoInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Panel_Info.png"))); // NOI18N
        PanelInfo.add(FondoInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 80));

        ContDesp.setOpaque(false);
        ContDesp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Opcion1.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        Opcion1.setForeground(new java.awt.Color(255, 255, 255));
        Opcion1.setText("Ahora aprendo");
        Opcion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Opcion1MouseReleased(evt);
            }
        });
        ContDesp.add(Opcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, -1));

        Opcion2.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        Opcion2.setForeground(new java.awt.Color(255, 255, 255));
        Opcion2.setText("El cazador");
        Opcion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Opcion2MouseReleased(evt);
            }
        });
        ContDesp.add(Opcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 360, -1));

        Opcion3.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        Opcion3.setForeground(new java.awt.Color(255, 255, 255));
        Opcion3.setText("Atrapa los univercoins");
        Opcion3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Opcion3MouseReleased(evt);
            }
        });
        ContDesp.add(Opcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 360, -1));

        Opcion4.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        Opcion4.setForeground(new java.awt.Color(255, 255, 255));
        Opcion4.setText("BAAM");
        Opcion4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Opcion4MouseReleased(evt);
            }
        });
        ContDesp.add(Opcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 360, -1));

        Opcion5.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        Opcion5.setForeground(new java.awt.Color(255, 255, 255));
        Opcion5.setText("PiensoPalabra");
        Opcion5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Opcion5MouseReleased(evt);
            }
        });
        ContDesp.add(Opcion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 128, 360, 20));
        ContDesp.add(FondoDesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 160));

        Crear.setForeground(new java.awt.Color(255, 255, 255));
        Crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cilindrico_Off.png"))); // NOI18N

        EtiqCrear.setBackground(new java.awt.Color(5, 19, 36));
        EtiqCrear.setFont(new java.awt.Font("Raleway", 1, 20)); // NOI18N
        EtiqCrear.setForeground(new java.awt.Color(255, 255, 255));
        EtiqCrear.setText("Crear");

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(EtiqCrear))
                    .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenidoLayout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Anadir, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContenidoLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(titulo))
                    .addComponent(frase1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContDesp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContenidoLayout.createSequentialGroup()
                        .addComponent(frase2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Mas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addComponent(Panel)
                    .addComponent(PanelInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(titulo)
                .addGap(24, 24, 24)
                .addComponent(frase1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContDesp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frase2)
                    .addComponent(Mas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Anadir, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(EtiqCrear))
                    .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        getContentPane().add(Contenido);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InfoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfoMouseReleased
        if(cont2 == 0){
            PanelInfo.setVisible(true);
            setImageLabel(FondoInfo, "src/images/Panel_Info.png");
            setImageLabel(Info, "src/images/Info_on.png");
            cont2++;
        }else{
            PanelInfo.setVisible(false);
            setImageLabel(Info, "src/images/Info_off.png");
            cont2--;
        }
    }//GEN-LAST:event_InfoMouseReleased

    private void Opcion1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion1MouseReleased
        Display.setText("Ahora aprendo");
        ContDesp.setVisible(false);
        setImageLabel(Desplegable, "src/images/Desplegable_on.png");
        cont--;
    }//GEN-LAST:event_Opcion1MouseReleased

    private void DesplegableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DesplegableMouseReleased
        if(cont == 0){
            ContDesp.setVisible(true);
            setImageLabel(FondoDesp, "src/images/Panel_Info.png");
            setImageLabel(Desplegable, "src/images/Desplegable_off.png");
            cont++;
        }else{
            ContDesp.setVisible(false);
            setImageLabel(Desplegable, "src/images/Desplegable_on.png");
            cont--;
        }
    }//GEN-LAST:event_DesplegableMouseReleased

    private void Opcion2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion2MouseReleased
        Display.setText("El cazador");
        ContDesp.setVisible(false);
        setImageLabel(Desplegable, "src/images/Desplegable_on.png");
        cont--;
    }//GEN-LAST:event_Opcion2MouseReleased

    private void Opcion3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion3MouseReleased
        Display.setText("Atrapa los univercoins");
        ContDesp.setVisible(false);
        setImageLabel(Desplegable, "src/images/Desplegable_on.png");
        cont--;
    }//GEN-LAST:event_Opcion3MouseReleased

    private void Opcion4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion4MouseReleased
        Display.setText("BAAM");
        ContDesp.setVisible(false);
        setImageLabel(Desplegable, "src/images/Desplegable_on.png");
        cont--;
    }//GEN-LAST:event_Opcion4MouseReleased

    private void Opcion5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion5MouseReleased
        Display.setText("PiensoPalabra");
        ContDesp.setVisible(false);
        setImageLabel(Desplegable, "src/images/Desplegable_on.png");
        cont--;
    }//GEN-LAST:event_Opcion5MouseReleased

    private void MasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MasMouseReleased
        
        if(cont3 == 0){
            Anadir.setVisible(true);
            setImageLabel(Mas, "src/images/Mas_on.png");
            setImageLabel(TituloPreg, "src/images/Panel_Info.png");
            setImageLabel(Correcta, "src/images/Panel_Info.png");
            setImageLabel(Incorrecta1, "src/images/Panel_Info.png");
            setImageLabel(Incorrecta2, "src/images/Panel_Info.png");
            setImageLabel(Incorrecta3, "src/images/Panel_Info.png");
            cont3++;
        }else{
            Anadir.setVisible(false);
            setImageLabel(Mas, "src/images/Mas_off.png");
            cont3--;
        }
    }//GEN-LAST:event_MasMouseReleased

    int cont = 0, cont2 = 0, cont3 = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainApp().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
                } catch (CsvValidationException ex) {
                    Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Anadir;
    private javax.swing.JPanel ContDesp;
    private javax.swing.JPanel Contenido;
    private javax.swing.JLabel Correcta;
    private javax.swing.JLabel Crear;
    private javax.swing.JLabel Desplegable;
    private javax.swing.JLabel Display;
    private javax.swing.JLabel EtiqCrear;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FondoDesp;
    private javax.swing.JLabel FondoInfo;
    private javax.swing.JLabel Incorrecta1;
    private javax.swing.JLabel Incorrecta2;
    private javax.swing.JLabel Incorrecta3;
    private javax.swing.JLabel Info;
    private javax.swing.JLabel Mas;
    private javax.swing.JLabel Menos;
    private javax.swing.JLabel Opcion1;
    private javax.swing.JLabel Opcion2;
    private javax.swing.JLabel Opcion3;
    private javax.swing.JLabel Opcion4;
    private javax.swing.JLabel Opcion5;
    private javax.swing.JScrollPane Panel;
    private javax.swing.JPanel PanelInfo;
    private javax.swing.JLabel Texto1;
    private javax.swing.JLabel Texto2;
    private javax.swing.JLabel Texto3;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel TituloPreg;
    private javax.swing.JLabel frase1;
    private javax.swing.JLabel frase2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
