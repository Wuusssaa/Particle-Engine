/*
 * Coder: Vanessa Haynes
 * Project: Project 1 - Particle Engine
 * Date: Sep. 2024
 * Description: Particle engine with basic physics and some interactivity
 */

package com.particle_engine;
import processing.core.*;

public class Main extends PApplet {

    Bubbles bubbles; //draws the simulation to the screen
    Fishies fishies; 

//sets up processing
    public static void main(String[] args) {
        PApplet.main("com.particle_engine.Main");
    }

//sets up the size of the window
    public void settings() {
        size (700,500);
        bubbles = new Bubbles(this);
        fishies = new Fishies(this);
    }

//Settings up the Bubbles class
    public void setup() {
    }

//draws everything on the screen
    public void draw() {
        bubbles.draw();
        fishies.draw();
    }

//TBD -- gonna do something with some particles
    public void mousePressed() {
        bubbles.mousePressed();
        fishies.mousePressed();
    }

    public void keyPressed() {
        bubbles.keyPressed();
        fishies.keyPressed();
    }
}