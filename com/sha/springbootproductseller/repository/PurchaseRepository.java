package com.sha.springbootproductseller.repository;

import com.sha.springbootproductseller.model.Purchase;
import com.sha.springbootproductseller.repository.projection.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, Long>{
    @Query("SELECT" + 
    "prd.name as name, pur.price as price, pur.purchaseTime as purchaseTime" +
    "from Purchase pur LEFT JOIN Product prd on prd.id = pur.productId" + 
    "WHERE pur.userId = :userId")
    List<PurchaseItem> findAllPurchasesOfUser(@Param("user_id") Long userId);
}