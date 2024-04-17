import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Parašykite programą, kuri modeliuoja žaislų parduotuvę. Jums reikės sukurti
//        pagrindinę klasę Žaislas, kuri turės šiuos atributus: pavadinimas, gamintojas,
//        amžiaus riba ir kaina. Sukurkite reikiamus getterius ir setterius, taip pat konstruktorių,
//        leidžiantį sukurti žaislo objektą su nurodytais atributais. Toliau sukurti dvi subklases,
//        Lėlė ir Konstruktorius. Kiekviena subklasė turi papildomus atributus, pavyzdžiui, lėlės turi
//        šukuosenos tipą(Enum) ir konstruktoriai turi detalės skaičių. Kiekviena subklasė taip pat
//        turi turėti savo konstruktorių, kuris prideda šiuos papildomus atributus, ir tinkamus getterius ir setterius.
//        Galų gale, parašykite klasę Parduotuvė, kurioje yra sąrašas su turimais žaislais.
//        Sukurkite metodus, kurie leistų pridėti naujus žaislus į sąrašą, išimti žaislus iš sąrašo ir apskaičiuoti
//        bendrą žaislų kainą už nurodytą kiekį.
//        + Sukurkite valdymą krepšelio (žaislų sąrašo) kad pagal pavadinimą galima įdėti
//        prekes į krepšelį. Prekių krepšelio valdymas turi turėti pasirinkimus - įdėti į krepšelį
//        ir skaičiuoti krepšelio prekių sumą. (Prekės dedamos į krepšelį ir jo meniu valdomas įvestimi :) )

        Scanner scaner = new Scanner(System.in);

        Toy toy1 = new Doll("Barbie clone", "made in china", 3, 8.50, DollHairstyle.TWOBRAIDS);
        Toy toy2 = new Doll("Barbie original", "Mattel", 3, 29.90, DollHairstyle.WATTERFALL);
        Toy toy3 = new Constructor("Battleship", "PlayWrite", 8, 21.00, 216);
        Toy toy4 = new Constructor("Police car", "Revel", 10, 19.00, 40);

        ToyStore store = new ToyStore();
        store.addToList(toy1);
        store.addToList(toy2);
        store.addToList(toy3);
        store.addToList(toy4);

        System.out.println("List of toys:");
        for(Toy item : store.getToyList()){
            System.out.println(item);
        }
        System.out.println();

        System.out.println("Which toy you want to remove (name):");
        String toyName = scaner.nextLine();
        boolean foundToyByName = false;
        for(Toy item : store.getToyList()){
            if (item.getToyName().equals(toyName)){
                store.getToyList().remove(item);
                foundToyByName = true;
            }
        }
        if(!foundToyByName) System.out.println("Did not find this toy");
        System.out.println("List of toys:");
        for(Toy item : store.getToyList()){
            System.out.println(item);
        }
        System.out.println();




    }
}