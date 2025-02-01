package com.ol.gg_fantasy.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
//Allows Crud operations
public interface PlayerRepository extends JpaRepository<Player, String> {
    void deleteByName(String playerName);

    Optional<Player> findByName(String name);
}
