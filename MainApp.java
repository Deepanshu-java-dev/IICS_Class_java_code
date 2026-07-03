class User {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username.trim();
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
interface AuthService 
{
    void register(User user);
    boolean login(String username, String password);
}
class AuthServiceImpl implements AuthService 
{

    User[] users = new User[5];
    int count = 0;

    @Override
    public void register(User user) {
        if (count < users.length) {
            users[count++] = user;
            System.out.println("User Registered Successfully");
        } else {
            System.out.println("User limit reached");
        }
    }

    @Override
    public boolean login(String username, String password) {
        for (int i = 0; i < count; i++) {
            if (users[i].getUsername().equals(username.trim())
                    && users[i].getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}