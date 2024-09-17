
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Eric
 */
public class checkInUI extends javax.swing.JFrame {

    private static int roomIndex;
    public static String checkInDate;
    public static String checkOutDate;


    public checkInUI(int roomIndex, String checkInDate, String checkOutDate) {
       initComponents();
        this.roomIndex = roomIndex;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        // Display room information using roomIndex, checkInDate, and checkOutDate
       
        System.out.println(roomIndex);
        System.out.println(checkInDate);
        System.out.println(checkOutDate);
         setText();

    }

    public checkInUI() {
        initComponents();
        setText();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnlBg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        btnClose = new javax.swing.JButton();
        btnCheckIn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescription1 = new javax.swing.JTextArea();
        lblIcon = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Check-In");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 25, 41), 3));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));

        pnlBg.setBackground(new java.awt.Color(255, 255, 255));
        pnlBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDescription.setBackground(new java.awt.Color(255, 255, 255));
        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtDescription.setRows(5);
        txtDescription.setBorder(null);
        txtDescription.setFocusable(false);
        jScrollPane1.setViewportView(txtDescription);

        pnlBg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 440, 130));

        btnClose.setBackground(new java.awt.Color(255, 0, 0));
        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(0, 0, 0));
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        pnlBg.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 720, -1, -1));

        btnCheckIn.setBackground(new java.awt.Color(153, 255, 153));
        btnCheckIn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCheckIn.setForeground(new java.awt.Color(0, 0, 0));
        btnCheckIn.setText("Check-In");
        btnCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckInActionPerformed(evt);
            }
        });
        pnlBg.add(btnCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 720, 157, -1));

        txtDescription1.setBackground(new java.awt.Color(255, 255, 255));
        txtDescription1.setColumns(20);
        txtDescription1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtDescription1.setRows(5);
        txtDescription1.setFocusable(false);
        jScrollPane3.setViewportView(txtDescription1);

        pnlBg.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 440, 130));

        lblIcon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        pnlBg.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 240, 280));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Check-In");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 25, 41), 3));
        pnlBg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 49));

        jLayeredPane1.setLayer(pnlBg, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBg, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(pnlBg, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        checkInFilter checkInFilter = new checkInFilter();
        checkInFilter.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckInActionPerformed
        // Update the room's check-in date, check-out date, and availability in the rooms list

        HotelNibra.rooms.get(roomIndex).setCheckInDate(checkInDate);
        HotelNibra.rooms.get(roomIndex).setCheckOutDate(checkOutDate);
        HotelNibra.rooms.get(roomIndex).setReservationStatus("Occupied");
        System.out.println(roomIndex);
        System.out.println(HotelNibra.rooms.get(roomIndex).getCheckInDate());
        System.out.println(HotelNibra.rooms.get(roomIndex).getCheckOutDate());
        System.out.println(HotelNibra.rooms.get(roomIndex).getReservationStatus());

        for (Rooms room : HotelNibra.rooms) {
            System.out.println(room.toString());
        }
        // Update the rooms text file
        updateRoomsTextFile(HotelNibra.rooms);

        User user = new User(SignIn.name, SignIn.phone, SignIn.email, SignIn.nationality, SignIn.cardNo, SignIn.cvc, SignIn.gender, roomIndex + 1);
        //user.setroomCheckIn(roomIndex+1);

        // Add the user to the user list
        HotelNibra.userList.add(user);
        // Update the users text file
        user.updateUsersTextFile();
        System.out.println(user.getroomCheckIn());
        // Display a message to indicate successful check-in
        JOptionPane.showMessageDialog(this, "Room checked in successfully!");

        // Close the check-in UI window
        HomePage homePage = new HomePage(); //opening and closing up this window
        homePage.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnCheckInActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(checkInUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkInUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkInUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkInUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkInUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCheckIn;
    public javax.swing.JButton btnClose;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JLabel lblIcon;
    private javax.swing.JPanel pnlBg;
    public static javax.swing.JTextArea txtDescription;
    public static javax.swing.JTextArea txtDescription1;
    // End of variables declaration//GEN-END:variables
public void setText() {

        txtDescription1.setText("Check-In Date: " + checkInDate + "\n"
                + "Check-Out Date: " + checkOutDate + "\n"
             );
    }

    private void updateRoomsTextFile(List<Rooms> rooms) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("ROOMS.txt"));
            for (Rooms room : rooms) {
                writer.write(room.toString()); // Assuming Rooms class has a toString() method to represent room details
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
