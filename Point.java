package com.company;

public class Point {
    private int x;
    private int y;

public Point() {
}
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public double distance() {
        double d = Math.sqrt(getX()*getX()+getY()*getY());
        return d;
    }
    public double distance(int x,int y) {
        double d = Math.sqrt((x-getX())*(x-getX())+(y-getY())*(y-getY()));
   return d;
    }
   public double distance (Point point) {
       return distance(point.x,point.y);
   }
}

