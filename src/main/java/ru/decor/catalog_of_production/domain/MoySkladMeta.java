package ru.decor.catalog_of_production.domain;

/**
 * @author Ivan Rovenskiy
 * 08 January 2020
 */
public class MoySkladMeta {
    private String href;
    private String type;
    private String mediaType;
    private Integer size;
    private Integer limit;
    private Integer offset;
    private String nextHref;
    private String metadataHref;
    private String uuidHref;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getNextHref() {
        return nextHref;
    }

    public void setNextHref(String nextHref) {
        this.nextHref = nextHref;
    }

    public String getMetadataHref() {
        return metadataHref;
    }

    public void setMetadataHref(String metadataHref) {
        this.metadataHref = metadataHref;
    }

    public String getUuidHref() {
        return uuidHref;
    }

    public void setUuidHref(String uuidHref) {
        this.uuidHref = uuidHref;
    }
}
