package org.example.ExcercicesNotés;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void display() {
        String row = "";

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                row += "#";
            }
            System.out.println(row);
            row = "";
        }
    }
}
