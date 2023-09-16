package mvc.controller;

import java.util.ArrayList;

import mvc.model.EventRoom;

public class EventRoomController {
	public ArrayList<String[]> getRooms() {
		ArrayList<String[]> rooms = new ArrayList<>();

		// Mapear a objetos de tipo sala para um vetor de String

		ArrayList<EventRoom> listRoom = EventRoom.getRooms();

		if (listRoom != null) {
			for (int i = 0; i < listRoom.size(); i++) {
				String room[] = new String[2];
				room[0] = listRoom.get(i).getName();
				room[1] = Integer.toString(listRoom.get(i).getCapacity());
				rooms.add(room);
			}
		}
		return rooms;

	}

}
