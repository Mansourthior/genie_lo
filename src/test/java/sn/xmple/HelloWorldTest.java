package sn.xmple;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class HelloWorldTest {
   
    private HelloWorld h ;
   
    @Before
    public void setup () {
        h = new HelloWorld() ;
    }

    @Test
	public void testGetMessage() {
		assertEquals("Hello World", h.getMessage(null));
	}

	@Test
	public void testGetMessage2() {
		assertEquals("Hello moussa Tonux", h.getMessage("Tonux"));
	}

	@Test
	public void testGetMessage3() {
		assertEquals("Hello Mansour", h.getMessage("Mansour"));
	}

	@Test
	public void testSum(){
		assertEquals(4, h.sum(2,2));
    }
    
    @Test
	public void testSum1(){
		assertEquals(4, h.sum('a',2));
	}
	

}
