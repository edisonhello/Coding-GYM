import java.util.Scanner;

public abstract class Player {
	Scanner input = new Scanner(System.in);
	
	protected String name;
	private boolean graph;

	public Player() {
		super();
		named();
	}
	
	public void setGraph(int choice) {
		if (choice == 0) {
			graph = true;
		}
		else if (choice == 1)
			graph = false;
	}
	
	public boolean getGraph() {
		return graph;
	}
	
	public abstract String named();
	
	public String getName() {
		return name;
	}

	public abstract int Choice();
	
}
