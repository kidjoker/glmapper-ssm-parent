package com.glmapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.glmapper.framerwork.dmo.OrderInfo;
import com.glmapper.framerwork.service.OrderService;

public class OrderServiceTest extends BaseTest{
	@Autowired
	private OrderService orderService;

	@Test
	public void testAppoint() throws Exception {
		 OrderInfo order = orderService.buyGoods(1l, 1l);
		System.out.println(order);
	}
}
