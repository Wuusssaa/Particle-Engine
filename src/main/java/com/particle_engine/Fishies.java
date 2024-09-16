/*
 * Coder: Vanessa Haynes
 * Project: Project 1 - Particle Engine
 * Date: Sep. 2024
 * Description: Fishies -- Container class for creating all of the "fish".
 */


package com.particle_engine;

import java.util.ArrayList;
import processing.core.*;

public class Fishies {
    PApplet main; //main class that gives processing funtionality
    ArrayList<Fish> fishies; //all the fish being drawn

    Fish fish;
    int fishCount = 50; //# of fish

    Fishies(PApplet main_) {
        main = main_;
        fishies = new ArrayList<>();
        init(); //initialize the fish
    }

//adds all the fish to the array. All attributes are random. 
    void init() {
        for(int i=0; i<fishCount; i++) {
            fish = new Fish(main.random(main.width), main.random(main.height), main.random(30,60), main.random(10,30), main.color(main.random(255), main.random(255), main.random(255)), main);
            fishies.add(fish);
        }
    }


//draws the fishies
    void draw() {
        for(int i = 0; i<fishies.size(); i++){
            fishies.get(i).draw(); 
        }
    }

//clicking the mouse speeds up the fishies
    void mousePressed() {
        for(int i = 0; i<fishies.size(); i++){
            fishies.get(i).faster(); 
        }
    }

    void keyPressed() {
        if(main.key == ' ') {
            fishCount = 50;
        }
    }
}
