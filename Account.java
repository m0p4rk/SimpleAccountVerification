public class Account {
    public static boolean login (String username, String password){
        if(username.equals("admin") && password.equals("passadmin")){
            return true;
        } else {
            return false;
        }
    }
    
}