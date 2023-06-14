package com.example.lesson02.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.lesson02.domain.UsedGoods;

@Repository
public interface UsedGoodsMapper {

	// input: X
	// output: List<UsedGoods> => BO(Service) 한테 돌려준다.
	public List<UsedGoods> selectUsedGoodsList();
}
