package de.gothaer.firstmove.FirstMove;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Client <-> Service layer <-> Repository Layer <-> DB

@Repository
public interface FirstMoveRepository extends JpaRepository<FirstMove, Long> // Repository = Aufbewahrungsort, Depot
{
    List<FirstMove> findByAddress(String color);
}
