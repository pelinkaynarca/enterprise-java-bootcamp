public class User {

    public User() {
        System.out.println("User created");
    }

    public User(String name, String surname, String email, String password) {
        this();
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public User(String email, String password){
        this();
        this.email = email;
        this.password = password;
    }

    String name;
    String surname;
    String email;
    String password;


    @Override
    public String toString() {
        return "Name: " + name + " Email: "+ email;
    }

}
