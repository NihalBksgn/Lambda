package team21_lambda;

public class CanPojo {

    private String sezon;
    private String kursAdi;
    private int ortPuan;
    private int ogrNo;

    public CanPojo() {

    }

    public CanPojo(String sezon, String kursAdi, int ortPuan, int ogrNo) {
        this.sezon = sezon;
        this.kursAdi = kursAdi;
        this.ortPuan = ortPuan;
        this.ogrNo = ogrNo;
    }

    @Override
    public String toString() {
        return "CanPojo{" +
                "sezon='" + sezon + '\'' +
                ", kursAdi='" + kursAdi + '\'' +
                ", ortPuan=" + ortPuan +
                ", ogrNo=" + ogrNo +
                '}';
    }

    public String getSezon() {
        return sezon;
    }

    public void setSezon(String sezon) {
        this.sezon = sezon;
    }

    public String getKursAdi() {
        return kursAdi;
    }

    public void setKursAdi(String kursAdi) {
        this.kursAdi = kursAdi;
    }

    public int getOrtPuan() {
        return ortPuan;
    }

    public void setOrtPuan(int ortPuan) {
        this.ortPuan = ortPuan;
    }

    public int getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(int ogrNo) {
        this.ogrNo = ogrNo;
    }


}
