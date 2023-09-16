package mvc.model;

import java.util.ArrayList;
import java.util.List;

public class EventRoom {
// Atributos da sala do evento
	private String name;
	private int capacity;
	// A sala do evento tem uma lesta de pessoas
	List<Person> listPerson;

	// Construtores
	public EventRoom() {
		this.listPerson = new ArrayList<>();
	}

	public EventRoom(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
		this.listPerson = new ArrayList<>();

	}

	// Métodos de acesso
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

	// Método para manipular a lista de pessoas
	// Retorna a lista inteira de pessoas
	public List<Person> getListPerson() {
		return listPerson;
	}

	// Adiciona uma lista de pessoas ao atributo
	public void setListPerson(List<Person> listPerson) {
		this.listPerson = listPerson;
	}

	// Muda a atributo sa da pessoa
	public void addPerson(Person person) {
		person.setRoom(this);// Informa a sala que a pessoa está
		listPerson.add(person);

	}

	public static ArrayList<EventRoom> getRooms() {
		EventRoom room = new EventRoom("Apex Java", 10);
		ArrayList<EventRoom> listRoom = new ArrayList<>();
		listRoom.add(room);
		return listRoom;

	}

}
