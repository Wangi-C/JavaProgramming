package Chapter9;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{

	public FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = getContentPane();
		
		con.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		con.add(new JButton("add"));
		con.add(new JButton("sub"));
		con.add(new JButton("mul"));
		con.add(new JButton("div"));
		con.add(new JButton("culculate"));
		
		setSize(300, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutEx();
	}

}
