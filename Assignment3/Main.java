package Session3.Assignment3;

public class Main {
    public static void main(String args[]){
        User us = new User();
        us.TT();
        User u = new User("Truong Xuan Minh", "minhtrx2003ns@gmail.com","0837503456",18,2000f );
        u.TT();

        Room r = new Room();
        r.TT2();
        Room rz = new Room("202", "My Dinh2 - Nam Tu Liem - Ha Noi", 1300f,"\n \t\tTruong Xuan Minh");
        rz.TT2();
        rz.TT3();
    }
}
