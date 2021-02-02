package Chapter9;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx  extends JFrame
{
	public ContentPaneEx()
	{
		setTitle("ContentPane과 JFrame"); //프레임 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 윈도우를 닫으면 프로그램을 종료하도록 설정
		
		Container contentPane = getContentPane(); //컨텐트팬을 알아낸다.
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout()); //컨탠트팬에 flowLayout 배치관리자를 달아준다.
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ContentPaneEx();
	}

}
