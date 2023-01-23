package pl.uwm.wmii.kaz.jacekt2000;

public class TestProduct {
    public static void main(String[] args)
    {
        //objekty do Product
        Product p1 = new Product("siema", 10 , 2 , 2);
        Product p2 = new Product("lol", 10 , 5 , 20);


        //Gettery
        System.out.println(p1.getName());
        System.out.println(p1.getPrice());
        System.out.println(p1.getQuality());
        System.out.println(p1.getTax());
        System.out.println(p1.getDate());
        System.out.println("\n");
        //settery
        p1.setName("lol");
        p1.setPrice(-5);
        p1.setQuality(-2);
        p1.setTax(-5);
        p1.setDate("15-05-2020");
        System.out.println(p1.getName());
        System.out.println(p1.getPrice());
        System.out.println(p1.getQuality());
        System.out.println(p1.getTax());
        System.out.println(p1.getDate());
        System.out.println("");
        //toString
        System.out.println("metoda tostring" + "\n" + p1 );
        //metoda buy
        System.out.println("metoda buy " + p1.buy());
        System.out.println(" ");
        //metoda equals
        System.out.println("metoda equals " + p1.equals(p2));
//         a,b,c,d,e,f // g nie zrobione
        System.out.println(" ");

        //objekty do Book
        Book b1 =new Book("siema", 10.5 , 3 , 20, "Sienkiewicz", "ogniem i mieczem");
        Book b2 =new Book("siema", 12, 3, 20, "Bol","ogniem i mieczem");

        //gettery
        System.out.println(b1.getAuthors());
        System.out.println(b1.getTitle());
        System.out.println(b1.getTax());
        System.out.println("");
        //settery
        b1.setAuthors("wafel");
        b1.setTitle("lamus");
        System.out.println(b1.getAuthors());
        System.out.println(b1.getTitle());
        // equals
        System.out.println("metoda equals " + b1.equals(b2));
        System.out.println(" ");
        //toString
        System.out.println(b1);
        //metoda buy działa 10.5 *5 bo 400% + 100% poprzednia
        System.out.println("metoda buy wynosi " + b1.buy());
        //
    }
}