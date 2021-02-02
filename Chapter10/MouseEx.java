package Chapter10;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEx extends JFrame{
	
	JLabel jl = new JLabel("NO Mouse Event");
	
	public MouseEx() {
		setTitle("mouseMove");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		con.addMouseListener(new MyMouseListener());
		con.addMouseMotionListener(new MyMouseListener());
		
		con.add(jl);
		setSize(400, 400);
		setVisible(true);
	}
	
	public class MyMouseListener implements MouseListener, MouseMotionListener{
		public void mousePressed(MouseEvent e) {
			jl.setText("press("+e.getX()+" , " +e.getY()+")");
		}
		public void mouseReleased(MouseEvent e) {
			jl.setText("Release("+e.getX()+" , " +e.getY()+")");
		}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.yellow);
		} //여기까지 mouseListener메소드 4가지
		
		public void mouseDragged(MouseEvent e) {
			jl.setText("drag("+e.getX()+","+e.getY()+")");
		}
		public void mouseMoved(MouseEvent e) {
			jl.setText("move("+e.getX()+","+e.getY()+")");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEx();
	}

}
