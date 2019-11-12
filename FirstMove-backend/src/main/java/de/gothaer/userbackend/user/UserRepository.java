package de.gothaer.userbackend.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Client <-> Service layer <-> Repository Layer <-> DB

@Repository
public interface UserRepository extends JpaRepository<User, Long> // Repository = Aufbewahrungsort, Depot
{
    List<User> findByAddress(String color);
}
