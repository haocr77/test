package BT_HoaDon_KhachHang;

import java.util.Scanner;

public class Hang {
    private String tenHang;
    private double soLuong;
    private double donGia;
    
    public void nhap(){
        Scanner s=new Scanner(System.in);
        System.out.printf("Nhap ten hang=");
        tenHang=s.nextLine();
        System.out.printf("Nhap so luong=");
        soLuong=s.nextDouble();
        System.out.printf("Nhap don gia=");
        donGia=s.nextDouble();
    }
    
    public double tinhTongTien(){
        return soLuong*donGia;
    }
    
    public static  void inTieuDe(){
        System.out.printf("-%10s -%10s -%10s -%15s %n","ten hang", "so luong","don gia","thanh tien");
    }
   /**
    * bổ sung xâu định dạng in dữ liệu thẳng hàng với tiêu đề
    */
    public void inDL(){
        System.out.printf("-%10s -%10.1f -%10.1f -%15.0f%n",
                tenHang,soLuong,donGia,tinhTongTien());
    }       

    public String getTenHang() {
        return tenHang;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public double getDonGia() {
        return donGia;
    }
    
}