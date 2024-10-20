import java.util.*;
public class baiTapVeNha{
   public static void main(String[] args) {
    String name; double heso;
    Scanner sc = new Scanner(System.in);
    System.out.println("Ten phong ban: ");
    name = sc.nextLine();
    System.out.print("So luong nhan vien muon nhap: ");
    byte soNhanVien = sc.nextByte();
    sc.nextLine();
    PhongBan obj = new PhongBan(name, soNhanVien);
    System.out.println();
    for(int i = 0;i < soNhanVien ;i ++){
        System.out.print("Nhap ten nhan vien muon them: ");
        //sc.nextLine();
        name = sc.nextLine();
        //System.out.println();
        System.out.print("Nhap he so luong cua nhan vien: ");
         heso = sc.nextDouble();
         sc.nextLine();
        NhanVien nhanVienMoi = new NhanVien(name, heso);
        if(obj.themNV(nhanVienMoi)){
            //System.out.println("Done");
        }else{
            System.out.println("Full, khong the them nhan vien");
        }
    }
    obj.inTTin();
    sc.close();
   }
}