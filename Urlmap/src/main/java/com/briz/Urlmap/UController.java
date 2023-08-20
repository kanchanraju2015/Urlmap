package com.briz.Urlmap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UController
{
@RequestMapping("/test")
	public String test()
	{
		return "this is test";
	}
	
@RequestMapping("/path/{name:[a-z]+}")  //http://localhost:8080/path/weehousr
	public String test1(@PathVariable("name") String name) 
	{
		// only small letter single word no space and no digits no symbols/signs 
		return "name is "+name;
	}
	*/
	@RequestMapping("/path/data/{name:[a-z]{4}}") // only four small letter
	public String hi(@PathVariable String name)  // no caps /symbols 
	{
		return "name is "+name;
	}
	
	@RequestMapping("/data/{name}")
	public String getdata(@PathVariable String name)
	{
		// TAKES ALL INT/SMALL/CAPS/SYMBOLS EVERYTHING MULTIWORD IMPORTANT 
		return "name is "+name;
	}
	
	@RequestMapping("path/data/show/{name:[a-z][0-9]+}")
	public String hallo(@PathVariable String name)
	{
		return "name is "+name;
	}
}
