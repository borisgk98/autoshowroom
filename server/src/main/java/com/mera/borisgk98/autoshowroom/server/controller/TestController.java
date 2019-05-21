package com.mera.borisgk98.autoshowroom.server.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mera.borisgk98.autoshowroom.server.models.AutoMark;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    ObjectMapper om;

    @RequestMapping()
    public ResponseEntity test() {
        try {
            AutoMark mark = om.readValue("{\n" +
                    "  \"autos\": [\n" +
                    "    {\n" +
                    "      \"id\": 0,\n" +
                    "      \"model\": {\n" +
                    "        \"autos\": [\n" +
                    "          null\n" +
                    "        ],\n" +
                    "        \"id\": 0,\n" +
                    "        \"name\": \"string\"\n" +
                    "      },\n" +
                    "      \"options\": [\n" +
                    "        {\n" +
                    "          \"autos\": [\n" +
                    "            null\n" +
                    "          ],\n" +
                    "          \"id\": 0,\n" +
                    "          \"name\": \"string\"\n" +
                    "        }\n" +
                    "      ]\n" +
                    "    }\n" +
                    "  ],\n" +
                    "  \"id\": 0,\n" +
                    "  \"name\": \"string\"\n" +
                    "}", AutoMark.class);
            System.out.println(mark);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return ResponseEntity.status(200).body("ok");
    }
}
