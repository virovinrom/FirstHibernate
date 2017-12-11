package com.github.virovinrom;

public class Main {

    public static void main(String[] args) {

        DataBase dataBase = new DataBase();
        User user = new User();
        user.setId(1);
        user.setName("Slava");
        dataBase.addToDatabase(user);
        dataBase.exitFromTransaction();
        user = dataBase.returnFromDatabase();
        dataBase.exitFromTransaction();

        System.out.println(user.getName());
        System.out.println(user.getId());


        dataBase.exitFromDatabase();
    }


}
