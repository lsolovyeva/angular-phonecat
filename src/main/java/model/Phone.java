package model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Phones {
    private int age;
    private String carrier;
    private String id;
    private String imageUrl;
    private String name;
    private String snippet;


    public Phones(int age, String id, String imageUrl, String name, String snippet) {
        this.age = age;
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.snippet = snippet;
    }

    public Phones(int age, String carrier, String id, String imageUrl, String name, String snippet) {
        this.age = age;
        this.carrier = carrier;
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.snippet = snippet;
    }

//    public int getAge() {
//        return age;
//    }
//    public String getCarrier() {
//        return carrier;
//    }
//    public String getId() {
//        return id;
//    }
//    public String getImageUrl() {
//        return imageUrl;
//    }
//    public String getName() {
//        return name;
//    }
//    public String getSnippet() {
//        return snippet;
//    }

}
