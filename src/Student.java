public class Student {
    public String name;
    public int[] grades;

    public Student() {
        grades = new int[0];
    }

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public void addGrade(int grade){
        int arraySize = grades.length;
        int[] arrayTemp = new int[arraySize + 1];
        for (int i = 0; i < arraySize; i++){
            arrayTemp[i] = grades[i];
        }
        arrayTemp[arraySize] = grade;
        grades = arrayTemp;
    }

}
