package com.voting;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class Result_Panel extends JFrame implements ActionListener {
	
	ResultSet rSet;
	
	Result_Panel(){
		
		jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        lblParty1 = new JLabel();
        jLabel6 = new JLabel();
        lblPartySym1 = new JLabel();
        jLabel5 = new JLabel();
        lblParty2 = new JLabel();
        jLabel7 = new JLabel();
        lblPartySym2 = new JLabel();
        jLabel8 = new JLabel();
        lblParty3 = new JLabel();
        lblPartySym3 = new JLabel();
        jLabel9 = new JLabel();
        lblParty4 = new JLabel();
        lblPartySym4 = new JLabel();
        jLabel10 = new JLabel();
        lblPartySym5 = new JLabel();
        lblParty5 = new JLabel();
        btnCheckRslt = new JButton();
        btnBack = new JButton();

        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        setTitle("Result Panel");
        setVisible(true);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("Sr.No.");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Party Name");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("Total votes");

        lblParty1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblParty1.setText("Party A");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel6.setText("1");

        lblPartySym1.setBackground(new java.awt.Color(255, 255, 255));
        lblPartySym1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPartySym1.setHorizontalAlignment(SwingConstants.CENTER);
        lblPartySym1.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel5.setText("Result Panel");

        lblParty2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblParty2.setText("Party B");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel7.setText("2");

        lblPartySym2.setBackground(new java.awt.Color(255, 255, 255));
        lblPartySym2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPartySym2.setHorizontalAlignment(SwingConstants.CENTER);
        lblPartySym2.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel8.setText("3");

        lblParty3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblParty3.setText("Party C");

        lblPartySym3.setBackground(new java.awt.Color(255, 255, 255));
        lblPartySym3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPartySym3.setHorizontalAlignment(SwingConstants.CENTER);
        lblPartySym3.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel9.setText("4");

        lblParty4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblParty4.setText("Party D");

        lblPartySym4.setBackground(new java.awt.Color(255, 255, 255));
        lblPartySym4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPartySym4.setHorizontalAlignment(SwingConstants.CENTER);
        lblPartySym4.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel10.setText("5");

        lblPartySym5.setBackground(new java.awt.Color(255, 255, 255));
        lblPartySym5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPartySym5.setHorizontalAlignment(SwingConstants.CENTER);
        lblPartySym5.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblParty5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblParty5.setText("Party E");

        btnCheckRslt.setBackground(new java.awt.Color(51, 255, 51));
        btnCheckRslt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCheckRslt.setText("Check Result");
        
        btnCheckRslt.addActionListener(this);

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("Exit");

        btnBack.addActionListener(this);
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(lblParty1, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(lblPartySym1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(lblParty2, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(lblPartySym2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblParty3, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(lblPartySym3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblParty4, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(lblPartySym4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCheckRslt, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(lblParty5, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(lblPartySym5, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblPartySym1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(lblParty1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblPartySym2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(lblParty2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblPartySym3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblParty3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(lblPartySym4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(lblParty4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(lblParty5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCheckRslt, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(7, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblPartySym5, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Result_Panel();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == btnCheckRslt) {
			
			SQLConnection sqlop = new SQLConnection();
			
			String query = "SELECT party_name, total_vote FROM total_vote_info"; 
			try {
				
				rSet = sqlop.stamt.executeQuery(query);
				
				while (rSet.next()) {
					
					String partyName = rSet.getString("party_name");
					
					int votes = rSet.getInt("total_vote");
					
					if (partyName.equals("Party A")) {
						
						lblPartySym1.setText("" + votes);
						
					}
					
					else if (partyName.equals("Party B")) {
						
						lblPartySym2.setText("" + votes);
						
					}
					
					
					else if (partyName.equals("Party C")) {
						
						lblPartySym3.setText("" + votes);
						
					}
					
					
					else if (partyName.equals("Party D")) {
						
						lblPartySym4.setText("" + votes);
						
					}
					
					
					else if (partyName.equals("Party E")) {
						
						lblPartySym5.setText("" + votes);
						
					}
					
				}
				
				//TODO: Extract the Winner Party 
				
				String querySelect = "SELECT party_name, total_vote FROM total_vote_info WHERE Total_vote = (SELECT MAX(total_vote) FROM total_vote_info)" ;
				
				try {
				
					rSet = sqlop.stamt.executeQuery(querySelect);
					
					if (rSet.next()) {
						
						String winnerParty = rSet.getString("party_name");
						
						int totalVotes = rSet.getInt("total_vote");
						
						
						JOptionPane.showMessageDialog(null, "The Winner of current election  is \n '"+ winnerParty +"'\n with the \n total "+ totalVotes +" votes. ");
						
						
					}
					
				} 
				
				catch (Exception e2) {
					// TODO: handle exception
				}
				
				
				
			} 
			
			catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
		else if (e.getSource() == btnBack) {
			
			setVisible(false);
			
			new Voting_Panel().setVisible(true);;
			
			
			
		}
	
	
		
	}
	
	
	private JButton btnBack;
    private JButton btnCheckRslt;
    private JLabel jLabel10;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
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
