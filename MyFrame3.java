package p20230911;

import java.awt.*;

import javax.swing.*;

public class MyFrame3 extends JFrame{
	public MyFrame3() {
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.setBackground(Color.orange);
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.setBackground(Color.green);
		JButton button1 = new JButton("버튼1");
		JButton button2 = new JButton("버튼1");

		//버튼1을 채널1에 넣자.
		panel1.add(button1);
		panel2.add(button2);
		
		setLayout(new GridLayout(2,1));
		add(panel1);
		this.add(panel2);
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
