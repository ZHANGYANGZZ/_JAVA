package Innerclass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock talkingClock = new TalkingClock(10000,true);
        talkingClock.start();

        JOptionPane.showMessageDialog(null,"Quit Program");
        System.exit(0);
    }
}

    class TalkingClock{
        private int interval;
        private boolean beep;

        public TalkingClock(int interval, boolean beep){
            this.beep = beep;
            this.interval = interval;
        }

        public void start(){
            ActionListener actionListener  = new TimerPrinter();
            Timer timer = new Timer(interval,actionListener);
            timer.start();
        }
        // 内部类，可以直接使用外围数据域
        public class TimerPrinter implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Date date = new Date();
                System.out.println("at the stone , the time is " + date);
                if(beep) Toolkit.getDefaultToolkit().beep();

            }
        }


    }

