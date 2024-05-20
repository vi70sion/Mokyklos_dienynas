import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

//        Mokyklos dienynas
//        Aprašymas:
//        Sukurkite programą, kuri saugotų mokinių pažymius ir pateiktų statistiką.
//        Reikalavimai:
//        Sukurkite klasę Student, su savybėmis name (vardas) ir grades (pažymių sąrašas).
//                Student klasėje turėtų būti metodas addGrade(int grade), leidžiantis pridėti pažymį į pažymių masyvą.
//        Sukurkite klasę School, kuri turėtų masyvąstudents, saugantį Student objektus.
//        School klasėje implementuokite metodus:
//        addStudent(Student student): pridėti mokinį į masyvą.
//        calculateAverage(String name): apskaičiuoja vidurkį mokiniui pagal nurodytą vardą.
//        printStudentGrades(String name): spausdina visus mokinio pažymius.
//        printTOP10Students() :spausdina visus studentus kurių vidurkis aukštesnis nei 8.5
//        resortList(String order) :grąžina surikiuotą masyvą pagal order ("ASC", "DESC")

        School school = new School();
        Student student = new Student();
        student.addGrade(7);
        student.addGrade(9);
        student.addGrade(6);
        student.addGrade(8);
        school.addStudent(new Student("Mokinys1", student.grades.clone()));
        student.grades = new int[0];
        student.addGrade(8);
        student.addGrade(9);
        student.addGrade(10);
        student.addGrade(8);
        school.addStudent(new Student("Mokinys2", student.grades.clone()));
        student.grades = new int[0];
        student.addGrade(10);
        student.addGrade(9);
        student.addGrade(8);
        student.addGrade(8);
        student.addGrade(10);
        school.addStudent(new Student("Mokinys3", student.grades.clone()));
        student.grades = new int[0];

        //apskaičiuoja vidurkį mokiniui pagal nurodytą vardą
        String studName = "Mokinys1";
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Mokinio " + studName + " pažymių vidurkis yra: " + df.format(school.calculateAverage(studName)));
        System.out.println();

        //spausdiname visus mokinio pažymius
        studName = "Mokinys3";
        school.printStudentGrades(studName);
        System.out.println();

        //spausdina visus studentus kurių vidurkis aukštesnis nei 8.5
        school.printTOP10Students();
        System.out.println();

        //grąžina surikiuotą masyvą pagal order ("ASC", "DESC")
        String order = "DESC";
        school.resortList(order);
        System.out.println("Rikiavimas pagal vardą " + order + ": ");
        for(Student item: school.arrayStudents){
            System.out.println(item);
        }
        order = "ASC";
        school.resortList(order);
        System.out.println("Rikiavimas pagal vardą " + order + ": ");
        for(Student item: school.arrayStudents){
            System.out.println(item);
        }

    }
}