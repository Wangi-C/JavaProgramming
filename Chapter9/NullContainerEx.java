package Chapter9;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame{

	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();
		con.setLayout(null);
		
		JLabel jl = new JLabel("Hello, Press Buttons!");
		jl.setLocation(130,  50);
		jl.setSize(150, 30);
		con.add(jl);
		
		for(int i = 1; i < 10; i++) {
			JButton jb = new JButton(Integer.toString(i));
			jb.setSize(50, 20);
			jb.setLocation(i * 10, i * 10);
			con.add(jb);
		}
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NullContainerEx();
	}

}
