package challenges;

public class User {

    private String name;
    private String surname;
    private String nick;

    public User(String name, String surname, String nick) {
        this.name = name;
        this.surname = surname;
        this.nick = nick;
    }

    public String getName() {
        return name;
    }
}
