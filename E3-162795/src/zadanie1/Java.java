package zadanie1;

import java.time.LocalDate;
import java.util.Date;
import java.util.Vector;


public class Java extends ProgrammingLanguage implements Cloneable,Comparable<Java>{
    private static LocalDate dateOfStart = null;
    private Date dateTheLatestRelease = null;
    private Vector<String> properties = null;

    {
        dateOfStart = LocalDate.of(1995, 5, 23);
    }

    public Java(boolean isObjectOriented, Vector<String> prop) {
        super(isObjectOriented);
        this.properties = prop;
        this.dateTheLatestRelease = new Date();
    }

    public Vector<String> getProperties() {
        return properties;
    }

    public static LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public static void setDateOfStart(LocalDate dateOfStart) {
        Java.dateOfStart = dateOfStart;
    }

    public Date getDateTheLatestRelease() {
        return dateTheLatestRelease;
    }

    public void setDateTheLatestRelease(Date dateTheLatestRelease) {
        this.dateTheLatestRelease = dateTheLatestRelease;
    }

    public void setProperties(Vector<String> properties) {
        this.properties = properties;
    }

    public String toString() {
        return "Language: " + getClass().getSimpleName()
                + ", dateOfStart = " + dateOfStart
                + ", dateTheLatestRelease = " + dateTheLatestRelease
                + ", properties = " + properties;
    }

    @Override
    public Java clone() {
        try {
            Java clone = (Java) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public int compareTo(Java o)
    {
        return this.dateTheLatestRelease.compareTo(o.dateTheLatestRelease);
    }
}
