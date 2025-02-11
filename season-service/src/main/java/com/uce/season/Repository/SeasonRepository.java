package com.uce.season.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uce.season.Model.Season;

@Repository
public interface SeasonRepository extends JpaRepository<Season, Long> {
    boolean existsByName(String name);
}
