package test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRomertal {
  
    @Test
    public void ikkeMereEndFireI(){
      Romertal romertal = new Romertal(II, III);
    
      assertEquals("V", romertal.getFaceit());
    }
}