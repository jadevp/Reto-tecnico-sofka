package com.retosofka.estacionespacialsofka.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.retosofka.estacionespacialsofka.Model.Nave;

public interface INaveRepository extends JpaRepository<Nave, Long> {

    @Query("FROM Nave c WHERE c.nombre like :title")
    List<Nave> findByTitleContaining(@Param("title") String title);

    @Query("FROM Nave c WHERE c.pais like :pais")
    List<Nave> findByPaisContaining(@Param("pais") String pais);
}
