
package com.mera.borisgk98.autoshowroom.server.soap;

import javax.annotation.Generated;
import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.1
 * 2019-05-31T12:27:39.023+03:00
 * Generated source version: 3.3.1
 */

@WebFault(name = "ModelNotFound", targetNamespace = "http://soap.server.autoshowroom.borisgk98.mera.com/")
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-31T12:27:39.023+03:00", comments = "Apache CXF 3.3.1")
public class ModelNotFound_Exception extends Exception {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-31T12:27:39.023+03:00")
    private com.mera.borisgk98.autoshowroom.server.soap.ModelNotFound modelNotFound;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-31T12:27:39.023+03:00")
    public ModelNotFound_Exception() {
        super();
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-31T12:27:39.023+03:00")
    public ModelNotFound_Exception(String message) {
        super(message);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-31T12:27:39.023+03:00")
    public ModelNotFound_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-31T12:27:39.023+03:00")
    public ModelNotFound_Exception(String message, com.mera.borisgk98.autoshowroom.server.soap.ModelNotFound modelNotFound) {
        super(message);
        this.modelNotFound = modelNotFound;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-31T12:27:39.023+03:00")
    public ModelNotFound_Exception(String message, com.mera.borisgk98.autoshowroom.server.soap.ModelNotFound modelNotFound, java.lang.Throwable cause) {
        super(message, cause);
        this.modelNotFound = modelNotFound;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-31T12:27:39.023+03:00")
    public com.mera.borisgk98.autoshowroom.server.soap.ModelNotFound getFaultInfo() {
        return this.modelNotFound;
    }
}
