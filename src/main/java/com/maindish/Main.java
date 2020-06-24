package com.maindish;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.maindish.entity.DefaultResponse;
import com.maindish.entity.Error;
import com.maindish.entity.JoinResult;
import com.maindish.entity.Result;

public class Main {
    public static void main(String[] args) {
        try {
            Error error = new Error(new Exception("test exception messages..."));
            JoinResult data = new JoinResult("c4e1d0aef7bbfb7f");

            // using builder
            /*DefaultResponse defaultResponse = DefaultResponse.builder()
                    .result(Result.INTERNAL_SERVER_ERROR)
                    .error(error)
                    .data(data)
                    .build();*/

            // using new access
            DefaultResponse defaultResponse = new DefaultResponse(Result.SUCCESS, error, new JoinResult("c4e1d0aef7bbfb7f"));

            ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

            String convertedJsonString = objectMapper.writeValueAsString(defaultResponse);

            System.out.println(convertedJsonString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}