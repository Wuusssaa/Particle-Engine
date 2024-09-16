/*
 * Coder: Vanessa Haynes
 * Project: Project 1 - Particle Engine
 * Date: Sep. 2024
 * Description: Fish -- creates "fish" bouncing left and right.
 */

package com.particle_engine;

import processing.core.*;

public class Fish {
    float x, y; //location
    float sizeX; //size of fish
    float sizeY; //size of fish
    float color; //color of fish
    float xVel = 1; //how fast the fish moves
    float x_direction = 1; //which direction the fish goes, 1 is right -- adding & -1 is left -- subtracting

    PApplet main; //main class that gives processing functionality

    Fish(float x_, float y_, float sizeX_, float sizeY_, int color_, PApplet main_) {
        x = x_;
        y = y_;
        sizeX = sizeX_;
        sizeY = sizeY_;
        color = color_;

        main = main_;
    }

    void draw() {
        main.fill (color);
        main.rect (x, y, sizeX, sizeY);
        move();
    }

    void move() {
        x += xVel*x_direction;

        if((x+sizeX) >= main.width){
            x_direction = -1;
        } else if (x <= 0) {
            x_direction = 1;
        }
    }

    void faster() {
        xVel++;
    }

}
