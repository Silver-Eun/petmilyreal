package com.petmily.service;

import com.petmily.domain.PromotionProductDTO;
import com.petmily.mapperInterface.PromotionProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionProductServiceImpl implements PromotionProductService {

	@Autowired
	PromotionProductMapper mapper;
	
	@Override
	public List<PromotionProductDTO> selectList() {
		return mapper.selectList();
	}
	
	@Override
	public PromotionProductDTO selectOne(PromotionProductDTO dto) {
		return mapper.selectOne(dto);
	}
	
	@Override
	public List<PromotionProductDTO> selectPromotionInfoList() {
		return mapper.selectPromotionInfoList();
	}
	
	@Override
	public int insert(PromotionProductDTO dto) {
		return mapper.insert(dto);
	}

	@Override
	public int update(PromotionProductDTO dto) {
		return mapper.update(dto);
	}
	
	@Override
	public int delete(PromotionProductDTO dto) {
		return mapper.delete(dto);
	}
}
