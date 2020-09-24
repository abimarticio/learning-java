// classes and objects

package Sample_15;

class StudentInfo {

    String firstName;
    String lastName;
    int studentId;
    int age;
    String gender;
    public static void main(String[] args) {

        StudentInfo s1  =  new StudentInfo();
        s1.firstName    =  "Clarke";
        s1.lastName     =  "Griffin";
        s1.studentId    =  2020123456;
        s1.age          =  18;
        s1.gender       =  "Female";

        StudentInfo s2  =  new StudentInfo();
        s2.firstName    =  "Bellamy";
        s2.lastName     =  "Blake";
        s2.studentId    =  2020123789;
        s2.age          =  20;
        s2.gender       =  "Male";

        System.out.println(s1.firstName + " " + s1.lastName);
        System.out.println(s2.firstName + " " + s2.lastName);
    }
}