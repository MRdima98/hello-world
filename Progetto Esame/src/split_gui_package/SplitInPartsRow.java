package split_gui_package;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SplitInPartsRow extends JPanel{
	
	private JPanel Row;
	private JCheckBox box;
	private JLabel parts;
	private JLabel num;
	private JTextField text;
	
	public SplitInPartsRow() {
		super();
		Row=new JPanel();
		Row.setLayout(new BoxLayout(Row, BoxLayout.LINE_AXIS));
		box=new JCheckBox();
		parts=new JLabel("Split in parts");
		num=new JLabel("n");
		text=new JTextField(7);
		Row.add(box);
		Row.add(parts);
		Row.add(Box.createRigidArea(new Dimension(77,0)));
		Row.add(num);
		Row.add(Box.createRigidArea(new Dimension(10,0)));
		Row.add(text);
		add(Row);
	}
}
