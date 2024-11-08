package com.petmily.mapperInterface;

import java.util.List;
import java.util.Map;

import com.petmily.domain.FaqDTO;
import com.petmily.domain.InquiryDTO;
import com.petmily.domain.NoticeDTO;
import com.petmily.domain.OrderProductByUserDTO;
import com.petmily.domain.ProductDTO;
import com.petmily.domain.ReviewDTO;
import com.petmily.domain.ReviewReplyDTO;
import com.petmily.domain.SearchDTO;
import com.petmily.domain.UserDTO;
import com.petmily.pagination.Criteria;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {

	List<NoticeDTO> getNoticeList(SearchDTO searchDTO);

	List<NoticeDTO> getNoticePagedList(Criteria cri);

	int noticeTotalCount();

	List<InquiryDTO> getInquiryList(SearchDTO searchDTO);

	List<InquiryDTO> getInquiryPagedList(Criteria cri);

	int inquiryTotalCount();

	List<ReviewDTO> getReviewList();

	List<ReviewDTO> getReviewPagedList(Criteria cri);

	int reviewTotalCount();

	List<FaqDTO> getFaqList(SearchDTO searchDTO);

	List<FaqDTO> getFaqPagedList(Criteria cri);

	int faqTotalCount();

	NoticeDTO getNotice(NoticeDTO dto);

	int updateNotice(NoticeDTO dto);

	int insertNotice(NoticeDTO dto);

	int deleteNotice(NoticeDTO dto);

	InquiryDTO getInquiry(InquiryDTO dto);

	int updateInquiry(InquiryDTO dto);

	int deleteInquiry(InquiryDTO dto);

	FaqDTO getFaq(FaqDTO dto);

	int updateFaq(FaqDTO dto);

	int insertFaq(FaqDTO dto);

	int deleteFaq(FaqDTO dto);

	ReviewDTO getReview(ReviewDTO dto);

	int updateReview(ReviewDTO dto);

	int deleteReview(ReviewDTO dto);

	List<ReviewReplyDTO> getReplyList(ReviewDTO dto);

	List<ProductDTO> getAllProducts();

	List<ProductDTO> getProduct(String name);

	int insertInquiry(InquiryDTO dto);

	int updateBoardInquiry(InquiryDTO dto);

	List<ReviewDTO> getReviewList(SearchDTO searchDTO);

	int insertReview(ReviewDTO dto);

	int insertReply(ReviewReplyDTO dto);

	int deleteReply(ReviewReplyDTO dto);

	int updateBoardReview(ReviewDTO dto);

	void updateNoticeCount(NoticeDTO dto);

	void updateInquiryCount(InquiryDTO dto);

	void updateReviewCount(ReviewDTO dto);

	void updateFaqCount(FaqDTO dto);

	List<ProductDTO> getProductByKind(String kind);

	List<ProductDTO> getProductByCategory(Map<String, String> condition);

	UserDTO getEmail(InquiryDTO dto);

	List<OrderProductByUserDTO> getProductByUser(String userName);

	int updateStatus(ReviewDTO dto);

	int updateStatusDelete(ReviewDTO dto);

	ReviewDTO getReviewTest(ReviewDTO dto);

}
