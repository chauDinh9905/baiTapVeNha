import java.util.LinkedList;

public class PhongBan {
    private String tenPhongBan;
    private byte soNhanVien;
    public static final byte SO_NV_MAX = 100;
    public LinkedList<NhanVien> listNV = new LinkedList<NhanVien>();

    public void setNamePhongBan(String namePhongBan) {
        tenPhongBan = namePhongBan;
    }

    public String getNamePhongBan() {
        return this.tenPhongBan;
    }

    public void setSoNhanVien(byte numberNhanVien) {
        soNhanVien = numberNhanVien;
    }

    public byte getSoNhanVien() {
        return this.soNhanVien;
    }

    public PhongBan(String tenPhongBan, byte soNhanVien/* , List<NhanVien> listNV*/) {
        //super(tenPhongBan, soNhanVien);
        this.tenPhongBan = tenPhongBan;
        this.soNhanVien = soNhanVien;
        //this.listNV = listNV;
    }

    public boolean themNV(NhanVien A) {
        if (soNhanVien > SO_NV_MAX) {
            return false;
        } else {
            listNV.add(0, A);
            soNhanVien++;
            return true;
        }
    }

    public NhanVien xoaNV() {
        if (listNV.size() == 0) {
            return null;
        } else {
            NhanVien nhanVienBiXoa = listNV.get(0);
            listNV.remove(0);
            soNhanVien--;
            return nhanVienBiXoa;
        }
    }

    public double tongLuong() {
        double sum = 0;
        if (listNV.size() != 0) {
            for (NhanVien i : listNV) {
                sum += i.tinhLuong();
            }
        } else {
            sum = 0;
        }
        return sum;
    }

    public void inTTin() {
        System.out.println("Ten phong ban: " + this.getNamePhongBan());
        System.out.println("So nhan vien cua phong ban: " + this.getSoNhanVien());
        System.out.println("Thong tin cua nhan vien: ");
        for (NhanVien i : listNV) {
            i.inTTin();
        }
    }
}