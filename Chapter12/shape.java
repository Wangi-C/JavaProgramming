package Chapter12;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Graphics;

public class shape extends JFrame 
{
	MyPanel p = new MyPanel();
	
	public shape() {
		setTitle("격자 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(p);
		setSize(300, 300);
		setVisible(true);
	}
	
	public class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g); // JPanel의 paintComponent() 호출 _ 패널 내에 이전에 그려진 잔상을 지우기 위해
			int x = getWidth();
			int y = getHeight();
			for(int i = 0; i < 10; i++) {
				g.drawLine(0, (int)(y*0.1*i), x, (int)(y*0.1*i));
				g.drawLine((int)(x*0.1*i), 0, (int)(x*0.1*i), y);
			}
		}
	}
	
	public static void main(String[] args) {
		new shape();
	}

}
