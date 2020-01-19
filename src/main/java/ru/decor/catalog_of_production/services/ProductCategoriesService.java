package ru.decor.catalog_of_production.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.decor.catalog_of_production.domain.product_categories.MoySkladCategory;
import ru.decor.catalog_of_production.domain.product_categories.ProductCategoriesResponse;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author Ivan Rovenskiy
 * 04 January 2020
 */
@Service
public class ProductCategoriesService {
    private String userName;
    private String userPassword;

    @Value("${moysclad.user.login}")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Value("${moysclad.user.password}")
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void getAllCategories() {
        final String url = "https://online.moysklad.ru/api/remap/1.1/entity/productfolder?Content-Type=application/json";
        final RestTemplate re = new RestTemplateBuilder().basicAuthentication(userName, userPassword).build();

        final String allCategoriesString = re.getForObject(url, String.class);
        checkNotNull(allCategoriesString, "null response string from server");

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            final ProductCategoriesResponse productCategoriesResponse = objectMapper.readValue(allCategoriesString, ProductCategoriesResponse.class);
            System.out.println("null");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public void getEvroplastCategoryTree() {
        final String url = "https://online.moysklad.ru/api/remap/1.1/entity/productfolder/7b2c588c-75c0-4dee-91f3-f3a3f0f38cfd";

        final RestTemplate re = new RestTemplateBuilder().basicAuthentication(userName, userPassword).build();

        final String evroplastCategoryString = re.getForObject(url, String.class);
        checkNotNull(evroplastCategoryString, "null response string from server");

        System.out.println(evroplastCategoryString);

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            final MoySkladCategory productCategoriesResponse = objectMapper.readValue(evroplastCategoryString, MoySkladCategory.class);
            System.out.println("null");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
