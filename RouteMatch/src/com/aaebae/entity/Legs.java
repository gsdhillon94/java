package com.aaebae.entity;

import java.util.Arrays;

public class Legs {
Distance distance;
Duration duration;
String end_address;
Location end_location;
String start_address;
Location start_location;
Step[] steps;
String[] traffic_speed_entry;
String[] via_waypoint;
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
public String getEnd_address() {
	return end_address;
}
public void setEnd_address(String end_address) {
	this.end_address = end_address;
}
public Location getEnd_location() {
	return end_location;
}
public void setEnd_location(Location end_location) {
	this.end_location = end_location;
}
public String getStart_address() {
	return start_address;
}
public void setStart_address(String start_address) {
	this.start_address = start_address;
}
public Location getStart_location() {
	return start_location;
}
public void setStart_location(Location start_location) {
	this.start_location = start_location;
}
public Step[] getSteps() {
	return steps;
}
public void setSteps(Step[] steps) {
	this.steps = steps;
}
public String[] getTraffic_speed_entry() {
	return traffic_speed_entry;
}
public void setTraffic_speed_entry(String[] traffic_speed_entry) {
	this.traffic_speed_entry = traffic_speed_entry;
}
public String[] getVia_waypoint() {
	return via_waypoint;
}
public void setVia_waypoint(String[] via_waypoint) {
	this.via_waypoint = via_waypoint;
}
@Override
public String toString() {
	return "Legs [distance=" + distance + ", duration=" + duration + ", end_address=" + end_address + ", end_location="
			+ end_location + ", start_address=" + start_address + ", start_location=" + start_location + ", steps="
			+ Arrays.toString(steps) + ", traffic_speed_entry=" + Arrays.toString(traffic_speed_entry)
			+ ", via_waypoint=" + Arrays.toString(via_waypoint) + "]";
}

}
