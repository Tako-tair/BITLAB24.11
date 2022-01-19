package GUI1TASK;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class listPage extends JFrame {
    private MainFrame parent;
    private JLabel label;
    private JButton back, update;
    private String header[] = {"Id","Name","Surname", "Faculty", "Group"};
    private JTextArea area;

    public listPage (MainFrame parent){
        this.parent = parent;
        setSize(500,500);
        setLayout(null);
        label = new JLabel("LIST STUDENTS");
        label.setSize(300,30);
        label.setLocation(100,100);
        add(label);

        update = new JButton("Update");
        update.setSize(70, 30);
        update.setLocation(100, 450);
        add(update);

        area = new JTextArea();
        area.setSize(300,300);
        area.setLocation(70,120);
        update.addActionListener(e-> {
            for (int i = 0; i < MainFrame.students.length; i++) {
                area.append(MainFrame.students[i].toString());
            }
        });

        back = new JButton("Back");
        back.setSize(70,30);
        back.setLocation(250,350);
        add(back);
        back.addActionListener(e->{
            parent.getList().setVisible(false);
            parent.getMainMenuPage().setVisible(true);
        });
    }
}

