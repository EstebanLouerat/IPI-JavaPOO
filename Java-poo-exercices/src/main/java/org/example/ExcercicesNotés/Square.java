package org.example.ExcercicesNotés;

public class Square extends Rectangle {

    public int height;
    public int width;
    public Square(int height, int width) {
        super(height, width);
        this.width = width;
        this.height = height;
    }

    public int area() {
        return height * width;
    }
}
