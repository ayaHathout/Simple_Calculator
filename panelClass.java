package calculator;
import javax.swing.*;
import java.awt.*;
public class panelClass extends JPanel{
    public panelClass(){
        this.setBackground(Color.WHITE);
        this.setLayout(null);
        JTextField tf=new JTextField();
        tf.setBounds(0,0,290,50);  //Height was 30
        JButton b1=new JButton("%");
        b1.setBounds(2,51,70,50);
        JButton b2=new JButton("CE");
        b2.setBounds(74,51,70,50);  //5
        JButton b3=new JButton("C");
        b3.setBounds(146,51,70,50);
        JButton b4=new JButton("delete");
        b4.setBounds(218,51,70,50);
        JButton b5=new JButton("1/x");
        b5.setBounds(2,102,70,50);
        JButton b6=new JButton("x^2");
        b6.setBounds(74,102,70,50);  //5
        JButton b7=new JButton("√x");
        b7.setBounds(146,102,70,50);
        JButton b8=new JButton("÷");
        b8.setBounds(218,102,70,50);
        JButton b9=new JButton("7");
        b9.setBounds(2,153,70,50);
        JButton b10=new JButton("8");
        b10.setBounds(74,153,70,50);  //5
        JButton b11=new JButton("9");
        b11.setBounds(146,153,70,50);
        JButton b12=new JButton("×");
        b12.setBounds(218,153,70,50);
        JButton b13=new JButton("4");
        b13.setBounds(2,204,70,50);
        JButton b14=new JButton("5");
        b14.setBounds(74,204,70,50);  //5
        JButton b15=new JButton("6");
        b15.setBounds(146,204,70,50);
        JButton b16=new JButton("-");
        b16.setBounds(218,204,70,50);
        JButton b17=new JButton("1");
        b17.setBounds(2,255,70,50);
        JButton b18=new JButton("2");
        b18.setBounds(74,255,70,50);  //5
        JButton b19=new JButton("3");
        b19.setBounds(146,255,70,50);
        JButton b20=new JButton("+");
        b20.setBounds(218,255,70,50);
        JButton b21=new JButton("+/-");
        b21.setBounds(2,306,70,50);
        JButton b22=new JButton("0");
        b22.setBounds(74,306,70,50);  //5
        JButton b23=new JButton(".");
        b23.setBounds(146,306,70,50);
        JButton b24=new JButton("=");
        b24.setBounds(218,306,70,50);
        b1.setBackground(Color.WHITE);
        b2.setBackground(Color.WHITE);
        b3.setBackground(Color.WHITE);
        b4.setBackground(Color.WHITE);
        b5.setBackground(Color.WHITE);
        b6.setBackground(Color.WHITE);
        b7.setBackground(Color.WHITE);
        b8.setBackground(Color.WHITE);
        b9.setBackground(Color.WHITE);
        b10.setBackground(Color.WHITE);
        b11.setBackground(Color.WHITE);
        b12.setBackground(Color.WHITE);
        b13.setBackground(Color.WHITE);
        b14.setBackground(Color.WHITE);
        b15.setBackground(Color.WHITE);
        b16.setBackground(Color.WHITE);
        b17.setBackground(Color.WHITE);
        b18.setBackground(Color.WHITE);
        b19.setBackground(Color.WHITE);
        b20.setBackground(Color.WHITE);
        b21.setBackground(Color.WHITE);
        b22.setBackground(Color.WHITE);
        b23.setBackground(Color.WHITE);
        b24.setBackground(Color.lightGray);
        this.add(tf);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);
        this.add(b10);
        this.add(b11);
        this.add(b12);
        this.add(b13);
        this.add(b14);
        this.add(b15);
        this.add(b16);
        this.add(b17);
        this.add(b18);
        this.add(b19);
        this.add(b20);
        this.add(b21);
        this.add(b22);
        this.add(b23);
        this.add(b24);
    }
}
