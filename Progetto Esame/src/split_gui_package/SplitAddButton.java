package split_gui_package;

import javax.swing.JButton;
import javax.swing.JPanel;

import final_gui_package.GuiTable;

public class SplitAddButton extends JPanel{
	
	private JPanel Row;
	protected JButton Add;
	GuiTable GT=new GuiTable();
	
	public SplitAddButton() {
		super();
		Row=new JPanel();
		Add=new JButton("Add to queue");
		Add.addActionListener(GT);
		Row.add(Add);
		add(Row);

	}
}
