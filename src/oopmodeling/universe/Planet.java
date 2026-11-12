package oopmodeling.universe;

public class Planet extends CelestialBody{
	
	private int age = 23;
	public Planet(double mass, float radius, String name) {
		//create or initialize the parent properties
		super(mass, radius, name);
		/*
		 * before changing any properties of an object
		 * created from Planet, we must first create
		 * its parent
		 */
		this.age = 45;
	}

	public Planet() {
		super();
	}
	
	
	
// Declare two different constructors for this class

}
