import java.io.FileNotFoundException;
import java.io.FileReader;
/**
 * Created by nsieverska on 15.08.15.
 */
public class Reader {

	public void getTextFromFile() throws FileNotFoundException{
		FileReader reader = new FileReader("/home/nsieverska/SQ/projects/PhoneBook1/src/phoneBook");

		System.out.println(reader.toString());
	}

	public static void main(String[] args) throws FileNotFoundException{
		Reader reader = new Reader();
		reader.getTextFromFile();
	}
}
