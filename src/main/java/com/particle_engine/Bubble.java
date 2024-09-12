/*
 * Coder: Vanessa Haynes
 * Project: Project 1 - Particle Engine
 * Date: Sep. 2024
 * Description: Bubble -- creates bubbles bouncing up and down.
 */

package com.particle_engine;

import processing.core.*;

public class Bubble {
    PApplet main; //the main class -- provides all the functionality of processing 

    float x, y; //location of the ball
    float yVel = 1; //how fast the ball moves
    float y_direction = 1; //which direction the ball goes, 1 is down -- adding & -1 is up -- subtracting

    float radius; //how big the ball is
    int bubbleColor;

    Bubble(float x_, float y_, float radius_, PApplet main_, int c) {
        x = x_;
        y = y_;
        radius = radius_;
        bubbleColor = c;

        main = main_;
    }

    void draw() {
        main.fill(bubbleColor);
        main.ellipse(x, y, radius, radius); //need to connect to main class to use processing's ellipse function
        move();
    }

    void move() {
        y += yVel*y_direction;

        if(y >= main.height){
            y_direction = -1;
        } else if (y <= 0) {
            y_direction = 1;
        }
    }

    void faster() {
        yVel++;
    }

}
