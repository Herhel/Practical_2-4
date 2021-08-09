package com.alfa.work1;

public abstract class Shape implements Drawable, Comparable, Cloneable {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "class=" + getClass().getSimpleName() +
                ", color=" + color;
    }

    public abstract double calcArea ();

    @Override
    public int compareTo(Object o) {
        if (this.calcArea() > ((Shape)o).calcArea()) return 1;
        if (this.calcArea() < ((Shape)o).calcArea()) return -1;
        return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
            return super.clone();
    }
}
