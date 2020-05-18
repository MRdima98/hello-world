package merge_gui_package;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MergeGui extends JPanel{
	
	private JPanel mergeRow;
	private JButton AddQueue;

	MergeAddButton b=new MergeAddButton();
	MergeGuiRow1 m=new MergeGuiRow1();
	MergeGuiRow r=new MergeGuiRow();
	public MergeGui() {
		super();
		mergeRow=new JPanel();
		AddQueue=new JButton("Add To Queue");
		mergeRow.setLayout(new BoxLayout(mergeRow, BoxLayout.PAGE_AXIS));
		mergeRow.add(m);
		mergeRow.add(r);
		mergeRow.add(Box.createRigidArea(new Dimension(0,116)));
		mergeRow.add(b);
		add(mergeRow);
	}
}
