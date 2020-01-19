package ru.decor.catalog_of_production.domain.product_categories;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.decor.catalog_of_production.domain.MoySkladMeta;

/**
 * @author Ivan Rovenskiy
 * 08 January 2020
 */
public class MoySkladCategory {
    @JsonProperty("meta")
    private MoySkladMeta categoryMeta;
    private String id;
    private String accountId;
    private boolean shared;
    private Object group;
    private Integer version;
    private String updated;
    private String name;
    private String description;
    private String externalCode;
    private boolean archived;
    private String pathName;
    private Integer vat;
    private Integer effectiveVat;
    private ProductFolder productFolder;
    @JsonProperty("owner")
    private CategoryOwner categoryOwner;

    public MoySkladCategory() {
    }

    public MoySkladMeta getCategoryMeta() {
        return categoryMeta;
    }

    public void setCategoryMeta(MoySkladMeta categoryMeta) {
        this.categoryMeta = categoryMeta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public boolean isShared() {
        return shared;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    public Object getGroup() {
        return group;
    }

    public void setGroup(Object group) {
        this.group = group;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
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

    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public Integer getVat() {
        return vat;
    }

    public void setVat(Integer vat) {
        this.vat = vat;
    }

    public Integer getEffectiveVat() {
        return effectiveVat;
    }

    public void setEffectiveVat(Integer effectiveVat) {
        this.effectiveVat = effectiveVat;
    }

    public ProductFolder getProductFolder() {
        return productFolder;
    }

    public void setProductFolder(ProductFolder productFolder) {
        this.productFolder = productFolder;
    }

    private static class ProductFolder {
        @JsonProperty("meta")
        private MoySkladMeta productFolderMeta;

        public MoySkladMeta getProductFolderMeta() {
            return productFolderMeta;
        }

        public void setProductFolderMeta(MoySkladMeta productFolderMeta) {
            this.productFolderMeta = productFolderMeta;
        }
    }

    private static class CategoryOwner {
        @JsonProperty("meta")
        private MoySkladMeta productOwnerMeta;

        public MoySkladMeta getProductOwnerMeta() {
            return productOwnerMeta;
        }

        public void setProductOwnerMeta(MoySkladMeta productOwnerMeta) {
            this.productOwnerMeta = productOwnerMeta;
        }
    }
}
