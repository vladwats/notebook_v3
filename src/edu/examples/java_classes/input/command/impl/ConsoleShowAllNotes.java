package edu.examples.java_classes.input.command.impl;

import edu.examples.java_classes.input.command.Command;
import edu.examples.java_classes.logic.NotebookLogic;
import edu.examples.java_classes.output.NotebookOutput;

public class ConsoleShowAllNotes implements Command {
	
	private NotebookLogic logic = new NotebookLogic();
	private NotebookOutput output = new NotebookOutput();
	
	@Override
	public void execute() {
		
		output.printSepаrator();
		
		output.print("all my notes", logic.allNotes());
		 
		output.printSepаrator();
    }

}


