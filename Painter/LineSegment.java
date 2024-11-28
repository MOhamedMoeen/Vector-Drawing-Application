package com.mycompany.lab6;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.Map;
public class LineSegment extends ShapeAbs {

     public LineSegment(Point position, Map<String, Double> properties) {
       super(position, properties);
    }

    public void draw(Graphics canvas) {
        Graphics2D g2d=(Graphics2D)canvas;
        int length=(int) Math.round(properties.get("length").doubleValue());
        int angle=(int) Math.round(properties.get("angle").doubleValue());  
        int x=position.x+(int)(length*Math.cos(Math.toRadians(angle)));
        int y=position.y+(int)(length*Math.sin(Math.toRadians(angle)));       
        int thickness=properties.get("thickness").intValue();
        g2d.setStroke(new BasicStroke(thickness));
        g2d.setPaint(color);
        g2d.drawLine(position.x,position.y,x,y); 
    }
}
