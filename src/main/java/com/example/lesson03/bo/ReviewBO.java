package com.example.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.dao.ReviewMapper;
import com.example.lesson03.domain.Review;

@Service
public class ReviewBO {

	@Autowired
	private ReviewMapper reviewMapper;
	
	// input: id
	//output: id에 일치하는 Review 단건 => 컨트롤러한테
	public Review getReviewById (int id) {
		return reviewMapper.selectReviewById(id);
	}
	
	// input: Review
	//output: 성공된 행의 개수 int
	public int addReview(Review review) {
		return reviewMapper.insertReview(review);
	}
	
	// addReviewAsField(4, "콤비네이션R", "김바다", 5.0, "역시 맛있다!!");
	public int addReviewAsField(int storeId, String menu, String userName, double point, String review) {
		return reviewMapper.insertReviewAsField(storeId, menu, userName, point, review);
	}
	
	public int updateReviewById(int id, String review) {
		return reviewMapper.updateReviewById(id, review);
	}
	
	public void deleteReviewById(int id) {
		reviewMapper.deleteReviewById(id);
	}
}
