package demo1.controller;

import demo1.model.Model;
import demo1.view.View;

public class Controller {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }
}
