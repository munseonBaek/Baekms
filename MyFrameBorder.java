package p20230911;

import java.awt.*;

import javax.swing.*;

public class MyFrameBorder extends JFrame {
	public MyFrameBorder() {
		setTitle("BorderLayout");
		setSize(1300,550);
		setLayout(new BorderLayout());
		
		JButton buttonNorth = new JButton("북쪽");
		JButton buttonSouth = new JButton("남쪽");
		JButton buttonEast = new JButton("동쪽");
		JButton buttonWest = new JButton("서쪽");
		JButton buttonCenter = new JButton("중앙");
		
		add(buttonNorth, "North");
		add(buttonSouth, "South");
		add(buttonEast, "East");
		add(buttonWest, "West");
		add(buttonCenter, "Center");
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
