import java.util.ArrayList;
public class StudentMain {

	public static void main(String[] args) {
		ArrayList<Student> studentsList=new ArrayList<>();
		 
        Student s1=new Student("John",12);
        Student s2=new Student("Martin",11);
        Student s3=new Student("Mary",10);
        Student s4=new Student("Sneha",13);
 
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);
        studentsList.add(s4);
 
        System.out.println("Student List:"+studentsList);
	}

}
