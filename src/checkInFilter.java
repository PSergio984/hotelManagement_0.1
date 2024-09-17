//imports

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.RowFilter;
import javax.swing.RowFilter.Entry;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class checkInFilter extends javax.swing.JFrame {

    List<Rooms> rooms = HotelNibra.getRooms();
    private DefaultTableModel model;
    private TableRowSorter<TableModel> sorter;
    Economy ecoRoom;
    Standard stanRoom;
    Deluxe delRoom;

    String checkInDateStr;
    String checkOutDateStr;

    public checkInFilter() {
        initComponents();
        model = (DefaultTableModel) tblRooms.getModel();
        sorter = new TableRowSorter<>(model); // Initialize the TableRowSorter
        tblRooms.setRowSorter(sorter); // Set the TableRowSorter for the table
        populateTable();

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roomTypeGroup = new javax.swing.ButtonGroup();
        roomSizeGroup = new javax.swing.ButtonGroup();
        pnlRoomData = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        economy = new javax.swing.JRadioButton();
        deluxe = new javax.swing.JRadioButton();
        standard = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        singleRoom = new javax.swing.JRadioButton();
        doubleRoom = new javax.swing.JRadioButton();
        tripleRoom = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        dateCheckIn = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        dateCheckOut = new com.toedter.calendar.JDateChooser();
        btnFilter = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRooms = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRoomData.setBackground(new java.awt.Color(242, 242, 242));
        pnlRoomData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(28, 25, 41), 5, true));
        pnlRoomData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Check-In");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 25, 41), 3));
        pnlRoomData.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, 49));

        jLabel13.setBackground(new java.awt.Color(28, 25, 41));
        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(28, 25, 41));
        jLabel13.setText("Room Type:");
        pnlRoomData.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        economy.setBackground(new java.awt.Color(242, 242, 242));
        roomTypeGroup.add(economy);
        economy.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        economy.setForeground(new java.awt.Color(28, 25, 41));
        economy.setText("ECONOMY");
        economy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                economyActionPerformed(evt);
            }
        });
        pnlRoomData.add(economy, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));

        deluxe.setBackground(new java.awt.Color(242, 242, 242));
        roomTypeGroup.add(deluxe);
        deluxe.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        deluxe.setForeground(new java.awt.Color(28, 25, 41));
        deluxe.setText("DELUXE");
        deluxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deluxeActionPerformed(evt);
            }
        });
        pnlRoomData.add(deluxe, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, -1, -1));

        standard.setBackground(new java.awt.Color(242, 242, 242));
        roomTypeGroup.add(standard);
        standard.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        standard.setForeground(new java.awt.Color(28, 25, 41));
        standard.setText("STANDARD");
        standard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardActionPerformed(evt);
            }
        });
        pnlRoomData.add(standard, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, -1, -1));

        jLabel14.setBackground(new java.awt.Color(28, 25, 41));
        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(28, 25, 41));
        jLabel14.setText("Room Size:");
        pnlRoomData.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        singleRoom.setBackground(new java.awt.Color(242, 242, 242));
        roomSizeGroup.add(singleRoom);
        singleRoom.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        singleRoom.setForeground(new java.awt.Color(28, 25, 41));
        singleRoom.setText("SINGLE");
        singleRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleRoomActionPerformed(evt);
            }
        });
        pnlRoomData.add(singleRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

        doubleRoom.setBackground(new java.awt.Color(242, 242, 242));
        roomSizeGroup.add(doubleRoom);
        doubleRoom.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        doubleRoom.setForeground(new java.awt.Color(28, 25, 41));
        doubleRoom.setText("DOUBLE");
        doubleRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleRoomActionPerformed(evt);
            }
        });
        pnlRoomData.add(doubleRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, -1, -1));

        tripleRoom.setBackground(new java.awt.Color(242, 242, 242));
        roomSizeGroup.add(tripleRoom);
        tripleRoom.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        tripleRoom.setForeground(new java.awt.Color(28, 25, 41));
        tripleRoom.setText("TRIPLE");
        tripleRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tripleRoomActionPerformed(evt);
            }
        });
        pnlRoomData.add(tripleRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, -1, -1));

        jLabel15.setBackground(new java.awt.Color(28, 25, 41));
        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(28, 25, 41));
        jLabel15.setText("Check In:");
        pnlRoomData.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));
        pnlRoomData.add(dateCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 213, 33));

        jLabel16.setBackground(new java.awt.Color(28, 25, 41));
        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(28, 25, 41));
        jLabel16.setText("Check Out:");
        pnlRoomData.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, 46));
        pnlRoomData.add(dateCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 213, 27));

        btnFilter.setBackground(new java.awt.Color(153, 255, 153));
        btnFilter.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnFilter.setForeground(new java.awt.Color(0, 0, 0));
        btnFilter.setText("FILTER");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });
        pnlRoomData.add(btnFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 157, -1));

        btnClose.setBackground(new java.awt.Color(255, 0, 0));
        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(0, 0, 0));
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        pnlRoomData.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, -1));

        tblRooms.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tblRooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Room Number", "Room Type", "Price", "Room Size", "Check-In Date", "Check-Out Date", "Reservation Status", "Specials"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRoomsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRooms);

        pnlRoomData.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 1250, 420));

        getContentPane().add(pnlRoomData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void economyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_economyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_economyActionPerformed

    private void deluxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deluxeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deluxeActionPerformed

    private void singleRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_singleRoomActionPerformed

    private void doubleRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doubleRoomActionPerformed

    private void tripleRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tripleRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tripleRoomActionPerformed

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        // Clear previous filters
        sorter.setRowFilter(null);

        // Check if room type and size are selected
        if (!economy.isSelected() && !deluxe.isSelected() && !standard.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please select a room type.");
            return;
        }
        if (!singleRoom.isSelected() && !doubleRoom.isSelected() && !tripleRoom.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please select a room size.");
            return;
        }
        // Check if check-in and check-out dates are selected
        if (dateCheckIn.getDate() == null || dateCheckOut.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Please select both check-in and check-out dates.");
            return;
        }

// Get the selected date from the JDateChooser
        Date checkInDateObj = dateCheckIn.getDate();
        Date checkOutDateObj = dateCheckOut.getDate();

// Define the date format you want
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-YYYY");

// Convert the Date objects to Strings using the defined format
        checkInDateStr = dateFormat.format(checkInDateObj);
        checkOutDateStr = dateFormat.format(checkOutDateObj);

        // Get the selected room type and size
        String selectedRoomType = getSelectedButtonText(roomTypeGroup);
        String selectedRoomSize = getSelectedButtonText(roomSizeGroup);

        // Create a filter based on the selected room type and size
        RowFilter<TableModel, Object> filter = new RowFilter<TableModel, Object>() {
            @Override
            public boolean include(Entry<? extends TableModel, ? extends Object> entry) {
                String roomType = entry.getStringValue(1); // Room Type column index
                String roomSize = entry.getStringValue(3); // Room Size column index
                String reservationStatus = entry.getStringValue(6); // Reservation Status column index

                return roomType.equals(selectedRoomType) && roomSize.equals(selectedRoomSize)
                        && reservationStatus.equals("Available");
            }
        };

        // Apply the filter to the table's sorter
        sorter.setRowFilter(filter);

    }

    private String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;

    }//GEN-LAST:event_btnFilterActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        HomePage homePage = new HomePage(); //opening and closing up this window
        homePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void standardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_standardActionPerformed

    private void tblRoomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRoomsMouseClicked
        // Get the index of the selected row in the table
        int selectedRow = tblRooms.getSelectedRow();
        // Check if check-in and check-out dates are selected
        if (dateCheckIn.getDate() == null || dateCheckOut.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Please select both check-in and check-out dates.");
            return;
        }
        // Check if a row is selected
        if (selectedRow != -1) {
            // Get the room number of the selected room
            int roomNumber = (int) tblRooms.getValueAt(selectedRow, 0);

            // Find the corresponding room object in the rooms list
            Rooms selectedRoom = null;
            for (Rooms room : rooms) {
                if (room.getRoomNumber() == roomNumber) {
                    selectedRoom = room;
                    break; 
               }
            }
            
// Get the selected date from the JDateChooser
            Date checkInDateObj = dateCheckIn.getDate();
            Date checkOutDateObj = dateCheckOut.getDate();

// Define the date format you want
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-YYYY");

            checkInDateStr = dateFormat.format(checkInDateObj);
            checkOutDateStr = dateFormat.format(checkOutDateObj);

            // Check if the selected room is found
            if (selectedRoom != null) {
                 // Check if the room is available
             if (!selectedRoom.getReservationStatus().equalsIgnoreCase("Available") ) {
            // Room is not available, display error message
            JOptionPane.showMessageDialog(this, "This room is not available.");
            return;
             }
             // Exit the method
                // Instantiate the appropriate room subclass based on the room type
                if (selectedRoom instanceof Economy) {
                    ecoRoom = (Economy) selectedRoom;        
                
                } else if (selectedRoom instanceof Standard) {
                    stanRoom = (Standard) selectedRoom;
                     
                } else if (selectedRoom instanceof Deluxe) {
                    delRoom = (Deluxe) selectedRoom;
                     
                }
                
               checkInUI checkInUI = new checkInUI(selectedRoom.getRoomNumber()-1, checkInDateStr, checkOutDateStr);
                checkInUI.setVisible(true);
                // Call the displayDescription method of the selected room to show room details
                selectedRoom.displayDescription(checkInUI);
                selectedRoom.setImage(checkInUI);
                
                
                
                this.dispose();
            } else {
                // Show an error message if the selected room is not found
                JOptionPane.showMessageDialog(this, "Error: Selected room not found.");
            }
        }

    }//GEN-LAST:event_tblRoomsMouseClicked

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
            java.util.logging.Logger.getLogger(checkInFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkInFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkInFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkInFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkInFilter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnClose;
    public javax.swing.JButton btnFilter;
    private com.toedter.calendar.JDateChooser dateCheckIn;
    private com.toedter.calendar.JDateChooser dateCheckOut;
    private javax.swing.JRadioButton deluxe;
    private javax.swing.JRadioButton doubleRoom;
    private javax.swing.JRadioButton economy;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlRoomData;
    private javax.swing.ButtonGroup roomSizeGroup;
    private javax.swing.ButtonGroup roomTypeGroup;
    private javax.swing.JRadioButton singleRoom;
    private javax.swing.JRadioButton standard;
    private javax.swing.JTable tblRooms;
    private javax.swing.JRadioButton tripleRoom;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblRooms.getModel();
        model.setRowCount(0); // Clear existing data

        List<Rooms> rooms = HotelNibra.getRooms();

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
