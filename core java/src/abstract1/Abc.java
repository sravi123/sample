
//Encapsulation using getters and setters

package abstract1;


public class Abc {
	private int age;
	public int getAge() {
		return age;
	}

      public void setAge(int age) {
		if(age<18 || age>130)
			throw new RuntimeException("Enter valid age"); 
		this.age = age;
	}

     private String name;
	
	  public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length()<3  || name.length()>10)
			throw new RuntimeException("Name should be in between 3 to 10");
		this.name = name;
	}
}
