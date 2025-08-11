package com.epam.forecast.ai.sunTracker.model;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public record SunriseSunsetForecast(
        String city,
        LocalDateTime sunrise,
        LocalDateTime sunset,
        String enhancedMessage
) {
}
