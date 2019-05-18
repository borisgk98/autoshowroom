package com.mera.borisgk98.autoshowroom.client;

import com.mera.borisgk98.autoshowroom.client.models.Auto;
import com.mera.borisgk98.autoshowroom.client.models.AutoMark;
import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;

public class Test {
    public static void main(String[] args) {
        DefaultApi defaultApi = new DefaultApi();
        Auto autoPost = defaultApi.autoPost(Auto.builder()
                .mark(AutoMark.builder().name("bmw").build())
                .build()).block();
        Auto auto = defaultApi.autoAutoIdGet(autoPost.getId()).block();
        System.out.println(auto.getModel().getName());
    }
}
