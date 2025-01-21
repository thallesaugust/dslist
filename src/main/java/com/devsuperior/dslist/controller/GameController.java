package com.devsuperior.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.services.GameService;

@RestController
@RequestMapping(value="/games")
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameMinDto> findAll(){
        var result = gameService.findAll();
        return result;
    }
}
