package com.example.AgentesApi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AgentesController {

    private final AgentesService agentesService;

    public AgentesController(AgentesService agentesService) {
        this.agentesService = agentesService;
    }

    @GetMapping("/agentes")
    public String getTeams(Model model) {
        AgentesResponse agentesResponse = agentesService.getAgentes();
        model.addAttribute("agentes", agentesResponse);
        return "agentes";
    }
}
