package final_gui_package;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class StartAndStopButtons extends JPanel{
	
	private JPanel SS;
	private JButton start,stop;
	public StartAndStopButtons(){
		super();
		SS=new JPanel();
		SS.setLayout(new BoxLayout(SS, BoxLayout.LINE_AXIS));
		start=new JButton("Start");
		stop=new JButton("Stop");
		SS.add(start);
		SS.add(Box.createRigidArea(new Dimension(200,0)));
		SS.add(stop);
		add(SS);
	}
}
