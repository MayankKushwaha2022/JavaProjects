public class Student extends Person {
   public Student(String name){
      super(name);
   }
   public void displayStudent() {
      System.out.println("Data of the Student class: ");
      //System.out.println("Name: "+super.name);
   }
   public static void main(String[] args) {
      Student std = new Student("Krishna");
      System.out.println(std.getName());
   }
}