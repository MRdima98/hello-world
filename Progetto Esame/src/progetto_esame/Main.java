package progetto_esame;
import java.awt.GridLayout;

import javax.swing.JFrame;

import final_gui_package.Interfaccia;

@SuppressWarnings("serial")
public class Main extends JFrame{

	public static void main(String[] args) {
		
		 JFrame f=new JFrame();
		 Interfaccia c=new Interfaccia();
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 f.add(c);
		 f.pack();
		 f.setBounds(200, 200, 700, 500);
		 f.setVisible(true);
	}

}
