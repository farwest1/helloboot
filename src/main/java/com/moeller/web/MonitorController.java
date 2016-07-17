package com.moeller.web;

import com.moeller.business.domain.Greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Moeller.Bernd on 22.05.2016.
 */
@RestController
@RequestMapping(path = "/monitor")
public class MonitorController {

  @Autowired
  private ApplicationContext applicationContext;

  @RequestMapping(method = RequestMethod.GET)
  public String monitor(){
    return "Monitor";
  }

  @RequestMapping(path = "/echo")
  public String echo(@RequestParam(value = "echo", defaultValue = "Echo",required = false) String tobeechoed){
    return "Echo: " + tobeechoed;
  }

  @RequestMapping(path = "greeting", method = RequestMethod.GET)
  public Greeting greeting(){
    return new Greeting(1,"Hallihallo");
  }

}
