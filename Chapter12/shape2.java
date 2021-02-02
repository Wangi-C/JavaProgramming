package Chapter12;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Chapter12.shape.MyPanel;

public class shape2 extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public shape2() {
		setTitle("�׷��� �ٰ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int x = getWidth();
			int y = getHeight();
			int[]w = {x/2, 0, x/2, x};
			int[]h = {0, y/2, y, y/2};
			for(int i = 0; i< 10; i++) {
				g.drawPolygon(w, h, 4); // w, h �迭�� ����� ���� �� 4���� �����ϴ� ��ٰ����� �׸���.
				h[0] = h[0] + 10; // ���� �߰� ���� y���� �������ش�.
				w[1] = w[1] + 10; // ���� �߰� ���� x���� �������ش�.
				h[2] = h[2] - 10;
				w[3] = w[3] - 10;
			}
		}
	}
	public static void main(String[] args) {
		new shape2();
	}
}
