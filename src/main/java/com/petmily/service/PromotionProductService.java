package com.petmily.service;

import com.petmily.domain.PromotionProductDTO;

import java.util.List;

public interface PromotionProductService {
	
	List<PromotionProductDTO> selectList();
	
	PromotionProductDTO selectOne(PromotionProductDTO dto);
	
	List<PromotionProductDTO> selectPromotionInfoList();
	
	int insert(PromotionProductDTO dto);
	
	int update(PromotionProductDTO dto);
	
	int delete(PromotionProductDTO dto);
}
