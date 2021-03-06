/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agmanager.out.terminal;

import java.io.PrintStream;

/**
 *
 * @author kaeru
 */
public class OutputTerminal extends javax.swing.JFrame {
    private static OutputTerminal terminal;
    private final TextAreaOutputStream out;
    private static Boolean state = false;
    
    /**
     * Creates new form OutputTerminal
     */
    public OutputTerminal() {
        initComponents();
        this.jOutputTextArea.setEditable(false);
        this.out = new TextAreaOutputStream(this);
    }
    
    public static OutputTerminal getTerminal(){
        execute();
        return terminal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jOutputTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBar(null);

        jOutputTextArea.setBackground(new java.awt.Color(0, 0, 0));
        jOutputTextArea.setColumns(20);
        jOutputTextArea.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jOutputTextArea.setForeground(new java.awt.Color(255, 255, 255));
        jOutputTextArea.setLineWrap(true);
        jOutputTextArea.setRows(5);
        jScrollPane1.setViewportView(jOutputTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void execute() {
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
            java.util.logging.Logger.getLogger(OutputTerminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutputTerminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutputTerminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutputTerminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        terminal = new OutputTerminal();
                
        //Standard Output
        //terminal.setToSystemOut();
        //terminal.setToSystemErr();
        
        state = true;
    }
    
    public Boolean isExecutable(){
        return this.state;
    }
    
    public void setToSystemOut(){
        System.setOut(new PrintStream(this.getOut()));
    }

    public void setToSystemErr(){
        System.setErr(new PrintStream(this.getOut()));
    }

    public TextAreaOutputStream getOut() {
        return out;
    }

    public void flush(){
        this.jOutputTextArea.append(out.toString());
        out.reset();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea jOutputTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
