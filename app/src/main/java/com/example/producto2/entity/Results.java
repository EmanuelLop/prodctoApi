package com.example.producto2.entity;

public class Results {
    private int id;
    private int digitalId;
    private String title;
    private int issueNumber;
    private String variantDescription;
    private String description;

    public int getId() {
        return id;
    }

    public int getDigitalId() {
        return digitalId;
    }

    public String getTitle() {
        return title;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public String getVariantDescription() {
        return variantDescription;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Results{" +
                "id=" + id +
                ", digitalId=" + digitalId +
                ", title='" + title + '\'' +
                ", issueNumber=" + issueNumber +
                ", variantDescription='" + variantDescription + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
