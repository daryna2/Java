package com.company;

public class Wall {
    private double width;
    private double height;

    public Wall() {
        this(0.00, 0.00);
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
        if (this.width < 0) {
            this.width = 0;
        }
        if(this.height<0) {
                this.height = 0;
            }
        }



    public void setWidth(double width) {
        this.width = width;
        if (this.width < 0) {
            this.width = 0;
        }
    }

    public void setHeight(double height) {
        this.height = height;
        if(this.height<0) {
            this.height = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public double getArea() {
        return getWidth()*getHeight();
    }
}
