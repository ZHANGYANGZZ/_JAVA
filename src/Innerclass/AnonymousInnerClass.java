package Innerclass;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Timer;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        TalkingClock1 talkingClock = new TalkingClock1();
        talkingClock.start(1000, true);

        JOptionPane.showMessageDialog(null, "Quit now?");
        System.exit(0);
    }

}

class TalkingClock1 {
    public void start(int interval, final boolean beep) {
        //创建actionListener接口对象
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Date date = new Date();
                System.out.println("at the stone , the time is " + date);
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        Timer timer = new Timer(interval, actionListener);
        timer.start();
    }
}
