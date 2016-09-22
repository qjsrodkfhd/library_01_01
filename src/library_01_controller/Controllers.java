package library_01_controller;

public class Controllers {

	private static LoginController loginControlles;
	private static UserController userController;
	private static BookController bookController;
	

	
	public Controllers() {

		loginControlles = new LoginController();
		userController = new UserController();
		bookController = new BookController();

	}

	public static LoginController getLoginControlles() {
		return loginControlles;
	}
	
	public static UserController getUserController() {
		
		return userController;
		
	}
	public static BookController getBookController() {
		return bookController;
	}
}
