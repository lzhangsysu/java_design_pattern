package demo1.controller;

import java.sql.SQLException;

import demo1.model.DAOFactory;
import demo1.model.Model;
import demo1.model.Person;
import demo1.model.PersonDAO;
import demo1.view.CreateUserEvent;
import demo1.view.CreateUserListener;
import demo1.view.View;

public class Controller implements CreateUserListener {
	private View view;
	private Model model;
	
	private PersonDAO personDAO = DAOFactory.getPersonDAO();
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void userCreated(CreateUserEvent event) {
		System.out.println("Login event received: " + event.getName() + "; " + event.getPassword());
		
		try {
			personDAO.addPerson(new Person(event.getName(), event.getPassword()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
