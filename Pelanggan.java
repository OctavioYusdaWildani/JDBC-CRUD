public class Pelanggan implements iSuperMarket {
    public String NamaPelanggan;
    public String Alamat;
    public String NoHp;

    public Pelanggan(String NamaPelanggan, String Alamat, String NoHp){
        this.NamaPelanggan=NamaPelanggan;
        this.Alamat=Alamat;
        this.NoHp=NoHp;
    }

    @Override
    public void cetakFaktur(){

    }

    @Override
    public Integer totalBayar() {
        throw new UnsupportedOperationException("Unimplemented method 'totalBayar'");
    }
   
}
