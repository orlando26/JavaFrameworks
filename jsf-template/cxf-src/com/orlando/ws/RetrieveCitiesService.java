package com.orlando.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-10-06T10:33:05.777-05:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "http://ws.orlando.com/", name = "RetrieveCitiesService")
@XmlSeeAlso({ObjectFactory.class})
public interface RetrieveCitiesService {

    @WebMethod
    @RequestWrapper(localName = "findAllByState", targetNamespace = "http://ws.orlando.com/", className = "com.orlando.ws.FindAllByState")
    @ResponseWrapper(localName = "findAllByStateResponse", targetNamespace = "http://ws.orlando.com/", className = "com.orlando.ws.FindAllByStateResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.orlando.ws.City> findAllByState(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );
}
