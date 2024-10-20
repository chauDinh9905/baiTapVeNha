import java.util.*;
public class NhanVien{
    private String tenNhanVien;
    private double heSoLuong;
    public static final double LUONG_CO_BAN = 750000;
    public static final double LUONG_MAX  = 20000000;
    public void setName(String nameNhanVien){
        this.tenNhanVien = nameNhanVien;
    }
    public String getName(){
        return this.tenNhanVien;
    }
    public void setHeSoLuong(double heSo){
        Scanner sc = new Scanner(System.in);
        while(heSo * LUONG_CO_BAN > LUONG_MAX){
            System.out.println("Can not apply this \"he so luong \", nhap lai he so luong: ");
            double input = sc.nextDouble();
            heSo = input;
        }
        this.heSoLuong = heSo;
    }
    public double getHeSoLuong(){
        return this.heSoLuong;
    }
    public NhanVien(String tenNhanVien, double heSoLuong){
        this.tenNhanVien = tenNhanVien;
        this.heSoLuong = heSoLuong;
    }
    public boolean tangLuong(double heSoTang){
         if((this.heSoLuong + heSoTang)*LUONG_CO_BAN > LUONG_MAX)
           return false;
        else return true;
    }
    public double tinhLuong(){
        if(this.heSoLuong * LUONG_CO_BAN > LUONG_MAX){
            return LUONG_MAX;
        }else{
            return this.heSoLuong * LUONG_CO_BAN;
        }
    }
    public void inTTin(){
        System.out.println("Ten nhan vien: " + this.getName());
        System.out.println("Luong co ban: " + LUONG_CO_BAN);
        System.out.println("He so luong: "  + this.getHeSoLuong());
        System.out.println("Luong: " + this.tinhLuong());
        System.out.println("Luong Max: " + LUONG_MAX);
    }
}
