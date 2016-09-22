package library_01_controller;

import library_01_dao.UserDao;
import library_01_domain.User;
import library_01_view.UserRegisterView;

public class UserController {

	private UserDao userDao;
	
	public UserController(){
		
		userDao = new UserDao();
		
	}

	//
	public void requestRegisterUser() {
		UserRegisterView userRegisterView = new UserRegisterView();
		User user = userRegisterView.getUserInfo();
		
		boolean success = userDao.insertUser(user);
		
	}
	
}
