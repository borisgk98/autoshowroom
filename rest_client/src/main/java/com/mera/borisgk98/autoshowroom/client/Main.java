package com.mera.borisgk98.autoshowroom.client;

import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;

public class Main {
    public static void main(String[] args) {
        DefaultApi api = new DefaultApi();
        try {
            System.out.println(api.automodelAutomodelIdGet(1));
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
