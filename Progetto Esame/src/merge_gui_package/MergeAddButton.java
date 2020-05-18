package merge_gui_package;

import ActionListener.MergeButtonActionListener;
import final_gui_package.GuiTable;

import javax.swing.*;

public class MergeAddButton extends JPanel {
    private JButton AddButton;
    private JPanel Row;
    GuiTable GT=new GuiTable();

    public MergeAddButton(){
        Row=new JPanel();
        AddButton=new JButton("Add To Queue");
        AddButton.addActionListener(GT);
        Row.add(AddButton);
        add(Row);

    }

}
