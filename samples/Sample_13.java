// OOP
// Polymorphism
// Method overloading

class StudentInfo {
    // Method with one parameter
    static String Student(String name) {
        return name;
    }
    // Method with same name but int parameter
    static int Student(int age) {
        return age;
    }
}
class Sample_13 {
    public static void main(String[] args) {
        System.out.println(StudentInfo.Student("Alivia"));
        System.out.println(StudentInfo.Student(19));
    }
}