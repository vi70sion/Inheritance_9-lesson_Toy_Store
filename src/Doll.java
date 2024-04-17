public class Doll extends Toy{
    private DollHairstyle hairStyle;
    public Doll(String toyName, String toyBrand, int ageWarning, double price, DollHairstyle hairStyle) {
        super(toyName, toyBrand, ageWarning, price);
        this.hairStyle = hairStyle;
    }
    public void setHairStyle(DollHairstyle hairStyle) {this.hairStyle = hairStyle; }
    public DollHairstyle getHairStyle(){ return hairStyle;}

    @Override
    public String toString(){
        return super.toString() + " " + hairStyle;
    }
}
