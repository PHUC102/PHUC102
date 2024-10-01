import Model.NhanVienFullTime;

import Model.NhanVienPartTime;

import Model.Configs;
public class App79 {
  public static void main(String[] args){
        NhanVienFullTime sep = new NhanVienFullTime("Trần Văn Sếp");
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyễn Văn Lính"); 
        NhanVienFullTime linh2 = new NhanVienFullTime("Lê Thị Lính", 3); 
        NhanVienPartTime thoiVu = new NhanVienPartTime("Phan Thị Thời Vụ", 240); 
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoiVu.tinhLuong();
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoiVu.xuatThongTin();
  }
}
