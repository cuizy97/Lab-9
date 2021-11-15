class Person {
  //name, age, and color with access controls:
	private String name;
	private int age;
	private String color;
	
  // constructor for person:
  // @param: name, age, and color
	public Person(String aName, int aAge, String aColor) {
		name = aName;
		age = aAge;
		color = aColor;
	}

  // accessors:
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getColor() {
		return color;
	}
	
}
