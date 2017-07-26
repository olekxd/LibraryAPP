package app;

import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import app.Task.Priority;

public class TaskManager {

	public static void main(String[] args) {
		TaskManager tManager = new TaskManager();
		try (Scanner scanner = new Scanner(System.in)) {
			tManager.printMenu(scanner);
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}

	}

	private void printMenu(Scanner sc) {
		Queue<Task> tasks = new PriorityQueue<>();
		Option next = null;
		while(next == null || next != Option.EXIT){
			printOption();
			next = Option.createFromInt(sc.nextInt());
			sc.nextLine();
			switch (next) {
			case ADD:
				tasks.offer(addTask(sc));
				break;
			case TAKE :
				takeTask(tasks.poll());
				break;
			case READ :
				printTasks(tasks);
				break;
			case EXIT :
				System.out.println("Application will be closed now");
				break;
			}

		}
	}

	private void printOption() {
		for (Option op : Option.values()) {
			System.out.println(op);
		}
	}

	private Task addTask(Scanner sc) {
//		Scanner sc = new Scanner(System.in);
		String name = null;
		String description = null;
		Priority priority = null;
//		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Type task name: ");
			name = sc.nextLine();
			System.out.println("Are You want to write additional description? yes\no");
			description = null;
			String decision = sc.nextLine().toLowerCase();
			if (decision.equals("yes")) {
				System.out.println("Add description");
				description = sc.nextLine();
			} else {
				description = null;
			}
			System.out.println("Set priority low, moderate or high");
			priority = Priority.valueOf(sc.nextLine().toUpperCase());
//		} catch (InputMismatchException e) {
//			System.err.println("Wrong format of data");
//		}
			sc.close();

		return new Task(name, description, priority);
	}

	private void printTasks(Queue<Task> tasks) {
		for (Task task : tasks) {
			System.out.println(task);
		}
	}

	private void takeTask(Task task) {
		System.out.println("Your next task");
		System.out.println(task);
	}

	private enum Option {
		EXIT(0, "to exit"), ADD(1, "to add new task"), TAKE(2, "to take next task"), READ(3, "to print all tasks");

		private int number;
		private String description;

		private Option(int number, String description) {
			this.number = number;
			this.description = description;
		}

		public String toString() {
			return number + " " + description;
		}

		static Option createFromInt(int number) {
			Option option = null;
			try {
				option = Option.values()[number];

			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("You choosed a wrong option");
			}
			return option;
		}
	}
}
