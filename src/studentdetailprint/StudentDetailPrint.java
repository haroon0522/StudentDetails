package studentdetailprint;

import java.util.Scanner;

/** initialize versioning git
 * .gitconfig file
 * .gitignore file
 * commit
 */

public class StudentDetailPrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // array of object decalration
         Student[] list = new Student[3];
         
         Scanner in = new Scanner(System.in);
         // store 3 student objects in array, also define each student name and age
         for(int i=0;i<list.length;i++)
         {
             String n = in.next();
             int a= in.nextInt();
             // create object
             Student s1 = new Student(n,a); //one object
             list[i]= s1;
             
         }
         for(int i=0;i<list.length;i++)
         {
             System.out.println(list[i].getName()+" is "+list[i].getAge()+" years old.");
         }
    }
}