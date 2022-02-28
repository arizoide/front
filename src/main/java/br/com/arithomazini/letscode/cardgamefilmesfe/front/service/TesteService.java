package br.com.arithomazini.letscode.cardgamefilmesfe.front.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TesteService {

    @Autowired
    private RestTemplate client;
}
