
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;

public class SignIn extends javax.swing.JFrame {

    public static String name, phone, email, nationality, cardNo, cvc,gender;

    public SignIn() {
        initComponents();
        focus();
         Icon i = lblLogo.getIcon(); 
        scaleImageIcon(lblLogo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        pblBg3 = new javax.swing.JPanel();
        lblHotelNigo3 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jpnl3 = new javax.swing.JPanel();
        pnlPersonalData = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtNationality = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        pnlCreditCard = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCardNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCVC = new javax.swing.JTextField();
        btnSignIn = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pblBg3.setBackground(new java.awt.Color(28, 25, 41));

        lblHotelNigo3.setBackground(new java.awt.Color(255, 255, 255));
        lblHotelNigo3.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 36)); // NOI18N
        lblHotelNigo3.setForeground(new java.awt.Color(255, 255, 255));
        lblHotelNigo3.setText("HOTEL AMIGGAS");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AmiggasLogo.png"))); // NOI18N

        btnBack.setBackground(new java.awt.Color(204, 0, 0));
        btnBack.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pblBg3Layout = new javax.swing.GroupLayout(pblBg3);
        pblBg3.setLayout(pblBg3Layout);
        pblBg3Layout.setHorizontalGroup(
            pblBg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pblBg3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pblBg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pblBg3Layout.createSequentialGroup()
                        .addComponent(lblHotelNigo3)
                        .addGap(398, 398, 398))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pblBg3Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addContainerGap())))
        );
        pblBg3Layout.setVerticalGroup(
            pblBg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pblBg3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pblBg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(pblBg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pblBg3Layout.createSequentialGroup()
                            .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pblBg3Layout.createSequentialGroup()
                            .addComponent(lblHotelNigo3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)))))
        );

        jpnl3.setBackground(new java.awt.Color(242, 242, 242));

        pnlPersonalData.setBackground(new java.awt.Color(242, 242, 242));
        pnlPersonalData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(28, 25, 41), 5, true));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Personal Data");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 25, 41), 3));

        jLabel3.setBackground(new java.awt.Color(28, 25, 41));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(28, 25, 41));
        jLabel3.setText("Name:");

        jLabel8.setBackground(new java.awt.Color(28, 25, 41));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(28, 25, 41));
        jLabel8.setText("Email:");

        jLabel9.setBackground(new java.awt.Color(28, 25, 41));
        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(28, 25, 41));
        jLabel9.setText("Address:");

        jLabel10.setBackground(new java.awt.Color(28, 25, 41));
        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(28, 25, 41));
        jLabel10.setText("Nationality:");

        jLabel11.setBackground(new java.awt.Color(28, 25, 41));
        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(28, 25, 41));
        jLabel11.setText("Phone:");

        jLabel12.setBackground(new java.awt.Color(28, 25, 41));
        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(28, 25, 41));
        jLabel12.setText("Gender");

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 25, 41), 2));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtPhone.setBackground(new java.awt.Color(255, 255, 255));
        txtPhone.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 25, 41), 2));
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 25, 41), 2));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtAddress.setBackground(new java.awt.Color(255, 255, 255));
        txtAddress.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 25, 41), 2));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        txtNationality.setBackground(new java.awt.Color(255, 255, 255));
        txtNationality.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtNationality.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 25, 41), 2));
        txtNationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNationalityActionPerformed(evt);
            }
        });

        male.setBackground(new java.awt.Color(242, 242, 242));
        genderGroup.add(male);
        male.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        male.setForeground(new java.awt.Color(28, 25, 41));
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        female.setBackground(new java.awt.Color(242, 242, 242));
        genderGroup.add(female);
        female.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        female.setForeground(new java.awt.Color(28, 25, 41));
        female.setText("Female");

        javax.swing.GroupLayout pnlPersonalDataLayout = new javax.swing.GroupLayout(pnlPersonalData);
        pnlPersonalData.setLayout(pnlPersonalDataLayout);
        pnlPersonalDataLayout.setHorizontalGroup(
            pnlPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPersonalDataLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(189, 189, 189))
            .addGroup(pnlPersonalDataLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(pnlPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPersonalDataLayout.createSequentialGroup()
                        .addGroup(pnlPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlPersonalDataLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(txtNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPersonalDataLayout.createSequentialGroup()
                                .addGroup(pnlPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(42, 42, 42))
                    .addGroup(pnlPersonalDataLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPersonalDataLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(male)
                        .addGap(36, 36, 36)
                        .addComponent(female)
                        .addGap(165, 165, 165))))
        );
        pnlPersonalDataLayout.setVerticalGroup(
            pnlPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersonalDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(pnlPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(pnlPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(pnlPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(pnlPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(pnlPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(pnlPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(male)
                    .addComponent(female))
                .addGap(0, 64, Short.MAX_VALUE))
        );

        pnlCreditCard.setBackground(new java.awt.Color(242, 242, 242));
        pnlCreditCard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(28, 25, 41), 5, true));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Payment Methods");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 25, 41), 3));

        jLabel5.setBackground(new java.awt.Color(28, 25, 41));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(28, 25, 41));
        jLabel5.setText("Card No. :");

        txtCardNo.setBackground(new java.awt.Color(255, 255, 255));
        txtCardNo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtCardNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 25, 41), 2));
        txtCardNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCardNoActionPerformed(evt);
            }
        });
        txtCardNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCardNoKeyTyped(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(28, 25, 41));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(28, 25, 41));
        jLabel6.setText("CVC Code:");

        txtCVC.setBackground(new java.awt.Color(255, 255, 255));
        txtCVC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtCVC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 25, 41), 2));
        txtCVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCVCActionPerformed(evt);
            }
        });
        txtCVC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCVCKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlCreditCardLayout = new javax.swing.GroupLayout(pnlCreditCard);
        pnlCreditCard.setLayout(pnlCreditCardLayout);
        pnlCreditCardLayout.setHorizontalGroup(
            pnlCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreditCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(txtCVC, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCreditCardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(134, 134, 134))
            .addGroup(pnlCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCreditCardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCardNo, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        pnlCreditCardLayout.setVerticalGroup(
            pnlCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreditCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(pnlCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addGroup(pnlCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCreditCardLayout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addGroup(pnlCreditCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtCardNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(93, Short.MAX_VALUE)))
        );

        btnSignIn.setBackground(new java.awt.Color(153, 255, 153));
        btnSignIn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(0, 0, 0));
        btnSignIn.setText("SUBMIT");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 51, 0));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 0, 0));
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnl3Layout = new javax.swing.GroupLayout(jpnl3);
        jpnl3.setLayout(jpnl3Layout);
        jpnl3Layout.setHorizontalGroup(
            jpnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlPersonalData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnl3Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnl3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlCreditCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jpnl3Layout.setVerticalGroup(
            jpnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlCreditCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addGroup(jpnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignIn)
                    .addComponent(btnClear))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnl3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPersonalData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pblBg3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pblBg3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtNationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNationalityActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void txtCardNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCardNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCardNoActionPerformed

    private void txtCardNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCardNoKeyTyped
        JTextField txt1 = (JTextField) evt.getSource(); //preventing the user for putting a non digit number
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCardNoKeyTyped

    private void txtCVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCVCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCVCActionPerformed

    private void txtCVCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCVCKeyTyped
        JTextField txt1 = (JTextField) evt.getSource(); //preventing the user for putting a non digit numbe
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCVCKeyTyped

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        
        submission();
        
//opening up a new window and closing this one
        
        

    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
 
        txtName.setText("First and Last Name");
        txtPhone.setText("Phone Number");
        txtEmail.setText("Email");
        txtCardNo.setText("Card Number");
        txtAddress.setText("Address");
        txtNationality.setText("Nationality");
        txtCVC.setText("CVC Code");
             //settubg tge txt fields to default
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        HomePage homePage = new HomePage();
        homePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
     

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    public javax.swing.JButton btnClear;
    public javax.swing.JButton btnSignIn;
    private javax.swing.JRadioButton female;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpnl3;
    private javax.swing.JLabel lblHotelNigo3;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JRadioButton male;
    private javax.swing.JPanel pblBg3;
    private javax.swing.JPanel pnlCreditCard;
    private javax.swing.JPanel pnlPersonalData;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCVC;
    private javax.swing.JTextField txtCardNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNationality;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables

    public void focus() { 
        txtName.setText("Put your name here");
        txtAddress.setText("Put your address here");
        txtCVC.setText("Put your CVC here");
        txtCardNo.setText("Enter card number");
        txtEmail.setText("Enter your email");
        txtNationality.setText("Enter your nationality");
        txtPhone.setText("Enter your phone number");
//focus listener, making it empty if the user clicks it,and setting it to default when the user clicks it for easier guidance
// Implement FocusListener for txtName
        txtName.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtName.getText().equals("Put your name here")) {
                    txtName.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtName.getText().isEmpty()) {
                    txtName.setText("Put your name here");
                }
            }
        });

// Implement FocusListener for txtAddress
        txtAddress.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtAddress.getText().equals("Put your address here")) {
                    txtAddress.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtAddress.getText().isEmpty()) {
                    txtAddress.setText("Put your address here");
                }
            }
        });

// Implement FocusListener for txtCVC
        txtCVC.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtCVC.getText().equals("Put your CVC here")) {
                    txtCVC.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtCVC.getText().isEmpty()) {
                    txtCVC.setText("Put your CVC here");
                }
            }
        });

// Implement FocusListener for txtCardNo
        txtCardNo.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtCardNo.getText().equals("Enter card number")) {
                    txtCardNo.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtCardNo.getText().isEmpty()) {
                    txtCardNo.setText("Enter card number");
                }
            }
        });

// Implement FocusListener for txtEmail
        txtEmail.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtEmail.getText().equals("Enter your email")) {
                    txtEmail.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtEmail.getText().isEmpty()) {
                    txtEmail.setText("Enter your email");
                }
            }
        });

// Implement FocusListener for txtNationality
        txtNationality.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtNationality.getText().equals("Enter your nationality")) {
                    txtNationality.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtNationality.getText().isEmpty()) {
                    txtNationality.setText("Enter your nationality");
                }
            }
        });

// Implement FocusListener for txtPhone
        txtPhone.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtPhone.getText().equals("Enter your phone number")) {
                    txtPhone.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtPhone.getText().isEmpty()) {
                    txtPhone.setText("Enter your phone number");
                }
            }
        });

    }

    public void txtIntegerKeyTyped(java.awt.event.KeyEvent evt) {
        JTextField txt1 = (JTextField) evt.getSource();
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }
private void submission() { 
    //setting the variables based on the txt field that the user inputted
    name = txtName.getText();
    phone = txtPhone.getText();
    email = txtEmail.getText();
    nationality = txtNationality.getText();
    cardNo = txtCardNo.getText();
    cvc = txtCVC.getText();

    gender = ""; // Declare gender variable

    // Check if "Male" radio button is selected
    if (male.isSelected()) {
        gender = "Male"; // Set gender to "Male"
    } else if (female.isSelected()) {
        gender = "Female"; // Set gender to "Female"
    }
    // Now gender variable contains the selected gender ("Male" or "Female")

    // Check if any field is empty
    if (name.isEmpty() || phone.isEmpty() || email.isEmpty() || nationality.isEmpty() || cardNo.isEmpty() || cvc.isEmpty() || gender.isEmpty()) {
        // Show message if any field is empty
        JOptionPane.showMessageDialog(this, "Please fill in all fields.");
        return; // Exit the method
    }
      checkInFilter checkInFilter = new checkInFilter();
        checkInFilter.setVisible(true);
        this.dispose();

   
    
    
}
 
    
    public void scaleImageIcon(JLabel label) { //scaling the image icon for jlabels
        Icon icon = label.getIcon();
        if (icon instanceof ImageIcon) {
            ImageIcon imageIcon = (ImageIcon) icon;
            Image image = imageIcon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(image));
        } else {
            System.err.println("The label does not have an ImageIcon set.");
        }
    }
}
