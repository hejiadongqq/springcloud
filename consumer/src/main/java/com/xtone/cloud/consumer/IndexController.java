package com.xtone.cloud.consumer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@RequestMapping("say")
	public String say(String info) {
		System.out.println("fffffffffffffff--->"+info);
		return "say:--->"+info;
	}
	
	@RequestMapping("say1")
	public Jinfo say1(String info) {
		Jinfo s = new Jinfo();
		s.setS(info);
		return s;
	}
	
	@RequestMapping("info")
	public String info(String info) {
		System.out.println("fffffffffffffff--->"+info);
		return "say:--->"+info;
	}
}
