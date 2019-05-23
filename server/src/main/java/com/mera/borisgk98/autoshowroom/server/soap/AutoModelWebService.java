package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.models.AutoModel;

import javax.jws.WebService;

@WebService
public interface AutoModelWebService {
    AutoModel read(Integer id);
}
