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
 * 2019-05-24T02:15:00.595+03:00
 * Generated source version: 3.3.1
 *
 */
@WebService(targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "SellerWebService")
@XmlSeeAlso({ObjectFactory.class})
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:15:00.595+03:00", comments = "Apache CXF 3.3.1")
public interface SellerWebService {

    @WebMethod
    @RequestWrapper(localName = "getAllSeller", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.GetAllSeller")
    @ResponseWrapper(localName = "getAllSellerResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.GetAllSellerResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:15:00.595+03:00")
    public java.util.List<com.mera.borisgk98.autoshowroom.server.soap.Seller> getAllSeller();

    @WebMethod
    @RequestWrapper(localName = "deleteSeller", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.DeleteSeller")
    @ResponseWrapper(localName = "deleteSellerResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.DeleteSellerResponse")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:15:00.595+03:00")
    public void deleteSeller(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Integer arg0
    ) throws ModelNotFound_Exception;

    @WebMethod
    @RequestWrapper(localName = "updateSeller", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.UpdateSeller")
    @ResponseWrapper(localName = "updateSellerResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.UpdateSellerResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:15:00.595+03:00")
    public com.mera.borisgk98.autoshowroom.server.soap.Seller updateSeller(
        @WebParam(name = "arg0", targetNamespace = "")
        com.mera.borisgk98.autoshowroom.server.soap.Seller arg0
    ) throws ModelNotFound_Exception;

    @WebMethod
    @RequestWrapper(localName = "readSeller", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.ReadSeller")
    @ResponseWrapper(localName = "readSellerResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.ReadSellerResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:15:00.595+03:00")
    public com.mera.borisgk98.autoshowroom.server.soap.Seller readSeller(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Integer arg0
    ) throws ModelNotFound_Exception;

    @WebMethod
    @RequestWrapper(localName = "createSeller", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.CreateSeller")
    @ResponseWrapper(localName = "createSellerResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.CreateSellerResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:15:00.595+03:00")
    public com.mera.borisgk98.autoshowroom.server.soap.Seller createSeller(
        @WebParam(name = "arg0", targetNamespace = "")
        com.mera.borisgk98.autoshowroom.server.soap.Seller arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getRangeSeller", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.GetRangeSeller")
    @ResponseWrapper(localName = "getRangeSellerResponse", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", className = "com.mera.borisgk98.autoshowroom.server.soap.GetRangeSellerResponse")
    @WebResult(name = "return", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:15:00.595+03:00")
    public java.util.List<com.mera.borisgk98.autoshowroom.server.soap.Seller> getRangeSeller(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.Integer arg1
    );
}
