package compositeExample2;

public class ClientCompositeExample2 {

	public static void main(String[] args) {
		Composite subTask1 = new Composite("Subtask1");
		subTask1.add(new Item("Item1", 6));
		subTask1.add(new Item("Item1", 6));
		
		Composite subTask2 = new Composite("Subtask2");
		subTask2.add(new Item("Item1", 6));
		subTask2.add(new Item("Item1", 6));
		
		Composite subTask3 = new Composite("Subtask3");
		subTask3.add(new Item("Item1", 6));
		subTask3.add(new Item("Item1", 6));
		
		Composite task1 = new Composite("Task1");
		task1.add(subTask1);
		task1.add(subTask2);
		task1.add(subTask3);
		Composite task2 = new Composite("Task2");
		task2.add(subTask1);
		task2.add(subTask2);
		task2.add(subTask3);
		Composite task3 = new Composite("Task3");
		task3.add(subTask1);
		task3.add(subTask2);
		task3.add(subTask3);
		
		Composite userStory = new Composite("UserStory");
		userStory.add(task1);
		userStory.add(task2);
		userStory.add(task3);
		
		System.out.println("Estimacion User Story: "+userStory.calcEstimacion());
	}

}
