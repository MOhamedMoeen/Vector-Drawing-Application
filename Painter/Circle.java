package com.mycompany.lab6;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.Map;
public class Circle extends ShapeAbs{
    public Circle(Point position, Map<String, Double> properties) {
        super(position, properties);
    }
    @Override
    public void draw(Graphics canvas) {
        Graphics2D g2d=(Graphics2D)canvas;
        int radius=(int) Math.round(properties.get("radius").doubleValue());
        if(fillColor!=null)
        {
        g2d.setPaint(fillColor);
        g2d.fillOval(position.x-radius,position.y-radius,2*radius,2*radius);  
        }
        int thickness=properties.get("thickness").intValue();
        g2d.setStroke(new BasicStroke(thickness));
        g2d.setPaint(color);
        g2d.drawOval(position.x-radius,position.y-radius,2*radius,2*radius);
        
    }
}
