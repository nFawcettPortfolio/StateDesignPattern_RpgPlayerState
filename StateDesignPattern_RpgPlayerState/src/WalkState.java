
public class WalkState implements State{
	public void doAction(Context context) {
		System.out.println("Player is walking.");
		context.setState(this);
	}
	public String toString() {
		return "Walk state";
	}
}
