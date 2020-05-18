package split_gui_package;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SplitInKbRow extends JPanel{
	
	private JPanel Row;
	private JLabel Split;
	private JLabel kb;
	private JCheckBox check;
	private JTextField text;
	
	public SplitInKbRow() {
		super();
		Row=new JPanel();
		Row.setLayout(new BoxLayout(Row, BoxLayout.LINE_AXIS));
		Split=new JLabel("Split");
		kb=new JLabel("kb");
		check=new JCheckBox();
		text=new JTextField(7);
		Row.add(check);
		Row.add(Split);
		Row.add(Box.createRigidArea(new Dimension(117,0)));
		Row.add(kb);
		Row.add(Box.createRigidArea(new Dimension(10,0)));
		Row.add(text);
		add(Row);
		
	}
}
