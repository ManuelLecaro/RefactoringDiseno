/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.duplication;

import java.io.IOException;

/**
 *El codigo tiene partes repetidas, para arreglar esto se lo conoce como pill up
 * @fuente de https://www.beyondjava.net/the-art-of-refactoring-removing-code-duplications
 */
public abstract class Duplications {
	public abstract void saveFile(String filename, String fileContent) throws IOException;
	public abstract String readFile(String filename) throws IOException;
	public abstract void log(String level, String message);

	public void createFile()
	{
		try
		{
			saveFile("Greetings.txt", "Beyond Java says \"Hello World!\"");
		}
		catch (IOException error)
		{
			// please provide better error diagnosis in real life!
			log("Error", "Can't write the file due to an exception");
		}
	}
	public void copyFile()
	{
		try
		{
			String fileContents = readFile("OldFileName.txt");
			try
			{
				saveFile("Greetings.txt", fileContents);
			}
			catch (IOException error)
			{
				// please provide better error diagnosis in real life!
				log("Error", "Can't write the file due to an exception");
			}
		}
		catch (IOException error)
		{
			// please provide better error diagnosis in real life!
			log("Error", "Can't read the file");
		}
	}
}
