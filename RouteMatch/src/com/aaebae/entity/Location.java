package com.aaebae.entity;

public class Location {
Double lng;
Double lat;
public Double getlng() {
	return lng;
}
public void setlng(Double lng) {
	this.lng = lng;
}
public Double getlat() {
	return lat;
}
public void setlat(Double lat) {
	this.lat = lat;
}
@Override
public String toString() {
	return "Location [lng=" + lng + ", lat=" + lat + "]";
}

}
