package com.example.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.dao.UsedGoodsMapper;
import com.example.lesson02.domain.UsedGoods;

@Service	// Spring bean
public class UsedGoodsBO {
	
	// 필드
	@Autowired		// Dependency Inject (DI) -> 의존성 주입 => Spring bean
	private UsedGoodsMapper usedGoodsMapper;

	// input: X		
	// output: List<UsedGoods>	  컨트롤러한테
	public List<UsedGoods> getUsedGoodsList() { 
		List<UsedGoods> usedGoodsList = usedGoodsMapper.selectUsedGoodsList();
		return usedGoodsList;
	}
}
