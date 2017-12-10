package hibernate.java.test;

public class Main {

    public static void main(String[] args) {

        DataBase dataBase = new DataBase();
        User user = new User();
        user.setId(1);
        user.setName("Slava");
        dataBase.addToDatabase(user);
        user = dataBase.returnFromDatabase();

        System.out.println(user.getName());
        System.out.println(user.getId());

        dataBase.exitFromDatabase();
    }


}
