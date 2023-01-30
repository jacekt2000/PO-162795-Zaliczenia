package zadanie1;

public class ProfessorDemo {
    public static void main(String[] args){
        AcademicTeacher p = new Professor("Fred", 1729);
        System.out.println(p.getName());
        Professor s = (Professor) p;
        System.out.println(s.getName());
        /*
        Named n = s;
        System.out.println(n.getName());
        Professor d = s.clone();
        System.out.println(d.getName());
        System.out.println(d);

        ArrayList<Professor> profesorowie = new ArrayList<>();
        profesorowie.add(new Professor("Zenon", 10));
        profesorowie.add(new Professor("Andrzej", 122));
        profesorowie.add(new Professor("Kamil", 23));

        studenci.sort(new NamesComparator());

        System.out.println();
        for (Professor e : profesorowie) {
            System.out.println("nazwisko = " + e.getName() + ", id = " + e.getId());
        }
        System.out.println();
        */


    }
}
