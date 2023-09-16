package mvc.model;

import java.util.ArrayList;

public class CoffeeSpace {

	// Atributos do espaço de café
	private String name;
	private int capacity;

	// O espaço de café tem uma lista de pessoas
	ArrayList<Person> listPersonCoffee;

	// construtores
	public CoffeeSpace() {
		// instanciando o ArrayList
		listPersonCoffee = new ArrayList<>();

	}

	public CoffeeSpace(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
		listPersonCoffee = new ArrayList<>();

	}

	// métodos de acesso
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

//Metodo para manipular o ArrayList
// Retorna a lista interira de pessoa no espaço de café
	public ArrayList<Person> getListPersonCoffee() {
		return listPersonCoffee;
	}

//Atribui a lista de pessoa informada ao atributo
	public void setListPersonCoffee(ArrayList<Person> listPersonCoffee) {
		this.listPersonCoffee = listPersonCoffee;
	}

//adiciona uma pessoa a lista
	public void addPersonCoffee(Person person) {
		person.setSpace(this);// informa o espaço de café que a pessoa está(muda o atributospace da person
								// para o espaço que ela está)
		listPersonCoffee.add(person);// Adicina uma pesso espaço

	}

	public static ArrayList<CoffeeSpace> getSpace() {
		CoffeeSpace space = new CoffeeSpace("Apex Java café", 10);
		ArrayList<CoffeeSpace> listSpace = new ArrayList<>();
		listSpace.add(space);
		return listSpace;
	}
}
