package ru.decor.catalog_of_production.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.decor.catalog_of_production.domain.users.User;

/**
 * @author Ivan Rovenskiy
 * 19 January 2020
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUserId(long id);
}
