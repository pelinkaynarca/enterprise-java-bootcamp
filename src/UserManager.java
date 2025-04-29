public class UserManager {

    void validation(User user){
        if(user.name.length() < 2){
            System.out.println("isim alanı daha uzun olmalıdır.");
            return;
        }

        if(!user.email.endsWith("@gmail.com")){
            System.out.println("Email formatında değil.");
            return;
        }

        System.out.println("validasyon kurallarından geçti");
    }

    User update(User oldUser, User newUser){
        oldUser.name = newUser.name;
        oldUser.email = newUser.email;
        return newUser;
    }
}
