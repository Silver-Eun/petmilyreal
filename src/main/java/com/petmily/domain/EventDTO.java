package com.petmily.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventDTO {
	private int event_id;
	private String event_name;
	private String event_description;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date event_start;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date event_end;
	
	private String event_imagepath;
	private MultipartFile uploadfilef;
}
