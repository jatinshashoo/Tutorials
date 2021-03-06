package designpattern.creational.prototype;

import designpattern.creational.prototype.BO.Sheep;
import designpattern.creational.prototype.factories.CloneFactory;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Sheep sheep = new Sheep(2);
		CloneFactory cloneFactory = new CloneFactory();
		Sheep sally = (Sheep) cloneFactory.createAnimalClone(sheep);
		System.out.println(sheep.hashCode());
		System.out.println(sally.hashCode());
	}
}
