package COM.AKMAL.PBO.Pertemuan4;

public class Manager extends pegawai {
    public void bonus(int bonus){
        System.out.println("Pegawai dengan nama "+nama+" " +
                "("+nip+") mendapatkan bonus sebesar Rp "+bonus);
    }
    public void extraInfo(){
        System.out.println("Jabatan Pegawai Manager");
    }
    public void bonus(){
        System.out.println("Eror : harap masukan jumlah bonusnya!");
    }
}
