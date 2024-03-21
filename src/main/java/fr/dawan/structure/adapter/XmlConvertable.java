package fr.dawan.structure.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

public interface XmlConvertable<T> {
    String toXml(T obj) throws JsonProcessingException;
    T fromXml(String xml, Class<T> clazz) throws IOException;
}
