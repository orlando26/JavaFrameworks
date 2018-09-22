package com.jsf.bean;

import java.rmi.RemoteException;
import java.util.List;

import javax.xml.rpc.ServiceException;

import com.jaxws.ws.City;
import com.jaxws.ws.CreateUserService;
import com.jaxws.ws.CreateUserServiceImplService;
import com.jaxws.ws.ObjectFactory;
import com.jaxws.ws.RetrieveUserService;
import com.jaxws.ws.RetrieveUserServiceImplService;
import com.jaxws.ws.State;
import com.jaxws.ws.User;

public class Register extends Form{

	/**
	 * Register Bean
	 */
	private static final long serialVersionUID = -5945512854016826921L;
	
	private String name;

	private String lastName;

	private String email;

	private Integer age;

	private String address;

	private State state;

	private City city;

	private String password;
	
	private List<State> states;
	
	private List<City> cities;
	
	public Register(){
		//this.cities = getServices().getRetrieveCitiesService().getAllByState(1);
		state = new State();
		state.setId(1);
	}
	
	public void register(){
		String data = "Name: " + name + 
						"\nLast Name: " + lastName +
						"\nEmail: " + email +
						"\nAge: " + age +
						"\nAddress: " + address +
						"\nState: " + state +
						"\nCity: " + city +
						"\nPassword: " + password;
		System.out.println(data);
		
		CreateUserServiceImplService service = new CreateUserServiceImplService();
		RetrieveUserServiceImplService retrieveService = new RetrieveUserServiceImplService();
		RetrieveUserService retrieveUserService = retrieveService.getRetrieveUserServiceImplPort();
		
		CreateUserService createUserService = service.getCreateUserServiceImplPort();
		
		if(retrieveUserService.getUserByEmail(email) == null){
			User user = new User();
			user.setName(name);
			user.setLastName(lastName);
			user.setAge(age);
			user.setCity(city.getName());
			user.setAddress(address);
			user.setState(state.getName());
			user.setEmail(email);
			user.setPassword(password);
			
			String response = createUserService.insertUser(user);
			System.out.println(response);
		}else{
			System.out.println("User " + email + " already exist.");
		}
		
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public List<State> getStates() {
		states = getServices().getRetrieveStateService().getAll();
		return states;
	}


	public void setStates(List<State> states) {
		this.states = states;
	}


	public List<City> getCities() {
		cities = getServices().getRetrieveCitiesService().getAllByState(getState().getId());
		return cities;
	}


	public void setCities(List<City> cities) {
		this.cities = cities;
	}

}
