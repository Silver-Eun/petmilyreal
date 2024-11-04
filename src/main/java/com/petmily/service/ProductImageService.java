package com.petmily.service;

import com.petmily.domain.ProductImageDTO;
import com.petmily.pagination.SearchCriteria;

import java.util.List;

public interface ProductImageService {
	
	List<ProductImageDTO> selectList();
	
	List<ProductImageDTO> selectListByID(int id);
	
	ProductImageDTO selectOne(ProductImageDTO dto);
	
	int insert(ProductImageDTO dto);

	int update(ProductImageDTO dto);

	int delete(ProductImageDTO dto);
	
	List<ProductImageDTO> searchCri(SearchCriteria cri); // 출력할 Data만 select
	int searchTotalCount(SearchCriteria cri); // 전체 rows 갯수
}
