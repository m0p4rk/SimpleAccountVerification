import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Account {
	public static boolean login(String username, String password) {
		if (username.equals("admin") && password.equals("passadmin")) {
			return true;
		} else {
			return false;
		}
	}

	public static void loginfail(boolean admin) {
		if (admin == true) {
			System.out.println("Login success, welcome Admin");
		} else {
			System.out.println("USER NOT ALLOWED");
		}
	}

	public static void sublogin(String username, String password) {
		password = "********";
		System.out.println(username + "is not an admin. Password is encrypted as " + password);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String username = br.readLine();
		String password = br.readLine();

		System.out.println("result :");

		if (login(username, password) == true) {
			loginfail(login(username, password));
		} else {
			sublogin(username, password);
		}

	}

}