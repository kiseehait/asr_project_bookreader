
public class Main {
	public static void main(String[] args) {
		Frame f = new Frame();
		Controller c = new Controller(f);
		HTKReader r = new HTKReader(c);
		(new Thread(r)).start();
		
		c.goToFrontCover();
	}
}
