import java.sql.SQLOutput;
import java.text.DecimalFormat;

public class School {
    public Student[] arrayStudents;

    public School() {
        arrayStudents = new Student[0];
    }

    public void addStudent(Student student){ //pridėti mokinį į masyvą.
        int arraySize = arrayStudents.length;
        Student[] arrayTemp = new Student[arraySize + 1];
        for (int i = 0; i < arraySize; i++){
            arrayTemp[i] = arrayStudents[i];
        }
        arrayTemp[arraySize] = student;
        arrayStudents = arrayTemp;
    }

    public Double calculateAverage(String name) { //apskaičiuoja vidurkį mokiniui pagal nurodytą vardą.
        int arraySize = arrayStudents.length;
        double gradeAver;
        int index = -1;
        for(int i = 0; i < arraySize; i++ ) {
            if(arrayStudents[i].name.equals(name)) index = i;
        }
        if(index < 0) {
            System.out.println("Mokinys " + name + " nerastas");
            return null;
        } else {
                int gradesArraySize = arrayStudents[index].grades.length;
                int sum = 0;
                for (int item: arrayStudents[index].grades){
                    sum += item;
                }
            gradeAver = (double) sum/gradesArraySize;
        }
        return gradeAver;
    }

    public void printStudentGrades(String name) {   //spausdina visus mokinio pažymius.
        int arraySize = arrayStudents.length;
        int index = -1;
        for(int i = 0; i < arraySize; i++ ) {
            if(arrayStudents[i].name.equals(name)) index = i;
        }
        if(index < 0) System.out.println("Mokinys " + name + " nerastas");
        else {
            System.out.print("Mokinio " + name + " pažymiai yra: ");
            for (int item: arrayStudents[index].grades){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    public void printTOP10Students() {  //spausdina visus studentus kurių vidurkis aukštesnis nei 8.5
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Mokinių top pagal vidurkį, aukštesnį nei 8.5: ");
        for(Student item: arrayStudents){
            if (calculateAverage(item.name) > 8.5){
                System.out.println("Mokinys " + item.name + ", vidurkis  " + df.format(calculateAverage(item.name)));
            }
        }
    }

    public void resortList(String order) {  //grąžina surikiuotą masyvą pagal order ("ASC", "DESC")
        boolean swapped;
        int n = arrayStudents.length;
        switch (order){
            case "ASC":
                do {
                    swapped = false;
                    for (int i = 1; i < n; i++) {
                        if (arrayStudents[i - 1].getName().compareTo(arrayStudents[i].getName()) > 0) {
                            Student studTemp = new Student(arrayStudents[i - 1].getName(), arrayStudents[i - 1].getGrades());
                            arrayStudents[i - 1] = arrayStudents[i];
                            arrayStudents[i] = studTemp;
                            swapped = true;
                        }
                    }
                    n--;
                } while (swapped);
                break;
            case "DESC":
                do {
                    swapped = false;
                    for (int i = 1; i < n; i++) {
                        if (arrayStudents[i - 1].getName().compareTo(arrayStudents[i].getName()) < 0) {
                            Student studTemp = new Student(arrayStudents[i - 1].getName(), arrayStudents[i - 1].getGrades());
                            arrayStudents[i - 1] = arrayStudents[i];
                            arrayStudents[i] = studTemp;
                            swapped = true;
                        }
                    }
                    n--;
                } while (swapped);
                break;
            default:
                System.out.println("Neteisingas įvedimas.");
                break;
        }
    }
}
