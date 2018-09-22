
package com.jaxws.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jaxws.ws package. 
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

    private final static QName _GetAllUsers_QNAME = new QName("http://ws.jaxws.com/", "getAllUsers");
    private final static QName _GetAllUsersResponse_QNAME = new QName("http://ws.jaxws.com/", "getAllUsersResponse");
    private final static QName _GetUserByEmail_QNAME = new QName("http://ws.jaxws.com/", "getUserByEmail");
    private final static QName _GetUserByEmailResponse_QNAME = new QName("http://ws.jaxws.com/", "getUserByEmailResponse");
    private final static QName _GetUserById_QNAME = new QName("http://ws.jaxws.com/", "getUserById");
    private final static QName _GetUserByIdResponse_QNAME = new QName("http://ws.jaxws.com/", "getUserByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jaxws.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllUsers }
     * 
     */
    public GetAllUsers createGetAllUsers() {
        return new GetAllUsers();
    }

    /**
     * Create an instance of {@link GetAllUsersResponse }
     * 
     */
    public GetAllUsersResponse createGetAllUsersResponse() {
        return new GetAllUsersResponse();
    }

    /**
     * Create an instance of {@link GetUserByEmail }
     * 
     */
    public GetUserByEmail createGetUserByEmail() {
        return new GetUserByEmail();
    }

    /**
     * Create an instance of {@link GetUserByEmailResponse }
     * 
     */
    public GetUserByEmailResponse createGetUserByEmailResponse() {
        return new GetUserByEmailResponse();
    }

    /**
     * Create an instance of {@link GetUserById }
     * 
     */
    public GetUserById createGetUserById() {
        return new GetUserById();
    }

    /**
     * Create an instance of {@link GetUserByIdResponse }
     * 
     */
    public GetUserByIdResponse createGetUserByIdResponse() {
        return new GetUserByIdResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaxws.com/", name = "getAllUsers")
    public JAXBElement<GetAllUsers> createGetAllUsers(GetAllUsers value) {
        return new JAXBElement<GetAllUsers>(_GetAllUsers_QNAME, GetAllUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaxws.com/", name = "getAllUsersResponse")
    public JAXBElement<GetAllUsersResponse> createGetAllUsersResponse(GetAllUsersResponse value) {
        return new JAXBElement<GetAllUsersResponse>(_GetAllUsersResponse_QNAME, GetAllUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaxws.com/", name = "getUserByEmail")
    public JAXBElement<GetUserByEmail> createGetUserByEmail(GetUserByEmail value) {
        return new JAXBElement<GetUserByEmail>(_GetUserByEmail_QNAME, GetUserByEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaxws.com/", name = "getUserByEmailResponse")
    public JAXBElement<GetUserByEmailResponse> createGetUserByEmailResponse(GetUserByEmailResponse value) {
        return new JAXBElement<GetUserByEmailResponse>(_GetUserByEmailResponse_QNAME, GetUserByEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaxws.com/", name = "getUserById")
    public JAXBElement<GetUserById> createGetUserById(GetUserById value) {
        return new JAXBElement<GetUserById>(_GetUserById_QNAME, GetUserById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaxws.com/", name = "getUserByIdResponse")
    public JAXBElement<GetUserByIdResponse> createGetUserByIdResponse(GetUserByIdResponse value) {
        return new JAXBElement<GetUserByIdResponse>(_GetUserByIdResponse_QNAME, GetUserByIdResponse.class, null, value);
    }

}
