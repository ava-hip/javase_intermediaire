package fr.dawan.structure.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class XmlToJsonAdapter<T> implements Target {
    private XmlConvertable xmlConverter;
    private Class<T> clazz;

    public XmlToJsonAdapter(XmlConvertable xmlConverter, Class<T> clazz) {
        this.xmlConverter = xmlConverter;
        this.clazz = clazz;
    }

    @Override
    public String toJson(String xml) throws IOException {
        Object obj = xmlConverter.fromXml(xml, clazz);
        ObjectMapper jsonMapper = new ObjectMapper();
        String json = jsonMapper.writeValueAsString(xml);
        return json;
    }
}
