import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Created by nsieverska on 15.08.15.
 */
public class Writer {

	public void writeFile() throws FileNotFoundException, IOException{
		FileWriter fileWriter = new FileWriter("/home/nsieverska/SQ/projects/PhoneBook1/src/phoneBook");

		fileWriter.write("ololo");
		fileWriter.flush();
		fileWriter.close();
	}

	public static void main(String[] args) throws FileNotFoundException, IOException{
		Writer writer = new Writer();
		writer.writeFile();
	}
}
