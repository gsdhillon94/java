package com.aaebae.entity;

import java.util.Arrays;

public class GeoWayPoints {
String geocoder_status;
String place_id;
String[] types;


public GeoWayPoints(String geocoder_status, String place_id, String[] types) {
	super();
	this.geocoder_status = geocoder_status;
	this.place_id = place_id;
	this.types = types;
}
@Override
public String toString() {
	return "GeoWayPoints [geocoder_status=" + geocoder_status + ", place_id=" + place_id + ", types="
			+ Arrays.toString(types) + "]";
}
public String getGeocoder_status() {
	return geocoder_status;
}
public void setGeocoder_status(String geocoder_status) {
	this.geocoder_status = geocoder_status;
}
public String getPlace_id() {
	return place_id;
}
public void setPlace_id(String place_id) {
	this.place_id = place_id;
}
public String[] getTypes() {
	return types;
}
public void setTypes(String[] types) {
	this.types = types;
}
}
