package zadanie1;

public abstract class ProgrammingLanguage {
    private boolean isObjectOriented;

    public ProgrammingLanguage(boolean isObjectOriented) { this.isObjectOriented = isObjectOriented; }
    public final boolean getIsObjectOriented() { return isObjectOriented; }
}

