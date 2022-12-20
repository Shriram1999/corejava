package in.com.Exceptionhandling;

public class throw_Exception {

	public static void main(String[] args) {
		auth("ram");
	}

	private static void auth(String user) {
		
		if(!user.equals("Admin")){
			
			LoginException e =new LoginException();
			try {
			throw e;
			}catch (LoginException e1) {
		
				System.out.println(e.getMessage());
			}
		}
		
	}

}
