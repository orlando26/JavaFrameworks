/**
 * CreateUserServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jaxws.ws;

public class CreateUserServiceImplServiceLocator extends org.apache.axis.client.Service implements com.jaxws.ws.CreateUserServiceImplService {

    public CreateUserServiceImplServiceLocator() {
    }


    public CreateUserServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CreateUserServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CreateUserServiceImplPort
    private java.lang.String CreateUserServiceImplPort_address = "http://localhost:8080/Jaxws-demo/CreateUserService";

    public java.lang.String getCreateUserServiceImplPortAddress() {
        return CreateUserServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CreateUserServiceImplPortWSDDServiceName = "CreateUserServiceImplPort";

    public java.lang.String getCreateUserServiceImplPortWSDDServiceName() {
        return CreateUserServiceImplPortWSDDServiceName;
    }

    public void setCreateUserServiceImplPortWSDDServiceName(java.lang.String name) {
        CreateUserServiceImplPortWSDDServiceName = name;
    }

    public com.jaxws.ws.CreateUserService getCreateUserServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CreateUserServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCreateUserServiceImplPort(endpoint);
    }

    public com.jaxws.ws.CreateUserService getCreateUserServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.jaxws.ws.CreateUserServiceImplServiceSoapBindingStub _stub = new com.jaxws.ws.CreateUserServiceImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCreateUserServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCreateUserServiceImplPortEndpointAddress(java.lang.String address) {
        CreateUserServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.jaxws.ws.CreateUserService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.jaxws.ws.CreateUserServiceImplServiceSoapBindingStub _stub = new com.jaxws.ws.CreateUserServiceImplServiceSoapBindingStub(new java.net.URL(CreateUserServiceImplPort_address), this);
                _stub.setPortName(getCreateUserServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CreateUserServiceImplPort".equals(inputPortName)) {
            return getCreateUserServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.jaxws.com/", "CreateUserServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.jaxws.com/", "CreateUserServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CreateUserServiceImplPort".equals(portName)) {
            setCreateUserServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
