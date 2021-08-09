package com.alfa.work1;

public class Rectangle extends Shape{
    private int width;
    private int height;
    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return super.toString() + ", width=" + width + ", height=" + height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.printf(this + ", area=%.2f \n", calcArea());
    }

    @Override
    public int compareTo(Object o) {
        if (this.calcArea() > ((Shape)o).calcArea()) return 1;
        if (this.calcArea() < ((Shape)o).calcArea()) return -1;
        return 0;
    }
}
