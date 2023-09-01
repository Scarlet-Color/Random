package randomName;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UI {
    public static void main(String[] args){//main function
        Frame1();
    }
    public static void JFrame2(){
        JFrame jf2 = new JFrame();
        JPanel jp2 = new JPanel();
        jf2.setVisible(true);
        jf2.setSize(480,360);
        jf2.setLocation(721,501);
    }
    public static void Frame1(){
        JFrame jf1 = new JFrame("System");//add the frame
        JButton jb1 = new JButton("开始随机点名.");//add the button
        jb1.setPreferredSize(new Dimension(120,50));//set button's size
        Font ft1 = new Font("宋体",Font.BOLD,36);
        jb1.setFont(ft1);
        jf1.add(jb1);//add the button into frame
        jf1.setVisible(true);//set frame visual
        jf1.setSize(480,360);//set frame's size
        jf1.setLocation(720,500);//set starting position
        jf1.setResizable(false);//refuse to resize
        JMenuBar jmb1 = new JMenuBar();//add a bar
        JMenu jm1 = new JMenu("Buy a coffee.");
        jmb1.add(jm1);

        jb1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame2();
                    }
                }
        );

    }
}
