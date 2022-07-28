package com.example.restservice;

public class ZvuvonCalculator {

	final static double g=9.81;

	private final Double velocity;
	private final Double height;
	private final Double angle;


	public ZvuvonCalculator(Double velocity , Double height, Double angle) {
		this.velocity = velocity;
		this.height = height;
		this.angle = angle;
	}

	public Double getVelocity() {
		return velocity;
	}

	public Double getHeight() {
		return height;
	}

	public Double getAngle() {
		return angle;
	}

	public static double getG() {
		return g;
	}

	public ZvuvonCalculatorResults calculateDistance () {

		double radians=Math.toRadians(angle);

		double distanceX= velocity*Math.cos(radians)*2*velocity*Math.sin(radians)/g;

		final double v = velocity * Math.sin(radians) * velocity * Math.sin(radians);
		double strikeSpeed=Math.sqrt( (velocity*Math.cos(radians)*velocity*Math.cos(radians))+
									 (v +2*g*height)
									);
		double strikeAngleRadians=Math.atan((Math.sqrt(v)+2*g*height)) / velocity * Math.cos(radians);
		double strikeAngle=Math.toDegrees(strikeAngleRadians);

		return new ZvuvonCalculatorResults(distanceX, strikeSpeed, strikeAngle);
	}


}
