package com.aaebae.entity;

public class Bounds {
Location northeast;
Location southwest;
public Location getNortheast() {
	return northeast;
}
public void setNortheast(Location northeast) {
	this.northeast = northeast;
}
public Location getSouthwest() {
	return southwest;
}
public void setSouthwest(Location southwest) {
	this.southwest = southwest;
}
@Override
public String toString() {
	return "Bounds [northeast=" + northeast + ", southwest=" + southwest + "]";
}

}
