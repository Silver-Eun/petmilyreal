package com.petmily.mapperInterface;

import com.petmily.domain.EventDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EventMapper {
	
	List<EventDTO> selectList();
	
	EventDTO selectOne(EventDTO dto);
	
	int insert(EventDTO dto);

	int update(EventDTO dto);

	int delete(EventDTO dto);
}
