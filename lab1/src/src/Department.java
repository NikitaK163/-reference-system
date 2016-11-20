import java.lang.String;
public class Department {
    private final String name; //Название отдела
    private final Employe chief;//Начальник отдела

    public Department(String name, Employe chief) {
        this.name = name;
        this.chief = chief;
    }
}
