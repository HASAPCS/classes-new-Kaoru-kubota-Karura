package com.example;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        // TODO: Initialize the length and width
        this.length = length;
        this.width = width;
    }

    public double area() {
        // TODO: Calculate and return the area of the rectangle
        return length*width;  // Change this default return statement
    }

    public double perimeter() {
        // TODO: Calculate and return the perimeter of the rectangle
        return length+width+length+width;  // Change this default return statement
    }
}
