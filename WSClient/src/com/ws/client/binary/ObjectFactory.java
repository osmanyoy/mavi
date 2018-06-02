
package com.ws.client.binary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ws.client.binary package. 
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

    private final static QName _UploadData_QNAME = new QName("http://rest.ws.com/", "uploadData");
    private final static QName _DownloadData_QNAME = new QName("http://rest.ws.com/", "downloadData");
    private final static QName _UploadDataResponse_QNAME = new QName("http://rest.ws.com/", "uploadDataResponse");
    private final static QName _DownloadDataResponse_QNAME = new QName("http://rest.ws.com/", "downloadDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ws.client.binary
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UploadData }
     * 
     */
    public UploadData createUploadData() {
        return new UploadData();
    }

    /**
     * Create an instance of {@link DownloadData }
     * 
     */
    public DownloadData createDownloadData() {
        return new DownloadData();
    }

    /**
     * Create an instance of {@link DownloadDataResponse }
     * 
     */
    public DownloadDataResponse createDownloadDataResponse() {
        return new DownloadDataResponse();
    }

    /**
     * Create an instance of {@link UploadDataResponse }
     * 
     */
    public UploadDataResponse createUploadDataResponse() {
        return new UploadDataResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rest.ws.com/", name = "uploadData")
    public JAXBElement<UploadData> createUploadData(UploadData value) {
        return new JAXBElement<UploadData>(_UploadData_QNAME, UploadData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rest.ws.com/", name = "downloadData")
    public JAXBElement<DownloadData> createDownloadData(DownloadData value) {
        return new JAXBElement<DownloadData>(_DownloadData_QNAME, DownloadData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rest.ws.com/", name = "uploadDataResponse")
    public JAXBElement<UploadDataResponse> createUploadDataResponse(UploadDataResponse value) {
        return new JAXBElement<UploadDataResponse>(_UploadDataResponse_QNAME, UploadDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rest.ws.com/", name = "downloadDataResponse")
    public JAXBElement<DownloadDataResponse> createDownloadDataResponse(DownloadDataResponse value) {
        return new JAXBElement<DownloadDataResponse>(_DownloadDataResponse_QNAME, DownloadDataResponse.class, null, value);
    }

}
