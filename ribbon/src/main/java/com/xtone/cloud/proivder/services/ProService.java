package com.xtone.cloud.proivder.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xtone.cloud.consumer.Jinfo;

@Service
public class ProService {

	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "hiError")
	public String hiService(String name) {
		Jinfo s = restTemplate.getForObject("http://COMPUTE-SERVICE/say1?info="+name,Jinfo.class);
		System.out.println(s.getS());
        return restTemplate.getForObject("http://COMPUTE-SERVICE/say?info="+name,String.class)+"|||"+s.getS();
    }
	
	public String hiError(String name) {
		return "error";
	}
	
}
