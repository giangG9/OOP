package NguyenTruongGiang_BaiTap03;

public class Vehicle {
	private String tenchuXe;
	 private String tenXe;
	 private int dungTich;
	 private float triGia;
	 
	 public Vehicle() {
	  super();
	  // TODO Auto-generated constructor stub
	 }
	 
	public Vehicle(String tenchuXe, String tenXe, int dungTich, float triGia) {
	  super();
	  this.tenchuXe = tenchuXe;
	  this.tenXe = tenXe;
	  this.dungTich = dungTich;
	  this.triGia = triGia;
	 }
	  
	 public float thueTruocba() {
	  float thue = 0f;
	  
	  if(dungTich < 100) thue = (1f/100) * triGia;
	  else if(dungTich <200) thue = (3f/100) * triGia;
	  else thue = (5f/100) * triGia;
	  
	  return thue;
	 }
	 
	   @Override
	 public String toString() {
	  return String.format("%-20s %-20s %12d %,20.1f %,20.1f", tenchuXe, tenXe, dungTich, triGia, thueTruocba());
	 }

	 public String getTenchuXe() {
	  return tenchuXe;
	 }

	 public void setTenchuXe(String tenchuXe) {
	  this.tenchuXe = tenchuXe;
	 }

	 public String getTenXe() {
	  return tenXe;
	 }

	 public void setTenXe(String tenXe) {
	  this.tenXe = tenXe;
	 }

	 public int getDungTich() {
	  return dungTich;
	 }

	 public void setDungTich(int dungTich) {
	  this.dungTich = dungTich;
	 }

	 public float getTriGia() {
	  return triGia;
	 }

	 public void setTriGia(float triGia) {
	  this.triGia = triGia;
	 }
}
