public class Food extends Customer { //Inheritance
    private String namaMakanan; // Encapsulation
    private String Jenis;
    private int Harga;


    public String getNamaMakanan(){ return this.namaMakanan; }
    public void setNamaMakanan (String na){ this.namaMakanan = na; }

    public String getJenis(){
        return this.Jenis;
    }
    public void setJenis (String jenis){
        this.Jenis = jenis;
    }

    public int getHarga(){
        return this.Harga;
    }
    public void setHarga(int rp){
        this.Harga = rp;
    }

    @Override //Polymorphism
    public String getDetails() {
        return "Anda memesan " + getNamaMakanan() + " dengan harga " + getHarga() + " Rupiah";
    }

    }
