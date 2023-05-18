package studentdetailprint;

/**
 * model the  student class template
 * @author srinivsi
 */
public class Student 
{
    private String name; //encapsulation
   private  int age;
   
   public Student(String n, int a)
   {
       this.name = n;
       this.age = a;
   }
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
}
