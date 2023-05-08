package edu.examples.java_classes.output;

import java.util.List;

import edu.examples.java_classes.entity.Note;

public class NotebookOutput {
	
	public void print(String title, List<Note> notes) {
		
		System.out.println(title.toUpperCase());
		System.out.println();
		
		if(notes == null || notes.size() <= 0) {
			System.out.println("Нет записей для вывода.");
			return;
		}
		
		for(Note n : notes) {
			System.out.println(n.getId() + " - " + n.getTitle()+ " - " + n.getContent() + " - " + n.getD());
		}
		
	}
	
	public void printSepаrator() {
		System.out.println("_________________________________");
	}
	
	public void printTitle() {
		System.out.println("Enter the title: ".toUpperCase());
	}
	
	public void printContent() {
		System.out.println("Enter the content: ".toUpperCase());
	}
	
	public void printStartOfPrinting() {
		System.out.println("> ");
	}
	
	public void printYear() {
		System.out.println("Enter the year: ");
	}
	
	public void printMonth() {
		System.out.println("Enter the month: ");
	}
	public void printDay() {
		System.out.println("Enter the day: ");

	}

}
