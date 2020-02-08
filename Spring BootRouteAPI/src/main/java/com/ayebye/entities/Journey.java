package com.ayebye.entities;

import java.util.Date;

public class Journey {
String journeyID;
Person person;
Location startingPoint;
Location endingPoint;
Date journeyDate;
String status;
public String getJourneyID() {
	return journeyID;
}
public void setJourneyID(String journeyID) {
	this.journeyID = journeyID;
}
public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}
public Location getStartingPoint() {
	return startingPoint;
}
public void setStartingPoint(Location startingPoint) {
	this.startingPoint = startingPoint;
}
public Location getEndingPoint() {
	return endingPoint;
}
public void setEndingPoint(Location endingPoint) {
	this.endingPoint = endingPoint;
}
public Date getJourneyDate() {
	return journeyDate;
}
public void setJourneyDate(Date journeyDate) {
	this.journeyDate = journeyDate;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "Journey [journeyID=" + journeyID + ", person=" + person + ", startingPoint=" + startingPoint
			+ ", endingPoint=" + endingPoint + ", journeyDate=" + journeyDate + ", status=" + status + "]";
}
}
