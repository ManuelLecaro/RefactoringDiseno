/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.duplication.pullup;

import java.io.IOException;

/**
 *Para corregir el code dupplication, un ide te ayuda a verificar el codigo si
 * se ha deteriorado y tiene fragmentos repetidos
 * @author fuente de https://www.beyondjava.net/the-art-of-refactoring-removing-code-duplications
 */
public abstract class Duplications {
	public abstract void saveFile(String filename, String fileContent) throws IOException;
	public abstract String readFile(String filename) throws IOException;
	public abstract void log(String level, String message);

	private void saveGreetings(String fileContents) {
		String algorithm = "Greetings.txt" ;
		String errorMessage = "Can't write the file due to an exception";
		executeWithNiceLogging(algorithm, errorMessage);
	}

	public void createFile() {
		saveGreetings("Beyond Java says \"Hello World!\"");
	}

	private void executeWithNiceLogging(String algorithm, String errorMessage) {
            System.out.println(algorithm); // please provide better error diagnosis in real life!
	}
	
}