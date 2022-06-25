package Hinh;

import App75.HinhHoc;

public class HinhTron extends HinhHoc {
  private final float PI = 3.14f;
  private float banKinh;
  public float getBanKinh(){
    return banKinh;
  }
  public void setBanKinh(float banKinh){
    this.banKinh = banKinh;
  }
  public float tinhChuVi(){
    return 2 * PI * banKinh;
  }
  public float tinhDienTich(){
    return PI * banKinh * banKinh;
  }
}
