package com.moeller.integration.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by Moeller.Bernd on 16.07.2016.
 */

@Component
public class MyRoute extends RouteBuilder {

  @Override
  public void configure() throws Exception {
    from("mqtt:temprecv?host=tcp://192.168.33.10:1883&subscribeTopicName=temperature/+")
        .to("log:com.moeller.integration.camel")
        .to("mqtt:tempsend?host=tcp://192.168.33.10:1883");
  }

}


