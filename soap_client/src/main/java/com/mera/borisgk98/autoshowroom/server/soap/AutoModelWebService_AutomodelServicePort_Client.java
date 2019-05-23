
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
 * 2019-05-24T00:38:52.356+03:00
 * Generated source version: 3.3.1
 *
 */
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T00:38:52.356+03:00", comments = "Apache CXF 3.3.1")
public final class AutoModelWebService_AutomodelServicePort_Client {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T00:38:52.356+03:00")
    private static final QName SERVICE_NAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "automodelService");

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T00:38:52.356+03:00")
    private AutoModelWebService_AutomodelServicePort_Client() {
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T00:38:52.356+03:00")
    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = AutomodelService.WSDL_LOCATION;
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

        AutomodelService ss = new AutomodelService(wsdlURL, SERVICE_NAME);
        AutoModelWebService port = ss.getAutomodelServicePort();

        {
        System.out.println("Invoking getRange...");
        java.lang.Integer _getRange_arg0 = null;
        java.lang.Integer _getRange_arg1 = null;
        java.util.List<com.mera.borisgk98.autoshowroom.server.soap.AutoModel> _getRange__return = port.getRange(_getRange_arg0, _getRange_arg1);
        System.out.println("getRange.result=" + _getRange__return);


        }
        {
        System.out.println("Invoking getAll...");
        java.util.List<com.mera.borisgk98.autoshowroom.server.soap.AutoModel> _getAll__return = port.getAll();
        System.out.println("getAll.result=" + _getAll__return);


        }
        {
        System.out.println("Invoking read...");
        java.lang.Integer _read_arg0 = null;
        try {
            com.mera.borisgk98.autoshowroom.server.soap.AutoModel _read__return = port.read(_read_arg0);
            System.out.println("read.result=" + _read__return);

        } catch (ModelNotFound_Exception e) {
            System.out.println("Expected exception: ModelNotFound has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking delete...");
        java.lang.Integer _delete_arg0 = null;
        try {
            port.delete(_delete_arg0);

        } catch (ModelNotFound_Exception e) {
            System.out.println("Expected exception: ModelNotFound has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking create...");
        com.mera.borisgk98.autoshowroom.server.soap.AutoModel _create_arg0 = null;
        com.mera.borisgk98.autoshowroom.server.soap.AutoModel _create__return = port.create(_create_arg0);
        System.out.println("create.result=" + _create__return);


        }
        {
        System.out.println("Invoking update...");
        com.mera.borisgk98.autoshowroom.server.soap.AutoModel _update_arg0 = null;
        try {
            com.mera.borisgk98.autoshowroom.server.soap.AutoModel _update__return = port.update(_update_arg0);
            System.out.println("update.result=" + _update__return);

        } catch (ModelNotFound_Exception e) {
            System.out.println("Expected exception: ModelNotFound has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
