package com.example.rentalz;

public class Address {

    private String code;

    private String name;

    private String name_with_type;

    private String slug;

    private String type;

    public Address(String code, String name, String name_with_type, String slug, String type) {
        this.code = code;
        this.name = name;
        this.name_with_type = name_with_type;
        this.slug = slug;
        this.type = type;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName_with_type(String name_with_type) {
        this.name_with_type = name_with_type;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getName_with_type() {
        return name_with_type;
    }

    public String getSlug() {
        return slug;
    }

    public String getType() {
        return type;
    }
}