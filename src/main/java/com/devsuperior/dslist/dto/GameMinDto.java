package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projection.GameMinProjection;

public class GameMinDto {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDto(){
    }

    public GameMinDto(Game entity) {
        this.id = entity.getId();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
        this.title = entity.getTitle();
        this.year = entity.getYear();
    }

    public GameMinDto(GameMinProjection projection) {
        this.id = projection.getId();
        this.imgUrl = projection.getImgUrl();
        this.shortDescription = projection.getShortDescription();
        this.title = projection.getTitle();
        this.year = projection.getYear();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }


}
