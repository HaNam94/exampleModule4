package com.example.testmodule4.service.impl;

import com.example.testmodule4.model.Promotion;
import com.example.testmodule4.model.PromotionDTO;
import com.example.testmodule4.respository.IPromotionRepo;
import com.example.testmodule4.service.IPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromotionService implements IPromotionService {
    @Autowired
    private IPromotionRepo promotionRepo;
    @Override
    public Iterable<PromotionDTO> getPromotions(Double minRate, Double maxRate, String startDate, String endDate) {
        return promotionRepo.getPromotionsWithSearch(minRate, maxRate, startDate, endDate);
    }

    @Override
    public void save(Promotion promotion) {
        promotionRepo.save(promotion);
    }

    @Override
    public void deleteById(Long id) {
        promotionRepo.deleteById(id);
    }
}
