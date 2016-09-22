package library_01_main;

import library_01_controller.Controllers;
import library_01_controller.LoginController;

public class Main {

	public static void main(String[] args) {
		
		new Controllers();
		LoginController loginController = Controllers.getLoginControlles();
		loginController.requestMainLogin();

	}

}
