package progetto_esame;

import java.io.File;

import javax.swing.JFileChooser;

import split_gui_package.SplitScegliFileRow;

public class CreazioneCoda {

	protected String[] Coda;
	protected String NomeFile;
	private File[] SelectedFile;
	private final JFileChooser fc;
	SplitScegliFileRow SC=new SplitScegliFileRow();
	
	public  CreazioneCoda() {
		super();
		fc=new JFileChooser();
		fc.setMultiSelectionEnabled(true);
		SelectedFile=fc.getSelectedFiles();
		System.out.println(SelectedFile);

	}

}
