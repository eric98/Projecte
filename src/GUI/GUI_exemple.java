/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.Arrays;
import metodes.GUI_UF3;
import projecte.Pilot;
import projecte.ProjecteJava;

/**
 *
 * @author profe
 */
public class GUI_exemple extends javax.swing.JFrame {

    /**
     * Creates new form GUI_exemple
     */
    public GUI_exemple() {
        initComponents();
        inicialitzaComponents();
    }

    private void inicialitzaComponents(){
    
        ProjecteJava.inicialitzarVariables();
        
        GUI_UF3.carregaTaula(new String[]{"Nom", "Dorsal", "Diners", "Home"}, 
                transformaDades(ProjecteJava.getArray())
//                new Object[][]{
//                    {"Marc", 93, 2346.6, true},
//                    {"Viñales", 25, 234.6, true}
//                }
                , taula);
    
    }
    
    /**
     * Mètode que transforma l'array de pilots en una matriu
     * @param dades array que conté les dades a transformar
     * @return una matriu d'objectes que conté les dades que ens interessen dels pilots
     */
    public static Object[][] transformaDades(Pilot[] dades){
        Object[][] resultat=new Object[dades.length][5];
        //Variable per comptar el número de pilots en dades que hi ha a l'array de dades
        int omplits=0;
        
        for (int i = 0; i < dades.length; i++) {
            if(dades[i].isOmplit()){
                resultat[omplits][0]=i;
                resultat[omplits][1]=dades[i].getNom();
                resultat[omplits][2]=dades[i].getDorsal();
                resultat[omplits][3]=dades[i].getDinersGuanyats();
                resultat[omplits][4]=dades[i].isHome();
                omplits++;
            }
        }
        //Retornem només els pilots plens
        return Arrays.copyOf(resultat,omplits);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        taula = new javax.swing.JTable();
        casellaNom = new javax.swing.JTextField();
        casellaDorsal = new javax.swing.JTextField();
        casellaGuanys = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        opcioHome = new javax.swing.JRadioButton();
        opcioDona = new javax.swing.JRadioButton();
        botoInserir = new javax.swing.JButton();
        botoModificar = new javax.swing.JButton();
        botoBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(taula);

        jLabel1.setText("Nom");

        jLabel2.setText("Dorsal");

        jLabel3.setText("Guanys");

        buttonGroup1.add(opcioHome);
        opcioHome.setText("Home");

        buttonGroup1.add(opcioDona);
        opcioDona.setText("Dona");

        botoInserir.setText("Inserir");

        botoModificar.setText("Modificar");

        botoBorrar.setText("Borrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcioDona)
                            .addComponent(opcioHome)
                            .addComponent(casellaNom, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casellaDorsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(casellaGuanys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(botoModificar)
                        .addGap(162, 162, 162)
                        .addComponent(botoBorrar)
                        .addGap(167, 167, 167)
                        .addComponent(botoInserir)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {casellaDorsal, casellaGuanys, casellaNom});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(casellaNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(casellaDorsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(casellaGuanys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(1, 1, 1)
                .addComponent(opcioHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcioDona)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botoModificar)
                    .addComponent(botoBorrar)
                    .addComponent(botoInserir))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GUI_exemple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_exemple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_exemple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_exemple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_exemple().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoBorrar;
    private javax.swing.JButton botoInserir;
    private javax.swing.JButton botoModificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField casellaDorsal;
    private javax.swing.JTextField casellaGuanys;
    private javax.swing.JTextField casellaNom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton opcioDona;
    private javax.swing.JRadioButton opcioHome;
    private javax.swing.JTable taula;
    // End of variables declaration//GEN-END:variables
}