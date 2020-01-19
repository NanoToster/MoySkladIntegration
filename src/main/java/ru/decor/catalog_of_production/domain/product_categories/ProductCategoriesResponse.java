package ru.decor.catalog_of_production.domain.product_categories;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import ru.decor.catalog_of_production.domain.MoySkladContext;
import ru.decor.catalog_of_production.domain.MoySkladMeta;

import java.util.List;

/**
 * @author Ivan Rovenskiy
 * 08 January 2020
 */
//@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoriesResponse {
//    @JsonProperty("context")
//    private MoySkladContext context;
    @JsonProperty("meta")
    private MoySkladMeta meta;
    @JsonProperty("rows")
    private List<MoySkladCategory> categoriesList;

    public ProductCategoriesResponse() {
    }

//    public MoySkladContext getContext() {
//        return context;
//    }

//    public void setContext(MoySkladContext context) {
//        this.context = context;
//    }

    public MoySkladMeta getMeta() {
        return meta;
    }

    public void setMeta(MoySkladMeta meta) {
        this.meta = meta;
    }

    public List<MoySkladCategory> getCategoriesList() {
        return categoriesList;
    }

    public void setCategoriesList(List<MoySkladCategory> categoriesList) {
        this.categoriesList = categoriesList;
    }
}
