package com.adore96.SpringbootSocket.repository;

import com.adore96.SpringbootSocket.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author kalharaperera ON 12/28/20
 * @project SpringbootSocket
 */

public interface ProductRepo extends JpaRepository<Product, Integer> {
//    Optional<Product> findByProductname(String productname);
}
