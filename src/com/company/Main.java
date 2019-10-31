package com.company;
import processing.core.PApplet;


public class Main extends PApplet {

    public static Main instance;

    testTest test = new testTest();

    public static void main(String[] args) {
	// write your code here
        PApplet.main("com.company.Main");
        System.out.println("HelloWorld");

    }
    public void settings(){
        //Put stuff like size() here
        size(1500,800);
        background(200);
        stroke(150);
        instance=this;

    }
    public void setup(){
        //Ordinary setup
        test.run();

    }
    public void draw(){
        //Ordinary draw
    }
}
