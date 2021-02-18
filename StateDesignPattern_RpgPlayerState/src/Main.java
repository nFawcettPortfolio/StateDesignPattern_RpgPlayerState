public class Main {
	public static void main(String[] args) {
		Context context = new Context();
		
		IdleState idle= new IdleState();
		idle.doAction(context);
		System.out.println(context.getState());
		
		WalkState walk= new WalkState();
		walk.doAction(context);
		System.out.println(context.getState());

		RunState run= new RunState();
		run.doAction(context);
		System.out.println(context.getState());

		

	}
}
