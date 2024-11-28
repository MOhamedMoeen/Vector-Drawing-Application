package com.mycompany.lab6;
import java.awt.Color;
import java.awt.Point;
import java.util.Map;
import java.awt.Graphics;
public interface Shape {
   public void setPosition(Point positon);
   public Point getPosition();
   public void setProperties(Map<String,Double> properties);
   public Map<String,Double> getProperties();
   public void setColor(Color color);
   public Color getColor();
   public void setFillColor(Color color);
   public Color getFillColor();
   public void draw(Graphics canvas);
}
