package com.petmily.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewReplyDTO {

	private int reply_id;
	private int review_id;
	private String reply_writer;
	private String reply_content;
	private Date reply_regdate;
}
