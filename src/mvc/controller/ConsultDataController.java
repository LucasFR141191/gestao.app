package mvc.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import mvc.model.CoffeeSpace;
import mvc.model.EventRoom;
import mvc.model.Person;

public class ConsultDataController {

	public static ArrayList<String[]> getDados() {
		ArrayList<String[]> consult = new ArrayList<>();

		ArrayList<Person> listPerson = Person.getPersons();
		ArrayList<EventRoom> listRoom = EventRoom.getRooms();
		ArrayList<CoffeeSpace> listspace = CoffeeSpace.getSpace();

		List<Person> pessoa = new ArrayList<>();
		int controle = 0;
		for (int i = listRoom.size(); i == 0; i--) {
			for (double j = (listPerson.size() / listRoom.size()); j < 1; j--) {
				controle++;
				pessoa.add(listPerson.get(controle));
				listRoom.get(controle).setListPerson(pessoa);
			}
		}
		if (listRoom != null) {
			for (int i = 0; i < listPerson.size(); i++) {
				String dados[] = new String[3];
				dados[0] = listPerson.get(i).getName();
				for (int j = 0; j < listRoom.size(); j++) {
					dados[1] = listRoom.get(j).getName();

				}
				for (int k = 0; k < listspace.size(); k++) {
					dados[2] = listspace.get(k).getName();
				}
				consult.add(dados);
			}
		}
		return null;

	}

	public static ArrayList<String[]> getDadosSegundo() {
		ArrayList<String[]> consultTWO = new ArrayList<>();

		ArrayList<Person> listPerson = Person.getPersons();
		ArrayList<EventRoom> listRoom = EventRoom.getRooms();
		ArrayList<CoffeeSpace> listSpace = CoffeeSpace.getSpace();

		List<Person> pessoas = new ArrayList<Person>();
		int controle = 0;
		for (int j = listRoom.size(); j == 0; j--) {
			for (int i = (listPerson.size() / listRoom.size()); i < 1; i++) {
				controle++;
				pessoas.add(listPerson.get(controle));
				listRoom.get(controle).setListPerson(pessoas);
			}
		}
		if (listRoom != null) {
			Collections.reverse(listPerson);
			for (int i = 0; i < listPerson.size(); i++) {
				String dados[] = new String[3];
				dados[0] = listPerson.get(i).getName();
				
				for (int j = 0; j < (listRoom.size() -1 ); j++) {
					dados[1] = listRoom.get(j).getName();

				}
				for (int k = 0; k < (listSpace.size() -1); k++) {
					dados[2] = listSpace.get(k).getName();
				}
				consultTWO.add(dados);
			}
		}

		return consultTWO;
	}
}
