package Callback_¶¨Ê±Æ÷;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class TimerTest {
    public static void main(String[] args) {
        ActionListener actionListener = new TimerPrinter();
        Timer timer = new Timer(10000,actionListener);
        timer.start();
        JOptionPane.showMessageDialog(null, "Quit Program?");
        System.exit(0);
    }
}
class TimerPrinter implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Date t = new Date();
        System.out.println("At the stone ,the time is " + t);

    }
}
