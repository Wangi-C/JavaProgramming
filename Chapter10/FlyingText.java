package Chapter10;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlyingText extends JFrame{
	final int FLYING_UNIT = 10;
	JLabel label = new JLabel("Hello");
	
	public FlyingText() {
		setTitle("텍스트 옮기기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = getContentPane();
		con.setLayout(null);
		label.setSize(100, 100);
		label.setLocation(50, 50);
		con.add(label);
		con.addKeyListener(new MyKeyListener());
		
		setSize(400, 400);
		setVisible(true);
		
		con.setFocusable(true);
		con.requestFocus();
		
		con.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource();
				com.setFocusable(true);
				com.requestFocus();
			}
		});
	}
	
	public class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			switch (keyCode) {
			case KeyEvent.VK_UP:
				label.setLocation(label.getX(), label.getY()-FLYING_UNIT);
				break;	
			case KeyEvent.VK_DOWN:
				label.setLocation(label.getX(), label.getY()+FLYING_UNIT);
				break;
			case KeyEvent.VK_RIGHT:
				label.setLocation(label.getX()+FLYING_UNIT, label.getY());
				break;
			case KeyEvent.VK_LEFT:
				label.setLocation(label.getX()-FLYING_UNIT, label.getY());
				break;
			}
			
		}
	}
	
	public static void main(String[] args) {
		new FlyingText();
	}
}
