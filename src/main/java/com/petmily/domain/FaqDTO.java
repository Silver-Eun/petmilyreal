package com.petmily.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FaqDTO {

	private int faq_id;
	private String question_type;
	private String faq_title;
	private String faq_writer;
	private int faq_count;
	private String faq_content;
	private Date faq_regdate;
}
