package com.davivienda.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.util.Map;

public class Utilidades {
    private Utilidades() {
    }

    public static <T> T setearDatos(Map<String, String> datos, Class<T> clase) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(datos);
        return objectMapper.readValue(json, clase);
    }

    public static String generarCodigoAleatorio() {
        int codigo = (int) (Math.random() * 9000) + 1000;
        return String.valueOf(codigo);
    }

    public static void esperarVisibilidad() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
