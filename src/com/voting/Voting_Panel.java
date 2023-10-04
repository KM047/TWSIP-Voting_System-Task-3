package com.voting;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.border.*;

import com.voting.SQLConnection;


import javax.swing.*;



public class Voting_Panel extends JFrame implements ActionListener {

	ResultSet rSet;
	
	Voting_Panel(){
		
		jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        tfVoterName = new JTextField();
        tfAdhaNum = new JTextField();
        btnNext = new JButton();
        btnLogin = new JButton();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("Voting Portal");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("Voter Name :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Adhar Number : ");

        tfVoterName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        tfAdhaNum.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        btnNext.setBackground(new java.awt.Color(51, 255, 51));
        btnNext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNext.setText("Next");
        
        btnNext.addActionListener(this);

        btnLogin.setBackground(new java.awt.Color(102, 255, 255));
        btnLogin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLogin.setText("Login ");
        
        btnLogin.addActionListener(this);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(tfAdhaNum, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(tfVoterName, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfVoterName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAdhaNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        layout.linkSize(SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, tfAdhaNum, tfVoterName});

        pack();
        setLocationRelativeTo(null);
		
		
	}
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		new Voting_Panel();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if (e.getSource() == btnNext) {
			
			String voterName = tfVoterName.getText();
			
			String adharNum = tfAdhaNum.getText();
			
			if (voterName.equals("")) {
				
				JOptionPane.showMessageDialog(null, "Please Enter the Name.");
			}
			
			else if (adharNum.equals("")) {
				
				JOptionPane.showMessageDialog(null, "Please Enter the Adhar Number.");
				
			}
			
			
			SQLConnection sqlop = new SQLConnection();
			
			String query = "SELECT * FROM voters_info WHERE votername = '"+ voterName +"' OR adhar_num = '"+ adharNum +"'";
			
			String newQuery = "INSERT INTO voters_info (votername, adhar_num ) values( '"+ voterName +"', '"+ adharNum +"' )";
			
			
			try {
				
				rSet = sqlop.stamt.executeQuery(query);
				
				if (rSet.next()) {
					
					JOptionPane.showMessageDialog(null, "You have already voted");
				}
				else {
					
                    int rowUpdate = sqlop.stamt.executeUpdate(newQuery);
					
                    if (rowUpdate > 0) {
						
                    	setVisible(false);
                    	
                    	new Voting_Meter(voterName, adharNum);
						
					}
					else {
						
						JOptionPane.showMessageDialog(null, "Server Error...");
						
					}
					
				}
				
				
			}
			catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			
		}
		
		else if (e.getSource() == btnLogin) {
			
			setVisible(false);
			
			new Login_Panel().setVisible(true);;
			
		}
		
		
	}
	
	
	
	private JButton btnLogin;
    private JButton btnNext;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JTextField tfAdhaNum;
    private JTextField tfVoterName;
	

}
