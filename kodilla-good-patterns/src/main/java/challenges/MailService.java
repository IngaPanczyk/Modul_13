package challenges;

public class MailService implements InformationService {

    public void inform(User user){
        System.out.println("Email was send to: "+ user.getName());
    }
}
