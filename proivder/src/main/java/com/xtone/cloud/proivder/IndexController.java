package com.xtone.cloud.proivder;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xtone.cloud.proivder.services.ProService;

@RestController
public class IndexController {

	@Resource
	private ProService s;
	
	@RequestMapping("say")
	public String say() {
		return s.hiService("3r3");
	}
}
