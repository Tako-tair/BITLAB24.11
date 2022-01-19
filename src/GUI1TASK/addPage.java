package GUI1TASK;

import com.company.Student;

import javax.swing.*;
import java.awt.*;

public class addPage extends JFrame {
    private MainFrame parent;

    private JLabel nameL;
    private JLabel surL;
    private JLabel facultyL;
    private JLabel groupL;
    private JTextField name;
    private JTextField sur;
    private JComboBox comboBox;
    private JTextField group;
    private JButton add;
    private JButton back;

    public addPage(MainFrame parent){
        this.parent = parent;
        String[] facult = {"Information Theory","Economy","Matem","History"};

        setSize(500,500);
        setLocale(null);

        nameL = new JLabel("NAME:");
        nameL.setSize(60,30);
        nameL.setLocation(80,50);
        add(nameL);

        surL = new JLabel("SURNAME:");
        surL.setSize(60,30);
        surL.setLocation(80,90);
        add(surL);

        facultyL = new JLabel("FACULTY:");
        facultyL.setSize(60,30);
        facultyL.setLocation(80,130);
        add(facultyL);

        groupL = new JLabel("GROUP:");
        groupL.setSize(60,30);
        groupL.setLocation(80,170);
        add(groupL);

        name = new JTextField();
        name.setSize(300,30);
        name.setLocation(170,50);
        add(name);

        sur = new JTextField();
        sur.setSize(300,30);
        sur.setLocation(170,90);
        add(sur);

        group = new JTextField();
        group.setSize(300,30);
        group.setLocation(170,170);
        add(group);

        comboBox = new JComboBox(facult);
        comboBox.setSize(300,30);
        comboBox.setLocation(170,130);
        add(comboBox);

        add = new JButton("ADD");
        add.setSize(130,30);
        add.setLocation(50,400);
        add.addActionListener(e->{
            int id = MainFrame.index;
            String namee = name.getText();
            String surname = sur.getText();
            String facul = (String)comboBox.getSelectedItem();
            String groups = group.getText();
            if(namee!=null && surname!=null && groups!=null) {
                MainFrame.students[MainFrame.index] = new Students(id + 1, namee, surname, facul, groups);
                MainFrame.index++;
            }
            name.setText("");
            sur.setText("");
            group.setText("");
            comboBox.setSelectedIndex(0);
        });
        add(add);

        back = new JButton("BACK");
        back.setSize(100,30);
        back.setLocation(200,400);
        back.addActionListener(e->{
            parent.getAdd().setVisible(false);
            parent.getMainMenuPage().setVisible(true);
        });
        add(back);


    }
}
