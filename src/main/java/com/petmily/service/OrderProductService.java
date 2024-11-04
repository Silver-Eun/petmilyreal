package com.petmily.service;

import com.petmily.domain.OrderProductDTO;
import com.petmily.pagination.SearchCriteria;

import java.util.List;

public interface OrderProductService {
	
	// ** selectList
	List<OrderProductDTO> selectList();
	
	// ** selectOne(주문상세내역 항목 선택)
	OrderProductDTO selectOne(OrderProductDTO dto);

	// ** Delete(주문내역 삭제)
	int delete(OrderProductDTO dto);
	
	// ** insert(주문내역 추가)
	int insert(OrderProductDTO dto);
	
	// ** update(주문내역 수정)
	int update(OrderProductDTO dto);
	
	// ** Paging
	List<OrderProductDTO> bcriList(SearchCriteria cri); // 출력할 Data만 select
	int criTotalCount(SearchCriteria cri); // 출력대상인 전체 rows 갯수
}