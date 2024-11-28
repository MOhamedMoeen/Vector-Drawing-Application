package com.mycompany.lab6;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DrawEngine implements DrawingEngine {
    private ArrayList<Shape> shapes=new ArrayList<>();
    public void addShape(Shape shape)
    {
        shapes.add(shape);
    }
    public void removeShape(Shape shape)
    {
        shapes.remove(shape);
    }
    public ArrayList<Shape> getShapes()
    {
        return shapes;
    }
    public void refresh(Graphics canvas)
    {
        for(Shape shape:shapes)
        {
            shape.draw(canvas);
        }
    }
    public void load(String line) throws Exception {
        try
        {
        String [] tokens = line.split(",");
        Point position = new Point(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
        Color color=new Color(Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]));
        int curr=6;
        Color fillColor = null;
        if(tokens.length>=13)
        {
            fillColor=new Color(Integer.parseInt(tokens[curr++]), Integer.parseInt(tokens[curr++]), Integer.parseInt(tokens[curr++]));
        }
        Map<String,Double> properties=new HashMap<>();
        properties.put(tokens[curr++],Double.parseDouble(tokens[curr++]));
        properties.put(tokens[curr++],Double.parseDouble(tokens[curr++]));
        if(tokens[0].equals("Rectangle")||tokens[0].equals("LineSegment"))
        {
            properties.put(tokens[curr++],Double.parseDouble(tokens[curr++]));
        }
        Shape shape=null;
        switch (tokens[0])
        {
            case "Circle":
            {
                shape =new Circle(position,properties);
                shape.setColor(color);
                if(fillColor!=null)
                shape.setFillColor(fillColor);
                break;
            }
            case "Rectangle":
            {
                shape =new Rectangle(position,properties);
                shape.setColor(color);
                if(fillColor!=null)
                    shape.setFillColor(fillColor);
                break;
            }
            case "LineSegment":
            {
                shape =new LineSegment(position,properties);
                shape.setColor(color);
                if(fillColor!=null)
                    shape.setFillColor(fillColor);
                break;
            }
            case "Square":
            {
                shape =new Square(position,properties);
                shape.setColor(color);
                if(fillColor!=null)
                    shape.setFillColor(fillColor);
                break;
            }
        }
        shapes.add(shape);
        }
        catch (Exception e)
        {
            throw new Exception();
        }
    }
}
