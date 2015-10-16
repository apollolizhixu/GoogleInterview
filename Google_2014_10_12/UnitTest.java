package Google_2014_10_12;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTest {

	@Test
	public void testAtoi(){
		atoi a = new atoi();
		int rst = a.atoi("-3856");
		assertEquals(-3856, rst);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnitTest u = new UnitTest();
		u.testAtoi();
	}

}
