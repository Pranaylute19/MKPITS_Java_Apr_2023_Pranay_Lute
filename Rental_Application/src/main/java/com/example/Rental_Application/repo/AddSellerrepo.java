package com.example.Rental_Application.repo;

import com.example.Rental_Application.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AddSellerrepo extends JpaRepository<Seller,Integer> {

    @Query("SELECT s FROM Seller s WHERE s.userid = :userid AND s.password = :password")
Seller findbyuiserid(@Param("userid") String userid, @Param("password") String password);
}
