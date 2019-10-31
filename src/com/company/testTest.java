package com.company;

public class testTest {
    testTest(){
    }
    void run(){
        for (int i=2*(Main.instance.height/35) ; i<(width-width/5) ; i=i+(height/35)){
            if((i-2*(height/35))%8==0) stroke(50);
            else stroke(150);
            line(i,2*(height/35),i,(height-height/20));
        }

        for (int i=(height/20) ; i<(height-height/20) ; i=i+(height/70)){
            if((i-8*(height/70))%16==0) stroke(0);
            else stroke(150);
            line(2*(height/35),i,(width-width/5),i);
        }
    }
}
