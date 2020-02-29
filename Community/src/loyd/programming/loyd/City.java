package loyd.programming.loyd;

public abstract class City implements Broadway, Fairview {
	
	public void Greetings() {
		System.out.println("Hello and Welcome! ");
		
	}
	@Override
	public int numHouses() {
		System.out.println(8);
		return 0;
	}
	@Override
	public int population() {
		System.out.println(100);
		return 0;
	}
	
	public abstract void counts();

}
