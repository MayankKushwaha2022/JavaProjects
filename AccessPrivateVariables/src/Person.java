class Person{
   private String name;
   public Person(String name){
      this.name = name;
   }

	/*
	 * public void setName(String name) { this.name = name; }
	 */
	   public String getName() {
	      return this.name;
	   }
   public void displayPerson() {
      System.out.println("Data of the Person class: ");
      System.out.println("Name: "+this.name);
   }
}