package Chapter10;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class SliderEx extends JFrame{
	
	public SliderEx() {
		setTitle("슬라이더 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL,0,200,100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		
		setSize(400, 400);
		setVisible(true);
		
		con.add(slider);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SliderEx();
	}

}
