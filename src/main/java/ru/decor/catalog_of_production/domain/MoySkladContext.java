package ru.decor.catalog_of_production.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Ivan Rovenskiy
 * 08 January 2020
 */
public class MoySkladContext {
    @JsonProperty("employee")
    private Employee employee;

    public MoySkladContext() {
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public static class Employee {
        @JsonProperty("meta")
        private Meta meta;

        public Employee() {
        }

        public void setMeta(Meta meta) {
            this.meta = meta;
        }

        public static class Meta {
            @JsonProperty("href")
            private String href;
            @JsonProperty("metadataHref")
            private String metadataHref;
            @JsonProperty("type")
            private String type;
            @JsonProperty("mediaType")
            private String mediaType;

            public Meta() {
            }

            public void setHref(String href) {
                this.href = href;
            }

            public void setMetadataHref(String metadataHref) {
                this.metadataHref = metadataHref;
            }

            public void setType(String type) {
                this.type = type;
            }

            public void setMediaType(String mediaType) {
                this.mediaType = mediaType;
            }
        }
    }
}
