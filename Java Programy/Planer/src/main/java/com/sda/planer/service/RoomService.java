package com.sda.planer.service;

import com.sda.planer.model.Room;
import com.sda.planer.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class RoomService {

    RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public Room addRoom(Room room) {

        return roomRepository.save(room);

    }

    public List<Room> getAllRooms() {
        return (List<Room>) roomRepository.findAll();
    }

    public Room getRoom(int id) {
       return roomRepository.findById(id);
    }


}
