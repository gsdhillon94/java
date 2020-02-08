package com.aaebae.entity;

import java.util.Arrays;

public class Routes {
	String copyrights;
	String summary;
	String[] warnings;
	String[] waypoint_order;
	OverviewPolyline overview_polyline;
	Legs[] legs;
	Bounds bounds;
	
	
	@Override
	public String toString() {
		return "Routes [copyrights=" + copyrights + ", summary=" + summary + ", warnings=" + Arrays.toString(warnings)
				+ ", waypoint_order=" + Arrays.toString(waypoint_order) + ", overview_polyline=" + overview_polyline
				+ ", legs=" + Arrays.toString(legs) + ", bounds=" + bounds + "]";
	}
	public String getCopyrights() {
		return copyrights;
	}
	public void setCopyrights(String copyrights) {
		this.copyrights = copyrights;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String[] getWarnings() {
		return warnings;
	}
	public void setWarnings(String[] warnings) {
		this.warnings = warnings;
	}
	public String[] getWaypoint_order() {
		return waypoint_order;
	}
	public void setWaypoint_order(String[] waypoint_order) {
		this.waypoint_order = waypoint_order;
	}
	public OverviewPolyline getOverview_polyline() {
		return overview_polyline;
	}
	public void setOverview_polyline(OverviewPolyline overview_polyline) {
		this.overview_polyline = overview_polyline;
	}
	public Legs[] getLegs() {
		return legs;
	}
	public void setLegs(Legs[] legs) {
		this.legs = legs;
	}
	public Bounds getBounds() {
		return bounds;
	}
	public void setBounds(Bounds bounds) {
		this.bounds = bounds;
	}
}
