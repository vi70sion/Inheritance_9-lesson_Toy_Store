public class Constructor extends Toy{
    int numberOfPiece;

    public Constructor(String toyName, String toyBrand, int ageWarning, double price, int numberOfPiece) {
        super(toyName, toyBrand, ageWarning, price);
        this.numberOfPiece = numberOfPiece;
    }
    public void setNumberOfPiece(int numberOfPiece) {this.numberOfPiece = numberOfPiece;}
    public int getNumberOfPiece(){ return numberOfPiece; }

    @Override
    public String toString(){
        return super.toString() + " number of piece " + numberOfPiece;
    }
}
