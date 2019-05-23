
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

    private final static QName _Create_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "create");
    private final static QName _CreateResponse_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "createResponse");
    private final static QName _Delete_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "delete");
    private final static QName _DeleteResponse_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "deleteResponse");
    private final static QName _GetAll_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "getAll");
    private final static QName _GetAllResponse_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "getAllResponse");
    private final static QName _GetRange_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "getRange");
    private final static QName _GetRangeResponse_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "getRangeResponse");
    private final static QName _Read_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "read");
    private final static QName _ReadResponse_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "readResponse");
    private final static QName _Update_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "update");
    private final static QName _UpdateResponse_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "updateResponse");
    private final static QName _ModelNotFound_QNAME = new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "ModelNotFound");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mera.borisgk98.autoshowroom.server.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link GetAllResponse }
     * 
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    /**
     * Create an instance of {@link GetRange }
     * 
     */
    public GetRange createGetRange() {
        return new GetRange();
    }

    /**
     * Create an instance of {@link GetRangeResponse }
     * 
     */
    public GetRangeResponse createGetRangeResponse() {
        return new GetRangeResponse();
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
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link ModelNotFound }
     * 
     */
    public ModelNotFound createModelNotFound() {
        return new ModelNotFound();
    }

    /**
     * Create an instance of {@link AutoModel }
     * 
     */
    public AutoModel createAutoModel() {
        return new AutoModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Create }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<GetAll>(_GetAll_QNAME, GetAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<GetAllResponse>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRange }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRange }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "getRange")
    public JAXBElement<GetRange> createGetRange(GetRange value) {
        return new JAXBElement<GetRange>(_GetRange_QNAME, GetRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRangeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRangeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "getRangeResponse")
    public JAXBElement<GetRangeResponse> createGetRangeResponse(GetRangeResponse value) {
        return new JAXBElement<GetRangeResponse>(_GetRangeResponse_QNAME, GetRangeResponse.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Update }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModelNotFound }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModelNotFound }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.server.autoshowroom.borisgk98.mera.com/", name = "ModelNotFound")
    public JAXBElement<ModelNotFound> createModelNotFound(ModelNotFound value) {
        return new JAXBElement<ModelNotFound>(_ModelNotFound_QNAME, ModelNotFound.class, null, value);
    }

}
