package br.com.arithomazini.letscode.cardgamefilmesfe.front.controller;

import br.com.arithomazini.letscode.cardgamefilmesfe.front.model.TesteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/teste")
public class TesteController {

    @Autowired
    RestTemplate template;

    @GetMapping
    public void teste(){
        ResponseEntity<String> exchange = template.exchange("http://filmesbe/movies", HttpMethod.GET, null, String.class);

        System.out.println(exchange.getBody().toString());
    }
}
