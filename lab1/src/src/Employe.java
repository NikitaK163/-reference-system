import java.util.Date;
import java.text.DateFormat;


public class Employe {

// Описание полей

    private Department dep;
    private final String fio; //Имя
    private final String tel;// телефон
    private final Department dep; //Отдел
    private final BigDecimal sallary;//Зарплата
    private final Date dateOfBirth;//Дата рождения
    private final Employe chief;//Название отдела

    public Employe(String fio, String tel, Department dep, BigDecimal sallary, Date dateOfBirth, Employe chief) {
        this.fio = fio;
        this.tel = tel;
        this.dep = dep;
        this.sallary = sallary;
        this.dateOfBirth = dateOfBirth;
        this.chief = chief;
    }


    /*public Employe(String fio) {
        this.fio = fio;
    }
    public Employe(String tel) {
        this.tel = tel;
    }
    public Employe(Department dep) {
        this.dep = dep;
    }
    public Employe(BigDecimal sallary) {
        this.sallary = sallary;
    }
    public Employe(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public Employe(Employe chief) {
        this.chief = chief;
    }*/

// Описание get/set

    // get/set для ИМЯ
   /* public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // get/set для ФАМИЛИЯ
    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    // get/set для ОТЧЕСТВО
    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    // get/set для ДАТА РОЖДЕНИЯ
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // get/set для ПОЛ
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // get/set для СЕМЕЙНОЕ ПОЛОЖЕНИЕ
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    // get/set для АДРЕСС
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    // get/set для ЗАРПЛАТА
    public int getSalary() {
        return sallary;
    }

    public void setSallary(int sallary) {
        this.sallary = sallary;
    }

    // get/set для НАЗВАНИЕ ОТДЕЛА
    public String getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
    Department dep;*/
}
