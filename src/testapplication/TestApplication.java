package testapplication;

import javax.swing.JFrame;

public class TestApplication extends JFrame {
    
    public TestApplication() {
        this.setTitle("Hello!");
        this.setSize(640, 480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public static void main(String[] args) {

        TestApplication test;
        test = new TestApplication();
        test.setVisible(true);
    }
    
}
