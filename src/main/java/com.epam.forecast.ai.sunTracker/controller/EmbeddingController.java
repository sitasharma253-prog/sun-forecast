package com.epam.forecast.ai.sunTracker.controller;

import dev.langchain4j.data.embedding.Embedding;
import dev.langchain4j.model.azure.AzureOpenAiEmbeddingModel;
import dev.langchain4j.model.output.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/embeddings")
public class EmbeddingController {

    private AzureOpenAiEmbeddingModel embeddingModel;
    public EmbeddingController(AzureOpenAiEmbeddingModel embeddingModel) {
        this.embeddingModel = embeddingModel;
    }

    @PostMapping
    public ResponseEntity<?> getEmbeddingDetails(@RequestParam(name = "input") String input) {

        Response<Embedding> response = embeddingModel.embed(input);
        return new ResponseEntity<>(response.content().vector(),
                HttpStatus.OK);
    }
}