package Chapter10;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame{
	JLabel jl = new JLabel("Hello");
	
	public MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = getContentPane();
		con.setLayout(null);
		con.addMouseListener(new MyMouseListener());
		jl.setSize(100, 100);
		jl.setLocation(30, 30);
		con.add(jl);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public class MyMouseListener implements MouseListener{
		public void mousePressed(MouseEvent e) {
			int x= e.getX();
			int y = e.getY();
			jl.setLocation(x, y); 
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	
	public static void main(String[] args) {
		new MouseListenerEx();
	}
}
