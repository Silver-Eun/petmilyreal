package com.petmily.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InquiryDTO {

	private int inquiry_id;
	private String inquiry_title;
	private String inquiry_writer;
	private int product_id;
	private String product_name;
	private int inquiry_count;
	private String inquiry_content;
	private Date inquiry_regdate;
	private String answer_content;
	private Date answer_regdate;
}
