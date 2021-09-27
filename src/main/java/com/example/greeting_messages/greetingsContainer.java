package com.example.greeting_messages;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.greeting_messages.container.greetMessages;
import com.example.greeting_messages.container.userInfo;

@RestController
public class greetingsContainer {
	
	greetMessages greet;
	
	
	@GetMapping(value = "/greet", produces = "application/json")
	public greetMessages hello() {
		greet = new greetMessages("Hi GoodAfterNoon");
		return greet ;
	}

}
