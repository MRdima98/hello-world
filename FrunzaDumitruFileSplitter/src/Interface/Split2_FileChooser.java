package Interface;

import com.sun.rowset.internal.Row;

import javax.swing.*;
import java.awt.*;

public class Split2_FileChooser extends JPanel {
    private JPanel SplitRow2;
    private JButton Choose;
    private JTextField Blank;


    public Split2_FileChooser(){
        SplitRow2=new JPanel();
        SplitRow2.setLayout(new BoxLayout(SplitRow2,BoxLayout.LINE_AXIS));
        Choose=new JButton("Choose File");
        Blank=new JTextField(15);
        Blank.setEditable(false);
        SplitRow2.add(Choose);
        SplitRow2.add(Blank);
        add(SplitRow2);
    }
}
