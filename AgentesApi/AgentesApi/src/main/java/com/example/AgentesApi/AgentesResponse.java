package com.example.AgentesApi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AgentesResponse(
        List<Agent> agents
) {}

@JsonIgnoreProperties(ignoreUnknown = true)
record Agent(
        List<RelatedContent> related_content,
        String id,
        Url url,
        String title,
        String description,
        String role,
        RoleIcon role_icon,
        AgentImage agent_image,
        Object agent_background
) {}




@JsonIgnoreProperties(ignoreUnknown = true)
record AgentImage(
        String url
) {}


@JsonIgnoreProperties(ignoreUnknown = true)
record RelatedContent(
        String machine_name,
        String title,
        Url url,
        String description,
        DateTime created_at,
        String id
) {}

@JsonIgnoreProperties(ignoreUnknown = true)
record RoleIcon(
        String url
) {}

@JsonIgnoreProperties(ignoreUnknown = true)
record Url(
        String url
) {}

