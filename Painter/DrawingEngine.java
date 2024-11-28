package com.mycompany.lab6;
import java.awt.Graphics;
import java.util.ArrayList;
public interface DrawingEngine {
    public void addShape(Shape shape);
    public void removeShape(Shape shape);
    public ArrayList<Shape> getShapes();
    public void refresh(Graphics canvas);
    public void load(String line) throws Exception;
}
