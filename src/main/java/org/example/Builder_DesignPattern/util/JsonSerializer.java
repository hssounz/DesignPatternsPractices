package org.example.Builder_DesignPattern.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerializer<T> {
    public String toJson(T dataObject) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(dataObject);
    }
}
