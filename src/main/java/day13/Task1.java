package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Ilon");
        User user2 = new User("Baiden");
        User user3 = new User("Lebron");

        user1.sendMessage(user3,"Hello Jaims!");
        user1.sendMessage(user3,"How are you men ?)");

        user3.sendMessage(user1, "Good");
        user3.sendMessage(user1, "How is you rokets?");
        user3.sendMessage(user1,"Fly?");

        user2.sendMessage(user1,"Hey!!! men ");
        user2.sendMessage(user1," Нou did it !!!!");
        user2.sendMessage(user1," It is fantastic");

        user1.sendMessage(user2," Thank you mister president");



        MessageDatabase.showDialog(user1,user3);




    }
}
