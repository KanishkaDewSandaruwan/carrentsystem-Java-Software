/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author kaniya
 */
public class Admin_Employee extends javax.swing.JFrame {

    /**
     * Creates new form CarReg
     */
    public Admin_Employee() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        autoId();
        get_table();
    }
    
    Connection con;
    PreparedStatement pst;
    PreparedStatement ps;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmployeeReg = new javax.swing.JTextField();
        txtCustomername = new javax.swing.JTextField();
        txtCustomerAddress = new javax.swing.JTextField();
        vomboCustomerGender = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCustomerMobile = new javax.swing.JTextField();
        txtCustomerEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCustomerNIC = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnAddNew = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtRePassword = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        txtBasic = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("Employee Reg Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("Full Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("Gender");

        vomboCustomerGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 51));
        jLabel6.setText("Mobile Number");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("E-Mail Address");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 51));
        jLabel8.setText("NIC Number");

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAddNew.setBackground(new java.awt.Color(0, 0, 0));
        btnAddNew.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddNew.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNew.setText("Clear");
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Save New");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(0, 0, 0));
        btnEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Update Data");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 51));
        jLabel9.setText("User Name");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 51));
        jLabel10.setText("Password");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 51));
        jLabel11.setText("Re-Password");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 51));
        jLabel12.setText("Basic Salary");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAddNew, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCustomername, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmployeeReg, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCustomerAddress, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBasic)
                                    .addComponent(txtUsername)
                                    .addComponent(txtCustomerNIC, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(vomboCustomerGender, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCustomerEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCustomerMobile)
                                    .addComponent(txtPassword)
                                    .addComponent(txtRePassword))))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmployeeReg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(txtCustomerMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(txtCustomerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(vomboCustomerGender, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtCustomerNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBasic, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setText("Employee Registration");

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Full Name", "Address", "Mobile Number", "Email", "Gender", "Basic Salary", "NIC Number", "User Name"
            }
        ));
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table2);
        if (table2.getColumnModel().getColumnCount() > 0) {
            table2.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       
        String reg_no = txtEmployeeReg.getText();
        String name = txtCustomername.getText();
        String address = txtCustomerAddress.getText();
        String mobile = txtCustomerMobile.getText();
        String email = txtCustomerEmail.getText();
        String gender = vomboCustomerGender.getSelectedItem().toString();
        String nic = txtCustomerNIC.getText();
        String uname = txtUsername.getText(); 
        String pass = txtPassword.getText(); 
        String rpass = txtRePassword.getText();
        String Basic = txtBasic.getText();
        
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/carrent","root","");
            ps = (PreparedStatement) con.prepareStatement("select * from customer where customer_id = ?");
            ps.setString(1, reg_no);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Customer Alrady Exist");
            }
            else
            {
                if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please Enter Full Name");
                }else if (address.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please Enter Address");
                }else if (mobile.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please Enter Mobile Number");
                }else if (email.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please Enter Email Address");
                }else if (nic.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please Enter NIC Number");
                }else if (mobile.length() == 11) {
                    JOptionPane.showMessageDialog(this, "Please Enter Correct Phone Number");
                }else if (uname.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please Enter User Name");
                }else if (pass.equals(rpass)) {
                    
                    if (checkUsername(uname) == false) {
                            try {


                                Class.forName("com.mysql.jdbc.Driver");
                                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/carrent","root","");
                                pst = (PreparedStatement) con.prepareStatement("insert into employee(employee_id,name,address,mobile,email,gender,nic,username,password,basic_salary) values(?,?,?,?,?,?,?,?,?,?)");
                                pst.setString(1, reg_no);
                                pst.setString(2, name);
                                pst.setString(3, address);
                                pst.setString(4, mobile);
                                pst.setString(5, email);
                                pst.setString(6, gender);
                                pst.setString(7, nic);
                                pst.setString(8, uname);
                                pst.setString(9, rpass);
                                pst.setString(10, Basic);
                                pst.executeUpdate();
                                JOptionPane.showMessageDialog(this, "Employee Added Success");
                                get_table();
                                autoId();

                            txtCustomername.setText("");
                            txtCustomerAddress.setText("");
                            txtCustomerMobile.setText("");
                            txtCustomerEmail.setText("");
                            txtCustomerNIC.setText("");
                            txtBasic.setText("");
                            
                            txtUsername.setText(""); 
                            txtPassword.setText(""); 
                            txtRePassword.setText("");

                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(Admin_Employee.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (SQLException ex) {
                                Logger.getLogger(Admin_Employee.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            
                      }else{
                         JOptionPane.showMessageDialog(this, "User Name is Alrady Exist. Please Enter Onother User Name");
                      }
                    
                }else {
                    JOptionPane.showMessageDialog(this, "Password is not Match");      
                }
                
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin_Employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    
    public boolean checkUsername(String username)
    {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String query = "SELECT * FROM `employee` WHERE `username` =?";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/carrent","root","");
            ps = (PreparedStatement) con.prepareStatement(query);
            ps.setString(1, username);
            
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                checkUser = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(adminPannel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(adminPannel.class.getName()).log(Level.SEVERE, null, ex);
        }
         return checkUser;
    }
    
    
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        adminPannel m = new adminPannel();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
 
                int selectIndex;
                TableModel d1 = (DefaultTableModel)table2.getModel();
                selectIndex = table2.getSelectedRow();

                int dialogresult = JOptionPane.showConfirmDialog(this, "Do You want to Delete Recode!","Warning",JOptionPane.YES_NO_OPTION);

                if (dialogresult == JOptionPane.YES_OPTION) {
                    try {

                        String id = d1.getValueAt(selectIndex, 0).toString();

                        Class.forName("com.mysql.jdbc.Driver");
                        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/carrent","root","");
                        pst = (PreparedStatement) con.prepareStatement("delete from employee where employee_id = ?");
                        pst.setString(1, id);
                        pst.executeUpdate();

                        JOptionPane.showMessageDialog(this, "Delete Success");
                        get_table();

                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Admin_Employee.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Admin_Employee.class.getName()).log(Level.SEVERE, null, ex);
                    }     
                }else{

                }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed

        txtCustomername.setText("");
        txtCustomerAddress.setText("");
        txtCustomerMobile.setText("");
        txtCustomerEmail.setText("");
        txtCustomerNIC.setText("");  
        txtBasic.setText(""); 
        
        
        txtUsername.setText(""); 
        txtPassword.setText(""); 
        txtRePassword.setText(""); 
        autoId();
    }//GEN-LAST:event_btnAddNewActionPerformed

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
        int selectIndex;
        TableModel d1 = (DefaultTableModel)table2.getModel();
        selectIndex = table2.getSelectedRow();
        
        txtEmployeeReg.setText(d1.getValueAt(selectIndex, 0).toString());
        txtCustomername.setText(d1.getValueAt(selectIndex, 1).toString());
        txtCustomerAddress.setText(d1.getValueAt(selectIndex, 2).toString());
        txtCustomerMobile.setText(d1.getValueAt(selectIndex,3).toString());
        txtCustomerEmail.setText(d1.getValueAt(selectIndex, 4).toString());
        vomboCustomerGender.setSelectedItem(d1.getValueAt(selectIndex, 5).toString());
        txtBasic.setText(d1.getValueAt(selectIndex, 6).toString());
        txtCustomerNIC.setText(d1.getValueAt(selectIndex, 7).toString());
        txtUsername.setText(d1.getValueAt(selectIndex, 8).toString());
       
        
    }//GEN-LAST:event_table2MouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed


       int selectIndex;
        TableModel d1 = (DefaultTableModel)table2.getModel();
        selectIndex = table2.getSelectedRow();
        
        String id = d1.getValueAt(selectIndex, 0).toString();
        
        try {
            
            String reg_no = txtEmployeeReg.getText();
            String name = txtCustomername.getText();
            String address = txtCustomerAddress.getText();
            String mobile = txtCustomerMobile.getText();
            String email = txtCustomerEmail.getText();
            String gender = vomboCustomerGender.getSelectedItem().toString();
            String Basic = txtBasic.getText();
            String nic = txtCustomerNIC.getText();
            String uname = txtUsername.getText();
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/carrent","root","");
            pst = (PreparedStatement) con.prepareStatement("update employee set  name=?, address=?, mobile=?, email=?, gender=?, nic=?, basic_salary =?, username=? where employee_id=?");
            
            pst.setString(1, name);
            pst.setString(2, address);
            pst.setString(3, mobile);
            pst.setString(4, email);
            pst.setString(5, gender);
            pst.setString(6, nic);
            pst.setString(7, Basic);
            pst.setString(8, uname);
            pst.setString(9, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Employee Data Updateed Success");
            get_table();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarReg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    /**
     * @param args the command line arguments
     */
    public void get_table(){
        
        int c;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/carrent","root","");
            pst = (PreparedStatement) con.prepareStatement("select * from employee");
            ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData rm = rs.getMetaData();
            c = rm.getColumnCount();
            DefaultTableModel df = (DefaultTableModel) table2.getModel();
            df.setRowCount(0);
            
            while (rs.next()){
                Vector vector = new Vector();
                
                for (int i = 0; i <= c; i++) {
                    vector.add(rs.getString("employee_id"));
                    vector.add(rs.getString("name"));
                    vector.add(rs.getString("address"));
                    vector.add(rs.getString("mobile"));
                    vector.add(rs.getString("email"));
                    vector.add(rs.getString("gender"));
                    vector.add(rs.getString("basic_salary"));
                    vector.add(rs.getString("nic"));
                    vector.add(rs.getString("username"));
                    
                }
                df.addRow(vector);
            }
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin_Employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
    
    public void autoId(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/carrent","root","");
            Statement s = con.createStatement(); 
            
            ResultSet rs = s.executeQuery("select Max(employee_id) from employee");
            rs.next();
            rs.getString("Max(employee_id)");
            
            if (rs.getString("Max(employee_id)")==null) {
                txtEmployeeReg.setText("W0001");
            }
            else
            {
                long id = Long.parseLong(rs.getString("Max(employee_id)").substring(2,rs.getString("Max(employee_id)").length()));
                id++;
                txtEmployeeReg.setText("W0" + String.format("%03d", id));
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Admin_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Admin_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table2;
    private javax.swing.JTextField txtBasic;
    private javax.swing.JTextField txtCustomerAddress;
    private javax.swing.JTextField txtCustomerEmail;
    private javax.swing.JTextField txtCustomerMobile;
    private javax.swing.JTextField txtCustomerNIC;
    private javax.swing.JTextField txtCustomername;
    private javax.swing.JTextField txtEmployeeReg;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRePassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JComboBox<String> vomboCustomerGender;
    // End of variables declaration//GEN-END:variables
}
