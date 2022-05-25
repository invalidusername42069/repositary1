package studentdetails;
/* changes*/
import java.util.Scanner;

public class StudentDetails {

    public static void main(String[] args) {
        students[] studentlist = new students[3];
        
        System.out.println("Enter student name ");
        
        students s1 = new students();
        students s2 = new students();
        students s3 = new students();
        s1.setName("Dixie normous");
        s1.setAge(69);
        s2.setName("Hugh Jass");
        s2.setAge(420);
        s3.setName("Same En");
        s3.setAge(42069);
        //Storing the values in the array
        studentlist[0]=s1;
        studentlist[1]=s2;
        studentlist[2]=s3;
        
        for(int i = 0;i<studentlist.length;i++){
        System.out.println(studentlist[i].getName()+" "+studentlist[i].getAge());
        }
        
    }
    
}
