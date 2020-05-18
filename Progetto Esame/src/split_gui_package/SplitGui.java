package split_gui_package;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SplitGui extends JPanel{
	
	private JPanel IO;
	private JLabel Split;
	SplitAddButton Add=new SplitAddButton();
	SplitCryptKBParts o=new SplitCryptKBParts();
	SplitAndLabelRow s=new SplitAndLabelRow();
	public SplitGui() {
		super();
		IO=new JPanel();
		IO.setLayout(new BoxLayout(IO, BoxLayout.PAGE_AXIS));
		Split=new JLabel("Splitta");
		IO.add(s);
		IO.add(o);
		IO.add(Add);
		add(IO);
	}
	
}
