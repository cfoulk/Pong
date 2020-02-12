package com.example.pong;

class Point {

    int x;
    int y;

    //constructor
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }


    // Font is 5% (1/20th) of screen width
    int getFontSize(){
        return (x/20);
    }

    // Margin is 1.5% (1/75th) of screen width
    int getMargin(){
        return (x/75);
    }
}
