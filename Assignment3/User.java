package Session3.Assignment3;

import java.util.Scanner;

public class User {
    public String Ten;
    public String Email;
    public String Dienthoai;
    public int Tuoi;
    public float Sotienhc;

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDienthoai() {
        return Dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        Dienthoai = dienthoai;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public float getSotienhc() {
        return Sotienhc;
    }

    public void setSotienhc(float sotienhc) {
        Sotienhc = sotienhc;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    Scanner sc = new Scanner(System.in);

    public User(){
        Ten = "Mai Van Thien";
        Email = "maithien2003ns@gmail.com";
        Dienthoai = "0352804383";
        Tuoi = 19;
        Sotienhc = 15000;

    }

    public User(String Ten, String Email, String Dienthoai, int Tuoi, float Sotienhc){
        this.Ten = Ten;
        this.Email = Email;
        this.Dienthoai = Dienthoai;
        this.Tuoi = Tuoi;
        this.Sotienhc = Sotienhc;
    }

    public void TT(){
        System.out.println("\t -Ten:"+Ten);
        System.out.println("\t -Email:" + Email);
        System.out.println("\t -Phone:" + Dienthoai);
        System.out.println("\t -Tuoi:" +Tuoi);
        System.out.println("\t -So tien hien co:" +Sotienhc);
        System.out.println("\n");
    }
}
