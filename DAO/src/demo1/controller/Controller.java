package demo1.controller;

import demo1.model.Model;
import demo1.model.Person;
import demo1.model.PersonDAO;
import demo1.view.CreateUserEvent;
import demo1.view.CreateUserListener;
import demo1.view.View;

public class Controller implements CreateUserListener {
    private View view;
    private Model model;

    private PersonDAO personDAO = new PersonDAO();

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void userCreated(CreateUserEvent event) {
        System.out.println("Create user event received: " + event.getName() + "; " + event.getPassword());

        personDAO.addPerson(new Person(event.getName(), event.getPassword()));
    }
}
