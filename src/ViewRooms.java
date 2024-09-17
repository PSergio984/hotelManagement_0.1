
import java.util.List;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Eric
 */
public class ViewRooms extends javax.swing.JFrame {

    /**
     * Creates new form ViewRooms
     */
    public ViewRooms() {
        initComponents();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnl3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRooms = new javax.swing.JTable();
        btnClose = new javax.swing.JButton();
        btnClose1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnl3.setBackground(new java.awt.Color(148, 202, 255));

        jLabel2.setBackground(new java.awt.Color(148, 202, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("View Rooms");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 25, 41), 3));

        tblRooms.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tblRooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Room Number", "Room Type", "Price", "Room Size", "Check-In Date", "Check-Out Date", "Reservation Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRooms);
        if (tblRooms.getColumnModel().getColumnCount() > 0) {
            tblRooms.getColumnModel().getColumn(0).setResizable(false);
            tblRooms.getColumnModel().getColumn(1).setResizable(false);
            tblRooms.getColumnModel().getColumn(2).setResizable(false);
            tblRooms.getColumnModel().getColumn(3).setResizable(false);
            tblRooms.getColumnModel().getColumn(4).setResizable(false);
            tblRooms.getColumnModel().getColumn(5).setResizable(false);
            tblRooms.getColumnModel().getColumn(6).setResizable(false);
        }

        btnClose.setBackground(new java.awt.Color(255, 0, 0));
        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(0, 0, 0));
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnClose1.setBackground(new java.awt.Color(255, 0, 0));
        btnClose1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnClose1.setForeground(new java.awt.Color(0, 0, 0));
        btnClose1.setText("CLOSE");
        btnClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnl3Layout = new javax.swing.GroupLayout(jpnl3);
        jpnl3.setLayout(jpnl3Layout);
        jpnl3Layout.setHorizontalGroup(
            jpnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(jpnl3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(391, 391, 391)
                .addComponent(btnClose1)
                .addGap(125, 125, 125))
            .addGroup(jpnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnl3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnClose)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jpnl3Layout.setVerticalGroup(
            jpnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose1))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(jpnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnl3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnClose)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jpnl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        HomePage homePage = new HomePage(); //opening and closing up this window
        homePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose1ActionPerformed
        HomePage homePage = new HomePage(); //opening and closing up this window
        homePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClose1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnClose;
    public javax.swing.JButton btnClose1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnl3;
    private javax.swing.JTable tblRooms;
    // End of variables declaration//GEN-END:variables
private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblRooms.getModel();
        model.setRowCount(0); // Clear existing data


        for (Rooms room : HotelNibra.rooms) {
            Object[] row = {
                room.getRoomNumber(),
                room.getType(),
                room.getPrice(),
                room.getSize(),
                room.getCheckInDate(),
                room.getCheckOutDate(),
                room.getReservationStatus(),
                room.getSpecial()
            };
            model.addRow(row);
        }
}
}
