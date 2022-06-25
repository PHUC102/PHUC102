import Hinh.HinhTron;

public class App71 {
  public static void main(String[] args){
    HinhTron hinhTron = new HinhTron();
    hinhTron.setBanKinh(10);
    float chuVi = hinhTron.tinhChuVi();
    float dienTich = hinhTron.tinhDienTich();
    System.out.println("Chu vi hinh tron: " + chuVi + "\nDien tich hinh tron: " + dienTich);
  }
}