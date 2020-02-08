package com.aaebae.entity;

public class Step {
Distance distance;
Duration duration;
Location end_location;
Location start_location;
String html_instructions;
OverviewPolyline polyline;
String travel_mode;
String maneuver;
public String getManeuver() {
	return maneuver;
}
public void setManeuver(String maneuver) {
	this.maneuver = maneuver;
}
public Distance getDistance() {
	return distance;
}
public void setDistance(Distance distance) {
	this.distance = distance;
}
public Duration getDuration() {
	return duration;
}
public void setDuration(Duration duration) {
	this.duration = duration;
}
public Location getEnd_location() {
	return end_location;
}
public void setEnd_location(Location end_location) {
	this.end_location = end_location;
}
public Location getStart_location() {
	return start_location;
}
public void setStart_location(Location start_location) {
	this.start_location = start_location;
}
public String getHtml_instructions() {
	return html_instructions;
}
public void setHtml_instructions(String html_instructions) {
	this.html_instructions = html_instructions;
}
public OverviewPolyline getPolyline() {
	return polyline;
}
public void setPolyline(OverviewPolyline polyline) {
	this.polyline = polyline;
}
public String getTravel_mode() {
	return travel_mode;
}
public void setTravel_mode(String travel_mode) {
	this.travel_mode = travel_mode;
}
@Override
public String toString() {
	return "Step [distance=" + distance + ", duration=" + duration + ", end_location=" + end_location
			+ ", start_location=" + start_location + ", html_instructions=" + html_instructions + ", polyline="
			+ polyline + ", travel_mode=" + travel_mode + "]";
}

}
