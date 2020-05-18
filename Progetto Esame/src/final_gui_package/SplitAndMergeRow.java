package final_gui_package;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import merge_gui_package.MergeGui;
import split_gui_package.SplitGui;

public class SplitAndMergeRow extends JPanel{
	
	private JPanel SplitMerge;
	SplitGui e=new SplitGui();
	MergeGui m=new MergeGui();
	
	public SplitAndMergeRow() {
		super();
		SplitMerge=new JPanel();
		SplitMerge.setLayout(new BoxLayout(SplitMerge,BoxLayout.LINE_AXIS));
		SplitMerge.getBorder();
		SplitMerge.add(e);
		SplitMerge.add(m);
		add(SplitMerge);
	}
}
