package maharishi.oop.generics.comparing;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks){
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int) (this.marks - o.marks);
        // if diff = 0: means they are equal
        // if diff<1: means o is bigger
        return -diff;
    }

    @Override
    public String toString() {
        return  marks + "";
    }
}
