/**
 * Created by willson on 2017/3/8.
 *
 * @author willson
 *         published under GNU Protocol
 */
public class School {
    public Student[] students;

    public School(){
        students = new Student[10];
        for (int i = 0; i < 10; i++) {
            students[i]=new Student(i*10);
        }
    }

    public void mathClass(){
        for(int i =0;i<10;i++){
            students[i].study("Math");
        }
    }

    public static void main(String[] args) {
        School SFLS = new School();
        SFLS.mathClass();
    }
}
