package fr.dawan.structure.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface Target<T> {
    String toJson(T obj) throws JsonProcessingException;
}
