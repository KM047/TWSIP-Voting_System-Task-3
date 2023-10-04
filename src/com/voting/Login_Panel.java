package com.voting;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.border.*;

import com.voting.SQLConnection;


import javax.swing.*;
public class Login_Panel extends JFrame implements ActionListener {

	ResultSet rSet;
	
	Login_Panel(){
		
		jLabel1 = new JLabel();
        jLabel3 = new JLabel();
        tfAdminUser = new JTextField();
        btnLogin = new JButton();
        btnBack = new JButton();
        jLabel4 = new JLabel();
        tfAdminPass = new JTextField();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Admin Login");
        setVisible(true);
        

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("Admin Login");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Enter Username:");

        tfAdminUser.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        

        btnLogin.setBackground(new java.awt.Color(51, 255, 51));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setText("Login");
        
        btnLogin.addActionListener(this);
        

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("Back");
        
        btnBack.addActionListener(this);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("Enter Password :");

        tfAdminPass.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
       

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfAdminUser, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfAdminPass, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(124, 124, 124)
                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(133, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAdminUser, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAdminPass, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnBack)
                .addGap(14, 14, 14))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(273, Short.MAX_VALUE)))
        );

        layout.linkSize(SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, tfAdminUser});

        pack();
        setLocationRelativeTo(null);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		new Login_Panel();
		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == btnLogin) {
			
			String password = tfAdminPass.getText();

			String user = tfAdminUser.getText();
			
			if (password.equals("")) {
				
				JOptionPane.showMessageDialog(null, "Please Enter the Password");
				
			} 
			
			else if (user.equals("")) {
				
				JOptionPane.showMessageDialog(null, "Please Enter the Username");
				
			}
			
			else {

				SQLConnection sqlop = new SQLConnection();
				
				
				String query = "SELECT * FROM admin_info WHERE username = '"+ user +"' AND pass = '"+ password +"'";
				

				try {
					
					rSet = sqlop.stamt.executeQuery(query);
					
					if (rSet.next()) {
						
						setVisible(false);
						
						// TODO: Result Panel
						
						new Result_Panel().setVisible(true);
						
						
					} else {

						JOptionPane.showMessageDialog(null, "Please Enter correct username and password");
						
					}
					
					
				} 
				
				catch (Exception e2) {
					// TODO: handle exception
				}
				
				
			}
			
			
		} 
		
		else if (e.getSource() == btnBack) {
		
			setVisible(false);
			
			new Voting_Panel().setVisible(true);;
			
		} 
		
	}
	
	
	
	
	
	private JButton btnBack;
    private JButton btnLogin;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JTextField tfAdminPass;
    private JTextField tfAdminUser;
	

}
