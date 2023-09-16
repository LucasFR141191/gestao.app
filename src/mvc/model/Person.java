package mvc.model;

import java.util.ArrayList;

/**
 * classe Person represanta o modelo (models) Tartas-se da entidade pesssoa que
 * o sistema possui
 */

public class Person {
//Atributos
	private String name;
	private String lastName;
	private EventRoom room; // A pesso está de dentro de uma sala
	private CoffeeSpace space;// a pessoa está dentro deum espaço de café

//Construtores
	public Person() {
	}

	public Person(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;

	}

	// Getters and Setters
	// Métodos de acesso
	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public EventRoom getRoom() {
		return room;
	}

	public void setRoom(EventRoom room) {
		this.room = room;
	}

	public CoffeeSpace getSpace() {
		return space;
	}

	public void setSpace(CoffeeSpace space) {
		this.space = space;
	}

	public static ArrayList<Person> getPersons() {
		Person person = new Person("Tharlys ", "Rodrigues");
		ArrayList<Person> listPerson = new ArrayList<>();
		listPerson.add(person);
		return listPerson;

	}

}
