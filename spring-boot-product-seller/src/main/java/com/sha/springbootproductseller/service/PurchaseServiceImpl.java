package com.sha.springbootproductseller.service;

import com.sha.springbootproductseller.model.Purchase;
import com.sha.springbootproductseller.repository.PurchaseRepository;
import com.sha.springbootproductseller.projection.PurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService{
    private final PurchaseRepository purchaseRepository;

    public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @Override
    public Purchase savePurchase(Purchase purchase) {
        purchase.setPurchaseTime(LocalDateTime.now());

        return purchaseRepository.save(purchase);
    }

    public List<PurchaseItem> findPurchaseItemsOfUser(Long userId) {
        return purchaseRepository.findAllPurchasesOfUsers(userId);
    }
}
