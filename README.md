### Mokyklos dienynas

Aprašymas:
Sukurkite programą, kuri saugotų mokinių pažymius ir pateiktų statistiką.

Reikalavimai:
Sukurkite klasę Student, su savybėmis name (vardas) ir grades (pažymių sąrašas).
Student klasėje turėtų būti metodas addGrade(int grade), leidžiantis pridėti pažymį į pažymių masyvą.

Sukurkite klasę School, kuri turėtų masyvąstudents, saugantį Student objektus.

School klasėje implementuokite metodus:

addStudent(Student student): pridėti mokinį į masyvą.

calculateAverage(String name): apskaičiuoja vidurkį mokiniui pagal nurodytą vardą.

printStudentGrades(String name): spausdina visus mokinio pažymius.

printTOP10Students() :spausdina visus studentus kurių vidurkis aukštesnis nei 8.5

resortList(String order) :grąžina surikiuotą masyvą pagal order ("ASC", "DESC")
