package com.xtone.cloud.proivder.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.xtone.cloud.consumer.Jinfo;

@Service
public class ProService {

	@Autowired
	RestTemplate restTemplate;
	
	public String hiService(String name) {
		Jinfo s = restTemplate.getForObject("http://COMPUTE-SERVICE/say1?info="+name,Jinfo.class);
		System.out.println(s.getS());
        return restTemplate.getForObject("http://COMPUTE-SERVICE/say?info="+name,String.class)+"|||"+s.getS();
    }
}
