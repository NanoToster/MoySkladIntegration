package ru.decor.catalog_of_production.domain.product;

/**
 * @author Ivan Rovenskiy
 * 12 January 2020
 */
public class ProductMin {
    private String name;

    public ProductMin(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
