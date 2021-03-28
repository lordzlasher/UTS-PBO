public abstract class Customer { //Abstract
    private String Name; // Encapsulation
    private String Phone;
    public abstract String getDetails(); //Abstract

    public String getNama(){
        return this.Name;
    }
    public void setNama (String nama){this.Name = nama; }
    public String getTelepon(){
        return this.Phone;
    }
    public void setTelepon (String telpon){
        this.Phone = telpon;
    }
}
