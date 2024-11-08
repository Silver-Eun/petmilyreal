package com.petmily.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchDTO {

	private String searchPeriod;
	private String searchType;
	private String searchCheck;
	private String searchCriteria;
	private String searchWord;
}
