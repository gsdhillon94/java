package com.ayebye.entities;

public class Request {
Person requestedBy;
Journey journey;
String status;
float cost;
float distance;
public Person getRequestedBy() {
	return requestedBy;
}
public void setRequestedBy(Person requestedBy) {
	this.requestedBy = requestedBy;
}
public Journey getJourney() {
	return journey;
}
public void setJourney(Journey journey) {
	this.journey = journey;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public float getCost() {
	return cost;
}
public void setCost(float cost) {
	this.cost = cost;
}
public float getDistance() {
	return distance;
}
public void setDistance(float distance) {
	this.distance = distance;
}
@Override
public String toString() {
	return "Request [requestedBy=" + requestedBy + ", journey=" + journey + ", status=" + status + ", cost=" + cost
			+ ", distance=" + distance + "]";
}

}
