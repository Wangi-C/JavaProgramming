package Chapter10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame {
	
	JLabel[] jlList = new JLabel[3];
	
	public KeyListenerEx() {
		setTitle("keyListener ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.addKeyListener(new MyKeyListener());
		
		jlList[0] = new JLabel(" getKeyCode() ");
		jlList[1] = new JLabel(" getKeyChar() ");
		jlList[2] = new JLabel(" getKeyText() ");
		
		for(int i =0; i < jlList.length; i++) {
			con.add(jlList[i]);
			jlList[i].setBackground(Color.yellow);
			jlList[i].setOpaque(true);
		}
		
		setSize(300, 300);
		setVisible(true);
		
		con.setFocusable(true);
		con.requestFocus();
	}
	
	
	
	public static void main(String[] args) {
		new KeyListenerEx();
	}
}
