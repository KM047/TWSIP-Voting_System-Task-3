package com.voting;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;

import javax.swing.border.*;

import com.voting.SQLConnection;

import javax.swing.*;

public class Voting_Meter extends JFrame implements ActionListener {
	
	String voterName;
	String adharNum;
	
	Voting_Meter(String voterName, String adharNum ) {
		// TODO Auto-generated constructor stub
		
		this.voterName = voterName;
		
		this.adharNum = adharNum;
		
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        lblParty1 = new JLabel();
        jLabel6 = new JLabel();
        lblPartySym1 = new JLabel();
        lblParty2 = new JLabel();
        jLabel9 = new JLabel();
        lblPartySym2 = new JLabel();
        lblPartySym3 = new JLabel();
        lblParty3 = new JLabel();
        jLabel13 = new JLabel();
        lblPartySym4 = new JLabel();
        lblParty4 = new JLabel();
        jLabel16 = new JLabel();
        lblParty5 = new JLabel();
        jLabel18 = new JLabel();
        lblPartySym5 = new JLabel();
        jLabel5 = new JLabel();
        btnParty1 = new JButton();
        btnParty2 = new JButton();
        btnParty3 = new JButton();
        btnParty4 = new JButton();
        btnParty5 = new JButton();

        

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBounds(new Rectangle(0, 0, 0, 0));
        setPreferredSize(new Dimension(490, 525));
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        setTitle("EVM Panel");
        setVisible(true);

      

        jLabel2.setFont(new Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new Color(51, 51, 255));
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("Sr.No.");

        jLabel3.setFont(new Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new Color(51, 51, 255));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Party Name");

        jLabel4.setFont(new Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new Color(51, 51, 255));
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("Symbol");

        lblParty1.setFont(new Font("Arial", 1, 12)); // NOI18N
        lblParty1.setText("Party A");

        jLabel6.setFont(new Font("Arial", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel6.setText("1");

        lblPartySym1.setBackground(new Color(255, 255, 255));
        lblPartySym1.setHorizontalAlignment(SwingConstants.CENTER);
        lblPartySym1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        lblParty2.setFont(new Font("Arial", 1, 12)); // NOI18N
        lblParty2.setText("Party B");

        jLabel9.setFont(new Font("Arial", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel9.setText("2");

        lblPartySym2.setBackground(new Color(255, 255, 255));
        lblPartySym2.setHorizontalAlignment(SwingConstants.CENTER);
        lblPartySym2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        lblPartySym3.setBackground(new Color(255, 255, 255));
        lblPartySym3.setHorizontalAlignment(SwingConstants.CENTER);
        lblPartySym3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        lblParty3.setFont(new Font("Arial", 1, 12)); // NOI18N
        lblParty3.setText("Party C");

        jLabel13.setFont(new Font("Arial", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel13.setText("3");

        lblPartySym4.setBackground(new Color(255, 255, 255));
        lblPartySym4.setHorizontalAlignment(SwingConstants.CENTER);
        lblPartySym4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        lblParty4.setFont(new Font("Arial", 1, 12)); // NOI18N
        lblParty4.setText("Party D");

        jLabel16.setFont(new Font("Arial", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel16.setText("4");

        lblParty5.setFont(new Font("Arial", 1, 12)); // NOI18N
        lblParty5.setText("Party E");

        jLabel18.setFont(new Font("Arial", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel18.setText("5");

        lblPartySym5.setBackground(new Color(255, 255, 255));
        lblPartySym5.setHorizontalAlignment(SwingConstants.CENTER);
        lblPartySym5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        jLabel5.setBackground(new Color(255, 255, 255));
        jLabel5.setFont(new Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new Color(0, 0, 255));
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel5.setText("EVM Panel");

        btnParty1.setBackground(new Color(0, 102, 255));
        btnParty1.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        
        btnParty1.addActionListener(this);
        

        btnParty2.setBackground(new Color(0, 102, 255));
        btnParty2.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        
        btnParty2.addActionListener(this);

        btnParty3.setBackground(new Color(0, 102, 255));
        btnParty3.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        
        btnParty3.addActionListener(this);
        

        btnParty4.setBackground(new Color(0, 102, 255));
        btnParty4.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        
        btnParty4.addActionListener(this);

        btnParty5.setBackground(new Color(0, 102, 255));
        btnParty5.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        
        btnParty5.addActionListener(this);
        
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblParty1, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblPartySym1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnParty1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblParty2, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblPartySym2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnParty2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblParty3, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblPartySym3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnParty3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblParty4, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblPartySym4, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnParty4, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblParty5, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblPartySym5, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnParty5, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblParty1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPartySym1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnParty1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblParty2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPartySym2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnParty2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblParty3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPartySym3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnParty3, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblParty4, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPartySym4, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnParty4, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblParty5, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPartySym5, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnParty5, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))))
        );
        pack();
        setLocationRelativeTo(null);
        
        LogoScale();
	
	}
	
	
	public static void main(String[] args) {
		
		new Voting_Meter("", "");
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String partyName = "";
		
		
		if (e.getSource() == btnParty1) {
			
			
			int  ch = JOptionPane.showConfirmDialog(null, "Confirm vote to Party A ?" );
            
            if (ch == 0) {
				
            	partyName = lblParty1.getText();
            	
			}
			
		}
		
		else if (e.getSource() == btnParty2) {
			
			int  ch = JOptionPane.showConfirmDialog(null, "Confirm vote to Party B ?" );
            
            if (ch == 0) {
				
            	partyName = lblParty2.getText();
            	
			}
			
			
		}
		
		else if (e.getSource() == btnParty3) {
			
			int  ch = JOptionPane.showConfirmDialog(null, "Confirm vote to Party C ?" );
            
            if (ch == 0) {
				
            	partyName = lblParty3.getText();
            	
			}
			
		}
		
		else if (e.getSource() == btnParty4) {
			
			int  ch = JOptionPane.showConfirmDialog(null, "Confirm vote to Party D ?" );
            
            if (ch == 0) {
				
            	partyName = lblParty4.getText();
            	
			}
			
			
		}
		
		else if (e.getSource() == btnParty5) {
			
			int  ch = JOptionPane.showConfirmDialog(null, "Confirm vote to Party E ?" );
            
            if (ch == 0) {
				
            	partyName = lblParty5.getText();
            	
			}
			
			
		}
		
		if (partyName.equals("")) {
			
			
			
		}
		else {
			
//			System.out.println(partyName + " Vote for.");

			
			
			SQLConnection sqlop = new SQLConnection();
			
			String query = "UPDATE total_vote_info SET Total_vote = Total_vote + 1 WHERE party_name = '" + partyName +"'" ;
			
			try {
				
				int rowUpdate = sqlop.stamt.executeUpdate(query);
				
				if (rowUpdate > 0) {
					
					JOptionPane.showMessageDialog(null, "You Give Vote to " + partyName);
					
					setVisible(false);
					new Voting_Panel();
					
				}
				else {
					
					JOptionPane.showMessageDialog(null, "Server Error...");
					
				}
				
			} 
			
			catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			
		}
		
	}

	
	
	
	public void LogoScale() {
		
		// Party A logo fit
		ImageIcon i1 = new ImageIcon("C:\\Users\\kunal\\Desktop\\TopperWorld Internship\\Task_3\\src\\img\\party1.jpg");
        
        Image img1 = i1.getImage();
        
        Image imgScale1 = img1.getScaledInstance( lblPartySym1.getWidth(), lblPartySym1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon(imgScale1);
        lblPartySym1.setIcon(scaledIcon1);
        
        
		
        // Party B logo fit
        ImageIcon i2 = new ImageIcon("C:\\Users\\kunal\\Desktop\\TopperWorld Internship\\Task_3\\src\\img\\party2.jpg");
        
        Image img2 = i2.getImage();
        
        Image imgScale2 = img2.getScaledInstance( lblPartySym2.getWidth(), lblPartySym2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
        lblPartySym2.setIcon(scaledIcon2);
        
        
        // Party C logo fit
        ImageIcon i3 = new ImageIcon("C:\\Users\\kunal\\Desktop\\TopperWorld Internship\\Task_3\\src\\img\\party3.png");
        
        Image img3 = i3.getImage();
        
        Image imgScale3 = img3.getScaledInstance( lblPartySym3.getWidth(), lblPartySym3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon3 = new ImageIcon(imgScale3);
        lblPartySym3.setIcon(scaledIcon3);
        
        
     // Party D logo fit
        ImageIcon i4 = new ImageIcon("C:\\Users\\kunal\\Desktop\\TopperWorld Internship\\Task_3\\src\\img\\party4.png");
        
        Image img4 = i4.getImage();
        
        Image imgScale4 = img4.getScaledInstance(lblPartySym4.getWidth(), lblPartySym4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon4 = new ImageIcon(imgScale4);
        lblPartySym4.setIcon(scaledIcon4);
        
        
        // Party E logo fit
        ImageIcon i5 = new ImageIcon("C:\\Users\\kunal\\Desktop\\TopperWorld Internship\\Task_3\\src\\img\\kite1.png");
        
        Image img5 = i5.getImage();
        
        Image imgScale5 = img5.getScaledInstance(lblPartySym5.getWidth(), lblPartySym5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon5 = new ImageIcon(imgScale5);
        lblPartySym5.setIcon(scaledIcon5);
        
        
        
	}
	
	
	
	private JButton btnParty1;
    private JButton btnParty2;
    private JButton btnParty3;
    private JButton btnParty4;
    private JButton btnParty5;
    private JLabel jLabel13;
    private JLabel jLabel16;
    private JLabel jLabel18;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel9;
    private JLabel lblParty1;
    private JLabel lblParty2;
    private JLabel lblParty3;
    private JLabel lblParty4;
    private JLabel lblParty5;
    private JLabel lblPartySym1;
    private JLabel lblPartySym2;
    private JLabel lblPartySym3;
    private JLabel lblPartySym4;
    private JLabel lblPartySym5;
	
	
}
