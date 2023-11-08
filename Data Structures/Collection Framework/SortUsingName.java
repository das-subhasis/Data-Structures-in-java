import java.util.Arrays;

class Student implements Comparable <Student>{
    String name;
    int roll;
    int age;
    int cls;

    public Student(String name, int age, int roll,int cls){
        this.name = name;
        this.age = age;
        this.roll = roll;
        this.cls = cls;
    }

    @Override
    public int compareTo(Student o) {
        char char1 = name.charAt(0);
        char char2 = o.name.charAt(0);
        if (char1 == char2){
            return age - o.age;
        }
        return (int)char1 - (int)char2;
    }

    public String toString(){ return String.format("{%s, %d, %d, %d}",name,age,roll,cls);}
}

public class SortUsingName {
    public static void main(String[] args) {
        Student[] students  = new Student[4];
        students[0] = new Student("Subhasis Das",23,24,15);
        students[1] = new Student("Ayan Bhattacharya",19,81,15);
        students[2] = new Student("Jatin Thapa",21,81,16);
        students[3] = new Student("Swastik Gurung",22,81,17);
        System.out.println("Before Sorting : "+Arrays.toString(students));

        Arrays.sort(students);

        System.out.println("After Sorting : "+Arrays.toString(students));
    }
}
