/*
 * Example of multiple inheritance using interface
 */

package loyd.proramming;


import loyd.programming.loyd.City;
import loyd.programming.loyd.OffGreed;
import loyd.programming.loyd.Province;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City city = new Province();
		city.counts();
		city.Greetings();
		city.population();;
		city.numHouses();
		
		System.out.println("*******************");
		
		City city1 = new OffGreed();
		city1.counts();
		city1.Greetings();
		System.out.println(city1.numHouses());
		System.out.println(city1.population());
	
	}

}
