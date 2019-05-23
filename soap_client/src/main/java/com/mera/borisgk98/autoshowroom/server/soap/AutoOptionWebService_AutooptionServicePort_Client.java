
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
 * 2019-05-24T02:14:59.637+03:00
 * Generated source version: 3.3.1
 *
 */
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:14:59.637+03:00", comments = "Apache CXF 3.3.1")
public final class AutoOptionWebService_AutooptionServicePort_Client {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:14:59.637+03:00")
    private static final QName SERVICE_NAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "autooptionService");

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:14:59.637+03:00")
    private AutoOptionWebService_AutooptionServicePort_Client() {
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:14:59.637+03:00")
    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = AutooptionService.WSDL_LOCATION;
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

        AutooptionService ss = new AutooptionService(wsdlURL, SERVICE_NAME);
        AutoOptionWebService port = ss.getAutooptionServicePort();

        {
        System.out.println("Invoking createAutoOption...");
        com.mera.borisgk98.autoshowroom.server.soap.AutoOption _createAutoOption_arg0 = null;
        com.mera.borisgk98.autoshowroom.server.soap.AutoOption _createAutoOption__return = port.createAutoOption(_createAutoOption_arg0);
        System.out.println("createAutoOption.result=" + _createAutoOption__return);


        }
        {
        System.out.println("Invoking getAllAutoOption...");
        java.util.List<com.mera.borisgk98.autoshowroom.server.soap.AutoOption> _getAllAutoOption__return = port.getAllAutoOption();
        System.out.println("getAllAutoOption.result=" + _getAllAutoOption__return);


        }
        {
        System.out.println("Invoking deleteAutoOption...");
        java.lang.Integer _deleteAutoOption_arg0 = null;
        try {
            port.deleteAutoOption(_deleteAutoOption_arg0);

        } catch (ModelNotFound_Exception e) {
            System.out.println("Expected exception: ModelNotFound has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getRangeAutoOption...");
        java.lang.Integer _getRangeAutoOption_arg0 = null;
        java.lang.Integer _getRangeAutoOption_arg1 = null;
        java.util.List<com.mera.borisgk98.autoshowroom.server.soap.AutoOption> _getRangeAutoOption__return = port.getRangeAutoOption(_getRangeAutoOption_arg0, _getRangeAutoOption_arg1);
        System.out.println("getRangeAutoOption.result=" + _getRangeAutoOption__return);


        }
        {
        System.out.println("Invoking updateAutoOption...");
        com.mera.borisgk98.autoshowroom.server.soap.AutoOption _updateAutoOption_arg0 = null;
        try {
            com.mera.borisgk98.autoshowroom.server.soap.AutoOption _updateAutoOption__return = port.updateAutoOption(_updateAutoOption_arg0);
            System.out.println("updateAutoOption.result=" + _updateAutoOption__return);

        } catch (ModelNotFound_Exception e) {
            System.out.println("Expected exception: ModelNotFound has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking readAutoOption...");
        java.lang.Integer _readAutoOption_arg0 = null;
        try {
            com.mera.borisgk98.autoshowroom.server.soap.AutoOption _readAutoOption__return = port.readAutoOption(_readAutoOption_arg0);
            System.out.println("readAutoOption.result=" + _readAutoOption__return);

        } catch (ModelNotFound_Exception e) {
            System.out.println("Expected exception: ModelNotFound has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
