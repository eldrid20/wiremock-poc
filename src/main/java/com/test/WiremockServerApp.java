package com.test;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;

public class WiremockServerApp {
    public static void main(String[] args) {
        WireMockServer server = new WireMockServer(
                WireMockConfiguration.options()
                        .port(8080)
                        .usingFilesUnderDirectory("src/main/resources")
        );

        server.start();

        System.out.println("✅ WireMock is running at http://localhost:8080");
    }
}
