package com.ayebye.entities;

public class Vehicle {
String registration;
int seatCount;
String color;
Person owner;
String model;
String manufacturer;
String carType;
Double average;
public String getRegistration() {
	return registration;
}
public void setRegistration(String registration) {
	this.registration = registration;
}
public int getSeatCount() {
	return seatCount;
}
public void setSeatCount(int seatCount) {
	this.seatCount = seatCount;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public Person getOwner() {
	return owner;
}
public void setOwner(Person owner) {
	this.owner = owner;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getManufacturer() {
	return manufacturer;
}
public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}
public String getCarType() {
	return carType;
}
public void setCarType(String carType) {
	this.carType = carType;
}
public Double getAverage() {
	return average;
}
public void setAverage(Double average) {
	this.average = average;
}
@Override
public String toString() {
	return "Vehicle [registration=" + registration + ", seatCount=" + seatCount + ", color=" + color + ", owner="
			+ owner + ", model=" + model + ", manufacturer=" + manufacturer + ", carType=" + carType + ", average="
			+ average + "]";
}
}
