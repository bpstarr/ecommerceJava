package com.sha.springbootproductseller.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sha.springbootproductseller.repository.PurchaseRepository;
import com.sha.springbootproductseller.repository.projection.PurchaseItem;
import com.sha.springbootproductseller.model.Purchase;

@Service
public class PurchaseServiceImpl implements PurchaseService{
    
    private final PurchaseRepository purchaseRepository;

    public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }
    
    @Override
    public Purchase savePurchase(Purchase purchase) {
        purchase.setCreateTime(LocalDateTime.now());
        
        return purchaseRepository.save(purchase);
    }
    
    @Override
    public List<PurchaseItem> findAllPurchasesOfItemsOfUser(Long userId) {
        return purchaseRepository.findAllPurchasesOfUser(userId);
    }
}
