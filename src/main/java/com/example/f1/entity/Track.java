package com.example.f1.entity;

public class Track {
    private Long id;
    private String name;
    private String location;
    private String length;
    private Integer lap;
    private String image;
    private String description;
    public Track() {}

    // getter & setter
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getLocation() {return location;}
    public void setLocation(String location) {this.location = location;}
    public String getLength() {return length;}
    public void setLength(String length) {this.length = length;}
    public Integer getLap() {return lap;}
    public void setLap(Integer lap) {this.lap = lap;}
    public String getImage() {return image;}
    public void setImage(String image) {this.image = image;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
}