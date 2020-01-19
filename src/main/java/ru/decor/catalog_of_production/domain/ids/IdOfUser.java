package ru.decor.catalog_of_production.domain.ids;

/**
 * @author Ivan Rovenskiy
 * 19 January 2020
 */
public class IdOfUser {
    private final long id;

    private IdOfUser(long id) {
        this.id = id;
    }

    public static IdOfUser of(final Long id) {
        return id == null ? null : new IdOfUser(id);
    }

    public long getId() {
        return id;
    }
}
