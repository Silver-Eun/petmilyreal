package com.petmily.service;

import com.petmily.domain.EventDTO;
import com.petmily.mapperInterface.EventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	EventMapper mapper;
	
	@Override
	public List<EventDTO> selectList() {
		return mapper.selectList();
	}
	
	@Override
	public EventDTO selectOne(EventDTO dto) {
		return mapper.selectOne(dto);
	}
	
	@Override
	public int insert(EventDTO dto) {
		return mapper.insert(dto);
	}
	
	@Override
	public int update(EventDTO dto) {
		return mapper.update(dto);
	}

	@Override
	public int delete(EventDTO dto) {
		return mapper.delete(dto);
	}
}
