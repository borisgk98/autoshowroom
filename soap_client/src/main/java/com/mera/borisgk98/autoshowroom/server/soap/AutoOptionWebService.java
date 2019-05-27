package com.mera.borisgk98.autoshowroom.server.soap;

import javax.annotation.Generated;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.1
 * 2019-05-24T02:14:59.670+03:00
 * Generated source version: 3.3.1
 *
 */
@WebService(targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "AutoOptionWebService")
@XmlSeeAlso({ObjectFactory.class})
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:14:59.670+03:00", comments = "Apache CXF 3.3.1")
public interface AutoOptionWebService {

    @WebMethod
    @RequestWrapper(localName = "createAutoOption", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.CreateAutoOption")
    @ResponseWrapper(localName = "createAutoOptionResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.CreateAutoOptionResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:14:59.670+03:00")
    public com.mera.borisgk98.autoshowroom.server.soap.AutoOption createAutoOption(
        @WebParam(name = "arg0", targetNamespace = "")
        com.mera.borisgk98.autoshowroom.server.soap.AutoOption arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getAllAutoOption", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.GetAllAutoOption")
    @ResponseWrapper(localName = "getAllAutoOptionResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.GetAllAutoOptionResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:14:59.670+03:00")
    public java.util.List<com.mera.borisgk98.autoshowroom.server.soap.AutoOption> getAllAutoOption();

    @WebMethod
    @RequestWrapper(localName = "deleteAutoOption", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.DeleteAutoOption")
    @ResponseWrapper(localName = "deleteAutoOptionResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.DeleteAutoOptionResponse")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:14:59.670+03:00")
    public void deleteAutoOption(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Integer arg0
    ) throws ModelNotFound_Exception;

    @WebMethod
    @RequestWrapper(localName = "getRangeAutoOption", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.GetRangeAutoOption")
    @ResponseWrapper(localName = "getRangeAutoOptionResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.GetRangeAutoOptionResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:14:59.670+03:00")
    public java.util.List<com.mera.borisgk98.autoshowroom.server.soap.AutoOption> getRangeAutoOption(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.Integer arg1
    );

    @WebMethod
    @RequestWrapper(localName = "updateAutoOption", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.UpdateAutoOption")
    @ResponseWrapper(localName = "updateAutoOptionResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.UpdateAutoOptionResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:14:59.670+03:00")
    public com.mera.borisgk98.autoshowroom.server.soap.AutoOption updateAutoOption(
        @WebParam(name = "arg0", targetNamespace = "")
        com.mera.borisgk98.autoshowroom.server.soap.AutoOption arg0
    ) throws ModelNotFound_Exception;

    @WebMethod
    @RequestWrapper(localName = "readAutoOption", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.ReadAutoOption")
    @ResponseWrapper(localName = "readAutoOptionResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.ReadAutoOptionResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:14:59.670+03:00")
    public com.mera.borisgk98.autoshowroom.server.soap.AutoOption readAutoOption(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Integer arg0
    ) throws ModelNotFound_Exception;
}