package HWProgram;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class TextBoldItalic  extends JFrame{
	
	private JTextField txt1;
	
public TextBoldItalic() {
	
	txt1 =new JTextField(10);
	txt1.setFont(new Font("Arial", Font.PLAIN,20));
	
	setTitle("Bold Italic");
	setSize(300,300);
	setLocation(100,200);
	setLayout(new FlowLayout());
	add(txt1);
	setVisible(true);
	

	
	MouseHandler mh=new MouseHandler();
	txt1.addMouseListener(mh);
	
}

class MouseHandler implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getButton()==MouseEvent.BUTTON1) {   //left  btn 3 right
		
			txt1.setFont(new Font("Arial" , Font.BOLD, 15));
		}
		
		if(e.getButton()==MouseEvent.BUTTON3) {   //left  btn 3 right
		
			txt1.setFont(new Font("Arial" ,Font.ITALIC,15));
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new TextBoldItalic();
	}

}
