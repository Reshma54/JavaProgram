package HWProgram;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.JFrame;

public class JTextBoxLabel extends JFrame{
	
	private JTextField txt;
	private JLabel lbl1;
	
	
	public JTextBoxLabel() {
		txt=new JTextField(20);
		lbl1 = new JLabel();
		
		setTitle("JTextBoxLabel");
		setSize(300,300);
		setLocation(100,200);
		setLayout(new FlowLayout());
		
		setVisible(true);
		
		add(txt);
		add(lbl1);
		
		textHandler th = new textHandler();
		
		txt.addActionListener(th);
		
	}
	
	class textHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String s=txt.getText();
			lbl1.setText(s);
			
			if(s=="X") {
				
				System.exit(0);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JTextBoxLabel();
		
	}

}
