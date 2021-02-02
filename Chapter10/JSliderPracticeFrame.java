package Chapter10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderPracticeFrame extends JFrame {
    private JSlider slider = new JSlider(0,100,20);
    private JLabel label = new JLabel(" ");
    private JCheckBox F = new JCheckBox("ȭ��");
    public boolean press;
    public JSliderPracticeFrame() {
        super("JSlider Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(slider);
        c.add(label);

        F.setBorderPainted(true);
        F.addItemListener(new MyItemListener());
        c.add(F);

        // �����̴��� �Ӽ� ����
        slider.setMajorTickSpacing(20);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);

        // ��� ���̺��� �Ӽ� ����
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setOpaque(true);
        label.setBackground(Color.GREEN);
        label.setText(Integer.toString(slider.getValue()));

        // �����̴��� Change ������ �ۼ�
        slider.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                	
                    JSlider s = (JSlider)e.getSource();
                    if(press == true) {
                    	int f = (int)(1.8*s.getValue())+32;
                    	label.setText(Integer.toString(f));
                    }
                    else {
                    	label.setText(Integer.toString(s.getValue()));
                    }
                }
            });

        setSize(300,150);
        setVisible(true);
    }

    public class MyItemListener implements ItemListener
    {
        public void itemStateChanged(ItemEvent e){
            if(e.getStateChange() == ItemEvent.SELECTED){
                if(e.getItem() == F){
                	int f = (int)(1.8*slider.getValue())+32;
                    label.setText(Integer.toString(f));
                }
                press = true;
            }
            else {
            	label.setText(Integer.toString(slider.getValue()));
            }
        }
    }

    public static void main(String[] args) {
        new JSliderPracticeFrame();
    }
}