package com.petmily.mapperInterface;

import com.petmily.domain.PromotionProductDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PromotionProductMapper {
	
	List<PromotionProductDTO> selectList();
	
	PromotionProductDTO selectOne(PromotionProductDTO dto);
	
	List<PromotionProductDTO> selectPromotionInfoList();
	
	int insert(PromotionProductDTO dto);
	
	int update(PromotionProductDTO dto);

	int delete(PromotionProductDTO dto);
}
