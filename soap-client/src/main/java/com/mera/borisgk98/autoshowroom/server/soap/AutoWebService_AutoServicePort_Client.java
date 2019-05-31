
package com.mera.borisgk98.autoshowroom.server.soap;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.annotation.Generated;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.1
 * 2019-05-31T12:27:37.446+03:00
 * Generated source version: 3.3.1
 *
 */
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-31T12:27:37.446+03:00", comments = "Apache CXF 3.3.1")
public final class AutoWebService_AutoServicePort_Client {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-31T12:27:37.446+03:00")
    private static final QName SERVICE_NAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "autoService");

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-31T12:27:37.446+03:00")
    private AutoWebService_AutoServicePort_Client() {
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-31T12:27:37.446+03:00")
    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = AutoService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        AutoService ss = new AutoService(wsdlURL, SERVICE_NAME);
        AutoWebService port = ss.getAutoServicePort();

        {
        System.out.println("Invoking readAuto...");
        java.lang.Integer _readAuto_arg0 = null;
        try {
            com.mera.borisgk98.autoshowroom.server.soap.Auto _readAuto__return = port.readAuto(_readAuto_arg0);
            System.out.println("readAuto.result=" + _readAuto__return);

        } catch (ModelNotFound_Exception e) {
            System.out.println("Expected exception: ModelNotFound has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getAllAuto...");
        java.util.List<com.mera.borisgk98.autoshowroom.server.soap.Auto> _getAllAuto__return = port.getAllAuto();
        System.out.println("getAllAuto.result=" + _getAllAuto__return);


        }
        {
        System.out.println("Invoking getRangeAuto...");
        java.lang.Integer _getRangeAuto_arg0 = null;
        java.lang.Integer _getRangeAuto_arg1 = null;
        java.util.List<com.mera.borisgk98.autoshowroom.server.soap.Auto> _getRangeAuto__return = port.getRangeAuto(_getRangeAuto_arg0, _getRangeAuto_arg1);
        System.out.println("getRangeAuto.result=" + _getRangeAuto__return);


        }
        {
        System.out.println("Invoking createAuto...");
        com.mera.borisgk98.autoshowroom.server.soap.Auto _createAuto_arg0 = null;
        com.mera.borisgk98.autoshowroom.server.soap.Auto _createAuto__return = port.createAuto(_createAuto_arg0);
        System.out.println("createAuto.result=" + _createAuto__return);


        }
        {
        System.out.println("Invoking deleteAuto...");
        java.lang.Integer _deleteAuto_arg0 = null;
        try {
            port.deleteAuto(_deleteAuto_arg0);

        } catch (ModelNotFound_Exception e) {
            System.out.println("Expected exception: ModelNotFound has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking updateAuto...");
        com.mera.borisgk98.autoshowroom.server.soap.Auto _updateAuto_arg0 = null;
        try {
            com.mera.borisgk98.autoshowroom.server.soap.Auto _updateAuto__return = port.updateAuto(_updateAuto_arg0);
            System.out.println("updateAuto.result=" + _updateAuto__return);

        } catch (ModelNotFound_Exception e) {
            System.out.println("Expected exception: ModelNotFound has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
