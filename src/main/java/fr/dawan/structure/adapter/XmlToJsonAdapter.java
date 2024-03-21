package fr.dawan.structure.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class XmlToJsonAdapter<T> implements Target<T> {
    private XmlConvertable<T> xmlConverter;

    public XmlToJsonAdapter(XmlConvertable<T> xmlConverter) {
        this.xmlConverter = xmlConverter;
    }

    @Override
    public String toJson(T obj) throws JsonProcessingException {
        ObjectMapper jsonMapper = new ObjectMapper();
        // tring xml = xmlConverter.toXml(obj);
        String json = jsonMapper.writeValueAsString(obj);
        return json;
    }
}
