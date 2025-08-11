package com.epam.forecast.ai.sunTracker.controller;


import com.epam.forecast.ai.sunTracker.model.SunriseSunsetForecast;
import com.epam.forecast.ai.sunTracker.service.AIAssistant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SunForecastController {
    private final AIAssistant forecastAIAssistant;

    public SunForecastController(AIAssistant forecastAIAssistant) {
        this.forecastAIAssistant = forecastAIAssistant;
    }

    @GetMapping("/sun-forecast")
    public ResponseEntity<SunriseSunsetForecast> getTodaySunriseSunset(@RequestParam(name = "city") String city) {
        return new ResponseEntity<>(forecastAIAssistant.askSunForecast(city), HttpStatus.OK);
    }
}
