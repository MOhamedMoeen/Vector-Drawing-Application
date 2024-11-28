package com.mycompany.lab6;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.Map;
public class Square extends ShapeAbs {
    public Square(Point position, Map<String, Double> properties) {
        super(position, properties);
    }
    public void draw(Graphics canvas) {
        Graphics2D g2d=(Graphics2D)canvas;
        int side=(int) Math.round(properties.get("side").doubleValue());
        if(fillColor!=null)
        {
        g2d.setPaint(fillColor);
        g2d.fillRect(position.x-side/2,position.y-side/2 , side, side);
        }
        int thickness=properties.get("thickness").intValue();
        g2d.setStroke(new BasicStroke(thickness));
        g2d.setPaint(color);
        g2d.drawRect(position.x-side/2,position.y-side/2 , side, side);
    }
}
