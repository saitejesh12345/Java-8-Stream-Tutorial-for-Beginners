package java8tutorial.FilterusingStreamAPi;



import java.util.ArrayList;
import java.util.List;
//after this code refer FIlter using Stream API
public class ToFilterObjectsTraditionalway {
    public static void main(String[] args) {
List<ElectronicGadgets> lis = new ArrayList<ElectronicGadgets>();
for(ElectronicGadgets pro :getProducts()){
    if(pro.getPrice()<40000f){
        lis.add(pro);

    }

}
for(ElectronicGadgets prod:lis){
System.out.println(prod);
}
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
    class ElectronicGadget{
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

        public ElectronicGadget(int id, String nameOfLaptop, float price) {
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

