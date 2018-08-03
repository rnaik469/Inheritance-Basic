package Question18;

//Demo class for creating instances
public class Demo {
	static void perform(Game game) {// perform method with game interface parameter
		game.play();
	}

	public static void main(String[] args) {
		Cricket cricket = new Cricket();// Cricket class instance
		perform(cricket);
		Tennis tennis = new Tennis();// Tennis class instance
		perform(tennis);
		FootBall football = new FootBall();// Football class instance
		perform(football);
	}
}
