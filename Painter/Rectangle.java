package com.mycompany.lab6;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.Map;

public class Rectangle extends ShapeAbs{
     public Rectangle(Point position, Map<String, Double> properties) {
        super(position, properties);
    }
    @Override
    public void draw(Graphics canvas) {
        Graphics2D g2d=(Graphics2D)canvas;
        int width=(int) Math.round(properties.get("width").doubleValue());
        int height=(int) Math.round(properties.get("height").doubleValue());
        g2d.setPaint(color);
        int thickness=properties.get("thickness").intValue();
        g2d.setStroke(new BasicStroke(thickness));
        g2d.drawRect(position.x-width/2,position.y-height/2 , width, height);
        if(fillColor!=null)
        {
        g2d.setPaint(fillColor);
        g2d.fillRect(position.x-width/2,position.y-height/2 , width, height);
        }
    }
    
}
