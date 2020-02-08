package com.ayebye.entities;

public class Location {
Double longitude;
Double latitude;
public Double getLongitude() {
	return longitude;
}
public void setLongitude(Double longitude) {
	this.longitude = longitude;
}
public Double getLatitude() {
	return latitude;
}
public void setLatitude(Double latitude) {
	this.latitude = latitude;
}
@Override
public String toString() {
	return "Location [longitude=" + longitude + ", latitude=" + latitude + "]";
}

}
