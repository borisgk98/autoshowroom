
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
 * 2019-05-24T02:15:00.385+03:00
 * Generated source version: 3.3.1
 *
 */
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:15:00.385+03:00", comments = "Apache CXF 3.3.1")
public final class AutoModelWebService_AutomodelServicePort_Client {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:15:00.385+03:00")
    private static final QName SERVICE_NAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "automodelService");

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:15:00.385+03:00")
    private AutoModelWebService_AutomodelServicePort_Client() {
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-05-24T02:15:00.385+03:00")
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

//        {
//        System.out.println("Invoking updateAutoModel...");
//        com.mera.borisgk98.autoshowroom.server.soap.AutoModel _updateAutoModel_arg0 = null;
//        try {
//            com.mera.borisgk98.autoshowroom.server.soap.AutoModel _updateAutoModel__return = port.updateAutoModel(_updateAutoModel_arg0);
//            System.out.println("updateAutoModel.result=" + _updateAutoModel__return);
//
//        } catch (ModelNotFound_Exception e) {
//            System.out.println("Expected exception: ModelNotFound has occurred.");
//            System.out.println(e.toString());
//        }
//            }
//        {
//        System.out.println("Invoking createAutoModel...");
//        com.mera.borisgk98.autoshowroom.server.soap.AutoModel _createAutoModel_arg0 = null;
//        com.mera.borisgk98.autoshowroom.server.soap.AutoModel _createAutoModel__return = port.createAutoModel(_createAutoModel_arg0);
//        System.out.println("createAutoModel.result=" + _createAutoModel__return);
//
//
//        }
//        {
//        System.out.println("Invoking getAllAutoModel...");
//        java.util.List<com.mera.borisgk98.autoshowroom.server.soap.AutoModel> _getAllAutoModel__return = port.getAllAutoModel();
//        System.out.println("getAllAutoModel.result=" + _getAllAutoModel__return);
//
//
//        }
//        {
//        System.out.println("Invoking getRangeAutoModel...");
//        java.lang.Integer _getRangeAutoModel_arg0 = null;
//        java.lang.Integer _getRangeAutoModel_arg1 = null;
//        java.util.List<com.mera.borisgk98.autoshowroom.server.soap.AutoModel> _getRangeAutoModel__return = port.getRangeAutoModel(_getRangeAutoModel_arg0, _getRangeAutoModel_arg1);
//        System.out.println("getRangeAutoModel.result=" + _getRangeAutoModel__return);
//
//
//        }
//        {
//        System.out.println("Invoking deleteAutoModel...");
//        java.lang.Integer _deleteAutoModel_arg0 = null;
//        try {
//            port.deleteAutoModel(_deleteAutoModel_arg0);
//
//        } catch (ModelNotFound_Exception e) {
//            System.out.println("Expected exception: ModelNotFound has occurred.");
//            System.out.println(e.toString());
//        }
//            }
        {
        System.out.println("Invoking readAutoModel...");
        java.lang.Integer _readAutoModel_arg0 = 1;
        try {
            com.mera.borisgk98.autoshowroom.server.soap.AutoModel _readAutoModel__return = port.readAutoModel(_readAutoModel_arg0);
            System.out.println("readAutoModel.result=" + _readAutoModel__return);

        } catch (ModelNotFound_Exception e) {
            System.out.println("Expected exception: ModelNotFound has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}