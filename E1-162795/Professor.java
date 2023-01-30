package zadanie1;

import java.util.Date;

public class Professor extends AcademicTeacher {
    private final int id;
    private Date dateOfStart = null;

    public Professor(String name, int id) {
        super(name);
        this.id = id;
        this.dateOfStart = new Date();
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ID = " + id
                + ", dateOfStart = " + dateOfStart
                + "]";
    }
}
