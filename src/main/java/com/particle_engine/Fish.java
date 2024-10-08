/*
 * Coder: Vanessa Haynes
 * Project: Project 1 - Particle Engine
 * Date: Sep. 2024
 * Description: Fish -- Class that creates "fish" bouncing left and right.
 */

package com.particle_engine;

import processing.core.*;

public class Fish {
    float x, y; //location
    float sizeX; //size of fish length
    float sizeY; //size of fish height
    int color; //color of fish
    float xVel = 3; //how fast the fish move
    float x_direction = 1; //which direction the fish goes, 1 is right -- adding & -1 is left -- subtracting
    boolean swimright;

    PApplet main; //main class that gives processing functionality

    Fish(float x_, float y_, float sizeX_, float sizeY_, int color_, PApplet main_) {
        x = x_;
        y = y_;
        sizeX = sizeX_;
        sizeY = sizeY_;
        color = color_;

        main = main_;
    }

//draws out the fish
    void draw() {
        if (swimright) {
            main.fill (color);
        main.rect (x, y, sizeX, sizeY);
        main.ellipse (x, y+sizeY/2-1, sizeX, sizeY);
        move();
        } else {
            main.fill (color);
        main.rect (x, y, sizeX, sizeY);
        main.ellipse (x+sizeX, y+sizeY/2-1, sizeX, sizeY);
        move();
        }
        
    }

//making the fish move
    void move() {

        x += xVel*x_direction; //moves the fish

        //keeps the fish from leaving the screen- boounces them
        if((x+sizeX) >= main.width){
            x_direction = -1;
            swimright = false;
        } else if (x <= 0) {
            x_direction = 1;
            swimright = true;
        }
    }

//changes the direction of the fish
    void flip() {
        x_direction *= -1;
    }

//speeds up fish
    void faster() {
        xVel++;
    }

//slows down fish
    void slower() {
        xVel--;
    }
}