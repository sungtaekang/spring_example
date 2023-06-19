package com.example.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson03.domain.Review;

@Repository
public interface ReviewMapper {

	public Review selectReviewById(int id);
	
	// insert일 때 mybatis가 성공한 행의 개수를 리턴해준다.
	public int insertReview(Review review);
	
	public int insertReviewAsField(
			// 파라미터가 2개 이상인 경우 하나의 맵으로 만들고 xml에 전달한다.
			@Param("storeId") int storeId,
			@Param("menu") String menu,
			@Param("userName") String userName,
			@Param("point") double point,
			@Param("review") String review);
	
	public int updateReviewById(
			@Param("id") int id,
			@Param("review") String review);
}
