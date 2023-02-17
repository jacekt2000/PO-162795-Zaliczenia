package zadanie2;

import java.util.ArrayList;
import java.util.Comparator;

public class zadanie2
{
    public static  <E> void kopiuj (ArrayList<? super E>lista , ArrayList<E> lista2)
    {
        int z = 1;
        for(int i = 0; i < lista2.size(); i++) {
            lista.add(lista2.get(lista2.size()-z));
            z++;
        }

    }

    public static void main(String[] args)
    {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println(l1);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(8);
        l2.add(9);
        l2.add(0);
        System.out.println(l2);
        kopiuj(l1,l2);
        System.out.println(l1);

        System.out.println("przerwaaa");
        ArrayList<String> l3 = new ArrayList<>();
        l3.add("a");
        l3.add("b");
        l3.add("c");
        System.out.println(l3);
        ArrayList<String> l4 = new ArrayList<>();
        l4.add("x");
        l4.add("z");
        l4.add("k");
        System.out.println(l4);
        kopiuj(l3,l4);
        System.out.println(l3);



    }
}
