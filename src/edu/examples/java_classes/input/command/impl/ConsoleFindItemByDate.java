package edu.examples.java_classes.input.command.impl;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import edu.examples.java_classes.entity.Note;
import edu.examples.java_classes.input.command.Command;
import edu.examples.java_classes.logic.NotebookLogic;
import edu.examples.java_classes.output.NotebookOutput;

public class ConsoleFindItemByDate implements Command{
	
	private NotebookLogic logic = new NotebookLogic(); 
	private NotebookOutput output = new NotebookOutput();

	@Override
	public void execute() {
		Scanner scanner = new Scanner(System.in);
		
		output.printSepаrator();
		
		output.printYear();
		output.printStartOfPrinting();
		int year = scanner.nextInt();
		
		output.printMonth();
		output.printStartOfPrinting();
		int month = scanner.nextInt();
		
		output.printDay();
		output.printStartOfPrinting();
		int day = scanner.nextInt();
		
		Date date = new Date(year-1900, month-1, day);
		date.setHours(0);		
		date.setMinutes(0);
		date.setSeconds(0);
		
		
		
		List<Note> result = logic.find(date);
		output.print("Notes are found", result);
		
		output.printSepаrator();
		
		
	}

}
