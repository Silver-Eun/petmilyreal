package com.petmily.service;

import com.petmily.domain.OrderDetailDTO;
import com.petmily.domain.OrderProductDTO;
import com.petmily.mapperInterface.OrderDetailMapper;
import com.petmily.pagination.SearchCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {
	
	// ** 전역변수 정의
	@Autowired
	OrderDetailMapper mapper;
	
	// ** selectList
	@Override
	public List<OrderDetailDTO> selectList() {
		return mapper.selectList();
	}
	@Override
	public List<OrderProductDTO> selectListP(String user_id) {
		return mapper.selectListP(user_id);
	}
	
	// ** selectOne
	@Override
	public OrderDetailDTO selectOne(OrderDetailDTO dto) {
		return mapper.selectOne(dto);
	}
	
	// ** Delete
	@Override
	public int delete(OrderDetailDTO dto) {
		return mapper.delete(dto);
	}
	
	// ** insert
	@Override
	public int insert(OrderDetailDTO dto) {
		return mapper.insert(dto);
	}
	
	// ** update
	@Override
	public int update(OrderDetailDTO dto) {
		return mapper.update(dto);
	}
	
	// ** Paging
	// => 출력할 Data만 select
	@Override
	public List<OrderDetailDTO> bcriList(SearchCriteria cri){
		return mapper.searchCri(cri);   // ver02
		// return mapper.bcriList(cri); // ver01
	}
	// => 전체 rows 갯수
	@Override
	public int criTotalCount(SearchCriteria cri) {
		return mapper.searchTotalCount(cri); // ver02
		// return mapper.criTotalCount(); // ver01
	}
}
