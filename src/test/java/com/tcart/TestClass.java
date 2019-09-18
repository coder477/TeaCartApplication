package com.tcart;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.tcart.models.ChatEntry;
import com.tcart.repository.TcartDAO;
import com.tcart.service.TcartService;

@RunWith(MockitoJUnitRunner.class)
public class TestClass {

	@InjectMocks
	private TcartService tcartService;
	
	@Mock
	private TcartDAO dao;
	
	@Test
	public void testAddition() {
		
		ChatEntry c = new ChatEntry();
		
		int x = tcartService.addition(1, 2, c);
		verify(dao).save(c);
		assertEquals(x, 3);

	}

}
