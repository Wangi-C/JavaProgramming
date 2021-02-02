package Chapter12;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Graphics;

public class shape extends JFrame 
{
	MyPanel p = new MyPanel();
	
	public shape() {
		setTitle("���� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(p);
		setSize(300, 300);
		setVisible(true);
	}
	
	public class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g); // JPanel�� paintComponent() ȣ�� _ �г� ���� ������ �׷��� �ܻ��� ����� ����
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
