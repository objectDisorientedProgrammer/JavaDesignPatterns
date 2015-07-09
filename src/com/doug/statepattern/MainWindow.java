/**
 * 
 */
package com.doug.statepattern;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author doug
 *
 */
public class MainWindow extends JFrame
{
	private JButton tier1, tier2, tier3;
	private StateContext sc;
	private boolean tier3Unlocked = false;
	
	// TODO add a textfield to display messages
	
	public MainWindow()
	{
		super();
		
		this.setLayout(new FlowLayout(20));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(350, 100);
		
		sc = new StateContext(new TierOne());
		
		tier1 = new JButton("Tier One");
		tier1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				sc.runLifeCycle();
				tier2.setText("Tier Two");
				tier2.setEnabled(true);
			}
		});
		
		tier2 = new JButton("Locked");
		tier2.setEnabled(false);
		tier2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				sc.runLifeCycle();
				tier3.setText("Tier Three");
				tier3.setEnabled(true);
			}
		});
		
		tier3 = new JButton("Locked");
		tier3.setEnabled(false);
		tier3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(!tier3Unlocked)
				{
					sc.runLifeCycle();
					tier3Unlocked = true;
				}
				else
					System.out.println("Tier 3 technology available!");
			}
		});
		
		
		this.getContentPane().add(tier1);
		this.getContentPane().add(tier2);
		this.getContentPane().add(tier3);
		
		this.setVisible(true);
	}
}
