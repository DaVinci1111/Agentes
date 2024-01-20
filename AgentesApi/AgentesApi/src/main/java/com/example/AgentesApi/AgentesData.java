package com.example.AgentesApi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AgentesData(
        @JsonProperty("related_content") List<RelatedContent> related_content,
        @JsonProperty("id") String id,
        @JsonProperty("url") Url url,
        @JsonProperty("title") String title,
        @JsonProperty("description") String description,
        @JsonProperty("role") String role,
        @JsonProperty("role_icon") RoleIcon role_icon,
        @JsonProperty("agent_image") AgentImage agent_image,
        @JsonProperty("agent_background") Object agent_background
) {}


@JsonIgnoreProperties(ignoreUnknown = true)
record AgentImageData(
        @JsonProperty("url") String url
) {}

@JsonIgnoreProperties(ignoreUnknown = true)
record FileData(
        @JsonProperty("url") String url
) {}

@JsonIgnoreProperties(ignoreUnknown = true)
record RelatedContentData(
        @JsonProperty("machine_name") String machine_name,
        @JsonProperty("title") String title,
        @JsonProperty("url") Url url,
        @JsonProperty("description") String description,
        @JsonProperty("created_at") DateTime created_at,
        @JsonProperty("id") String id
) {}

@JsonIgnoreProperties(ignoreUnknown = true)
record RoleIconData(
        @JsonProperty("url") String url
) {}

@JsonIgnoreProperties(ignoreUnknown = true)
record StaticImageData(
        @JsonProperty("url") String url
) {}

@JsonIgnoreProperties(ignoreUnknown = true)
record UrlData(
        @JsonProperty("url") String url
) {}

