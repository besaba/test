package testapplication;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TestApplication extends JFrame {
    
    public TestApplication() {
        this.setTitle("Hello!");
        this.setSize(640, 480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initMenu();
    }
    
    void initMenu() {
        JMenuBar bar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenuItem item1 = new JMenuItem("Exit");
        menu1.add(item1);
        JMenu menu2 = new JMenu("Help");
        JMenuItem item2 = new JMenuItem("About");
        menu2.add(item2);
        
        bar.add(menu1);
        bar.add(menu2);
        this.setJMenuBar(bar);
        
    }

    public static void main(String[] args) {

        TestApplication test;
        test = new TestApplication();
        test.setVisible(true);
    }
    
}
