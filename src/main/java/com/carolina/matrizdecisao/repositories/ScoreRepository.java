package com.carolina.matrizdecisao.repositories;

import com.carolina.matrizdecisao.entities.Score;
import com.carolina.matrizdecisao.entities.pk.ScorePk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {
}
