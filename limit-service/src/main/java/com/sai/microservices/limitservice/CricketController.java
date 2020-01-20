package com.sai.microservices.limitservice;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.sai.microservices.bean.Cricket;
import com.sai.microservices.bean.ScoreInfo;

@Controller
public class CricketController {

	private RestTemplate restTemplate;
    private String matchId = "1187028";
    private String apikey = "2HfgiCA51SdxPtwJdmXqHrg1dGt1";
    
	@GetMapping("/score")
	public Cricket getScore() throws JsonParseException, JsonMappingException, IOException {
		restTemplate = new RestTemplate();
		//String url = "https://cricapi.com/api/fantasySummary?apikey=2HfgiCA51SdxPtwJdmXqHrg1dGt1&unique_id=1187028";
		Cricket forObject = restTemplate.getForObject(generateUrl("fantasySummary"), Cricket.class);
		
//		File file = new File("D:\\workspace\\practice\\microservices\\limit-service\\src\\main\\resources\\data.json");
//		ObjectMapper objectMapper = new ObjectMapper();
//		Cricket forObject = objectMapper.readValue(file, Cricket.class);
		
		return forObject;
	}
	
    @RequestMapping("/")
    public String home(Map<String, Object> model) throws JsonParseException, JsonMappingException, IOException {
		restTemplate = new RestTemplate();
		//String url = "https://cricapi.com/api/fantasySummary?apikey=2HfgiCA51SdxPtwJdmXqHrg1dGt1&unique_id=1187028";
		Cricket forObject = restTemplate.getForObject(generateUrl("fantasySummary"), Cricket.class);
		//System.out.println("Score "+forObject);
		//String furl = "D:\\\\workspace\\\\practice\\\\microservices\\\\limit-service\\\\src\\\\main\\\\resources\\\\data.json";
		//File file = new File(furl);
		//ObjectMapper objectMapper = new ObjectMapper();
		//objectMapper.writeValue(file, forObject);
		//Cricket forObject = objectMapper.readValue(file, Cricket.class);
        model.put("score_info", forObject);
        model.put("score", getScoreInfo());
        return "index";
    }
    
    private ScoreInfo getScoreInfo() {
		restTemplate = new RestTemplate();
		//String url = "https://cricapi.com/api/cricketScore?apikey=2HfgiCA51SdxPtwJdmXqHrg1dGt1&unique_id=1187028";
		return restTemplate.getForObject(generateUrl("cricketScore"), ScoreInfo.class);
    }
    
    private String generateUrl(String type) {
    	return String.format("https://cricapi.com/api/%s?apikey=%s&unique_id=%s", type, apikey, matchId);
    }
    
}
