package com.example.f1.entity;

public class Team {
    private Integer id;
    private String name;
    private String fullName;
    private String country;
    private String foundedYear;
    private Integer championships;
    private String image;
    private String description;

    public Team() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getFoundedYear() { return foundedYear; }
    public void setFoundedYear(String foundedYear) { this.foundedYear = foundedYear; }

    public Integer getChampionships() { return championships; }
    public void setChampionships(Integer championships) { this.championships = championships; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}