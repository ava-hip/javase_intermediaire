package fr.dawan.structure.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

public interface Target {
    String toJson(String xml) throws IOException;
}
