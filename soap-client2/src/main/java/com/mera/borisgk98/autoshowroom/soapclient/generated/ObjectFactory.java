
package com.mera.borisgk98.autoshowroom.soapclient.generated;

import com.mera.borisgk98.autoshowroom.soapclient.model.AutoMark;

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

    private final static QName _CreateAutoMark_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "createAutoMark");
    private final static QName _CreateAutoMarkResponse_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "createAutoMarkResponse");
    private final static QName _DeleteAutoMark_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "deleteAutoMark");
    private final static QName _DeleteAutoMarkResponse_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "deleteAutoMarkResponse");
    private final static QName _GetAllAutoMark_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "getAllAutoMark");
    private final static QName _GetAllAutoMarkResponse_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "getAllAutoMarkResponse");
    private final static QName _GetRangeAutoMark_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "getRangeAutoMark");
    private final static QName _GetRangeAutoMarkResponse_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "getRangeAutoMarkResponse");
    private final static QName _ReadAutoMark_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "readAutoMark");
    private final static QName _ReadAutoMarkResponse_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "readAutoMarkResponse");
    private final static QName _UpdateAutoMark_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "updateAutoMark");
    private final static QName _UpdateAutoMarkResponse_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "updateAutoMarkResponse");
    private final static QName _ModelNotFound_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "ModelNotFound_Class");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mera.borisgk98.autoshowroom.server.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateAutoMark }
     * 
     */
    public CreateAutoMark createCreateAutoMark() {
        return new CreateAutoMark();
    }

    /**
     * Create an instance of {@link CreateAutoMarkResponse }
     * 
     */
    public CreateAutoMarkResponse createCreateAutoMarkResponse() {
        return new CreateAutoMarkResponse();
    }

    /**
     * Create an instance of {@link DeleteAutoMark }
     * 
     */
    public DeleteAutoMark createDeleteAutoMark() {
        return new DeleteAutoMark();
    }

    /**
     * Create an instance of {@link DeleteAutoMarkResponse }
     * 
     */
    public DeleteAutoMarkResponse createDeleteAutoMarkResponse() {
        return new DeleteAutoMarkResponse();
    }

    /**
     * Create an instance of {@link GetAllAutoMark }
     * 
     */
    public GetAllAutoMark createGetAllAutoMark() {
        return new GetAllAutoMark();
    }

    /**
     * Create an instance of {@link GetAllAutoMarkResponse }
     * 
     */
    public GetAllAutoMarkResponse createGetAllAutoMarkResponse() {
        return new GetAllAutoMarkResponse();
    }

    /**
     * Create an instance of {@link GetRangeAutoMark }
     * 
     */
    public GetRangeAutoMark createGetRangeAutoMark() {
        return new GetRangeAutoMark();
    }

    /**
     * Create an instance of {@link GetRangeAutoMarkResponse }
     * 
     */
    public GetRangeAutoMarkResponse createGetRangeAutoMarkResponse() {
        return new GetRangeAutoMarkResponse();
    }

    /**
     * Create an instance of {@link ReadAutoMark }
     * 
     */
    public ReadAutoMark createReadAutoMark() {
        return new ReadAutoMark();
    }

    /**
     * Create an instance of {@link ReadAutoMarkResponse }
     * 
     */
    public ReadAutoMarkResponse createReadAutoMarkResponse() {
        return new ReadAutoMarkResponse();
    }

    /**
     * Create an instance of {@link UpdateAutoMark }
     * 
     */
    public UpdateAutoMark createUpdateAutoMark() {
        return new UpdateAutoMark();
    }

    /**
     * Create an instance of {@link UpdateAutoMarkResponse }
     * 
     */
    public UpdateAutoMarkResponse createUpdateAutoMarkResponse() {
        return new UpdateAutoMarkResponse();
    }

    /**
     * Create an instance of {@link ModelNotFound_Class }
     * 
     */
    public ModelNotFound_Class createModelNotFound() {
        return new ModelNotFound_Class();
    }

    /**
     * Create an instance of {@link AutoMark }
     * 
     */
    public AutoMark createAutoMark() {
        return new AutoMark();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAutoMark }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAutoMark }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "createAutoMark")
    public JAXBElement<CreateAutoMark> createCreateAutoMark(CreateAutoMark value) {
        return new JAXBElement<CreateAutoMark>(_CreateAutoMark_QNAME, CreateAutoMark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAutoMarkResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAutoMarkResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "createAutoMarkResponse")
    public JAXBElement<CreateAutoMarkResponse> createCreateAutoMarkResponse(CreateAutoMarkResponse value) {
        return new JAXBElement<CreateAutoMarkResponse>(_CreateAutoMarkResponse_QNAME, CreateAutoMarkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAutoMark }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteAutoMark }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "deleteAutoMark")
    public JAXBElement<DeleteAutoMark> createDeleteAutoMark(DeleteAutoMark value) {
        return new JAXBElement<DeleteAutoMark>(_DeleteAutoMark_QNAME, DeleteAutoMark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAutoMarkResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteAutoMarkResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "deleteAutoMarkResponse")
    public JAXBElement<DeleteAutoMarkResponse> createDeleteAutoMarkResponse(DeleteAutoMarkResponse value) {
        return new JAXBElement<DeleteAutoMarkResponse>(_DeleteAutoMarkResponse_QNAME, DeleteAutoMarkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAutoMark }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllAutoMark }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "getAllAutoMark")
    public JAXBElement<GetAllAutoMark> createGetAllAutoMark(GetAllAutoMark value) {
        return new JAXBElement<GetAllAutoMark>(_GetAllAutoMark_QNAME, GetAllAutoMark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAutoMarkResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllAutoMarkResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "getAllAutoMarkResponse")
    public JAXBElement<GetAllAutoMarkResponse> createGetAllAutoMarkResponse(GetAllAutoMarkResponse value) {
        return new JAXBElement<GetAllAutoMarkResponse>(_GetAllAutoMarkResponse_QNAME, GetAllAutoMarkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRangeAutoMark }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRangeAutoMark }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "getRangeAutoMark")
    public JAXBElement<GetRangeAutoMark> createGetRangeAutoMark(GetRangeAutoMark value) {
        return new JAXBElement<GetRangeAutoMark>(_GetRangeAutoMark_QNAME, GetRangeAutoMark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRangeAutoMarkResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRangeAutoMarkResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "getRangeAutoMarkResponse")
    public JAXBElement<GetRangeAutoMarkResponse> createGetRangeAutoMarkResponse(GetRangeAutoMarkResponse value) {
        return new JAXBElement<GetRangeAutoMarkResponse>(_GetRangeAutoMarkResponse_QNAME, GetRangeAutoMarkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAutoMark }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadAutoMark }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "readAutoMark")
    public JAXBElement<ReadAutoMark> createReadAutoMark(ReadAutoMark value) {
        return new JAXBElement<ReadAutoMark>(_ReadAutoMark_QNAME, ReadAutoMark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAutoMarkResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadAutoMarkResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "readAutoMarkResponse")
    public JAXBElement<ReadAutoMarkResponse> createReadAutoMarkResponse(ReadAutoMarkResponse value) {
        return new JAXBElement<ReadAutoMarkResponse>(_ReadAutoMarkResponse_QNAME, ReadAutoMarkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAutoMark }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateAutoMark }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "updateAutoMark")
    public JAXBElement<UpdateAutoMark> createUpdateAutoMark(UpdateAutoMark value) {
        return new JAXBElement<UpdateAutoMark>(_UpdateAutoMark_QNAME, UpdateAutoMark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAutoMarkResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateAutoMarkResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "updateAutoMarkResponse")
    public JAXBElement<UpdateAutoMarkResponse> createUpdateAutoMarkResponse(UpdateAutoMarkResponse value) {
        return new JAXBElement<UpdateAutoMarkResponse>(_UpdateAutoMarkResponse_QNAME, UpdateAutoMarkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModelNotFound_Class }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModelNotFound_Class }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "ModelNotFound_Class")
    public JAXBElement<ModelNotFound_Class> createModelNotFound(ModelNotFound_Class value) {
        return new JAXBElement<ModelNotFound_Class>(_ModelNotFound_QNAME, ModelNotFound_Class.class, null, value);
    }

}
