
package paquete;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Calculadora extends javax.swing.JFrame {

    
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
   
    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/LOGO-Calcu.png")));
      
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        btn_oscuro = new javax.swing.JButton();
        btn_MINIMIZAR = new javax.swing.JLabel();
        btn_CERRAR = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_igual = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_porcentaje = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();
        btn_mult = new javax.swing.JButton();
        btn_menos = new javax.swing.JButton();
        btn_mas = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn_coma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setFont(new java.awt.Font("Razed", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 338, 36));

        txtResultado.setFont(new java.awt.Font("Razed", 0, 48)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(55, 62, 71));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, 338, 60));

        btn_oscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_desactivado1.png"))); // NOI18N
        btn_oscuro.setBorderPainted(false);
        btn_oscuro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_desactivado1_sombra.png"))); // NOI18N
        btn_oscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oscuroActionPerformed(evt);
            }
        });
        jPanel1.add(btn_oscuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 40, 17));

        btn_MINIMIZAR.setFont(new java.awt.Font("Razed", 0, 20)); // NOI18N
        btn_MINIMIZAR.setForeground(new java.awt.Color(255, 192, 47));
        btn_MINIMIZAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_MINIMIZAR.setText("o");
        btn_MINIMIZAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MINIMIZARMouseClicked(evt);
            }
        });
        jPanel1.add(btn_MINIMIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 20, 20));

        btn_CERRAR.setFont(new java.awt.Font("Razed", 0, 20)); // NOI18N
        btn_CERRAR.setForeground(new java.awt.Color(253, 84, 77));
        btn_CERRAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_CERRAR.setText("o");
        btn_CERRAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CERRARMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CERRARMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_CERRARMouseReleased(evt);
            }
        });
        jPanel1.add(btn_CERRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 20, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_igual.setFont(new java.awt.Font("Razed", 0, 25)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_oscuro.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_oscuro.png"))); // NOI18N
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_mascuro.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 50, 50));

        btn_delete.setFont(new java.awt.Font("Razed", 0, 25)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(55, 62, 71));
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn_delete.setText("<-");
        btn_delete.setFocusPainted(false);
        btn_delete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_delete.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn_delete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_pressed.png"))); // NOI18N
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel2.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 50, 50));

        btn_porcentaje.setFont(new java.awt.Font("Razed", 0, 25)); // NOI18N
        btn_porcentaje.setForeground(new java.awt.Color(55, 62, 71));
        btn_porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn_porcentaje.setText("%");
        btn_porcentaje.setFocusPainted(false);
        btn_porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn_porcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_pressed.png"))); // NOI18N
        btn_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 50, 50));

        btn_div.setFont(new java.awt.Font("Razed", 0, 25)); // NOI18N
        btn_div.setForeground(new java.awt.Color(55, 62, 71));
        btn_div.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn_div.setText("/");
        btn_div.setFocusPainted(false);
        btn_div.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_div.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn_div.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_pressed.png"))); // NOI18N
        btn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divActionPerformed(evt);
            }
        });
        jPanel2.add(btn_div, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 50, 50));

        btn_mult.setFont(new java.awt.Font("Razed", 0, 25)); // NOI18N
        btn_mult.setForeground(new java.awt.Color(55, 62, 71));
        btn_mult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn_mult.setText("x");
        btn_mult.setFocusPainted(false);
        btn_mult.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mult.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn_mult.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_pressed.png"))); // NOI18N
        btn_mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multActionPerformed(evt);
            }
        });
        jPanel2.add(btn_mult, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 50, 50));

        btn_menos.setFont(new java.awt.Font("Razed", 0, 25)); // NOI18N
        btn_menos.setForeground(new java.awt.Color(55, 62, 71));
        btn_menos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn_menos.setText("-");
        btn_menos.setFocusPainted(false);
        btn_menos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_menos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn_menos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_pressed.png"))); // NOI18N
        btn_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menosActionPerformed(evt);
            }
        });
        jPanel2.add(btn_menos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 50, 50));

        btn_mas.setFont(new java.awt.Font("Razed", 0, 25)); // NOI18N
        btn_mas.setForeground(new java.awt.Color(55, 62, 71));
        btn_mas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn_mas.setText("+");
        btn_mas.setFocusPainted(false);
        btn_mas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn_mas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_pressed.png"))); // NOI18N
        btn_mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masActionPerformed(evt);
            }
        });
        jPanel2.add(btn_mas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 50, 50));

        btn_borrar.setFont(new java.awt.Font("Razed", 0, 25)); // NOI18N
        btn_borrar.setForeground(new java.awt.Color(55, 62, 71));
        btn_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn_borrar.setText("C");
        btn_borrar.setFocusPainted(false);
        btn_borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_borrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn_borrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_pressed.png"))); // NOI18N
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 50, 50));

        btn9.setFont(new java.awt.Font("Razed", 0, 25)); // NOI18N
        btn9.setForeground(new java.awt.Color(55, 62, 71));
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_blanco.png"))); // NOI18N
        btn9.setText("9");
        btn9.setFocusPainted(false);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_blanco.png"))); // NOI18N
        btn9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 50, 50));

        btn7.setFont(new java.awt.Font("Razed", 0, 25)); // NOI18N
        btn7.setForeground(new java.awt.Color(55, 62, 71));
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_blanco.png"))); // NOI18N
        btn7.setText("7");
        btn7.setFocusPainted(false);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_blanco.png"))); // NOI18N
        btn7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 50, 50));

        btn8.setFont(new java.awt.Font("Razed", 0, 25)); // NOI18N
        btn8.setForeground(new java.awt.Color(55, 62, 71));
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_blanco.png"))); // NOI18N
        btn8.setText("8");
        btn8.setFocusPainted(false);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_blanco.png"))); // NOI18N
        btn8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 50, 50));

        btn6.setFont(new java.awt.Font("Razed", 0, 25)); // NOI18N
        btn6.setForeground(new java.awt.Color(55, 62, 71));
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_blanco.png"))); // NOI18N
        btn6.setText("6");
        btn6.setFocusPainted(false);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_blanco.png"))); // NOI18N
        btn6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 50, 50));

        btn5.setFont(new java.awt.Font("Razed", 0, 25)); // NOI18N
        btn5.setForeground(new java.awt.Color(55, 62, 71));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_blanco.png"))); // NOI18N
        btn5.setText("5");
        btn5.setFocusPainted(false);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_blanco.png"))); // NOI18N
        btn5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 50, 50));

        btn4.setFont(new java.awt.Font("Razed", 0, 25)); // NOI18N
        btn4.setForeground(new java.awt.Color(55, 62, 71));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_blanco.png"))); // NOI18N
        btn4.setText("4");
        btn4.setFocusPainted(false);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_blanco.png"))); // NOI18N
        btn4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 50, 50));

        btn3.setFont(new java.awt.Font("Razed", 0, 25)); // NOI18N
        btn3.setForeground(new java.awt.Color(55, 62, 71));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_blanco.png"))); // NOI18N
        btn3.setText("3");
        btn3.setFocusPainted(false);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_blanco.png"))); // NOI18N
        btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 50, 50));

        btn1.setFont(new java.awt.Font("Razed", 0, 25)); // NOI18N
        btn1.setForeground(new java.awt.Color(55, 62, 71));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_blanco.png"))); // NOI18N
        btn1.setText("1");
        btn1.setFocusPainted(false);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_blanco.png"))); // NOI18N
        btn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 50, 50));

        btn2.setFont(new java.awt.Font("Razed", 0, 25)); // NOI18N
        btn2.setForeground(new java.awt.Color(55, 62, 71));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_blanco.png"))); // NOI18N
        btn2.setText("2");
        btn2.setFocusPainted(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_blanco.png"))); // NOI18N
        btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 50, 50));

        btn0.setFont(new java.awt.Font("Razed", 0, 25)); // NOI18N
        btn0.setForeground(new java.awt.Color(55, 62, 71));
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_blanco.png"))); // NOI18N
        btn0.setText("0");
        btn0.setFocusPainted(false);
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_blanco.png"))); // NOI18N
        btn0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 50, 50));

        btn_coma.setFont(new java.awt.Font("Razed", 0, 25)); // NOI18N
        btn_coma.setForeground(new java.awt.Color(55, 62, 71));
        btn_coma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_blanco.png"))); // NOI18N
        btn_coma.setText(".");
        btn_coma.setFocusPainted(false);
        btn_coma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_coma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_blanco.png"))); // NOI18N
        btn_coma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn_coma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_coma, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 350, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
       
            // TODO add your handling code here:
            // BOTON =
            
         try { 
            
          String resultado =  se.eval(txtOperacion.getText()).toString();
          txtResultado.setText(resultado);
          
        } catch (ScriptException ex) {
           
        // txtOperacion.setText("ERROR"); // esto es para cuando hacemos algo mal como concatenar dos signos seguidos
        // lo comento porque surgen problemas a la hora de borrar de a uno los numeros
            
        }
        
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        // BOTON DELETE
         String texto = txtOperacion.getText().substring(0,txtOperacion.getText().length()-1); // para borrar el ultimo digito presionado
         txtOperacion.setText(texto);
         btn_igual.doClick();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcentajeActionPerformed
        // TODO add your handling code here:
        // BOTON %
         addNumber("%");
          
    }//GEN-LAST:event_btn_porcentajeActionPerformed

    private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed
        // TODO add your handling code here:
        // BOTON /
         addNumber("/");
    }//GEN-LAST:event_btn_divActionPerformed

    private void btn_multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multActionPerformed
        // TODO add your handling code here:
        // BOTON *
         addNumber("*");
    }//GEN-LAST:event_btn_multActionPerformed

    private void btn_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menosActionPerformed
        // TODO add your handling code here:
        // BOTON -
         addNumber("-");
    }//GEN-LAST:event_btn_menosActionPerformed

    private void btn_masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masActionPerformed
        // TODO add your handling code here:
        // BOTON +
         addNumber("+");
    }//GEN-LAST:event_btn_masActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        // TODO add your handling code here:
        //BOTON BORRAR
        
        txtOperacion.setText("");
        txtResultado.setText("");
        
        
        
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        // BOTON 9
        
        addNumber("9");
         btn_igual.doClick();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        // BOTON 7
        addNumber("7");
         btn_igual.doClick();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        // BOTON 8
         addNumber("8");
          btn_igual.doClick();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        // BOTON 6
        
         addNumber("6");
          btn_igual.doClick();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        // BOTON 5
         addNumber("5");
          btn_igual.doClick();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        // BOTON 4
         addNumber("4");
          btn_igual.doClick();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        // BOTON 3
         addNumber("3");
          btn_igual.doClick();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        // BOTON 1
         addNumber("1");
          btn_igual.doClick();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        // BOTON 2
         addNumber("2");
          btn_igual.doClick();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        // BOTON
         addNumber("0");
          btn_igual.doClick();
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn_comaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comaActionPerformed
        // TODO add your handling code here:
        // BOTON
         addNumber(".");
         btn_igual.doClick();
    }//GEN-LAST:event_btn_comaActionPerformed

    
    boolean modoOscuro = false;
    
    
    private void btn_oscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oscuroActionPerformed
        // TODO add your handling code here:
        //Boton Tema Oscuro
        
        if (!modoOscuro){
        
        
        jPanel1.setBackground(Color.decode("#212b41")); // Cambia color fondo panel de arriba
        jPanel2.setBackground(Color.decode("#2e3951")); // Cambia color fondo panel de abajo
        txtOperacion.setForeground(Color.decode("#0db387"));
        txtResultado.setForeground(Color.decode("#0db387"));
        
        cambiarColorBtnComun(btn1);
        cambiarColorBtnComun(btn2);
        cambiarColorBtnComun(btn3);
        cambiarColorBtnComun(btn4);
        cambiarColorBtnComun(btn5);
        cambiarColorBtnComun(btn6);
        cambiarColorBtnComun(btn7);
        cambiarColorBtnComun(btn8);
        cambiarColorBtnComun(btn9);
        cambiarColorBtnComun(btn0);
        cambiarColorBtnComun(btn_coma);
        
        cambiarColorBtnOperador(btn_mas);
        cambiarColorBtnOperador(btn_menos);
        cambiarColorBtnOperador(btn_delete);
        cambiarColorBtnOperador(btn_borrar);
        cambiarColorBtnOperador(btn_mult);
        cambiarColorBtnOperador(btn_div);
        cambiarColorBtnOperador(btn_porcentaje);
        
        btn_oscuro.setIcon(new ImageIcon(getClass().getResource("/imagenes/boton_activado1.png")));
        btn_oscuro.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/boton_activado1_oscuro.png")));
        
        btn_igual.setIcon(new ImageIcon(getClass().getResource("/imagenes/botonigualdark.png")));
        btn_igual.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/botonigualdark.png")));
        btn_igual.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/botonigualdark_oscuro.png")));
        btn_igual.setForeground(Color.decode("#212b41"));
        
        modoOscuro = true;
        
        }
        
        else {
            
            // Esto es para no tener que poner toda la torta de codigo de arriba para invertir los valores
            
           Calculadora frame = new Calculadora();
           this.dispose();
           frame.setVisible(true);
            
        }
        
    }//GEN-LAST:event_btn_oscuroActionPerformed

    private void btn_CERRARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CERRARMouseClicked
        // TODO add your handling code here:
        // BOTON CERRAR
        
        this.dispose(); // Esto cierra la ventana
        
       
    }//GEN-LAST:event_btn_CERRARMouseClicked

    private void btn_MINIMIZARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MINIMIZARMouseClicked
        // TODO add your handling code here:
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btn_MINIMIZARMouseClicked

    private void btn_CERRARMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CERRARMouseReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btn_CERRARMouseReleased

    private void btn_CERRARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CERRARMouseEntered
        // TODO add your handling code here:
         this.setForeground(Color.decode("#bf4b46"));
    }//GEN-LAST:event_btn_CERRARMouseEntered

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    
    public void cambiarColorBtnComun (JButton btn){
       
        btn.setIcon(new ImageIcon(getClass().getResource("/imagenes/botondark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/botondark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/botondark_oscuro.png")));
        btn.setForeground(Color.decode("#96a8a0"));
        
        
    }
    
    public void cambiarColorBtnOperador(JButton btn){
        
        btn.setIcon(new ImageIcon(getClass().getResource("/imagenes/botondark_oscuro.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/botondark_oscuro.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/botondark_maoscuro.png")));
        btn.setForeground(Color.decode("#0db387"));
        
    }
    
    

    public void addNumber(String digito){
        txtOperacion.setText(txtOperacion.getText()+digito);
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel btn_CERRAR;
    private javax.swing.JLabel btn_MINIMIZAR;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_coma;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_mas;
    private javax.swing.JButton btn_menos;
    private javax.swing.JButton btn_mult;
    private javax.swing.JButton btn_oscuro;
    private javax.swing.JButton btn_porcentaje;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
