package com.Animal_MS.Repository;

import java.util.List;

import com.Animal_MS.dto.ResgatadorDTO;
import com.Animal_MS.entidades.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada")
    List<Animal> findyNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL")
    List<Animal> findyAdopted();


    @Query("SELECT NEW br.com.AdoteBichinho.animal_service.dto.ResgatadorDTO(R.nome, COUNT(A.id)) " +
            "FROM Resgatador R " +
            "JOIN R.animais A " +
            "WHERE A.dataEntrada BETWEEN current_date() - 365 DAY AND current_date() " +
            "GROUP BY R.nome")
    List<ResgatadorDTO> obterResgatadorQuantidadeAnimais();

//    @Query("SELECT NEW br.com.AdoteBichinho.animal_service.dto.ResgatadorDTO(R.nome, COUNT(A.id)) " +
//            "FROM Resgatador R " +
//            "JOIN R.animais A " +
//            "WHERE A.dataEntrada BETWEEN current_date() - 365 DAY AND current_date() " +
//            "GROUP BY R.nome")

}