public class Customer {

    private String name;
    private String surname;
    private String email;
    private String password;

    public String getFullName(){
        return name + "" + surname;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        if(name == null | name==""){
            System.out.println("İsim boş olamaz");
            return;
        }
        this.name = name;
    }

    public void setPassword(String password) {
        if (password.length()<6){
            System.out.println("Şifre 6 karakterden daha fazla olmalıdır.");
            return;
        }
        this.password = password;
    }

    public void setEmail(String email) {
        if (email.endsWith("@gmail.com")) {
            System.out.println("Email @gmail formatında olmalıdır.");
            return;
        }
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
