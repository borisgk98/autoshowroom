
package com.mera.borisgk98.autoshowroom.server.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mera.borisgk98.autoshowroom.server.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Read_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "read");
    private final static QName _ReadResponse_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "readResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mera.borisgk98.autoshowroom.server.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Read }
     * 
     */
    public Read createRead() {
        return new Read();
    }

    /**
     * Create an instance of {@link ReadResponse }
     * 
     */
    public ReadResponse createReadResponse() {
        return new ReadResponse();
    }

    /**
     * Create an instance of {@link AutoModel }
     * 
     */
    public AutoModel createAutoModel() {
        return new AutoModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Read }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Read }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "read")
    public JAXBElement<Read> createRead(Read value) {
        return new JAXBElement<Read>(_Read_QNAME, Read.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "readResponse")
    public JAXBElement<ReadResponse> createReadResponse(ReadResponse value) {
        return new JAXBElement<ReadResponse>(_ReadResponse_QNAME, ReadResponse.class, null, value);
    }

}
