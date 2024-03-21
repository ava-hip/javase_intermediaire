package fr.dawan.structure.adapter;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

public class XmlConvertableImpl<T> implements XmlConvertable<T>{

    @Override
    public String toXml(Object obj) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.writeValueAsString(obj);
    }

    @Override
    public Object fromXml(String xml, Class clazz) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(xml.getBytes(), clazz);
    }
}
