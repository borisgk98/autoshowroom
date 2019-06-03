
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
 * 2019-06-03T11:44:07.481+03:00
 * Generated source version: 3.3.1
 *
 */
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T11:44:07.481+03:00", comments = "Apache CXF 3.3.1")
public final class SellerWebService_SellerServicePort_Client {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T11:44:07.481+03:00")
    private static final QName SERVICE_NAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "sellerService");

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T11:44:07.481+03:00")
    private SellerWebService_SellerServicePort_Client() {
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2019-06-03T11:44:07.481+03:00")
    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = SellerService.WSDL_LOCATION;
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

        SellerService ss = new SellerService(wsdlURL, SERVICE_NAME);
        SellerWebService port = ss.getSellerServicePort();

        {
        System.out.println("Invoking getAllSeller...");
        java.util.List<com.mera.borisgk98.autoshowroom.server.soap.Seller> _getAllSeller__return = port.getAllSeller();
        System.out.println("getAllSeller.result=" + _getAllSeller__return);


        }
        {
        System.out.println("Invoking deleteSeller...");
        java.lang.Integer _deleteSeller_arg0 = null;
        try {
            port.deleteSeller(_deleteSeller_arg0);

        } catch (ModelNotFound_Exception e) {
            System.out.println("Expected exception: ModelNotFound has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking updateSeller...");
        com.mera.borisgk98.autoshowroom.server.soap.Seller _updateSeller_arg0 = null;
        try {
            com.mera.borisgk98.autoshowroom.server.soap.Seller _updateSeller__return = port.updateSeller(_updateSeller_arg0);
            System.out.println("updateSeller.result=" + _updateSeller__return);

        } catch (ModelNotFound_Exception e) {
            System.out.println("Expected exception: ModelNotFound has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking readSeller...");
        java.lang.Integer _readSeller_arg0 = null;
        try {
            com.mera.borisgk98.autoshowroom.server.soap.Seller _readSeller__return = port.readSeller(_readSeller_arg0);
            System.out.println("readSeller.result=" + _readSeller__return);

        } catch (ModelNotFound_Exception e) {
            System.out.println("Expected exception: ModelNotFound has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking createSeller...");
        com.mera.borisgk98.autoshowroom.server.soap.Seller _createSeller_arg0 = null;
        com.mera.borisgk98.autoshowroom.server.soap.Seller _createSeller__return = port.createSeller(_createSeller_arg0);
        System.out.println("createSeller.result=" + _createSeller__return);


        }
        {
        System.out.println("Invoking getRangeSeller...");
        java.lang.Integer _getRangeSeller_arg0 = null;
        java.lang.Integer _getRangeSeller_arg1 = null;
        java.util.List<com.mera.borisgk98.autoshowroom.server.soap.Seller> _getRangeSeller__return = port.getRangeSeller(_getRangeSeller_arg0, _getRangeSeller_arg1);
        System.out.println("getRangeSeller.result=" + _getRangeSeller__return);


        }

        System.exit(0);
    }

}
