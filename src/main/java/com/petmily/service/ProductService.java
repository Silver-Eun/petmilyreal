package com.petmily.service;

import com.petmily.domain.InquiryDTO;
import com.petmily.domain.ProductDTO;
import com.petmily.domain.ReviewDTO;
import com.petmily.pagination.Criteria;
import com.petmily.pagination.SearchCriteria;

import java.util.List;

public interface ProductService {
	
	ProductDTO selectOne(ProductDTO dto);
	
	List<ProductDTO> selectList();
	
	List<ProductDTO> selectPromotionList(int id);
	
	List<ProductDTO> selectedList(String kind, String category);
	
	List<ProductDTO> selectThisMonthList();
	
	List<ProductDTO> selectPopularList();
	
	List<ProductDTO> selectDiscountedList();
	
	List<ProductDTO> selectSearchedList(String searchKeyword);
	
	List<ReviewDTO> pReviewList(int id);
	
	List<InquiryDTO> pinquiryList(int id);
    
	int insert(ProductDTO dto);

	int update(ProductDTO dto);
	
	int updateProductRating();
	
	int delete(ProductDTO dto);

	int updateP();
	
	List<ProductDTO> getProductPagedList(Criteria cri);
	int productTotalCount();
	
	List<ProductDTO> searchCri(SearchCriteria cri); // 출력할 Data만 select
	int searchTotalCount(SearchCriteria cri); // 전체 rows 갯수

	int updateD(int order_key);
}
