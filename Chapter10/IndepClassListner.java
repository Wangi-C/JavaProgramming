package Chapter10;

//예제 10-1

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListner extends JFrame {
	
	public IndepClassListner() {
		setTitle("Action 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		JButton jb = new JButton("Action");
		jb.addActionListener(new MyActionListener());
		con.add(jb);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public class MyActionListener implements ActionListener { //내부 클래스로 action리스너 작성
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action")) {
				b.setText("액션");
			}
			else {
				b.setText("Action");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IndepClassListner();
	}

}
