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
    ArrayList<Bubble> bubbles;

    Bubble bubbles_; //a bubble that will be drawn to the screen

    Bubbles(PApplet main_) 
    {
        main = main_;
        bubbles = new ArrayList<Bubble>();
    }

//setup everything you need for the particle engine
    void setup() {
        bubbles_ = new Bubble(main.width/2.0f, main.height*.10f, 12.f, main, main.color(main.random(255), main.random(255), main.random(255))); //Had to make everything floats by addingg f at the end of the hard-coded numbers.
    }

//draws the bubbles
    void draw() {
        main.background(49, 72, 185); //resets the background every frame
        main.noStroke(); //takes away the outlines around the shapes
        bubbles_.draw();
    }

//clicking the mouse speeds up the bouncing ball
    void mousePressed() {
        bubbles_.faster();
    }


}
