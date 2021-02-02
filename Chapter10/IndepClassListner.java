package Chapter10;

//���� 10-1

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListner extends JFrame {
	
	public IndepClassListner() {
		setTitle("Action ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		JButton jb = new JButton("Action");
		jb.addActionListener(new MyActionListener());
		con.add(jb);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public class MyActionListener implements ActionListener { //���� Ŭ������ action������ �ۼ�
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action")) {
				b.setText("�׼�");
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
