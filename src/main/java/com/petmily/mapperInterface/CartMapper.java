package com.petmily.mapperInterface;

import com.petmily.domain.CartDTO;
import com.petmily.domain.InquiryDTO;
import com.petmily.domain.ReviewDTO;
import com.petmily.pagination.SearchCriteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartMapper {

	// selectList
	List<CartDTO> selectList(String user_id);
	
	// selectOne: Detail
	CartDTO selectOne(CartDTO vo);
		
	// delete
	int delete(CartDTO vo);
	int deleteP(String user_id);
	
	// insert: Join
	void insert(String user_id, int product_id, int product_cnt);
	void insertP(String user_id, int product_id);
		
	// update
	int update(CartDTO vo);
	void upCnt(String user_id, int product_id);
	void downCnt(String user_id, int product_id);

	// ** Board_SrarchCri_Paging
	// => Cri + 검색조건
	List<CartDTO> searchCri(SearchCriteria cri);  
	int searchTotalCount(SearchCriteria cri);  
	
	// ** Board_Cri_Paging
	List<CartDTO> bcriList(SearchCriteria cri); // 출력할 Data만 select
	int criTotalCount(); // 전체 rows 갯수
	
	// ** 마이페이지 문의 목록	
	List<InquiryDTO> getInquiryList(String review_writer);

	// ** 마이페이지 리뷰 목록
	List<ReviewDTO> getReviewList();
}