public class Toy {
    private String toyName, toyBrand;
    private int ageWarning; //not allowed before this age
    private double price;

    public Toy(String toyName, String toyBrand, int ageWarning, double price) {
        this.toyName = toyName;
        this.toyBrand = toyBrand;
        this.ageWarning = ageWarning;
        this.price = price;
    }

    public String getToyName() {return toyName;}
    public void setToyName(String toyName) {this.toyName = toyName;}
    public String getToyMake() {return toyBrand;}
    public void setToyMake(String toyMake) {this.toyBrand = toyMake;}
    public int getAgeWarning() {return ageWarning;}
    public void setAgeWarning(int ageWarning) {this.ageWarning = ageWarning;}
    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    @Override
    public String toString(){
        return toyName + " " + toyBrand + " " + " age from " + ageWarning + " price " + price;
    }
}
