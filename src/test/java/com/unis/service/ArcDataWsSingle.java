
package com.unis.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ArcDataWsSingle", targetNamespace = "http://service.unis.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ArcDataWsSingle {


    /**
     * 
     * @param dataXml
     * @param xmlName
     * @param gdrCode
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "fileReciveXml", targetNamespace = "http://service.unis.com/", className = "com.unis.service.FileReciveXml")
    @ResponseWrapper(localName = "fileReciveXmlResponse", targetNamespace = "http://service.unis.com/", className = "com.unis.service.FileReciveXmlResponse")
    public Integer fileReciveXml(
        @WebParam(name = "xmlName", targetNamespace = "")
        String xmlName,
        @WebParam(name = "dataXml", targetNamespace = "")
        String dataXml,
        @WebParam(name = "gdrCode", targetNamespace = "")
        String gdrCode);

    /**
     * 
     * @param xmlName
     * @param gdrCode
     * @param dataJson
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "fileReciveJson", targetNamespace = "http://service.unis.com/", className = "com.unis.service.FileReciveJson")
    @ResponseWrapper(localName = "fileReciveJsonResponse", targetNamespace = "http://service.unis.com/", className = "com.unis.service.FileReciveJsonResponse")
    public Integer fileReciveJson(
        @WebParam(name = "xmlName", targetNamespace = "")
        String xmlName,
        @WebParam(name = "dataJson", targetNamespace = "")
        String dataJson,
        @WebParam(name = "gdrCode", targetNamespace = "")
        String gdrCode);

    /**
     * 
     * @param xmlName
     * @param gdrCode
     * @param dataTxt
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "fileReciveTxt", targetNamespace = "http://service.unis.com/", className = "com.unis.service.FileReciveTxt")
    @ResponseWrapper(localName = "fileReciveTxtResponse", targetNamespace = "http://service.unis.com/", className = "com.unis.service.FileReciveTxtResponse")
    public Integer fileReciveTxt(
        @WebParam(name = "xmlName", targetNamespace = "")
        String xmlName,
        @WebParam(name = "dataTxt", targetNamespace = "")
        String dataTxt,
        @WebParam(name = "gdrCode", targetNamespace = "")
        String gdrCode);

}
