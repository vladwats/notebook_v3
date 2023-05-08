package edu.examples.java_classes.input.command.impl;

import java.util.List;
import java.util.Scanner;

import edu.examples.java_classes.entity.Note;
import edu.examples.java_classes.input.command.Command;
import edu.examples.java_classes.logic.NotebookLogic;
import edu.examples.java_classes.output.NotebookOutput;

public class ConsoleFindItemByContent implements Command {

	private NotebookLogic logic = new NotebookLogic(); 
	private NotebookOutput output = new NotebookOutput();
	
	
	@Override
	public void execute() {
		Scanner scanner = new Scanner(System.in);
		
		output.printSepаrator();
		
		output.printContent();
		output.printStartOfPrinting();
		
		
		String content = scanner.nextLine();
		
		List <Note> result = logic.find(content);
		
		output.print("Notes are found", result);		
				
		output.printSepаrator();		
				

	}

}
