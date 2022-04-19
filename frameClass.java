package calculator;
import javax.swing.*;
public class frameClass extends JFrame{
    public frameClass(){
        this.setTitle("Calculator");
        this.setSize(296,388);
        this.setResizable(false);
        this.setLocation(500,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
