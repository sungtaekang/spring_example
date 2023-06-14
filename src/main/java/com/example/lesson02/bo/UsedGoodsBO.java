package com.example.lesson02.bo;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.lesson02.domain.UsedGoods;

@Service	// Spring bean
public class UsedGoodsBO {

	// input: X		
	// output: List<UsedGoods>	  컨트롤러한테
	public List<UsedGoods> getUsedGoodsList() { 
		List<UsedGoods> usedGoodsList = ;
		return usedGoodsList;
	}
}
