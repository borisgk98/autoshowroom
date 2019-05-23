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
 * 2019-05-23T23:49:38.872+03:00
 * Generated source version: 3.3.1
 *
 */
@WebService(targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "AutoModelWebService")
@XmlSeeAlso({ObjectFactory.class})
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-23T23:49:38.872+03:00", comments = "Apache CXF 3.3.1")
public interface AutoModelWebService {

    @WebMethod
    @RequestWrapper(localName = "getRange", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.GetRange")
    @ResponseWrapper(localName = "getRangeResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.GetRangeResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-23T23:49:38.872+03:00")
    public java.util.List<com.mera.borisgk98.autoshowroom.server.soap.AutoModel> getRange(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.Integer arg1
    );

    @WebMethod
    @RequestWrapper(localName = "getAll", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.GetAll")
    @ResponseWrapper(localName = "getAllResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.GetAllResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-23T23:49:38.872+03:00")
    public java.util.List<com.mera.borisgk98.autoshowroom.server.soap.AutoModel> getAll();

    @WebMethod
    @RequestWrapper(localName = "read", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.Read")
    @ResponseWrapper(localName = "readResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.ReadResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-23T23:49:38.872+03:00")
    public com.mera.borisgk98.autoshowroom.server.soap.AutoModel read(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Integer arg0
    ) throws ModelNotFound_Exception;

    @WebMethod
    @RequestWrapper(localName = "delete", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.DeleteResponse")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-23T23:49:38.872+03:00")
    public void delete(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Integer arg0
    ) throws ModelNotFound_Exception;

    @WebMethod
    @RequestWrapper(localName = "create", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.Create")
    @ResponseWrapper(localName = "createResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.CreateResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-23T23:49:38.872+03:00")
    public com.mera.borisgk98.autoshowroom.server.soap.AutoModel create(
        @WebParam(name = "arg0", targetNamespace = "")
        com.mera.borisgk98.autoshowroom.server.soap.AutoModel arg0
    );

    @WebMethod
    @RequestWrapper(localName = "update", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.Update")
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.UpdateResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-23T23:49:38.872+03:00")
    public com.mera.borisgk98.autoshowroom.server.soap.AutoModel update(
        @WebParam(name = "arg0", targetNamespace = "")
        com.mera.borisgk98.autoshowroom.server.soap.AutoModel arg0
    ) throws ModelNotFound_Exception;
}
