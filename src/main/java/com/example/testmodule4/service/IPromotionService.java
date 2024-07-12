package com.example.testmodule4.service;

import com.example.testmodule4.model.Promotion;
import com.example.testmodule4.model.PromotionDTO;

public interface IPromotionService {
    Iterable<PromotionDTO> getPromotions(Double minRate, Double maxRate, String startDate, String endDate);

    void save(Promotion promotion);

    void deleteById(Long id);
}
