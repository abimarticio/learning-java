// arrays of objects

class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Sample_11 {
    public static void main(String[] args) {
        Student[] arr;        // declares an array
        arr = new Student[3]; // allocating memory for 3 objects

        arr[0] = new Student("Mona", 18); // first element of array
        arr[1] = new Student("Ross", 19); // second element
        arr[2] = new Student("Joey", 19); // third element
       
        // accessing the elements in the array
        for(int i = 0; i < arr.length; i++) {
            System.out.println("My name is " + arr[i].name + "\nI'm " + arr[i].age + " years old\n");
        }

    }
}