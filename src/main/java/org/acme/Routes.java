package org.acme;

import org.apache.camel.builder.RouteBuilder;

public class Routes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from(String.format("lumberjack:0.0.0.0:5044"))
                .log("message received ${body}");
    }
}
