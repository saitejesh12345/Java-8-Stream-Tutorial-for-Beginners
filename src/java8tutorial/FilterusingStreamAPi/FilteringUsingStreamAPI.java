package java8tutorial.FilterusingStreamAPi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringUsingStreamAPI {
    public static void main(String[] args) {
//logic to filter using stream API
        //take one list and store filter data in list2
        List<ElectronicGadgets> list2 =
                //logic
                getProducts().stream().filter((obj) -> obj.getPrice() > 50000f).
                        collect(Collectors.toList());
//print it
        list2.forEach(System.out::println);

//or we can directly print the object like this without storing also
//        getProducts().stream().filter((obj) -> obj.getPrice() > 50000f)
//                .forEach(System.out::println);
    }
    public static List<ElectronicGadgets> getProducts() {
        List<ElectronicGadgets> productlist = new ArrayList<ElectronicGadgets>();
        productlist.add(new ElectronicGadgets(1, "HP BOOK", 35000f));
        productlist.add(new ElectronicGadgets(2, "Lenova BOOK", 38000f));
        productlist.add(new ElectronicGadgets(3, "MAC BOOK", 70000f));
        productlist.add(new ElectronicGadgets(4, "DELL BOOK", 39000f));
        productlist.add(new ElectronicGadgets(5, "ACER BOOK", 28000f));
        return productlist;
    }
}
class ElectronicGadgets {
    private  int id;
    private String NameOfLaptop;
    private float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfLaptop() {
        return NameOfLaptop;
    }

    public void setNameOfLaptop(String nameOfLaptop) {
        NameOfLaptop = nameOfLaptop;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public ElectronicGadgets(int id, String nameOfLaptop, float price) {
        this.id = id;
        NameOfLaptop = nameOfLaptop;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ElectronicGadget{" +
                "id=" + id +
                ", NameOfLaptop='" + NameOfLaptop + '\'' +
                ", price=" + price +
                '}';
    }
}

