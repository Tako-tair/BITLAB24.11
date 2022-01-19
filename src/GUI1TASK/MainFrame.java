package GUI1TASK;

import Gui1.FirstPage;
import Gui1.MainMenu;
import Gui1.Player;
import Gui1.SecondPage;
import com.company.Student;

import javax.swing.*;

public class MainFrame extends JFrame {

    private MainMenu mainMenuPage;
    private addPage addd;
    private listPage list;

    public static Students[] students = new Students[10];
    public static int index = 0;

    public MainFrame() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");
        setSize(500, 500);
        setLayout(null);

        mainMenuPage = new MainMenu(this);
        mainMenuPage.setVisible(true);
        add(mainMenuPage);

        addd = new addPage(this);
        addd.setVisible(false);
        add(addd);

        list = new listPage(this);
        list.setVisible(false);
        add(list);
    }

    public MainMenu getMainMenuPage() {
        return mainMenuPage;
    }

    public addPage getAdd() {
        return addd;
    }

    public listPage getList() {
        return list;
    }

    public static Students[] getStudents() {
        return students;
    }

    public static int getIndex() {
        return index;
    }
}