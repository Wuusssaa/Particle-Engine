/*
 * Coder: Vanessa Haynes
 * Project: Project 1 - Particle Engine
 * Date: Sep. 2024
 * Description: Bubbles -- Container class for creating all of the bubbles.
 */

package com.particle_engine;

import java.util.ArrayList;
import processing.core.*;

public class Bubbles {
    PApplet main; //the main class -- provides all the functionality of processing 
    ArrayList<Bubble> bubbles; //all the bubbles being drawn

    Bubble bubble; //a bubble that will be drawn to the screen
    int bubbleCount = 50; //# of bubbles

    Bubbles(PApplet main_) {
        main = main_;
        bubbles = new ArrayList<>();
        init(); //initialize the bubbles
    }

//adds all the fish to the array. All attributes are random. 
    void init() {
        for(int i=0; i<bubbleCount; i++) {
            bubble = new Bubble(main.random(main.width), main.random(main.height), main.random(30), main, main.color(main.random(255), main.random(255), main.random(255))); //Had to make everything floats by addingg f at the end of the hard-coded numbers.
            bubbles.add(bubble);
        }
    }

//draws the bubbles
    void draw() {
        main.background(49, 72, 185); //resets the background every frame
        main.noStroke(); //takes away the outlines around the shapes
        for(int i = 0; i<bubbles.size(); i++){
            bubbles.get(i).draw(); 
        }
    }

//clicking the mouse speeds up the bouncing bubbles
    void mousePressed() {
        for(int i = 0; i<bubbles.size(); i++){
            bubbles.get(i).faster(); 
        }
    }

    void keyPressed() {
        if(main.key == ' ') {
            bubbleCount = 50;
        }
    }

}
