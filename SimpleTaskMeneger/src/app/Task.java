package app;

public class Task implements Comparable<Task> {

	private String name;
	private String description;
	private Priority priority;


	public Task(String name, String description, Priority priority) {
		super();
		this.name = name;
		if(description != null)
			this.description = description;
		else
			this.description = null;
		this.priority = priority;
	}





	enum Priority{
		LOW, MODERATE, HIGH;
	}





	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}





	public String getDescription() {
		return description;
	}





	public void setDescription(String description) {
		this.description = description;
	}





	public Priority getPriority() {
		return priority;
	}





	public void setPriority(Priority priority) {
		this.priority = priority;
	}





	@Override
	public String toString() {
		return "Task " + name + " : " + description + " prio " + priority ;
	}





	@Override
	public int compareTo(Task o) {
		return -this.priority.compareTo(o.priority);
	}
}
