package final_gui_package;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GuiTable extends JPanel implements ActionListener {
	
	protected JTable table;
	protected DefaultTableModel modello;
	
	public GuiTable() {
		
		table=new JTable(new DefaultTableModel(new Object[] {"Split or Merge","File","Progress Bar"},0));
		modello=(DefaultTableModel)table.getModel();
		JScrollPane Scroll=new JScrollPane(table);
		Scroll.setPreferredSize(new Dimension(500,150));
		add(Scroll);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="Add To Queue") {
			modello.addRow(new Object[]{"uno", "due", "tre"});
			System.out.println("Ciao");
			System.out.println(table.getRowCount());
			System.out.println(table.getColumnCount());
			modello.fireTableDataChanged();
		}
	}
}

