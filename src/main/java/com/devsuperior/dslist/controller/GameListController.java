package com.devsuperior.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDto;
import com.devsuperior.dslist.services.GameListService;

@RestController
@RequestMapping(value="/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDto> findAll(){
        var result = gameListService.findAll();
        return result;
    }

    /*@GetMapping(value="/{id}")
    public GameDto findById(@PathVariable Long id){
        var result = gameService.findById(id);
        return result;
    }*/
}
