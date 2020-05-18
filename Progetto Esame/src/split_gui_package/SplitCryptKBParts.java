package split_gui_package;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class SplitCryptKBParts extends JPanel{
	
	private JPanel opz;
	SplitInKbRow r1=new SplitInKbRow();
	SplitAndCryptRow r2=new SplitAndCryptRow();
	SplitInPartsRow r3=new SplitInPartsRow();
	public SplitCryptKBParts() {
		super();
		opz =new JPanel();
		opz.setLayout(new BoxLayout(opz, BoxLayout.PAGE_AXIS));
		opz.add(r1);
		opz.add(r2);
		opz.add(r3);
		add(opz);
		
	}
}
