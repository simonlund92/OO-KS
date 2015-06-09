package rt;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRomertal {
  
    @Test
    public void ikkeMereEndFireI(){
      Romertal romertal = new Romertal("II", "III");
    
      assertEquals("V", romertal.getFaceit());
    }
    
    @Test
    public void ikkeMereEndEnV(){
      Romertal romertal = new Romertal("V", "V");
    
      assertEquals("X", romertal.getFaceit());
    }
    
    @Test
    public void ikkeMereEndFireX(){
      Romertal romertal = new Romertal("XX", "XXX");
    
      assertEquals("L", romertal.getFaceit());
    }
    
    @Test
    public void ikkeMereEndEnL(){
      Romertal romertal = new Romertal("L", "L");
    
      assertEquals("C", romertal.getFaceit());
    }
}
