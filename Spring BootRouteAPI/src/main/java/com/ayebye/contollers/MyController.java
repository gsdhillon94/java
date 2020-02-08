package com.ayebye.contollers;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

@Controller
public class MyController {

    @RequestMapping(value = "/getHomeDRRCroute")
    @ResponseBody
    public JSONObject getHomeDRRCroute() throws ParseException {
    	String resp = "{\r\n" + 
    			"   \"geocoded_waypoints\": [\r\n" + 
    			"      {\r\n" + 
    			"         \"geocoder_status\": \"OK\",\r\n" + 
    			"         \"place_id\": \"ChIJ_ek-HG5F1moRh3dyEwzj7L4\",\r\n" + 
    			"         \"types\": [\r\n" + 
    			"            \"premise\"\r\n" + 
    			"         ]\r\n" + 
    			"      },\r\n" + 
    			"      {\r\n" + 
    			"         \"geocoder_status\": \"OK\",\r\n" + 
    			"         \"place_id\": \"ChIJTyjZwRhF1moRMh6ai7GSKtU\",\r\n" + 
    			"         \"types\": [\r\n" + 
    			"            \"street_address\"\r\n" + 
    			"         ]\r\n" + 
    			"      }\r\n" + 
    			"   ],\r\n" + 
    			"   \"routes\": [\r\n" + 
    			"      {\r\n" + 
    			"         \"bounds\": {\r\n" + 
    			"            \"northeast\": {\r\n" + 
    			"               \"lat\": -37.7053456,\r\n" + 
    			"               \"lng\": 144.9954238\r\n" + 
    			"            },\r\n" + 
    			"            \"southwest\": {\r\n" + 
    			"               \"lat\": -37.7205364,\r\n" + 
    			"               \"lng\": 144.9840327\r\n" + 
    			"            }\r\n" + 
    			"         },\r\n" + 
    			"         \"copyrights\": \"Map data ©2020\",\r\n" + 
    			"         \"legs\": [\r\n" + 
    			"            {\r\n" + 
    			"               \"distance\": {\r\n" + 
    			"                  \"text\": \"3.3 km\",\r\n" + 
    			"                  \"value\": 3297\r\n" + 
    			"               },\r\n" + 
    			"               \"duration\": {\r\n" + 
    			"                  \"text\": \"6 mins\",\r\n" + 
    			"                  \"value\": 344\r\n" + 
    			"               },\r\n" + 
    			"               \"end_address\": \"30 Kurnai Ave, Reservoir VIC 3073, Australia\",\r\n" + 
    			"               \"end_location\": {\r\n" + 
    			"                  \"lat\": -37.720501,\r\n" + 
    			"                  \"lng\": 144.9840327\r\n" + 
    			"               },\r\n" + 
    			"               \"start_address\": \"33 Wilson Blvd, Reservoir VIC 3073, Australia\",\r\n" + 
    			"               \"start_location\": {\r\n" + 
    			"                  \"lat\": -37.7053456,\r\n" + 
    			"                  \"lng\": 144.9942392\r\n" + 
    			"               },\r\n" + 
    			"               \"steps\": [\r\n" + 
    			"                  {\r\n" + 
    			"                     \"distance\": {\r\n" + 
    			"                        \"text\": \"0.3 km\",\r\n" + 
    			"                        \"value\": 280\r\n" + 
    			"                     },\r\n" + 
    			"                     \"duration\": {\r\n" + 
    			"                        \"text\": \"1 min\",\r\n" + 
    			"                        \"value\": 30\r\n" + 
    			"                     },\r\n" + 
    			"                     \"end_location\": {\r\n" + 
    			"                        \"lat\": -37.7076733,\r\n" + 
    			"                        \"lng\": 144.9954238\r\n" + 
    			"                     },\r\n" + 
    			"                     \"html_instructions\": \"Head <b>south</b> on <b>Wilson Blvd</b> toward <b>Elliot St</b>\",\r\n" + 
    			"                     \"polyline\": {\r\n" + 
    			"                        \"points\": \"liceF_e~sZLAVCLALERG`@Q`CiAtEyB\"\r\n" + 
    			"                     },\r\n" + 
    			"                     \"start_location\": {\r\n" + 
    			"                        \"lat\": -37.7053456,\r\n" + 
    			"                        \"lng\": 144.9942392\r\n" + 
    			"                     },\r\n" + 
    			"                     \"travel_mode\": \"DRIVING\"\r\n" + 
    			"                  },\r\n" + 
    			"                  {\r\n" + 
    			"                     \"distance\": {\r\n" + 
    			"                        \"text\": \"0.5 km\",\r\n" + 
    			"                        \"value\": 460\r\n" + 
    			"                     },\r\n" + 
    			"                     \"duration\": {\r\n" + 
    			"                        \"text\": \"1 min\",\r\n" + 
    			"                        \"value\": 44\r\n" + 
    			"                     },\r\n" + 
    			"                     \"end_location\": {\r\n" + 
    			"                        \"lat\": -37.7072315,\r\n" + 
    			"                        \"lng\": 144.9902251\r\n" + 
    			"                     },\r\n" + 
    			"                     \"html_instructions\": \"Turn <b>right</b> onto <b>Broadhurst Ave</b>\",\r\n" + 
    			"                     \"maneuver\": \"turn-right\",\r\n" + 
    			"                     \"polyline\": {\r\n" + 
    			"                        \"points\": \"|wceFkl~sZExAMtDC^?HAL?FAF_@fJYfG@ZA^AH\"\r\n" + 
    			"                     },\r\n" + 
    			"                     \"start_location\": {\r\n" + 
    			"                        \"lat\": -37.7076733,\r\n" + 
    			"                        \"lng\": 144.9954238\r\n" + 
    			"                     },\r\n" + 
    			"                     \"travel_mode\": \"DRIVING\"\r\n" + 
    			"                  },\r\n" + 
    			"                  {\r\n" + 
    			"                     \"distance\": {\r\n" + 
    			"                        \"text\": \"0.8 km\",\r\n" + 
    			"                        \"value\": 818\r\n" + 
    			"                     },\r\n" + 
    			"                     \"duration\": {\r\n" + 
    			"                        \"text\": \"1 min\",\r\n" + 
    			"                        \"value\": 75\r\n" + 
    			"                     },\r\n" + 
    			"                     \"end_location\": {\r\n" + 
    			"                        \"lat\": -37.7145117,\r\n" + 
    			"                        \"lng\": 144.98904\r\n" + 
    			"                     },\r\n" + 
    			"                     \"html_instructions\": \"At the roundabout, take the <b>1st</b> exit onto <b>Banbury Rd</b>\",\r\n" + 
    			"                     \"maneuver\": \"roundabout-left\",\r\n" + 
    			"                     \"polyline\": {\r\n" + 
    			"                        \"points\": \"duceF}k}sZ@@@?@B@@FAP?TD@?^AN@H?rCXbDZtCXrE`@bCThE`@zALhALbBP`AH\"\r\n" + 
    			"                     },\r\n" + 
    			"                     \"start_location\": {\r\n" + 
    			"                        \"lat\": -37.7072315,\r\n" + 
    			"                        \"lng\": 144.9902251\r\n" + 
    			"                     },\r\n" + 
    			"                     \"travel_mode\": \"DRIVING\"\r\n" + 
    			"                  },\r\n" + 
    			"                  {\r\n" + 
    			"                     \"distance\": {\r\n" + 
    			"                        \"text\": \"0.4 km\",\r\n" + 
    			"                        \"value\": 364\r\n" + 
    			"                     },\r\n" + 
    			"                     \"duration\": {\r\n" + 
    			"                        \"text\": \"1 min\",\r\n" + 
    			"                        \"value\": 40\r\n" + 
    			"                     },\r\n" + 
    			"                     \"end_location\": {\r\n" + 
    			"                        \"lat\": -37.716358,\r\n" + 
    			"                        \"lng\": 144.9922749\r\n" + 
    			"                     },\r\n" + 
    			"                     \"html_instructions\": \"Turn <b>left</b> onto <b>Edwardes St</b>\",\r\n" + 
    			"                     \"maneuver\": \"turn-left\",\r\n" + 
    			"                     \"polyline\": {\r\n" + 
    			"                        \"points\": \"tbeeFod}sZHq@BKBQBKHW@CDKBCDKJOLSV]|@eAX[X_@XYh@m@TWV]Pa@BODO?EBIBUBWAC?C?ABe@\"\r\n" + 
    			"                     },\r\n" + 
    			"                     \"start_location\": {\r\n" + 
    			"                        \"lat\": -37.7145117,\r\n" + 
    			"                        \"lng\": 144.98904\r\n" + 
    			"                     },\r\n" + 
    			"                     \"travel_mode\": \"DRIVING\"\r\n" + 
    			"                  },\r\n" + 
    			"                  {\r\n" + 
    			"                     \"distance\": {\r\n" + 
    			"                        \"text\": \"0.3 km\",\r\n" + 
    			"                        \"value\": 253\r\n" + 
    			"                     },\r\n" + 
    			"                     \"duration\": {\r\n" + 
    			"                        \"text\": \"1 min\",\r\n" + 
    			"                        \"value\": 30\r\n" + 
    			"                     },\r\n" + 
    			"                     \"end_location\": {\r\n" + 
    			"                        \"lat\": -37.7183488,\r\n" + 
    			"                        \"lng\": 144.9933726\r\n" + 
    			"                     },\r\n" + 
    			"                     \"html_instructions\": \"At the roundabout, take the <b>2nd</b> exit onto <b>Gilbert Rd</b>\",\r\n" + 
    			"                     \"maneuver\": \"roundabout-left\",\r\n" + 
    			"                     \"polyline\": {\r\n" + 
    			"                        \"points\": \"fneeFux}sZ?AA??A?AA??A?A?A?A?A?A?A?A@??A?A@??A?A@??A@?@??A@?@?@?@?@?@@@??@HADAV@bCiAvCsA\\\\OVM\"\r\n" + 
    			"                     },\r\n" + 
    			"                     \"start_location\": {\r\n" + 
    			"                        \"lat\": -37.716358,\r\n" + 
    			"                        \"lng\": 144.9922749\r\n" + 
    			"                     },\r\n" + 
    			"                     \"travel_mode\": \"DRIVING\"\r\n" + 
    			"                  },\r\n" + 
    			"                  {\r\n" + 
    			"                     \"distance\": {\r\n" + 
    			"                        \"text\": \"0.7 km\",\r\n" + 
    			"                        \"value\": 727\r\n" + 
    			"                     },\r\n" + 
    			"                     \"duration\": {\r\n" + 
    			"                        \"text\": \"1 min\",\r\n" + 
    			"                        \"value\": 71\r\n" + 
    			"                     },\r\n" + 
    			"                     \"end_location\": {\r\n" + 
    			"                        \"lat\": -37.7177629,\r\n" + 
    			"                        \"lng\": 144.985601\r\n" + 
    			"                     },\r\n" + 
    			"                     \"html_instructions\": \"At the roundabout, take the <b>3rd</b> exit onto <b>Henty St</b>\",\r\n" + 
    			"                     \"maneuver\": \"roundabout-left\",\r\n" + 
    			"                     \"polyline\": {\r\n" + 
    			"                        \"points\": \"tzeeFq_~sZ?C@A@C@C@A@A@?@A@?B@@?@@?@@??@?@?D?@?@A@?@?@A@A@A@A@C@]lEq@tI_@jEQxBOpAQ|BEt@CXKbB?L?L?LDb@PhA^zB\"\r\n" + 
    			"                     },\r\n" + 
    			"                     \"start_location\": {\r\n" + 
    			"                        \"lat\": -37.7183488,\r\n" + 
    			"                        \"lng\": 144.9933726\r\n" + 
    			"                     },\r\n" + 
    			"                     \"travel_mode\": \"DRIVING\"\r\n" + 
    			"                  },\r\n" + 
    			"                  {\r\n" + 
    			"                     \"distance\": {\r\n" + 
    			"                        \"text\": \"0.4 km\",\r\n" + 
    			"                        \"value\": 395\r\n" + 
    			"                     },\r\n" + 
    			"                     \"duration\": {\r\n" + 
    			"                        \"text\": \"1 min\",\r\n" + 
    			"                        \"value\": 54\r\n" + 
    			"                     },\r\n" + 
    			"                     \"end_location\": {\r\n" + 
    			"                        \"lat\": -37.720501,\r\n" + 
    			"                        \"lng\": 144.9840327\r\n" + 
    			"                     },\r\n" + 
    			"                     \"html_instructions\": \"Turn <b>left</b> onto <b>Kurnai Ave</b><div style=\\\"font-size:0.9em\\\">Partial restricted usage road</div><div style=\\\"font-size:0.9em\\\">Destination will be on the left</div>\",\r\n" + 
    			"                     \"maneuver\": \"turn-left\",\r\n" + 
    			"                     \"polyline\": {\r\n" + 
    			"                        \"points\": \"~veeF_o|sZ~Fd@R@N?bAGVAT@\\\\HJDJDRHHHHFHJ\\\\x@Ln@@h@?LAPALARAD\"\r\n" + 
    			"                     },\r\n" + 
    			"                     \"start_location\": {\r\n" + 
    			"                        \"lat\": -37.7177629,\r\n" + 
    			"                        \"lng\": 144.985601\r\n" + 
    			"                     },\r\n" + 
    			"                     \"travel_mode\": \"DRIVING\"\r\n" + 
    			"                  }\r\n" + 
    			"               ],\r\n" + 
    			"               \"traffic_speed_entry\": [],\r\n" + 
    			"               \"via_waypoint\": []\r\n" + 
    			"            }\r\n" + 
    			"         ],\r\n" + 
    			"         \"overview_polyline\": {\r\n" + 
    			"            \"points\": \"liceF_e~sZd@EZGt@YvIcEWxHc@dKYfG@ZCh@FFXAVDn@?|CXpSlBdHn@lD^`AHHq@F]Ts@b@s@nB_CrB_CV]Pa@H_@J}@@o@AEAI@IDEFAFBHA\\\\?zG}Ct@]?CDIBCH?BB@HGNEBoAbPsAtOU`E?ZVlB^zB~Fd@b@@zAIr@JVJ\\\\RRR\\\\x@Ln@@v@C^CX\"\r\n" + 
    			"         },\r\n" + 
    			"         \"summary\": \"Banbury Rd\",\r\n" + 
    			"         \"warnings\": [],\r\n" + 
    			"         \"waypoint_order\": []\r\n" + 
    			"      }\r\n" + 
    			"   ],\r\n" + 
    			"   \"status\": \"OK\"\r\n" + 
    			"}";
    	JSONParser parser = new JSONParser();
    	JSONObject obj = (JSONObject) parser. parse(resp);
    	return obj;
    }
    
    @RequestMapping(value = "/getHomeMKroute")
    @ResponseBody
    public JSONObject getHomeMKroute() throws ParseException {
    	String resp = "{\r\n" + 
    			"   \"geocoded_waypoints\": [\r\n" + 
    			"      {\r\n" + 
    			"         \"geocoder_status\": \"OK\",\r\n" + 
    			"         \"place_id\": \"ChIJ_ek-HG5F1moRh3dyEwzj7L4\",\r\n" + 
    			"         \"types\": [\r\n" + 
    			"            \"premise\"\r\n" + 
    			"         ]\r\n" + 
    			"      },\r\n" + 
    			"      {\r\n" + 
    			"         \"geocoder_status\": \"OK\",\r\n" + 
    			"         \"place_id\": \"ChIJke7BORBF1moRQSRqZkx2qxo\",\r\n" + 
    			"         \"types\": [\r\n" + 
    			"            \"street_address\"\r\n" + 
    			"         ]\r\n" + 
    			"      }\r\n" + 
    			"   ],\r\n" + 
    			"   \"routes\": [\r\n" + 
    			"      {\r\n" + 
    			"         \"bounds\": {\r\n" + 
    			"            \"northeast\": {\r\n" + 
    			"               \"lat\": -37.7053456,\r\n" + 
    			"               \"lng\": 144.9954238\r\n" + 
    			"            },\r\n" + 
    			"            \"southwest\": {\r\n" + 
    			"               \"lat\": -37.7181686,\r\n" + 
    			"               \"lng\": 144.98904\r\n" + 
    			"            }\r\n" + 
    			"         },\r\n" + 
    			"         \"copyrights\": \"Map data ©2020\",\r\n" + 
    			"         \"legs\": [\r\n" + 
    			"            {\r\n" + 
    			"               \"distance\": {\r\n" + 
    			"                  \"text\": \"2.2 km\",\r\n" + 
    			"                  \"value\": 2153\r\n" + 
    			"               },\r\n" + 
    			"               \"duration\": {\r\n" + 
    			"                  \"text\": \"4 mins\",\r\n" + 
    			"                  \"value\": 216\r\n" + 
    			"               },\r\n" + 
    			"               \"end_address\": \"771-775 Gilbert Rd, Reservoir VIC 3073, Australia\",\r\n" + 
    			"               \"end_location\": {\r\n" + 
    			"                  \"lat\": -37.7181686,\r\n" + 
    			"                  \"lng\": 144.9932714\r\n" + 
    			"               },\r\n" + 
    			"               \"start_address\": \"33 Wilson Blvd, Reservoir VIC 3073, Australia\",\r\n" + 
    			"               \"start_location\": {\r\n" + 
    			"                  \"lat\": -37.7053456,\r\n" + 
    			"                  \"lng\": 144.9942392\r\n" + 
    			"               },\r\n" + 
    			"               \"steps\": [\r\n" + 
    			"                  {\r\n" + 
    			"                     \"distance\": {\r\n" + 
    			"                        \"text\": \"0.3 km\",\r\n" + 
    			"                        \"value\": 280\r\n" + 
    			"                     },\r\n" + 
    			"                     \"duration\": {\r\n" + 
    			"                        \"text\": \"1 min\",\r\n" + 
    			"                        \"value\": 30\r\n" + 
    			"                     },\r\n" + 
    			"                     \"end_location\": {\r\n" + 
    			"                        \"lat\": -37.7076733,\r\n" + 
    			"                        \"lng\": 144.9954238\r\n" + 
    			"                     },\r\n" + 
    			"                     \"html_instructions\": \"Head <b>south</b> on <b>Wilson Blvd</b> toward <b>Elliot St</b>\",\r\n" + 
    			"                     \"polyline\": {\r\n" + 
    			"                        \"points\": \"liceF_e~sZLAVCLALERG`@Q`CiAtEyB\"\r\n" + 
    			"                     },\r\n" + 
    			"                     \"start_location\": {\r\n" + 
    			"                        \"lat\": -37.7053456,\r\n" + 
    			"                        \"lng\": 144.9942392\r\n" + 
    			"                     },\r\n" + 
    			"                     \"travel_mode\": \"DRIVING\"\r\n" + 
    			"                  },\r\n" + 
    			"                  {\r\n" + 
    			"                     \"distance\": {\r\n" + 
    			"                        \"text\": \"0.5 km\",\r\n" + 
    			"                        \"value\": 460\r\n" + 
    			"                     },\r\n" + 
    			"                     \"duration\": {\r\n" + 
    			"                        \"text\": \"1 min\",\r\n" + 
    			"                        \"value\": 44\r\n" + 
    			"                     },\r\n" + 
    			"                     \"end_location\": {\r\n" + 
    			"                        \"lat\": -37.7072315,\r\n" + 
    			"                        \"lng\": 144.9902251\r\n" + 
    			"                     },\r\n" + 
    			"                     \"html_instructions\": \"Turn <b>right</b> onto <b>Broadhurst Ave</b>\",\r\n" + 
    			"                     \"maneuver\": \"turn-right\",\r\n" + 
    			"                     \"polyline\": {\r\n" + 
    			"                        \"points\": \"|wceFkl~sZExAMtDC^?HAL?FAF_@fJYfG@ZA^AH\"\r\n" + 
    			"                     },\r\n" + 
    			"                     \"start_location\": {\r\n" + 
    			"                        \"lat\": -37.7076733,\r\n" + 
    			"                        \"lng\": 144.9954238\r\n" + 
    			"                     },\r\n" + 
    			"                     \"travel_mode\": \"DRIVING\"\r\n" + 
    			"                  },\r\n" + 
    			"                  {\r\n" + 
    			"                     \"distance\": {\r\n" + 
    			"                        \"text\": \"0.8 km\",\r\n" + 
    			"                        \"value\": 818\r\n" + 
    			"                     },\r\n" + 
    			"                     \"duration\": {\r\n" + 
    			"                        \"text\": \"1 min\",\r\n" + 
    			"                        \"value\": 75\r\n" + 
    			"                     },\r\n" + 
    			"                     \"end_location\": {\r\n" + 
    			"                        \"lat\": -37.7145117,\r\n" + 
    			"                        \"lng\": 144.98904\r\n" + 
    			"                     },\r\n" + 
    			"                     \"html_instructions\": \"At the roundabout, take the <b>1st</b> exit onto <b>Banbury Rd</b>\",\r\n" + 
    			"                     \"maneuver\": \"roundabout-left\",\r\n" + 
    			"                     \"polyline\": {\r\n" + 
    			"                        \"points\": \"duceF}k}sZ@@@?@B@@FAP?TD@?^AN@H?rCXbDZtCXrE`@bCThE`@zALhALbBP`AH\"\r\n" + 
    			"                     },\r\n" + 
    			"                     \"start_location\": {\r\n" + 
    			"                        \"lat\": -37.7072315,\r\n" + 
    			"                        \"lng\": 144.9902251\r\n" + 
    			"                     },\r\n" + 
    			"                     \"travel_mode\": \"DRIVING\"\r\n" + 
    			"                  },\r\n" + 
    			"                  {\r\n" + 
    			"                     \"distance\": {\r\n" + 
    			"                        \"text\": \"0.4 km\",\r\n" + 
    			"                        \"value\": 364\r\n" + 
    			"                     },\r\n" + 
    			"                     \"duration\": {\r\n" + 
    			"                        \"text\": \"1 min\",\r\n" + 
    			"                        \"value\": 40\r\n" + 
    			"                     },\r\n" + 
    			"                     \"end_location\": {\r\n" + 
    			"                        \"lat\": -37.716358,\r\n" + 
    			"                        \"lng\": 144.9922749\r\n" + 
    			"                     },\r\n" + 
    			"                     \"html_instructions\": \"Turn <b>left</b> onto <b>Edwardes St</b>\",\r\n" + 
    			"                     \"maneuver\": \"turn-left\",\r\n" + 
    			"                     \"polyline\": {\r\n" + 
    			"                        \"points\": \"tbeeFod}sZHq@BKBQBKHW@CDKBCDKJOLSV]|@eAX[X_@XYh@m@TWV]Pa@BODO?EBIBUBWAC?C?ABe@\"\r\n" + 
    			"                     },\r\n" + 
    			"                     \"start_location\": {\r\n" + 
    			"                        \"lat\": -37.7145117,\r\n" + 
    			"                        \"lng\": 144.98904\r\n" + 
    			"                     },\r\n" + 
    			"                     \"travel_mode\": \"DRIVING\"\r\n" + 
    			"                  },\r\n" + 
    			"                  {\r\n" + 
    			"                     \"distance\": {\r\n" + 
    			"                        \"text\": \"0.2 km\",\r\n" + 
    			"                        \"value\": 231\r\n" + 
    			"                     },\r\n" + 
    			"                     \"duration\": {\r\n" + 
    			"                        \"text\": \"1 min\",\r\n" + 
    			"                        \"value\": 27\r\n" + 
    			"                     },\r\n" + 
    			"                     \"end_location\": {\r\n" + 
    			"                        \"lat\": -37.7181686,\r\n" + 
    			"                        \"lng\": 144.9932714\r\n" + 
    			"                     },\r\n" + 
    			"                     \"html_instructions\": \"At the roundabout, take the <b>2nd</b> exit onto <b>Gilbert Rd</b><div style=\\\"font-size:0.9em\\\">Destination will be on the right</div>\",\r\n" + 
    			"                     \"maneuver\": \"roundabout-left\",\r\n" + 
    			"                     \"polyline\": {\r\n" + 
    			"                        \"points\": \"fneeFux}sZ?AA??A?AA??A?A?A?A?A?A?A?A@??A?A@??A?A@??A@?@??A@?@?@?@?@?@@@??@HADAV@bCiAvCsAPI\"\r\n" + 
    			"                     },\r\n" + 
    			"                     \"start_location\": {\r\n" + 
    			"                        \"lat\": -37.716358,\r\n" + 
    			"                        \"lng\": 144.9922749\r\n" + 
    			"                     },\r\n" + 
    			"                     \"travel_mode\": \"DRIVING\"\r\n" + 
    			"                  }\r\n" + 
    			"               ],\r\n" + 
    			"               \"traffic_speed_entry\": [],\r\n" + 
    			"               \"via_waypoint\": []\r\n" + 
    			"            }\r\n" + 
    			"         ],\r\n" + 
    			"         \"overview_polyline\": {\r\n" + 
    			"            \"points\": \"liceF_e~sZd@EZGt@YvIcEWxHc@dKYfG@ZCh@FFXAVDn@?|CXpSlBdHn@lD^`AHHq@F]Ts@b@s@nB_CrB_CV]Pa@H_@J}@@o@AEAI@IDEFAFBHA\\\\?zG}CPI\"\r\n" + 
    			"         },\r\n" + 
    			"         \"summary\": \"Banbury Rd\",\r\n" + 
    			"         \"warnings\": [],\r\n" + 
    			"         \"waypoint_order\": []\r\n" + 
    			"      }\r\n" + 
    			"   ],\r\n" + 
    			"   \"status\": \"OK\"\r\n" + 
    			"}";
    	JSONParser parser = new JSONParser();
    	JSONObject obj = (JSONObject) parser. parse(resp);
    	return obj;
    }
}