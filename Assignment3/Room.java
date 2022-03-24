package Session3.Assignment3;

import java.util.Scanner;

public class Room {
    public String Tenphong;
    public String Vitri;
    public float Giatp;
    public String Danhsach;

    public String getTenphong() {
        return Tenphong;
    }

    public void setTenphong(String tenphong) {
        Tenphong = tenphong;
    }

    public String getVitri() {
        return Vitri;
    }

    public void setVitri(String vitri) {
        Vitri = vitri;
    }

    public float getGiatp() {
        return Giatp;
    }

    public void setGiatp(float giatp) {
        Giatp = giatp;
    }

    public String getDanhsach() {
        return Danhsach;
    }

    public void setDanhsach(String danhsach) {
        Danhsach = danhsach;
    }

    Scanner sc = new Scanner(System.in);

    public Room() {
        Tenphong = "202";
        Vitri = "5 Hem 52/25/19 Duong My Dinh, Lang Phu My " +
                " \n \t\t\t   Phuong My Dinh 2, Quan Nam Tu Liem, Ha Noi";
        Giatp = 1300;
        Danhsach = "\n \t\tMai Van Thien  \n \t\tLe Duy Duoc";
    }

    public Room(String Tenphong, String Vitri, float Giatp, String Danhsach) {
        this.Tenphong = Tenphong;
        this.Vitri = Vitri;
        this.Giatp = Giatp;
        this.Danhsach = Danhsach;
    }

    public void TT2() {
        System.out.println("\t -Ten phong:" + Tenphong);
        System.out.println("\t -Vi tri:" + Vitri);
        System.out.println("\t -Gia thue phong:" + Giatp);
        System.out.println("\t -Danh sach nguoi thue phong:" + Danhsach);
        System.out.println("\n");
    }

    public void TT3(){
        System.out.println("\t -Them nguoi vao danh sach phong 202:");
        Danhsach = sc.nextLine();
        System.out.println("Kiem tra yeu to dieu kien vao phong 202:");
        Giatp = sc.nextFloat();
        if (Giatp < 1300) {
            System.out.println("\t -Khong du dieu kien thue phong.");
        } else {
            System.out.println("\t -Du dieu kien thue phong.");
        }
    }

}
