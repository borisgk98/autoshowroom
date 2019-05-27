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
 * 2019-05-27T14:33:35.523+03:00
 * Generated source version: 3.3.1
 *
 */
@WebService(targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "AutoMarkWebService")
@XmlSeeAlso({ObjectFactory.class})
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:35.523+03:00", comments = "Apache CXF 3.3.1")
public interface AutoMarkWebService {

    @WebMethod
    @RequestWrapper(localName = "getAllAutoMark", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.GetAllAutoMark")
    @ResponseWrapper(localName = "getAllAutoMarkResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.GetAllAutoMarkResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:35.523+03:00")
    public java.util.List<com.mera.borisgk98.autoshowroom.server.soap.AutoMark> getAllAutoMark();

    @WebMethod
    @RequestWrapper(localName = "getRangeAutoMark", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.GetRangeAutoMark")
    @ResponseWrapper(localName = "getRangeAutoMarkResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.GetRangeAutoMarkResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:35.523+03:00")
    public java.util.List<com.mera.borisgk98.autoshowroom.server.soap.AutoMark> getRangeAutoMark(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.Integer arg1
    );

    @WebMethod
    @RequestWrapper(localName = "createAutoMark", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.CreateAutoMark")
    @ResponseWrapper(localName = "createAutoMarkResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.CreateAutoMarkResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:35.523+03:00")
    public com.mera.borisgk98.autoshowroom.server.soap.AutoMark createAutoMark(
        @WebParam(name = "arg0", targetNamespace = "")
        com.mera.borisgk98.autoshowroom.server.soap.AutoMark arg0
    );

    @WebMethod
    @RequestWrapper(localName = "updateAutoMark", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.UpdateAutoMark")
    @ResponseWrapper(localName = "updateAutoMarkResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.UpdateAutoMarkResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:35.523+03:00")
    public com.mera.borisgk98.autoshowroom.server.soap.AutoMark updateAutoMark(
        @WebParam(name = "arg0", targetNamespace = "")
        com.mera.borisgk98.autoshowroom.server.soap.AutoMark arg0
    ) throws ModelNotFound_Exception;

    @WebMethod
    @RequestWrapper(localName = "readAutoMark", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.ReadAutoMark")
    @ResponseWrapper(localName = "readAutoMarkResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.ReadAutoMarkResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:35.523+03:00")
    public com.mera.borisgk98.autoshowroom.server.soap.AutoMark readAutoMark(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Integer arg0
    ) throws ModelNotFound_Exception;

    @WebMethod
    @RequestWrapper(localName = "deleteAutoMark", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.DeleteAutoMark")
    @ResponseWrapper(localName = "deleteAutoMarkResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.DeleteAutoMarkResponse")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:35.523+03:00")
    public void deleteAutoMark(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Integer arg0
    ) throws ModelNotFound_Exception;
}
