# JavaFrameworks
Repository for java frameworks course

## Java Server Faces config files

### pom.xml

```xml
	<dependencies>
		<dependency>
			<groupId>com.sun.faces</groupId>
			<artifactId>jsf-api</artifactId>
			<version>2.1.9</version>
		</dependency>
		<dependency>
			<groupId>com.sun.faces</groupId>
			<artifactId>jsf-impl</artifactId>
			<version>2.1.9</version>
		</dependency>
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
			<version>1.2</version>
		</dependency>

		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>servlet-api</artifactId>
			<version>2.5</version>
		</dependency>

		<dependency>
			<groupId>javax.servlet.jsp</groupId>
			<artifactId>jsp-api</artifactId>
			<version>2.1</version>
		</dependency>
		<dependency>
			<groupId>org.primefaces</groupId>
			<artifactId>primefaces</artifactId>
			<version>8.0</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/net.bootsfaces/bootsfaces -->
		<dependency>
			<groupId>net.bootsfaces</groupId>
			<artifactId>bootsfaces</artifactId>
			<version>1.4.1</version>
		</dependency>

		<dependency>
			<groupId>org.glassfish.jersey.core</groupId>
			<artifactId>jersey-client</artifactId>
			<version>2.25.1</version>
		</dependency>

		<dependency>
			<groupId>com.owlike</groupId>
			<artifactId>genson</artifactId>
			<version>0.99</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.apache.cxf/cxf-core -->
		<dependency>
			<groupId>org.apache.cxf</groupId>
			<artifactId>cxf-core</artifactId>
			<version>3.3.6</version>
		</dependency>


		<!-- https://mvnrepository.com/artifact/org.apache.cxf/cxf-rt-rs-client -->
		<dependency>
			<groupId>org.apache.cxf</groupId>
			<artifactId>cxf-rt-rs-client</artifactId>
			<version>3.3.6</version>
		</dependency>

		<dependency>
			<groupId>org.codehaus.jackson</groupId>
			<artifactId>jackson-jaxrs</artifactId>
			<version>1.9.13</version>
		</dependency>
	</dependencies>
```

### web.xml

```xml
	<servlet>
		<servlet-name>Faces Servlet</servlet-name>
		<servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
		<load-on-startup>1</load-on-startup>
	</servlet>
	<servlet-mapping>
		<servlet-name>Faces Servlet</servlet-name>
		<url-pattern>*.xhtml</url-pattern>
	</servlet-mapping>
	<servlet-mapping>
		<servlet-name>Faces Servlet</servlet-name>
		<url-pattern>*.jsf</url-pattern>
	</servlet-mapping>
	<context-param>
		<description>State saving method: 'client' or 'server' (=default). See JSF Specification 2.5.2</description>
		<param-name>javax.faces.STATE_SAVING_METHOD</param-name>
		<param-value>client</param-value>
	</context-param>
	<context-param>
		<param-name>javax.servlet.jsp.jstl.fmt.localizationContext</param-name>
		<param-value>resources.application</param-value>
	</context-param>
	<context-param>
		<param-name>net.bootsfaces.legacy_error_classes</param-name>
		<param-value>true</param-value>
	</context-param>
	<listener>
		<listener-class>com.sun.faces.config.ConfigureListener</listener-class>
	</listener>
```

### index.xhtml

```html
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:c="http://java.sun.com/jsp/jstl/core"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:p="http://primefaces.org/ui" xmlns:b="http://bootsfaces.net/ui">

<f:loadBundle basename="messages" var="msg" />
<c:set var="bean" value="#{viewContext.mainBean}"></c:set>

<h:head>
	<title>JSF</title>
</h:head>
<h:body>
	<b:jumbotron>
		<h3 class="text-center">
			<h:outputText value="JSF" />
		</h3>
	</b:jumbotron>

	<b:container>
		<h:form>
			

		</h:form>
	</b:container>

</h:body>
</html>
```

### Form.java

´´´java
public class Form implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Gets the faces context
	 * @return FacesContext
	 */
	public FacesContext getFacesContext(){
		return FacesContext.getCurrentInstance();
	}
	
	/**
	 * Gets the URL parameter
	 * 
	 * @param paramName
	 * 
	 * @return a string containing the parameter value
	 */
	public String getParam(String paramName){
		return getFacesContext().getExternalContext().getRequestParameterMap().get(paramName);
	}
	
	/**
	 * Gets the value of an EL expresion
	 * @param beanName
	 * @return The Object resulting from the expression evaluation
	 */
	public Object getValue(String beanName){
		ELContext el = getFacesContext().getELContext();
		Object o = el.getELResolver().getValue(el, null, beanName);
		if (o == null){
			throw new RuntimeException("The bean " + beanName + " was not found :(");
		}
		return o;
	}
	
	/**
	 * Gets the request object
	 * @return the request Object
	 */
	public HttpServletRequest getRequest(){
		return (HttpServletRequest) getFacesContext().getExternalContext().getRequest();
	}
	
	/**
	 * Gets the response object
	 * @return the response Object
	 */
	public HttpServletResponse getResponse(){
		return (HttpServletResponse) getFacesContext().getExternalContext().getResponse();
	}
	
	/**
	 * Performs a redirect to another page
	 * @param url
	 */
	public void redirect(String url){
		assert url != null;
		assert url.startsWith("/");
		
		FacesContext context = getFacesContext();
		context.responseComplete();
		HttpServletResponse response = getResponse();
		try{
			response.sendRedirect(response.encodeRedirectURL(getRequest().getContextPath() + url + ".xhtml"));
		}catch(IOException e){
			throw new RuntimeException(e);
		}	
	}
	
	public void redirectHome(){
		String url = "/index";
		assert url != null;
		assert url.startsWith("/");
		
		FacesContext context = getFacesContext();
		context.responseComplete();
		HttpServletResponse response = getResponse();
		try{
			response.sendRedirect(response.encodeRedirectURL(getRequest().getContextPath() + url + ".xhtml"));
		}catch(IOException e){
			throw new RuntimeException(e);
		}	
	}
	
	protected Object getSessionBean(String bean){
		Object object = getFacesContext().getExternalContext().getSessionMap().get(bean);
		return object;
	}
	
	protected void message(String status, String message) {
		getFacesContext().addMessage(null, new FacesMessage(status, message));
	}

}
´´´

