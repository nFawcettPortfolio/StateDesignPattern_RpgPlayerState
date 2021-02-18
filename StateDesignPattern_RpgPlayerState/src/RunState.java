
public class RunState implements State{
	public void doAction(Context context) {
		System.out.println("Player is running.");
		context.setState(this);
	}
	public String toString() {
		return "Run state";
	}
}
