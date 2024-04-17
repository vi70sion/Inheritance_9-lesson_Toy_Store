import java.util.ArrayList;
import java.util.List;
public class ToyStore {
    private List<Toy> toyList = new ArrayList<>();

    public List<Toy> getToyList() {return toyList;}
    public void setToyList(List<Toy> toyList) {this.toyList = toyList;}

    public void addToList(Toy toy){ this.toyList.add(toy); }
    public void removeFromList(Toy toy){ this.toyList.remove(toy); }

}
