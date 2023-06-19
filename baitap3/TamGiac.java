package baitap3;

public class TamGiac {
	private double ma;
    private double mb;
    private double mc;

    public TamGiac() {
        this.ma = 0;
        this.mb = 0;
        this.mc = 0;
    }

    public TamGiac(double ma, double mb, double mc) {
        if (ma <= 0 || mb <= 0 || mc <= 0 || (ma + mb <= mc) || (mb + mc <= ma) || (mc + ma <= mb)) {
            this.ma = 0;
            this.mb = 0;
            this.mc = 0;
        } else {
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        }
    }

    public void setMa(double ma) {
        if (ma > 0 && (ma + this.mb > this.mc) && (ma + this.mc > this.mb)) {
            this.ma = ma;
        }
    }

    public void setMb(double mb) {
        if (mb > 0 && (this.ma + mb > this.mc) && (mb + this.mc > this.ma)) {
            this.mb = mb;
        }
    }

    public void setMc(double mc) {
        if (mc > 0 && (this.ma + this.mb > mc) && (this.mb + mc > this.ma)) {
            this.mc = mc;
        }
    }

    public double getMa() {
        return ma;
    }

    public double getMb() {
        return mb;
    }

    public double getMc() {
        return mc;
    }

    public double tinhChuVi() {
        return ma + mb + mc;
    }

    public double tinhDienTich() {
        double p = tinhChuVi() / 2;
        return Math.sqrt(p * (p - ma) * (p - mb) * (p - mc));
    }

    public String kieuTamGiac() {
        if (ma == mb && mb == mc) {
            return "Tam giac deu";
        } else if (ma == mb || mb == mc || mc == ma) {
            return "Tam giac can";
        } else if (ma != mb && mb != mc && mc != ma) {
            return "Tam giac thuong";
        } else {
            return "Khong phai tam giac";
        }
    }

    @Override
    public String toString() {
        return "Tam giac: ma = " + ma + ", mb = " + mb + ", mc = " + mc + "\n" +
                "Kieu tam giac: " + kieuTamGiac() + "\n" +
                "Chu vi: " + tinhChuVi() + "\n" +
                "Dien tich: " + tinhDienTich();
    }

    public static void main(String[] args) {
        TamGiac tamGiac = new TamGiac(3, 4, 5);
        System.out.println(tamGiac.toString());

        tamGiac.setMa(6);
        tamGiac.setMb(8);
        tamGiac.setMc(10);
        System.out.println(tamGiac.toString());
    }
}
