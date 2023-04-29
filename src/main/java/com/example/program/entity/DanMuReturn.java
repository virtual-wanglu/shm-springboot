package com.example.program.entity;

import java.util.Objects;

public class DanMuReturn {
    private String text;

    private String color;

    private double time;

    public DanMuReturn() {
    }

    public DanMuReturn(String text, String color, double time) {
        this.text = text;
        this.color = color;
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DanMuReturn that = (DanMuReturn) o;
        return Double.compare(that.time, time) == 0 && Objects.equals(text, that.text) && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, color, time);
    }


}
