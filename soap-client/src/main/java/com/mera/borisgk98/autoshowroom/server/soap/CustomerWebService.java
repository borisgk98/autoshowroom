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
 * 2019-05-27T14:33:34.949+03:00
 * Generated source version: 3.3.1
 *
 */
@WebService(targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "CustomerWebService")
@XmlSeeAlso({ObjectFactory.class})
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:34.949+03:00", comments = "Apache CXF 3.3.1")
public interface CustomerWebService {

    @WebMethod
    @RequestWrapper(localName = "createCustomer", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.CreateCustomer")
    @ResponseWrapper(localName = "createCustomerResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.CreateCustomerResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:34.949+03:00")
    public com.mera.borisgk98.autoshowroom.server.soap.Customer createCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        com.mera.borisgk98.autoshowroom.server.soap.Customer arg0
    );

    @WebMethod
    @RequestWrapper(localName = "readCustomer", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.ReadCustomer")
    @ResponseWrapper(localName = "readCustomerResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.ReadCustomerResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:34.949+03:00")
    public com.mera.borisgk98.autoshowroom.server.soap.Customer readCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Integer arg0
    ) throws ModelNotFound_Exception;

    @WebMethod
    @RequestWrapper(localName = "getRangeCustomer", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.GetRangeCustomer")
    @ResponseWrapper(localName = "getRangeCustomerResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.GetRangeCustomerResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:34.949+03:00")
    public java.util.List<com.mera.borisgk98.autoshowroom.server.soap.Customer> getRangeCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.Integer arg1
    );

    @WebMethod
    @RequestWrapper(localName = "getAllCustomer", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.GetAllCustomer")
    @ResponseWrapper(localName = "getAllCustomerResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.GetAllCustomerResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:34.949+03:00")
    public java.util.List<com.mera.borisgk98.autoshowroom.server.soap.Customer> getAllCustomer();

    @WebMethod
    @RequestWrapper(localName = "updateCustomer", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.UpdateCustomer")
    @ResponseWrapper(localName = "updateCustomerResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.UpdateCustomerResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:34.949+03:00")
    public com.mera.borisgk98.autoshowroom.server.soap.Customer updateCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        com.mera.borisgk98.autoshowroom.server.soap.Customer arg0
    ) throws ModelNotFound_Exception;

    @WebMethod
    @RequestWrapper(localName = "deleteCustomer", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.DeleteCustomer")
    @ResponseWrapper(localName = "deleteCustomerResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.DeleteCustomerResponse")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-27T14:33:34.949+03:00")
    public void deleteCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Integer arg0
    ) throws ModelNotFound_Exception;
}
