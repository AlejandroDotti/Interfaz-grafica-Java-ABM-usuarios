package UI;

import Busisness.Manager;
import DTO.User;
import Tools.Validator;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC-C202
 */
public class frmAltaAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmAltaAlumno
     */
    public frmAltaAlumno() {
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

        lbl_A_Nombre = new javax.swing.JLabel();
        lbl_A_Apellido = new javax.swing.JLabel();
        lbl_A_DNI = new javax.swing.JLabel();
        lbl_A_Telefono = new javax.swing.JLabel();
        lbl_A_User = new javax.swing.JLabel();
        lbl_A_Password = new javax.swing.JLabel();
        txt_A_Nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_A_Apellido = new javax.swing.JTextField();
        txt_A_DNI = new javax.swing.JTextField();
        txt_A_Telefono = new javax.swing.JTextField();
        txt_A_User_WEB = new javax.swing.JTextField();
        txt_A_Email = new javax.swing.JTextField();
        btn_A_Guardar = new javax.swing.JButton();
        btn_A_Borrar_datos = new javax.swing.JButton();
        txt_A_Password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        lbl_A_Nombre.setText("NOMBRE");

        lbl_A_Apellido.setText("APELLIDO");

        lbl_A_DNI.setText("DNI ");

        lbl_A_Telefono.setText("TELEFONO");

        lbl_A_User.setText("USER_WEB");

        lbl_A_Password.setText("PASSWORD");

        txt_A_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_A_NombreActionPerformed(evt);
            }
        });

        jLabel1.setText("EMAL");

        txt_A_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_A_EmailActionPerformed(evt);
            }
        });

        btn_A_Guardar.setBackground(new java.awt.Color(0, 204, 0));
        btn_A_Guardar.setText("GUARDAR");
        btn_A_Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_A_GuardarMouseClicked(evt);
            }
        });
        btn_A_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_A_GuardarActionPerformed(evt);
            }
        });

        btn_A_Borrar_datos.setBackground(new java.awt.Color(255, 0, 51));
        btn_A_Borrar_datos.setText("BORRAR DATOS");
        btn_A_Borrar_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_A_Borrar_datosActionPerformed(evt);
            }
        });

        txt_A_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_A_PasswordActionPerformed(evt);
            }
        });

        jLabel2.setText("Largo MIN 3, MAX 20            ( A-Z  a-z )");

        jLabel3.setText("Largo MIN 10, MAX 15          ( + )( 1-9 )");

        jLabel4.setText("Largo MIN 5, MAX 10           ( A-Z  a-z  -_#* )");

        jLabel5.setText("Largo MIN 6, MAX 11            ( 0-9 . )");

        jLabel6.setText("Largo MIN 5, MAX 25          ( A-Z a-z 0-9 . _- @ )");

        jLabel7.setText("Largo MIN 3, MAX 20             ( A-Z   a-z )");

        jLabel8.setText("Largo MIN 5, MAX 10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_A_Password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_A_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbl_A_DNI)
                                        .addComponent(lbl_A_Telefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl_A_Apellido)
                                        .addComponent(lbl_A_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_A_Nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt_A_DNI, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt_A_Apellido, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txt_A_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_A_User)
                                    .addGap(13, 13, 13)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_A_User_WEB)
                                        .addComponent(txt_A_Email))))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btn_A_Borrar_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(btn_A_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addContainerGap(116, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_A_DNI))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_A_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_A_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_A_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_A_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_A_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_A_Telefono)
                        .addComponent(txt_A_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_A_User_WEB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_A_User)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_A_Password)
                    .addComponent(txt_A_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_A_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_A_Guardar)
                    .addComponent(btn_A_Borrar_datos))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_A_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_A_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_A_NombreActionPerformed

    private void txt_A_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_A_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_A_EmailActionPerformed

    private void btn_A_GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_A_GuardarMouseClicked
        @SuppressWarnings("UnusedAssignment")
        int resultado_operacion=0;
        String auxtmp;
        boolean validacion_formato_Apellido=false;
        boolean validacion_formato_Nombre=false;
        boolean validacion_formato_Email=false;
        boolean validacion_formato_Telefono=false;
        boolean validacion_formato_User=false;
        boolean validacion_formato_Password=false;
        boolean validacion_formato_DNI =false;
        User User_Alta=new User();
        Validator validacionTool=new Validator();
        
        
        if ((txt_A_DNI.getText().length()>5))                                   // Condicion Minima de DNI
        { 
          if ((txt_A_DNI.getText().length()>11))                                // Condicion Maxima de DNI
              txt_A_DNI.setText(txt_A_DNI.getText().substring(0,11));
                
          if ( validacionTool.SoloNumeros(txt_A_DNI.getText(),'D')==true)
          {
            validacion_formato_DNI=true; 
            txt_A_DNI.setBackground(Color.WHITE);
          }  
          else 
          {
            validacion_formato_DNI=false;
            txt_A_DNI.setBackground(Color.red);
          }
        }
        else
          txt_A_DNI.setBackground(Color.red);
        

        // verificamos si cada uno de los campos cumple con las caracteristicas minimas
        if (txt_A_Apellido.getText().length()>2)        // Condicion Minima de Apellido
        {  
             if ((txt_A_Apellido.getText().length()>20))// Condicion Maxima de Apellido
                 txt_A_Apellido.setText(txt_A_Apellido.getText().substring(0,20));
                if (validacionTool.SoloLetras(txt_A_Apellido.getText(),'A')==true) // D=DNI T=TELEFONO
                {    
                  validacion_formato_Apellido=true;
                  txt_A_Apellido.setBackground(Color.white);
                }
                else
                {
                  txt_A_Apellido.setBackground(Color.red);  
                }
        }
        else
            txt_A_Apellido.setBackground(Color.red);
        
        
        if (txt_A_Nombre.getText().length()>2)         //Condicion Minima de Apellido
        {
            if ((txt_A_Nombre.getText().length()>20))// Condicion Maxima de Apellido
                 txt_A_Nombre.setText(txt_A_Nombre.getText().substring(0,20));
              if (validacionTool.SoloLetras(txt_A_Nombre.getText(),'A')==true)
              {
                validacion_formato_Nombre=true;
                txt_A_Nombre.setBackground(Color.white);
              }
              else
                txt_A_Nombre.setBackground(Color.red);
        }
        else
           txt_A_Nombre.setBackground(Color.red);
            
        if (txt_A_Telefono.getText().length()>=10)     // Condicion Minma de txt_A_Telefono
        {
            if ((txt_A_Telefono.getText().length()>15))// Condicion Maxima de txt_A_Telefono
                 txt_A_Telefono.setText(txt_A_Telefono.getText().substring(0,15));
              if (validacionTool.SoloNumeros(txt_A_Telefono.getText(),'T')==true)
              {
                validacion_formato_Telefono=true;
                txt_A_Telefono.setBackground(Color.white);
              }
              else
               txt_A_Telefono.setBackground(Color.red);
        }
        else
           txt_A_Telefono.setBackground(Color.red);
             
        if (txt_A_Email.getText().length()>4)       // Condicion Maxima de Email 
        {
            if ((txt_A_Email.getText().length()>25))// Condicion Maxima de Email
                 txt_A_Email.setText(txt_A_Email.getText().substring(0,25));
              if (validacionTool.SoloLetras(txt_A_Email.getText(),'E')==true)
              {
/*  */
                 validacion_formato_Email=true;
                 txt_A_Email.setBackground(Color.white);
              }
              else
                 txt_A_Email.setBackground(Color.red);
        }
        else 
            txt_A_Email.setBackground(Color.red);
 
        
        if (txt_A_User_WEB.getText().length()>4)       // Condicion Minima de txt_A_User_WEB
        {
            if ((txt_A_User_WEB.getText().length()>10))// Condicion Maxima de txt_A_User_WEB
                 txt_A_User_WEB.setText(txt_A_User_WEB.getText().substring(0,10));
               if (validacionTool.SoloLetras(txt_A_User_WEB.getText(),'U')==true)
               {
                 validacion_formato_User=true;
                 txt_A_User_WEB.setBackground(Color.white);
               }
               else
                 txt_A_User_WEB.setBackground(Color.red);
        }
        else
           txt_A_User_WEB.setBackground(Color.red);
        
        if (txt_A_Password.getText().length()>4)     // Condicion Minima de txt_A_Password
        {
            if ((txt_A_Password.getText().length()>10))// Condicion Maxima de txt_A_Password
               txt_A_Password.setText(txt_A_Password.getText().substring(0,10));
            {
               validacion_formato_Password=true;
               txt_A_Password.setBackground(Color.white);
            }
        }
        else
           txt_A_Password.setBackground(Color.red);
            
        Manager Manager_UI= new Manager ();
        if ((validacion_formato_Apellido==true)&&
              (validacion_formato_Nombre==true)&&
              (validacion_formato_DNI==true)&&
              (validacion_formato_Email==true)&&
              (validacion_formato_User==true)&&
              (validacion_formato_Telefono==true)&&
              (validacion_formato_Password==true))
           {
            User_Alta.setApellido(txt_A_Apellido.getText());
            User_Alta.setNombre(txt_A_Nombre.getText());
            User_Alta.setTelefono(txt_A_Telefono.getText());
            User_Alta.setUser(txt_A_User_WEB.getText());
            User_Alta.setPassword(txt_A_Password.getText());
            User_Alta.setEmail(txt_A_Email.getText());
            User_Alta.setDNI(txt_A_DNI.getText());
            try {
                resultado_operacion=Manager_UI.guardarAlumno(User_Alta);
            } catch (SQLException ex) {
                Logger.getLogger(frmAltaAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (resultado_operacion==0)  // 1 se almaceno la informacion en la DB
             {
               JOptionPane.showMessageDialog(null, "Se realizo exitosamente el ALTA");
               txt_A_Apellido.setText("");
               txt_A_Nombre.setText("");
               txt_A_DNI.setText("");
               txt_A_User_WEB.setText("");
               txt_A_Password.setText("");
               txt_A_Email.setText("");
               txt_A_Telefono.setText("");
             }
             else
               if (resultado_operacion==1)
               {
                 txt_A_Email.setBackground(Color.YELLOW);
                 txt_A_Email.setFocusable(true);
                 JOptionPane.showMessageDialog(null, "Email ya existe, verifique los datos ingresados");
               } 
               else
                if (resultado_operacion==10)
                {
                 txt_A_User_WEB.setBackground(Color.YELLOW);
                 txt_A_User_WEB.setFocusable(true);
                 JOptionPane.showMessageDialog(null, "EL USER_WEB ya existe, verifique los datos ingresados");
                } 
                else
                 if (resultado_operacion==11)
                 {
                  txt_A_Email.setBackground(Color.YELLOW);
                  txt_A_Email.setFocusable(true);
                  txt_A_User_WEB.setBackground(Color.YELLOW);
                  txt_A_User_WEB.setFocusable(true);
                  JOptionPane.showMessageDialog(null, "Emial y User ya existen, verifique los datos ingresados");
                 } 
                else
                 if (resultado_operacion==100)
                 {
                  txt_A_DNI.setBackground(Color.YELLOW);
                  txt_A_DNI.setFocusable(true);
                  JOptionPane.showMessageDialog(null, "EL DNI ya existe, verifique los datos ingresados");
                 } 
                else
                 if (resultado_operacion==101)
                 {
                  txt_A_DNI.setBackground(Color.YELLOW);
                  txt_A_DNI.setFocusable(true);
                  txt_A_Email.setBackground(Color.YELLOW);
                  txt_A_Email.setFocusable(true);
                  JOptionPane.showMessageDialog(null, "EL DNI y Email ya existen, verifique los datos ingresados");
                 } 
                else
                 if (resultado_operacion==110)
                 {
                  txt_A_DNI.setBackground(Color.YELLOW);
                  txt_A_DNI.setFocusable(true);
                  txt_A_User_WEB.setBackground(Color.YELLOW);
                  txt_A_User_WEB.setFocusable(true);
                  JOptionPane.showMessageDialog(null, "EL DNI y el User_WEb ya existen, verifique los datos ingresados");
                 } 
                else
                 if (resultado_operacion==111)
                 {
                  txt_A_DNI.setBackground(Color.YELLOW);
                  txt_A_DNI.setFocusable(true);
                  txt_A_User_WEB.setBackground(Color.YELLOW);
                  txt_A_User_WEB.setFocusable(true);
                  txt_A_Email.setBackground(Color.YELLOW);
                  txt_A_Email.setFocusable(true);
                  JOptionPane.showMessageDialog(null, "DNI, User_WEb y Email ya existen, verifique los datos ingresados");
                  
                 }else
                   if (resultado_operacion==111)
                   {
                     JOptionPane.showMessageDialog(null, "ERROR, NO FUE POSIBLE REALIZAR EL ALTA");
                   } 
            }    
    }//GEN-LAST:event_btn_A_GuardarMouseClicked

  //  DNI      User    Email    Resultado
          //  NoUsado  NoUsado Usado     1
          //  NoUsado  Usado   NoUsado   2
          //  NoUsado  Usado   Usado     3
          //  Usado    NoUsado NOUsado   4
          //  Usado    NOUsado Usado     5
          //  Usado    Usado   NoUsado   6
          //  Usado    Usado   Usado     7  
    
    
    
    
    private void btn_A_Borrar_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_A_Borrar_datosActionPerformed
           txt_A_Apellido.setText("");
           txt_A_Nombre.setText("");
           txt_A_DNI.setText("");
           txt_A_User_WEB.setText("");
           txt_A_Password.setText("");
           txt_A_Email.setText("");
           txt_A_Telefono.setText("");
           txt_A_Apellido.setBackground(Color.WHITE);
           txt_A_Nombre.setBackground(Color.WHITE);
           txt_A_DNI.setBackground(Color.WHITE);
           txt_A_User_WEB.setBackground(Color.WHITE);
           txt_A_Password.setBackground(Color.WHITE);
           txt_A_Telefono.setBackground(Color.WHITE);          
           txt_A_Email.setBackground(Color.WHITE);          
    }//GEN-LAST:event_btn_A_Borrar_datosActionPerformed

    private void txt_A_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_A_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_A_PasswordActionPerformed

    private void btn_A_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_A_GuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_A_GuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_A_Borrar_datos;
    private javax.swing.JButton btn_A_Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl_A_Apellido;
    private javax.swing.JLabel lbl_A_DNI;
    private javax.swing.JLabel lbl_A_Nombre;
    private javax.swing.JLabel lbl_A_Password;
    private javax.swing.JLabel lbl_A_Telefono;
    private javax.swing.JLabel lbl_A_User;
    private javax.swing.JTextField txt_A_Apellido;
    private javax.swing.JTextField txt_A_DNI;
    private javax.swing.JTextField txt_A_Email;
    private javax.swing.JTextField txt_A_Nombre;
    private javax.swing.JPasswordField txt_A_Password;
    private javax.swing.JTextField txt_A_Telefono;
    private javax.swing.JTextField txt_A_User_WEB;
    // End of variables declaration//GEN-END:variables
}