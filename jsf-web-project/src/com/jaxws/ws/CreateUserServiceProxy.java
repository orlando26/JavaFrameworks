package com.jaxws.ws;

public class CreateUserServiceProxy implements com.jaxws.ws.CreateUserService {
  private String _endpoint = null;
  private com.jaxws.ws.CreateUserService createUserService = null;
  
  public CreateUserServiceProxy() {
    _initCreateUserServiceProxy();
  }
  
  public CreateUserServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCreateUserServiceProxy();
  }
  
  private void _initCreateUserServiceProxy() {
    try {
      createUserService = (new com.jaxws.ws.CreateUserServiceImplServiceLocator()).getCreateUserServiceImplPort();
      if (createUserService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)createUserService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)createUserService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (createUserService != null)
      ((javax.xml.rpc.Stub)createUserService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.jaxws.ws.CreateUserService getCreateUserService() {
    if (createUserService == null)
      _initCreateUserServiceProxy();
    return createUserService;
  }
  
  public java.lang.String insertUser(com.jaxws.ws.User arg0) throws java.rmi.RemoteException{
    if (createUserService == null)
      _initCreateUserServiceProxy();
    return createUserService.insertUser(arg0);
  }
  
  
}