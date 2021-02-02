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
		setTitle("ContentPane�� JFrame"); //������ Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ �����츦 ������ ���α׷��� �����ϵ��� ����
		
		Container contentPane = getContentPane(); //����Ʈ���� �˾Ƴ���.
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout()); //����Ʈ�ҿ� flowLayout ��ġ�����ڸ� �޾��ش�.
		
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
