package demo1;

import javax.swing.SwingUtilities;

import demo1.controller.Controller;
import demo1.model.Model;
import demo1.view.View;

public class Application {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				runApp();
			}
			
		});
	}
	
	public static void runApp() {
		Model model = new Model();
		View view = new View(model);

		Controller controller = new Controller(view, model);
		
		view.setLoginListener(controller);
	}

}
