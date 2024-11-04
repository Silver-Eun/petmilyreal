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
public class PromotionProductDTO {
	private int promotion_id;
	private String promotion_name;
	private String promotion_image;
	private MultipartFile uploadfilef;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date promotion_start;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date promotion_end;
	
	private int promotion_discount;
	private String promotion_value1;
}
