/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package cine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;

/**
 *
 * @author hector
 */
public class Cine extends javax.swing.JFrame {
    
    private int REFRESH_RATE=1000;
    private int CANT_CAJAS=3;
    private int CANT_MAQUINASELECTRONICAS=3;
    private int CANT_VENDEDORDEALIMENTOS=3;
    
    private Timer timerCreadorDeClientes ;
    private Timer timerAlarm ;
    private Timer timerRefreshRate ;
    
    private int duracionDeLaSimulacion;
    private ColaCliente colaDeEntrada; // Cola a la entrada del cine
    
    private ATM atm=new ATM();
    private Operador operador=new Operador();
    private MaquinaElectronica MaquinasElectronicas[];
    private Caja cajas[];
    private VendedorDeAlimento vendedoresDeAlimentos[];
    
    //private MaquinaElectronica maquinaElectronica =new MaquinaElectronica();
    //private VendedorDeAlimento alimentos=new VendedorDeAlimento();
    
    
    /**
     * Creates new form Cine
     */
    public Cine() {
        initComponents();
        
        cajas=new Caja[CANT_CAJAS];
        MaquinasElectronicas = new MaquinaElectronica[CANT_MAQUINASELECTRONICAS];
        vendedoresDeAlimentos=new VendedorDeAlimento[CANT_VENDEDORDEALIMENTOS];       
    }
    
    private void play(){
        arrancarTimers();
        
    }
    
    private void arrancarTimers(){
        
        int aleatorio=new Random().nextInt()%3000; // TODO: Cambiar a números aleatorios
        System.out.println("Duracion:"+duracionDeLaSimulacion);
        
        // PASO 2
        timerRefreshRate = new Timer (REFRESH_RATE, new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
                
                System.out.println("RefreshRateasd");
                
                
                // Cliente c=atm.despachar();
                
                
                switch (c.getTipoDePago()){
                    
                    
                }
                
                // # Visitar ATM                               
                {                
                    Cliente c=atm.despachar();

                    // # Manda al cliente del ATM a la caja o a la tickera
                    if (c.getTipoDePago()=="WEB"){                       
                        
                        atm.encolar(c);
                    }else{
                        encolarEnCajaMasVacia(c);
                    }
                }
                
                // # Visitar Maquina de ticket
                for (int i = 0; i < CANT_MAQUINASELECTRONICAS; i++) {
                    // # Visitar Maquina de ticket
                    {                    
                        Cliente c=MaquinasElectronicas[i].despachar();

                        // # Manda al cliente del ATM a la caja o a la tickera
                        if (c.isVaAl_Alimentos()){
                            vendedoresDeAlimentos.encolar(c);
                        }
                    }
                }

                // # Visita cada una de las cajas                
                for (int i = 0; i < CANT_CAJAS; i++) {
                    // # Visitar Maquina de ticket
                    {
                    
                        Cliente c=cajas[i].despachar();

                        // # Manda al cliente del ATM a la caja o a la tickera
                        if (c.isVaAl_Alimentos()){
                            alimentos.encolar(c);
                        }
                    }
                }
                
                
                // # Visitar Maquina de alimentos
                for (int i = 0; i < CANT_VENDEDORDEALIMENTOS; i++) {
                    // # Visitar Maquina de ticket
                    {
                    
                        Cliente c=cajas[i].despachar();

                        // # Manda al cliente del ATM a la caja o a la tickera
                        if (c.isVaAl_Alimentos()){
                            vendedoresDeAlimentos.encolar(c);
                        }
                    }
                }
                
            }
        });
        timerRefreshRate.start();
        
        // PASO 3: LISTO
        timerCreadorDeClientes = new Timer (aleatorio, new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
                // Encola un nuevo cliente
                //colaDeEntrada.encolar(new Cliente());
            }
        });
        
        timerCreadorDeClientes.start();
        
        // PASO 4: LISTO
        timerAlarm = new Timer (duracionDeLaSimulacion, new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
                // detenr siulacion y generar estadisticas
                System.out.println("Tiempo vencido");
                timerRefreshRate.stop();
                timerCreadorDeClientes.stop();
                
                // HACE LO QUE HACE CUANDO EL PROGRAMA SE DETIENE
            }
        });
        
        timerAlarm.start();
        
    }
    
    void encolarEnCajaMasVacia(Cliente c){
        int min=0;
        int idxMin=0;
        for (int i = 0; i < CANT_CAJAS; i++) {
            if (cajas[i].getTamCola()<min){
                min=cajas[i].getTamCola();
                idxMin=i;
            }
        }
        cajas[idxMin].encolar(c);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonPlay = new javax.swing.JToggleButton();
        input_duracionSimulacion = new javax.swing.JTextField();
        label_atm = new javax.swing.JLabel();
        ventaDeAlimentos1 = new javax.swing.JLabel();
        caja = new javax.swing.JLabel();
        ventaDeTicket = new javax.swing.JLabel();
        ventaDeTicket1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ventaDeAlimentos2 = new javax.swing.JLabel();
        ventaDeAlimentos3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        detener = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonPlay.setText("Play");
        botonPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonPlayMouseClicked(evt);
            }
        });
        botonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPlayActionPerformed(evt);
            }
        });

        input_duracionSimulacion.setText("10");
        input_duracionSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_duracionSimulacionActionPerformed(evt);
            }
        });

        label_atm.setText("ATM");

        ventaDeAlimentos1.setText("Venta de Alimentos");

        caja.setText("Caja");

        ventaDeTicket.setText("Caja");

        ventaDeTicket1.setText("Caja");

        jLabel1.setText("Operador");

        jLabel2.setText("salaDeCine");

        ventaDeAlimentos2.setText("Venta de Alimentos");

        ventaDeAlimentos3.setText("Venta de Alimentos");

        jLabel3.setText("salaDeCine");

        jLabel4.setText("salaDeCine");

        detener.setText("detener");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_atm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(detener)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(input_duracionSimulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ventaDeAlimentos1)
                                .addGap(58, 58, 58)
                                .addComponent(ventaDeAlimentos2)
                                .addGap(50, 50, 50)
                                .addComponent(ventaDeAlimentos3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(caja)
                                .addGap(42, 42, 42)
                                .addComponent(ventaDeTicket)
                                .addGap(48, 48, 48)
                                .addComponent(ventaDeTicket1)))
                        .addGap(0, 209, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(33, 33, 33))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(label_atm))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(botonPlay)
                        .addGap(26, 26, 26)
                        .addComponent(detener)))
                .addGap(18, 18, 18)
                .addComponent(input_duracionSimulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caja)
                    .addComponent(ventaDeTicket)
                    .addComponent(ventaDeTicket1))
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ventaDeAlimentos1)
                    .addComponent(ventaDeAlimentos2)
                    .addComponent(ventaDeAlimentos3))
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_duracionSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_duracionSimulacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_duracionSimulacionActionPerformed

    private void botonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPlayActionPerformed
        
    }//GEN-LAST:event_botonPlayActionPerformed

    private void botonPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPlayMouseClicked
        this.duracionDeLaSimulacion=Integer.parseInt(input_duracionSimulacion.getText())*1000;
        play();
    }//GEN-LAST:event_botonPlayMouseClicked
    
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
            java.util.logging.Logger.getLogger(Cine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botonPlay;
    private javax.swing.JLabel caja;
    private javax.swing.JButton detener;
    private javax.swing.JTextField input_duracionSimulacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel label_atm;
    private javax.swing.JLabel ventaDeAlimentos1;
    private javax.swing.JLabel ventaDeAlimentos2;
    private javax.swing.JLabel ventaDeAlimentos3;
    private javax.swing.JLabel ventaDeTicket;
    private javax.swing.JLabel ventaDeTicket1;
    // End of variables declaration//GEN-END:variables
}
