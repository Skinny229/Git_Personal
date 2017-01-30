package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gui extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Gui(String title){
		super(title);
		this.setVisible(true);
		this.setSize(200, 300);
		this.initGui();
		
	}
	
	JPanel panel;
	JSlider slider;
	JLabel text;
	JButton confirm;
	
	void initGui(){
		panel = new JPanel();
		slider = new JSlider(1,10,4);
		text =  new JLabel("Please input the nmber of ppl in secret santa and press enter");
		confirm = new JButton("Enter");
		
		
		panel.add(text);
		panel.add(slider);
		panel.add(confirm);
		
		confirm.addActionListener(this);
		
		this.add(panel);
		
	}
	
	void inti2(){
		
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == confirm){
			
			
		}
	}
}
