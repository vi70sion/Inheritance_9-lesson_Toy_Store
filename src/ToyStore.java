import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToyStore {
    private List<Toy> toyList = new ArrayList<>();
    private Map<Toy, Integer> shoppingBag = new HashMap();

    public List<Toy> getToyList() {return toyList;}
    public void setToyList(List<Toy> toyList) {this.toyList = toyList;}

    public void addToList(Toy toy){ this.toyList.add(toy); }
    public void removeFromList(Toy toy){ this.toyList.remove(toy); }

    public void addToyToShoppingBag(Toy toy, int quantity){
        this.shoppingBag.put(toy, quantity);
    }
    public Map<Toy, Integer> getShoppingBag() { return shoppingBag; }

    public void printToyList(){
        System.out.println("List of toys:");
        for(Toy item : toyList){
            System.out.println(item);
        }
    }
    public Toy findToy(String toyName){
        for(Toy item : toyList){
            if (item.getToyName().equals(toyName)) return item;
        }
        return null;
    }
    public void calculateBagAmount(){ //print shopping bag items and calculate price amount
        double bagAmount = 0;
        for(Map.Entry<Toy, Integer> entry: shoppingBag.entrySet()){
            System.out.println(entry.getKey().getToyName() + "- įdėta " + entry.getValue() + " vnt., suma: " + entry.getKey().getPrice() * entry.getValue());
            bagAmount += entry.getKey().getPrice() * entry.getValue();
        }
        System.out.println("Krepšelio prekių suma: " + bagAmount);
    }

}
