import java.util.Date;
import java.text.DateFormat;


public class employe {

// Описание полей
    // ИМЯ
    private String firstName;
    // ФАМИЛИЯ
    private String surName;
    // ОТЧЕСТВО
    private String patronymic;
    // Дата рождения
    private Date dateOfBirth;
    // ПОЛ
    private char gender;
    // Семейное положение
    private String family;
    // Адресс проживания
    private String adress;
    // НОМЕР ТЕЛЕФОНА
    private String tel;
    // ЗАРПЛАТА
    private int sallary;
    // ИМЯ НАЧАЛЬНИКА
    private String chief;
    // НАЗВАНИЕ ОТДЕЛА
    private String departmentId;

// Описание get/set

    // get/set для ИМЯ
    public String getFirstName() {
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
    Department dep;
}
