package ro.sda.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.sda.demo.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
