import java.io.*;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

   	// ArrayList named people that holds Person objects:
		ArrayList<Person> people = new ArrayList<Person>();
    // 5 new Person objects to people
		people.add(new Person("ZiYan",20,"blue"));
		people.add(new Person("A",87,"pink"));
		people.add(new Person("B",13,"yellow"));
		people.add(new Person("C",55,"black"));
		people.add(new Person("D",4,"green"));
    // try block:
		try {
      // FileWriter object named fWriter
			FileWriter fWriter = new FileWriter("data.txt");
      // BufferedWriter object named bWriter and uses fWriter:
			BufferedWriter bWriter = new BufferedWriter(fWriter);
      // Loop to add each person to the file:
			for(int i = 0; i < people.size(); i++) {
        // write in the file
				bWriter.write(people.get(i).getName());
        bWriter.newLine();
        bWriter.write(Integer.toString(people.get(i).getAge()));
        bWriter.newLine();        
        bWriter.write(people.get(i).getColor());
        bWriter.newLine();
        // close the try block and the writer object:
        bWriter.flush();
			}
			bWriter.close();
		} 
    catch (IOException e) {
			System.out.println("An error occurred: " + e);
		}


    // read from the file created, start from a try block
		try {
      // FileReader object named fReader:
			FileReader fReader = new FileReader("data.txt");
      // BufferedReader object named bReader and uses fReader:
			BufferedReader bReader = new BufferedReader(fReader);

      // while loop to loop thru bReader
      String name = " ";
      String age = " ";
      String color = " ";
      while(bReader.ready()) {
        name = bReader.readLine();
        age = bReader.readLine();
        color = bReader.readLine();
        System.out.printf("%-10s %-10s %-10s %n", name, age, color);
      }
      // close bReader:
			bReader.close();
		} 
    catch (IOException e) {
			System.out.println("An error occurred: " + e);
		}


  }

}
