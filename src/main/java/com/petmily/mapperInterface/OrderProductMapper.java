package com.petmily.mapperInterface;

import com.petmily.domain.OrderProductDTO;
import com.petmily.pagination.SearchCriteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderProductMapper {

	// selectList
	List<OrderProductDTO> selectList();

	// selectOne: Detail
	OrderProductDTO selectOne(OrderProductDTO vo);

	// delete
	int delete(OrderProductDTO vo);

	// insert: Join
	int insert(OrderProductDTO vo);

	// update
	int update(OrderProductDTO vo);
	
	// ** Board_SrarchCri_Paging
	// => Cri + 검색조건
	List<OrderProductDTO> searchCri(SearchCriteria cri);  
	int searchTotalCount(SearchCriteria cri);  
	
	// ** Board_Cri_Paging
	List<OrderProductDTO> bcriList(SearchCriteria cri); // 출력할 Data만 select
	int criTotalCount(); // 전체 rows 갯수
}
