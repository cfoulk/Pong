package com.example.pong;

class Point {

    int x;
    int y;

    //constructor
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    int getFontSize(){
        return (x/20);
    }

    int getMargin(){
        return (x/75);
    }
}
