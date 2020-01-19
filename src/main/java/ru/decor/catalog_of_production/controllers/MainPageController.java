package ru.decor.catalog_of_production.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import ru.decor.catalog_of_production.domain.product.ProductMin;
import ru.decor.catalog_of_production.services.ProductCategoriesService;

/**
 * @author Ivan Rovenskiy
 * 04 January 2020
 */
@Controller
public class MainPageController {

    private ProductCategoriesService productCategoriesService;

    @Autowired
    public void setProductCategoriesService(ProductCategoriesService productCategoriesService) {
        this.productCategoriesService = productCategoriesService;
    }

    @GetMapping
    public String getAllCategories(
            @RequestParam(name = "name", required = false, defaultValue = "World") String name,
            Model model) {
        productCategoriesService.getAllCategories();

        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);

        System.out.println(name);

        return "greeting";
    }

    @GetMapping("/evroplast")
    public String getEvroplastCategory() {
        productCategoriesService.getEvroplastCategoryTree();
        return "greeting";
    }

    @GetMapping("/find_product/{productName}")
    public ResponseEntity<ProductMin> findProductByName(@PathVariable String productName) {
        System.out.println(productName);
        final ResponseEntity<ProductMin> ok = ResponseEntity.ok(new ProductMin(productName));
        return ok;
    }
}
