import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class TimerTest{
	@Test
	public void test_getter_currentTime(){
	Timer t=new Timer();
	Date current=new Date();
	assertEquals("Testing current time",current.getTime(),t.getCurrentTime().getTime());
	}
	@Test
	public void test_setter_startTime(){
	Timer t=new Timer();
	Date random = new Date(2018,11,28);
	t.setStartTime(random);
	assertEquals("Testing current time",random.getTime(),t.getStartTime().getTime());
	}
	@Test
	public void test_setter_currentTime(){
	Timer t=new Timer();
	Date temp=new Date(t.getCurrentTime().getTime());
	try {
		System.out.println("wait for 1 sec...");
		Thread.sleep(1000);
    } catch (Exception e)
    {
        System.out.println("Testing...");
    }
	t.setCurrentTime();
	Date current=new Date();
	assertEquals("Setting current time",current.getTime(),t.getCurrentTime().getTime());
	}
	@Test
	public void test_getSec() {
		Timer t=new Timer();
		try {
			System.out.println("wait for 1 sec...");
			Thread.sleep(1000);
	    } catch (Exception e)
	    {
	        System.out.println("Testing...");
	    }
		t.setCurrentTime();
		int res=(int)((t.getCurrentTime().getTime()-t.getStartTime().getTime())/1000);
		assertEquals("Setting current time",res,t.getSec(),0.0001);
		assertEquals(0,t.getMin());
		assertEquals(0,t.getHour());
	}
	@Test
	public void test_getSec_1min() {
		Timer t=new Timer();
		try {
			System.out.println("wait for 60 sec...");
			Thread.sleep(60000);
	    } catch (Exception e)
	    {
	        System.out.println("Testing...");
	    }
		assertEquals("Setting current time",0,t.getSec(),0.0001);
		assertEquals(1,t.getMin());
		assertEquals(0,t.getHour());
	}
	//test for strings and get Hour
	
	
	
}