package final_gui_package;

import split_gui_package.SplitScegliFileRow;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.JTextComponent;

@SuppressWarnings("serial")
public class Interfaccia extends JPanel implements ActionListener {
	
	
	private JPanel interfaccia;
	SplitAndMergeRow SM=new SplitAndMergeRow();
	StartAndStopButtons SS=new StartAndStopButtons();
	GuiTable GT=new GuiTable();
	public Interfaccia() {
		super();
		interfaccia=new JPanel();
		interfaccia.setLayout(new BoxLayout(interfaccia, BoxLayout.PAGE_AXIS));
		interfaccia.add(SM);
		interfaccia.add(GT);
		interfaccia.add(SS);
		
		add(interfaccia);
		
		}
	
	

	
	public void actionPerformed(ActionEvent e) {
	
		}
	
	
	
}
