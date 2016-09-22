package library_01_dao;

import library_01_domain.Login;
import library_01_repository.LoginRepository;

public class LoginDao {
	
	public LoginDao(){
		
		new LoginRepository();
		
	}
	
	//로그인 등록
	public boolean login(Login login){
		
		boolean success = false;
		
		
		return success;
	}
	
	//로그인 체크
	public boolean loginCheck(){
		
		boolean success = false;
		
		return success;
		
	}
	
	//로그아웃
	public boolean logOut(){
		boolean success = false;
		
		return success;
		
	}
	
}
