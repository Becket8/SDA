package com.sda.planer.controller;

import com.sda.planer.model.Employee;
import com.sda.planer.model.Room;
import com.sda.planer.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/rooms")
public class RoomController {


    private RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public ModelAndView getAllRooms() {
        ModelAndView modelAndView = new ModelAndView("room");
        modelAndView.addObject("room", roomService.getAllRooms());
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView getRoom(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView("room");
        modelAndView.addObject("room", roomService.getRoom(id));
        return modelAndView;
    }

    @PostMapping
    public String saveRoom(@ModelAttribute Room room) {
        roomService.addRoom(room);
        return "redirect:/rooms";
    }
}
