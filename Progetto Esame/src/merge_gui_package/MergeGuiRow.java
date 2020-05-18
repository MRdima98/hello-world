package merge_gui_package;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MergeGuiRow extends JPanel{

	private JPanel Row;
	private JButton Choose;
	private JTextField Nada;
	
	public MergeGuiRow() {
		super();
		Row=new JPanel();
		Row.setLayout(new BoxLayout(Row, BoxLayout.LINE_AXIS));
		Choose=new JButton("Scegli File");
		Nada=new JTextField(15);
		Nada.setEditable(false);
		Row.add(Choose);
		Row.add(Nada);
		add(Row);
	}
}
