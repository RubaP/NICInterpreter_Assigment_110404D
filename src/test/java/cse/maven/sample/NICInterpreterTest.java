package cse.maven.sample;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import cse.maven.sample.exception.InvalidNICNumberException;
import static org.testng.Assert.assertEquals;

public class NICInterpreterTest {
	NICInterpreter nicInterpreter; 
		
	@BeforeClass
	public void setUp() {
		nicInterpreter = new NICInterpreter();
	}

	@Test
	public void createNICTest1() throws InvalidNICNumberException {
		NIC resultNIC = nicInterpreter.createNIC("917292396v");
                nicInterpreter.interpret(resultNIC);
	    assertEquals(resultNIC.getGender(),"FEMALE");
	}
        
        @Test
	public void createNICTest2() throws InvalidNICNumberException {
		NIC resultNIC = nicInterpreter.createNIC("917292396v");
                nicInterpreter.interpret(resultNIC);
	    assertEquals(resultNIC.getBirthday().getDayOfMonth(),16);
	}
        
        @Test
        public void createNICTest3() throws InvalidNICNumberException {
		NIC resultNIC = nicInterpreter.createNIC("917292396v");
                nicInterpreter.interpret(resultNIC);
	    assertEquals(resultNIC.getBirthday().getMonthOfYear(),8);
	}
        
        @Test
        public void createNICTest4() throws InvalidNICNumberException {
		NIC resultNIC = nicInterpreter.createNIC("917292396v");
                nicInterpreter.interpret(resultNIC);
	    assertEquals(resultNIC.getBirthday().getYear(),1991);
	}
        
        @Test
        public void createNICTest5() throws InvalidNICNumberException {
		NIC resultNIC = nicInterpreter.createNIC("917292396v");
                nicInterpreter.interpret(resultNIC);
	    assertEquals(resultNIC.isVoter(),true);
	}
        
}

