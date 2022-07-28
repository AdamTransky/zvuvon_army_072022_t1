package com.example.restservice;

public class ZvuvonCalculatorResults {


    private final Double strikeSpeed;
    private final Double distanceX;
    private final Double strikeAngle;

    public ZvuvonCalculatorResults(Double distanceX, Double strikeSpeed, Double strikeAngle) {
    this.distanceX = distanceX;
    this.strikeSpeed = strikeSpeed;
    this.strikeAngle = strikeAngle;

    }

    public Double getStrikeSpeed() {
        return strikeSpeed;
    }

    public Double getDistanceX() {
        return distanceX;
    }

    public Double getStrikeAngle() {
        return strikeAngle;
    }
}
