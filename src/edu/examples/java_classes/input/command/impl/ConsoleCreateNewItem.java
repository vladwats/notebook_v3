package edu.examples.java_classes.input.command.impl;

import java.util.Scanner;

import edu.examples.java_classes.input.command.Command;
import edu.examples.java_classes.logic.NotebookLogic;
import edu.examples.java_classes.output.NotebookOutput;

public class ConsoleCreateNewItem implements Command{
	
	private NotebookLogic logic = new NotebookLogic (); 
	private NotebookOutput output = new NotebookOutput();

	@Override
	public void execute() {
				
		Scanner scanner = new Scanner(System.in);
		
		output.printSepаrator();
		
		output.printTitle();
		output.printStartOfPrinting();
								
		String title = scanner.nextLine();

				
		output.printContent();
		output.printStartOfPrinting();

		String content = scanner.nextLine();
		

		logic.add(title,content);
		
		output.printSepаrator();

		
	}

}
