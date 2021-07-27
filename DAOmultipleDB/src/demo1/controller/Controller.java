package demo1.controller;

import java.sql.SQLException;

import demo1.model.*;
import demo1.view.CreateUserEvent;
import demo1.view.CreateUserListener;
import demo1.view.View;

public class Controller implements CreateUserListener {
	private View view;
	private Model model;

	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void userCreated(CreateUserEvent event) {
		DAOFactory factory = DAOFactory.getFactory(DAOFactory.MYSQL);

		PersonDAO personDAO = factory.getPersonDAO();


		System.out.println("Login event received: " + event.getName() + "; " + event.getPassword());
		
		try {
			personDAO.addPerson(new Person(event.getName(), event.getPassword()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
