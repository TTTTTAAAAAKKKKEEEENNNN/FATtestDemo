package com.fattestdemo.svcA.controllers;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fattestdemo.svcA.model.ResObj;
import com.facade.callfromsvcA2svcB.callfromA2B;

@Controller
@RequestMapping("/userinfo/")
public class GetUserinfoController {

	@Reference
	private callfromA2B svcB;
	
	@RequestMapping("/{name}")
	@ResponseBody
	public ResObj getUserinfo(@PathVariable("name") String name)
	{
		ResObj resobj = new ResObj();
		resobj.setInfo(svcB.getNamefromSvcB(name));
		return resobj;
	}
}
