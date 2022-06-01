package ru.geekbains.persist;

public class Product {
    private Long id;
    private String title;
    private Integer cost;
    public Product(String title, Integer cost) {
        this.title = title;
        this.cost = cost;
    }

    public Product(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getCost() {
        return cost;
    }
}
