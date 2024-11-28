package com.mycompany.lab6;

import java.awt.*;
import java.util.Map;

public abstract class ShapeAbs implements Shape{
    protected Color color=Color.black;
    protected Point position;
    protected Color fillColor;
    protected Map<String,Double> properties;
    public ShapeAbs(Point position, Map<String, Double> properties) {
        this.position = position;
        this.properties = properties;
    }
    public void setPosition(Point position) {
        this.position=position;
    }
    public Point getPosition() {
        return position;
    }

    public void setProperties(Map<String,Double> properties) {
        this.properties=properties;
    }

    public Map<String, Double> getProperties() {
        return this.properties;
    }

    public void setColor(Color color) {
        this.color=color;
    }

    public Color getColor() {
        return this.color;
    }

    public void setFillColor(Color color) {
        this.fillColor=color;
    }

    public Color getFillColor() {
        return this.fillColor;
    }

}
