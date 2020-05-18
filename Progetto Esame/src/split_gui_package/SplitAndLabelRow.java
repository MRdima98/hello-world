package split_gui_package;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SplitAndLabelRow extends JPanel{

	private JPanel Row;
	private JLabel Split;
	SplitScegliFileRow s=new SplitScegliFileRow();
	public SplitAndLabelRow() {
		super();
		Row=new JPanel();
		Row.setLayout(new BoxLayout(Row, BoxLayout.PAGE_AXIS));
		Split=new JLabel("Splitta");
		Row.add(Split);
		Row.add(Box.createRigidArea(new Dimension(0,5)));
		Row.add(s);
		add(Row);
	}
}
