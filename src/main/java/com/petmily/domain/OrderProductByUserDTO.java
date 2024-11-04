package com.petmily.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderProductByUserDTO extends ProductDTO {
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date order_date;
	private String user_id;
	private int order_key;
}
