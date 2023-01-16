package pl.uwm.wmii.kaz.jacekt2000;
import java.time.LocalDate;
import java.util.Objects;

public class University {
    private String type;
    private int studies;

    public University(String name, String address, int students, LocalDate launch, String type, int studies)
    {
        super(name, address, students, launch);
        if (type == "")
        {
            type = "rolniczy";
        }
        if (studies<0)
        {
            studies = 20;
        }
        this.type = type;
        this.studies = studies;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStudies() {
        return studies;
    }

    public void setStudies(int studies) {
        this.studies = studies;
    }


    @Override
    public String toString() {
        return   "nazwa"  +
                "type='" + type + '\'' +
                ", studies=" + studies +
                '}' + University.class.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return getName == getName && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, studies);
    }




}