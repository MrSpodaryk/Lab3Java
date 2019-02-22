package test_read;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Input {

	public static void ma(String... strings) throws IOException {
		File myFile = new File("happiness_from_java");
		
		try (FileOutputStream fos = new FileOutputStream(myFile);
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				BufferedWriter bufWriter = new BufferedWriter(osw);) {

			bufWriter.write("I'm happy!");
			bufWriter.newLine();
			bufWriter.write("from writting in C++");

		} finally {

		}
	}
	
	public static void main(String... strings) throws IOException {
		ma(strings);
		File myFile = new File("happiness_from_java");
		
		
		try (FileInputStream fis = new FileInputStream(myFile);
				InputStreamReader isw = new InputStreamReader(fis);
				BufferedReader bufReader = new BufferedReader(isw);) {

			
			
			String line = null;
			while((line = bufReader.readLine()) != null);
			System.out.println(line);
			
		} finally {

		}
	}
}
