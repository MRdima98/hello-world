package split_gui_package;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SplitScegliFileRow extends JPanel implements ActionListener{
	
	protected JButton Choose;
	private JTextField Nada;
	private JPanel Row;
	final JFileChooser fc;
	private File FileScelti;
	private static String S;

	
	
	
	public SplitScegliFileRow(){
		super();
		Row=new JPanel();
		Row.setLayout(new BoxLayout(Row, BoxLayout.LINE_AXIS));
		Choose=new JButton("Scegli File");
		Nada=new JTextField(15);
		fc=new JFileChooser();
		fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		Nada.setEditable(false);
		Row.add(Choose);
		Row.add(Nada);
		Choose.addActionListener(this);
		add(Row);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==Choose) {
			int returnVal = fc.showOpenDialog(SplitScegliFileRow.this);
			FileScelti=fc.getSelectedFile();
			S=FileScelti.getAbsolutePath();
			System.out.println(S);

		}


	}
	public void PrintPath(){System.out.println(S);}
	public String GetPath(){return S;};

}
