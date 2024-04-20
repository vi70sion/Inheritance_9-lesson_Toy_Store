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

        Scanner scanner = new Scanner(System.in);

        Toy toy1 = new Doll("Barbie_clone", "made in china", 3, 8.50, DollHairstyle.TWOBRAIDS);
        Toy toy2 = new Doll("Barbie_original", "Mattel", 3, 29.90, DollHairstyle.WATTERFALL);
        Toy toy3 = new Constructor("Battleship", "PlayWrite", 8, 21.00, 216);
        Toy toy4 = new Constructor("Police_car", "Revel", 10, 19.00, 40);

        ToyStore store = new ToyStore();
        store.addToList(toy1);
        store.addToList(toy2);
        store.addToList(toy3);
        store.addToList(toy4);

        System.out.println("Žaislų sąrašas:");
        for(Toy item : store.getToyList()){
            System.out.println(item);
        }
        System.out.println();

        System.out.println("Kurį žaislą norite pašalinti (pavadinimas):");
        String toyName = scanner.nextLine();
        boolean foundToyByName = false;
        for(Toy item : store.getToyList()){
            if (item.getToyName().equals(toyName)){
                //store.getToyList().remove(item);
                store.removeFromList(item);
                foundToyByName = true;
                break;
            }
        }
        if(!foundToyByName) System.out.println("Neradome tokio žaislo.");
        store.printToyList();
        System.out.println();

//        + Sukurkite valdymą krepšelio (žaislų sąrašo) kad pagal pavadinimą galima įdėti
//        prekes į krepšelį. Prekių krepšelio valdymas turi turėti pasirinkimus - įdėti į krepšelį
//        ir skaičiuoti krepšelio prekių sumą. (Prekės dedamos į krepšelį ir jo meniu valdomas įvestimi :) )

        String choice = "";
        do{
            System.out.println("(1)- prekių sąrašas, (2)- pridėti prekę į krepšelį, (3)- suskaičiuoti krepšelio prekių sumą, (0)- pabaiga");
            choice = scanner.nextLine();
            switch (choice){
                case "1":
                    store.printToyList();
                    break;
                case "2":
                    int quantity = 0;
                    System.out.println("Įveskite prekės pavadinimą: ");
                    toyName = scanner.nextLine();
                    if(store.findToy(toyName) != null){
                        System.out.println("Įveskite kiekį: ");
                        quantity = Integer.parseInt(scanner.nextLine());
                        store.addToyToShoppingBag(store.findToy(toyName), quantity);
                        break;
                    }
                    System.out.println("Prekė nerasta, pakartokite.");
                    break;
                case "3":
                    store.calculateBagAmount();
                    break;
                case "0":
                    break;

            }
        } while(!choice.equals("0"));

    }
}