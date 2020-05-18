package split_gui_package;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SplitAndCryptRow extends JPanel{

	private JCheckBox box;
	private JTextField text;
	private JPanel Row;
	private JLabel key;
	private JLabel crypt;
	
	public SplitAndCryptRow() {
		super();
		Row=new JPanel();
		Row.setLayout(new BoxLayout(Row,BoxLayout.LINE_AXIS));
		box=new JCheckBox();
		crypt=new JLabel("Crypt");
		key=new JLabel("Key");
		text=new JTextField(7);
		Row.add(box);
		Row.add(crypt);
		Row.add(Box.createRigidArea(new Dimension(105,0)));
		Row.add(key);
		Row.add(Box.createRigidArea(new Dimension(10,0)));
		Row.add(text);
		add(Row);
		
	}
}
