package com.petmily.service;

import com.petmily.domain.EventDTO;

import java.util.List;

public interface EventService {
	
	List<EventDTO> selectList();
	
	EventDTO selectOne(EventDTO dto);
	
	int insert(EventDTO dto);

	int update(EventDTO dto);

	int delete(EventDTO dto);
}
