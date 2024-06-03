package demo;

public class App {
	
	public void login()
	{   //Login Functionality added
		System.out.println("login---Method");
	}

	public void register() {
		// register Functionality Added
		System.out.println("register --method");
	}

	int i=10; 

	public static void main(String[] args) {
		System.out.println("main--Start");

		App a = new App();

		a.register();
	}
}
