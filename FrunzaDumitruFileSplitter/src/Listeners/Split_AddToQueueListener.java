package Listeners;


import Interface.FinalGui2_JTable;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Split_AddToQueueListener implements ActionListener {

    FinalGui2_JTable GT=new FinalGui2_JTable();

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Add to queue")){
            System.out.println("Ciao");
            GT.AddRow();


        }

    }
}
