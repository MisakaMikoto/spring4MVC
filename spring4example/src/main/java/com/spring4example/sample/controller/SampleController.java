package com.spring4example.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring4example.sample.service.SampleService;

import io.swagger.annotations.Api;

@RestController
@Api(value = "SampleController", description ="SampleController")
@RequestMapping("/sampleController")
public class SampleController {
	
	@Autowired
    public SampleService sampleService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView load() {
		return new ModelAndView("sample/index");
	}
	
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public @ResponseBody List list(@RequestParam("name") String name) {
    	return sampleService.list(name);
    }
}
