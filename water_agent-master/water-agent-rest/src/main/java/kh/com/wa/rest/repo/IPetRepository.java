package kh.com.wa.rest.repo;

import kh.com.wa.data.jpa.enity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPetRepository extends  JpaRepository<Pet, Integer> {
    @Query(value = "SELECT p.description FROM tbl_pet p WHERE p.id = ?1", nativeQuery = true)
    List<Pet> getPetById(Integer id);

    @Query("SELECT p.description FROM tbl_pet p WHERE p.petCategory.id = :cateId")
    List<Pet> getPetByCategoryId(Integer cateId);


}
