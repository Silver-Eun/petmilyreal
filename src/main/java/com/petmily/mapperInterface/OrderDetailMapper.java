package com.petmily.mapperInterface;

import com.petmily.domain.OrderDetailDTO;
import com.petmily.domain.OrderProductDTO;
import com.petmily.pagination.SearchCriteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDetailMapper {

	// selectList
	List<OrderDetailDTO> selectList();
	List<OrderProductDTO> selectListP(String user_id);

	// selectOne: Detail
	OrderDetailDTO selectOne(OrderDetailDTO vo);

	// delete
	int delete(OrderDetailDTO vo);

	// insert: Join
	int insert(OrderDetailDTO vo);

	// update
	int update(OrderDetailDTO vo);
	
	// ** Board_SrarchCri_Paging
	// => Cri + 검색조건
	List<OrderDetailDTO> searchCri(SearchCriteria cri);  
	int searchTotalCount(SearchCriteria cri);  
	
	// ** Board_Cri_Paging
	List<OrderDetailDTO> bcriList(SearchCriteria cri); // 출력할 Data만 select
	int criTotalCount(); // 전체 rows 갯수
}
