/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Busisness.Manager;
import DTO.User;
import Tools.Validator;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.TableView;

/**
 *
 * @author erabalf
 */
public class FrmConsultas extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmCconsultas
     */
    public FrmConsultas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        btnConsultarAlumno = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_c_Nombre = new javax.swing.JTextField();
        txt_c_Apellido = new javax.swing.JTextField();
        txt_c_DNI = new javax.swing.JTextField();
        txt_c_User = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_c_Email = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_datos_mostrar = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txt_c_Telefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnActualizarAlumno = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_c_Password = new javax.swing.JTextField();
        btnResetSeleccion = new javax.swing.JButton();
        btnBorrarAlumno = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        btnConsultarAlumno.setBackground(new java.awt.Color(0, 204, 255));
        btnConsultarAlumno.setText("CONSULTAR ALUMNO");
        btnConsultarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarAlumnoActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTAS y ACTUALIZACIONES DE ALUMNOS");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("DNI");

        jLabel5.setText("User");

        txt_c_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_c_NombreActionPerformed(evt);
            }
        });

        txt_c_DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_c_DNIActionPerformed(evt);
            }
        });

        jLabel6.setText("Email");

        txt_c_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_c_EmailActionPerformed(evt);
            }
        });

        Tabla_datos_mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_datos_mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_datos_mostrarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla_datos_mostrar);

        jLabel7.setText("Telefono");

        txt_c_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_c_TelefonoActionPerformed(evt);
            }
        });

        jLabel8.setText("(Unico)");

        jLabel9.setText("(Unico)");

        jLabel10.setText("(Unico)");

        btnActualizarAlumno.setText("ACTUALIZAR ALUMNO");
        btnActualizarAlumno.setEnabled(false);
        btnActualizarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAlumnoActionPerformed(evt);
            }
        });

        jLabel11.setText("Password");

        btnResetSeleccion.setText("RESET OPCIONES");
        btnResetSeleccion.setEnabled(false);
        btnResetSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetSeleccionActionPerformed(evt);
            }
        });

        btnBorrarAlumno.setText("BORRAR ALUMNO");
        btnBorrarAlumno.setEnabled(false);
        btnBorrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_c_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_c_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)))
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActualizarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(btnConsultarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnResetSeleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_c_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_c_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txt_c_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_c_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(txt_c_User, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBorrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(269, 269, 269))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_c_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_c_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_c_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(btnActualizarAlumno)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_c_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(txt_c_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_c_Password)
                                .addComponent(btnResetSeleccion)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_c_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(btnConsultarAlumno))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnBorrarAlumno)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_c_DNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_c_DNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_c_DNIActionPerformed

    private void btnConsultarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarAlumnoActionPerformed

        int resultado_operacion=0;
        int hay_datos=1; //Habilita ver todo
        
        String auxtmp;
        boolean validacion_formato_Apellido=false;
        boolean validacion_formato_Nombre=false;
        boolean validacion_formato_Email=false;
        boolean validacion_formato_Telefono=false;
        boolean validacion_formato_User=false;
        boolean validacion_formato_Password=false;
        boolean validacion_formato_DNI =false;
        User User_Consulta=new User();
        User User_Consulta_Respuesta=new User();
        
        Validator validacionTool=new Validator();
        btnConsultarAlumno.setBackground(Color.GREEN);

        
        if ((txt_c_DNI.getText().length()>5))                                   // Condicion Minima de DNI
        { 
          if ((txt_c_DNI.getText().length()>11))                                // Condicion Maxima de DNI
              txt_c_DNI.setText(txt_c_DNI.getText().substring(0,11));
                
          if ( validacionTool.SoloNumeros(txt_c_DNI.getText(),'D')==true)
          {
            validacion_formato_DNI=true; 
            txt_c_DNI.setBackground(Color.WHITE);
            hay_datos=1;
          }  
          else 
          {
            validacion_formato_DNI=false;
            txt_c_DNI.setBackground(Color.red);
          }
        }
        else
          if ((txt_c_DNI.getText().length()==0))  
          {
              txt_c_DNI.setBackground(Color.white);
              validacion_formato_DNI=true;
          }

          else
            txt_c_DNI.setBackground(Color.red);
              

        // verificamos si cada uno de los campos cumple con las caracteristicas minimas
        if (txt_c_Apellido.getText().length()>2)        // Condicion Minima de Apellido
        {  
             if ((txt_c_Apellido.getText().length()>20))// Condicion Maxima de Apellido
                 txt_c_Apellido.setText(txt_c_Apellido.getText().substring(0,20));
                if (validacionTool.SoloLetras(txt_c_Apellido.getText(),'A')==true) // D=DNI T=TELEFONO
                {    
                  validacion_formato_Apellido=true;
                  txt_c_Apellido.setBackground(Color.white);
                  hay_datos=1;
               }
                else
                {
                  txt_c_Apellido.setBackground(Color.red);  
                }
        }
        else
          if ((txt_c_Apellido.getText().length()==0))  
          {
            txt_c_Apellido.setBackground(Color.WHITE);
            validacion_formato_Apellido=true;
          }
          else
            txt_c_Apellido.setBackground(Color.red);
              
        
        if (txt_c_Nombre.getText().length()>2)         //Condicion Minima de Apellido
        {
            if ((txt_c_Nombre.getText().length()>20))// Condicion Maxima de Apellido
                 txt_c_Nombre.setText(txt_c_Nombre.getText().substring(0,20));
              if (validacionTool.SoloLetras(txt_c_Nombre.getText(),'A')==true)
              {
                validacion_formato_Nombre=true;
                txt_c_Nombre.setBackground(Color.white);
                hay_datos=1;
              }
              else
                txt_c_Nombre.setBackground(Color.red);
        }
        else
          if ((txt_c_Nombre.getText().length()==0))  
          {
              validacion_formato_Nombre=true;
              txt_c_Nombre.setBackground(Color.WHITE);
          }
          else
            txt_c_Nombre.setBackground(Color.red);
              
        
            
             
        if (txt_c_Email.getText().length()>4)       // Condicion Maxima de Email 
        {
            if ((txt_c_Email.getText().length()>25))// Condicion Maxima de Email
                 txt_c_Email.setText(txt_c_Email.getText().substring(0,25));
              if (validacionTool.SoloLetras(txt_c_Email.getText(),'E')==true)
              {
                 validacion_formato_Email=true;
                 txt_c_Email.setBackground(Color.white);
                hay_datos=1;
             }
              else
                 txt_c_Email.setBackground(Color.red);
        }
        else 
          if ((txt_c_Email.getText().length()==0))  
          {
              txt_c_Email.setBackground(Color.WHITE);
              validacion_formato_Email=true;
       } 
          else
            txt_c_Email.setBackground(Color.red);
 
        
        if (txt_c_User.getText().length()>4)       // Condicion Minima de txt_A_User_WEB
        {
            if ((txt_c_User.getText().length()>10))// Condicion Maxima de txt_A_User_WEB
                 txt_c_User.setText(txt_c_User.getText().substring(0,10));
               if (validacionTool.SoloLetras(txt_c_User.getText(),'U')==true)
               {
                 validacion_formato_User=true;
                 txt_c_User.setBackground(Color.white);
                 hay_datos=1;
            }
               else
                 txt_c_User.setBackground(Color.red);
        }
        else
          if ((txt_c_User.getText().length()==0))  
          {
           validacion_formato_User=true;
           txt_c_User.setBackground(Color.WHITE);
          } 
           else
            txt_c_User.setBackground(Color.red);
 
            
        Manager Manager_UI= new Manager ();
        if ((validacion_formato_Apellido==true)&&
              (validacion_formato_Nombre==true)&&
              (validacion_formato_DNI==true)&&
              (validacion_formato_Email==true)&&
              (validacion_formato_User==true)&&(hay_datos==1))
           {
            User_Consulta.setApellido(txt_c_Apellido.getText());
            User_Consulta.setNombre(txt_c_Nombre.getText());
            User_Consulta.setUser(txt_c_User.getText());
            User_Consulta.setEmail(txt_c_Email.getText());
            User_Consulta.setDNI(txt_c_DNI.getText());
            User_Consulta.setTelefono(txt_c_Telefono.getText());
            
            
            DefaultTableModel Tabla_datos_DB=new DefaultTableModel();
            DefaultTableModel Tabla_Check=new DefaultTableModel();
            String[][] Tabla_datos_DB_String=new String [100][8];
            Tabla_datos_DB.addColumn("Nombre");
            Tabla_datos_DB.addColumn("Apellido");
            Tabla_datos_DB.addColumn("DNI");
            Tabla_datos_DB.addColumn("Telefono");
            Tabla_datos_DB.addColumn("User_Web");
            Tabla_datos_DB.addColumn("Password");
            Tabla_datos_DB.addColumn("Email");
            
            Tabla_datos_mostrar.setModel(Tabla_datos_DB);
            try {
//              Tabla_datos_DB_String=(Manager_UI.consultaAlumno(User_Consulta));
                Tabla_datos_DB_String=(Manager_UI.consultaAlumnoDb_Procedure(User_Consulta));
     //         Tabla_datos_mostrar.setModel(Tabla_datos_DB);
     //         Tabla_datos_mostrar.isEnabled();
            } catch (SQLException ex) {
                Logger.getLogger(frmAltaAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }
            int tmpa=0;
            while (Tabla_datos_DB_String[tmpa][3]!=null) //DNI No NULL
            {
 //               Tabla_datos_DB.addRow(new Object[]{Tabla_datos_DB_String[tmpa][0],Tabla_datos_DB_String[tmpa][1],Tabla_datos_DB_String[tmpa][2],Tabla_datos_DB_String[tmpa][3],
 //                                                  Tabla_datos_DB_String[tmpa][4],Tabla_datos_DB_String[tmpa][5],Tabla_datos_DB_String[tmpa][6],Tabla_datos_DB_String[tmpa][7]});
                Tabla_datos_DB.addRow(new Object[]{Tabla_datos_DB_String[tmpa][0],Tabla_datos_DB_String[tmpa][1],Tabla_datos_DB_String[tmpa][2],Tabla_datos_DB_String[tmpa][3],
                                                   Tabla_datos_DB_String[tmpa][4],Tabla_datos_DB_String[tmpa][5],Tabla_datos_DB_String[tmpa][6],Tabla_datos_DB_String[tmpa][7]});
                tmpa++;
            }
            if (tmpa==1)
            {
              btnActualizarAlumno.setEnabled(true);
              btnActualizarAlumno.setBackground(Color.green);
              btnResetSeleccion.setEnabled(true);
              btnResetSeleccion.setBackground(Color.GREEN);
              btnBorrarAlumno.setEnabled(true);
              btnBorrarAlumno.setBackground(Color.RED);

              
              txt_c_Nombre.setText(Tabla_datos_DB_String[0][0]);
              txt_c_Apellido.setText(Tabla_datos_DB_String[0][1]);
              txt_c_DNI.setText(Tabla_datos_DB_String[0][2]);
              txt_c_DNI.setEditable(false);
              txt_c_DNI.setBackground(Color.GRAY);
             
              txt_c_Telefono.setText(Tabla_datos_DB_String[0][3]);
              txt_c_User.setText(Tabla_datos_DB_String[0][4]);
              txt_c_Password.setText(Tabla_datos_DB_String[0][5]);
              txt_c_Email.setText(Tabla_datos_DB_String[0][6]);
              User_Consulta.setNombre(Tabla_datos_DB_String[0][0]);
              User_Consulta.setApellido(Tabla_datos_DB_String[0][1]);
              User_Consulta.setDNI(Tabla_datos_DB_String[0][2]);
              User_Consulta.setTelefono(Tabla_datos_DB_String[0][3]);
              User_Consulta.setUser(Tabla_datos_DB_String[0][4]);
              User_Consulta.setPassword(Tabla_datos_DB_String[0][5]);
              User_Consulta.setEmail(Tabla_datos_DB_String[0][6]);
              
            }
            else
            {        
               btnActualizarAlumno.setEnabled(false);
               btnResetSeleccion.setEnabled(false);
               btnBorrarAlumno.setEnabled(false);
               txt_c_Apellido.setText("");
               txt_c_Nombre.setText("");
               txt_c_DNI.setText("");
               txt_c_User.setText("");
               txt_c_Email.setText("");
               txt_c_Password.setText("");
               txt_c_Telefono.setText("");
               txt_c_DNI.setEditable(true);
               txt_c_DNI.setBackground(Color.white);
               btnResetSeleccion.setBackground(Color.GRAY);
               btnBorrarAlumno.setBackground(Color.GRAY);
               btnBorrarAlumno.setBackground(Color.GRAY);

             }     
  
    }//GEN-LAST:event_btnConsultarAlumnoActionPerformed
 }
    
    private void txt_c_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_c_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_c_EmailActionPerformed

    private void txt_c_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_c_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_c_TelefonoActionPerformed

    private void Tabla_datos_mostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_datos_mostrarMouseClicked
          
    }//GEN-LAST:event_Tabla_datos_mostrarMouseClicked

    private void btnActualizarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAlumnoActionPerformed
        User User_Actulizar= new User ();
        int resultado =0;
        Manager Manager_Actualizar= new Manager();
        
        User_Actulizar.setNombre(txt_c_Nombre.getText());
        User_Actulizar.setApellido(txt_c_Apellido.getText());
        User_Actulizar.setDNI(txt_c_DNI.getText());
        User_Actulizar.setTelefono(txt_c_Telefono.getText());
        User_Actulizar.setUser(txt_c_User.getText());
        User_Actulizar.setPassword(txt_c_Password.getText());
        User_Actulizar.setEmail(txt_c_Email.getText());
        
        try {
            resultado=Manager_Actualizar.ActualizarAlumnoDb_Procedure(User_Actulizar);
        } catch (SQLException ex) {
            Logger.getLogger(FrmConsultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (resultado==1)
        {
          btnActualizarAlumno.setEnabled(false);
          txt_c_Apellido.setText("");
          txt_c_Nombre.setText("");
          txt_c_DNI.setText("");
          txt_c_User.setText("");
          txt_c_Email.setText("");
          txt_c_Password.setText("");
          txt_c_Telefono.setText("");
          txt_c_DNI.setEditable(true);
          txt_c_DNI.setBackground(Color.white);
          btnResetSeleccion.setEnabled(false);
          btnBorrarAlumno.setEnabled(false);
          btnBorrarAlumno.setBackground(Color.GRAY);
          btnResetSeleccion.setBackground(Color.GRAY);
          txt_c_User.setBackground(Color.white);
          txt_c_Email.setBackground(Color.WHITE);
 
          JOptionPane.showMessageDialog(null, "Se realizo la ACTUALIZACION");
        }
        else
        {
          txt_c_User.setBackground(Color.YELLOW);
          txt_c_Email.setBackground(Color.YELLOW);
          
            
        }
    }//GEN-LAST:event_btnActualizarAlumnoActionPerformed

    private void txt_c_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_c_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_c_NombreActionPerformed

    private void btnResetSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetSeleccionActionPerformed
          btnActualizarAlumno.setEnabled(false);
          txt_c_Apellido.setText("");
          txt_c_Nombre.setText("");
          txt_c_DNI.setText("");
          txt_c_User.setText("");
          txt_c_Email.setText("");
          txt_c_Password.setText("");
          txt_c_Telefono.setText("");
          txt_c_DNI.setEditable(true);
          txt_c_DNI.setBackground(Color.white);
          btnResetSeleccion.setEnabled(false);
          btnBorrarAlumno.setEnabled(false);
          txt_c_User.setBackground(Color.white);
          txt_c_Email.setBackground(Color.WHITE);
 

    }//GEN-LAST:event_btnResetSeleccionActionPerformed

    private void btnBorrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarAlumnoActionPerformed
        Manager Manager_BorrarDB= new Manager();
        int ResultadoBorrar=0;
        try {
            ResultadoBorrar=Manager_BorrarDB.BorrarAlumnoDb_Procedure(txt_c_DNI.getText());
        } catch (SQLException ex) {
            Logger.getLogger(FrmConsultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (ResultadoBorrar==1)
        {
           btnBorrarAlumno.setEnabled(false);
           btnBorrarAlumno.setBackground(Color.GRAY);           
           btnResetSeleccion.setEnabled(false);
           btnResetSeleccion.setBackground(Color.GRAY);       
           btnActualizarAlumno.setEnabled(false);
           btnActualizarAlumno.setBackground(Color.GRAY);       
           
           txt_c_Apellido.setText("");
           txt_c_Nombre.setText("");
           txt_c_DNI.setText("");
           txt_c_User.setText("");
           txt_c_Email.setText("");
           txt_c_Password.setText("");
           txt_c_Telefono.setText("");
           txt_c_DNI.setEditable(true);
           txt_c_DNI.setBackground(Color.white);
           txt_c_User.setBackground(Color.white);
           txt_c_Email.setBackground(Color.WHITE);
           JOptionPane.showMessageDialog(null, "Se realizó el BORRADO");
        }
        else
        {
           txt_c_DNI.setEditable(true);
           txt_c_DNI.setBackground(Color.YELLOW);
           JOptionPane.showMessageDialog(null, "NO encontró el N° de DNI");
        }
        
        



    }//GEN-LAST:event_btnBorrarAlumnoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_datos_mostrar;
    private javax.swing.JButton btnActualizarAlumno;
    private javax.swing.JButton btnBorrarAlumno;
    private javax.swing.JToggleButton btnConsultarAlumno;
    private javax.swing.JButton btnResetSeleccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txt_c_Apellido;
    private javax.swing.JTextField txt_c_DNI;
    private javax.swing.JTextField txt_c_Email;
    private javax.swing.JTextField txt_c_Nombre;
    private javax.swing.JTextField txt_c_Password;
    private javax.swing.JTextField txt_c_Telefono;
    private javax.swing.JTextField txt_c_User;
    // End of variables declaration//GEN-END:variables
}
