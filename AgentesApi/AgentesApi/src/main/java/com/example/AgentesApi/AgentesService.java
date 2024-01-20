package com.example.AgentesApi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AgentesService {

    private final String AGENTES_API_URL = "https://valorant-agents-maps-arsenal.p.rapidapi.com/agents/en-us";
    private final RestTemplate restTemplate;

    public AgentesService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public AgentesResponse getAgentes() {
        return restTemplate.getForObject(AGENTES_API_URL, AgentesResponse.class);
    }
}

