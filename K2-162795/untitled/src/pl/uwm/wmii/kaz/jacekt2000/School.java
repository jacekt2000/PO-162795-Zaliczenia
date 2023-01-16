package pl.uwm.wmii.kaz.jacekt2000;
import jdk.nashorn.internal.objects.annotations.Getter;
import java.time.LocalDate;
import java.util.Objects;

public class School {
    private String name;
    private String address;
    private int students;
    private LocalDate launch;

    public School(String name, String address, int students, LocalDate launch)
    {
        if (students < 0)
        {
            students = 50;
        }
        if( address == "")
        {
            address = "ul. Słoneczna 54, 10-710 Olsztyn";
        }
        if(launch.isAfter() = LocalDate.now())
        {
            launch = LocalDate.now();
        }
        this.address = address;
        this.name = name;
        this.students = students;
        this.launch = launch;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public int getStudents() {
        return this.students;
    }
    public LocalDate getLaunch() {
        return this.launch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address)
    {
        if( address == "")
            this.address = "ul. Słoneczna 54, 10-710 Olsztyn";
    }

    public void setStudents(int students) {
        if (students < 0)
            this.students = 50;
    }

    public void setLaunch(LocalDate launch) {
        if(launch.isAfter() = LocalDate.now())
            this.launch = launch;
    }

    @Override
    public String toString()
    {
        return   "nazwa szkoły to " + this.name + "o adresie" + this.address + "ma studentów " + this.students
                + "otworzona " + this.launch + "." + School.class.getName();
    }

    public int hashCode()
    {
        return Objects.hash(name, address, students, launch);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof School))
            return false;
        School school = (School) obj;
        return this.name == school.name;
    }
    public static void jakiLimit(School other)
    {
        System.out.println(other.students);
        System.out.println(200 - other.students);
    }

    public int rekrutacja() {
        if (students > 200)
        {
            students = 200;
        }
        return this.students;
    }
}