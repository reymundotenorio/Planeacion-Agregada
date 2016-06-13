package View;

import javax.swing.ImageIcon;

/**
 *
 * @author Reymundo Tenorio
 */
public class ProcesandoInfo extends javax.swing.JDialog {

    public ProcesandoInfo() {

        this.setUndecorated(true); // Sin borde
//        this.setOpacity(0.5F); // Transparencia
        
        initComponents();

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Assets/Cargando.gif"));
        LabelGif.setIcon(imageIcon);
        LabelGif.setOpaque(false);
        this.setSize(540,540);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelGif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LabelGif.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cargando.gif"))); // NOI18N
        LabelGif.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LabelGif, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcesandoInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        new ProcesandoInfo().setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelGif;
    // End of variables declaration//GEN-END:variables
}
