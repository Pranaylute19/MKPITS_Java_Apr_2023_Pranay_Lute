package com.example.Rental_Application.repo;

import com.example.Rental_Application.entity.Addproperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Addpropertyrepo extends JpaRepository<Addproperty,Integer> {
//    @Query("SELECT a FROM Addproperty a WHERE a.id = :userid AND a. = :password")
//    Addproperty findbyuseridpassword(String id,String password);
//    @Query("SELECT a from Addproperty a where a.sellerid=:sellerid")
//    List<Addproperty> findpropertybyid(@Param("sellerid") String sellerid);
@Query("SELECT a FROM Addproperty a WHERE a.sellerid = :sellerid")
List<Addproperty> findBySellerid(@Param("sellerid") int sellerid);
}
