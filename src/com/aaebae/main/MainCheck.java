package com.aaebae.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;
import java.util.Map.Entry;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.aaebae.entity.*;

public class MainCheck {

	public OverviewPolyline ovp = new OverviewPolyline();

	public static void main(String[] args) throws Exception {

		URL urlForGetRequest = new URL("http://localhost:8080/getRouteResponse");
		String responseString = "";
		HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
		conection.setRequestMethod("GET");
		conection.connect();

		Scanner sc = new Scanner(urlForGetRequest.openStream());
		while (sc.hasNext()) {
			responseString += sc.nextLine();
		}
		
		JSONParser parser = new JSONParser();
    	JSONObject responseObject = (JSONObject) parser.parse(responseString);
    	
    	JSONArray route = (JSONArray) responseObject.get("routes");
    	ObjectMapper objectMapper = new ObjectMapper();
    	Routes[] routes = objectMapper.readValue(responseObject.get("routes").toString(), Routes[].class);
    	System.out.println(routes[0].getOverview_polyline());
    	
	}

	public static void saveOverviewPolyline(String overviewpolyLine) {
		System.out.println(overviewpolyLine);

	}
}
