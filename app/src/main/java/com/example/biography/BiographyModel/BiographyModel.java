package com.example.biography.BiographyModel;

public class BiographyModel {
    int pic;
    String name ,description;

    public BiographyModel(int pic, String name, String description) {
        this.pic = pic;
        this.name = name;
        this.description = description;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
