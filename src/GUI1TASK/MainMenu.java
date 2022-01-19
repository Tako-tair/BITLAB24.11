package GUI1TASK;

import Gui1.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JPanel {

    private MainFrame parent;

    private JButton add;
    private JButton list;
    private JButton exitButton;

    public MainMenu(MainFrame parent) {

        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        add = new JButton("First Page");
        add.setSize(300,30);
        add.setLocation(100,100);
        add.addActionListener(e-> {
                parent.getMainMenuPage().setVisible(false);
                parent.getFirstPage().setVisible(true);
        });
        add(add);

        list = new JButton("Second Page");
        list.setSize(300,30);
        list.setLocation(100,150);
        list.addActionListener(e->{
                parent.getSecondPage().generateTable(parent.getPlayers());
                parent.getMainMenuPage().setVisible(false);
                parent.getSecondPage().setVisible(true);
        });
        add(list);

        exitButton = new JButton("Exit");
        exitButton.setSize(300,30);
        exitButton.setLocation(100,200);
        add(exitButton);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }
}