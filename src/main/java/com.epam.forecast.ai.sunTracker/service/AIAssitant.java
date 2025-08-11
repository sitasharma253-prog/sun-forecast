package com.epam.forecast.ai.sunTracker.service;

import com.epam.forecast.ai.sunTracker.model.SunriseSunsetForecast;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface AIAssistant {
    @SystemMessage("You are a helpful assistant that gives sunrise/sunset info in a friendly way. Strictly show sunrise and sunset time in IST timezone")
    SunriseSunsetForecast askSunForecast(String city);
}
