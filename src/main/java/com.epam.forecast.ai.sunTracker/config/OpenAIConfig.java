package com.epam.forecast.ai.sunTracker.config;

import dev.langchain4j.model.azure.AzureOpenAiChatModel;
import dev.langchain4j.model.chat.ChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAIConfig {



    @Bean
    public ChatModel chatModel() {
        return AzureOpenAiChatModel.builder()
                .apiKey("key")
                .endpoint("endpoint")
                .deploymentName("deploymentName")
                .build();
    }
}