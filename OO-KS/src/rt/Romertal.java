package rt;

public class Romertal {
  private String a, b, c;
  private StringBuilder sbSamlet = new StringBuilder( "" );
  private StringBuilder sbI = new StringBuilder( "" );
  private StringBuilder sbV = new StringBuilder( "" );
  private StringBuilder sbX = new StringBuilder( "" );
  private StringBuilder sbL = new StringBuilder( "" );
  private StringBuilder sbC = new StringBuilder( "" );
  private StringBuilder sbD = new StringBuilder( "" );
  private StringBuilder sbM = new StringBuilder( "" );
  public Romertal( String a, String b ) {
    this.a = a;
    this.b = b;
    c = a + b;
  }

  public String getFaceit() {
    getI();
    getV();
    getX();
    getL();
    getC();
    getD();
    getM();
    return sbSamlet.append( sbI ).append( sbV ).append( sbX ).append(sbL).append(sbC).append( sbD ).append(sbM).toString();
  }

  private void getV() {
    for ( int i = 0; i < c.length(); i++ ) {
      if ( c.charAt( i ) == 'V' )
        sbV.append( "V" );
      if ( sbV.indexOf( "VV" ) == 0 ) {
        sbV.delete( 0, 2 );
        sbX.append( "X" );
      }
    }
  }

  private void getI() {
    for ( int i = 0; i < c.length(); i++ ) {
      if ( c.charAt( i ) == 'I' )
        sbI.append( "I" );
      if ( sbI.indexOf( "IIIII" ) == 0 ) {
        sbI.delete( 0, 5 );
        sbV.append( "V" );
      }
    }
  }
  
  private void getX() {
    for ( int i = 0; i < c.length(); i++ ) {
      if ( c.charAt( i ) == 'X' )
        sbX.append( "X" );
      if ( sbX.indexOf( "XXXXX" ) == 0 ) {
        sbX.delete( 0, 5 );
        sbL.append( "L" );
      }
    }
  }
  
  private void getL() {
    for ( int i = 0; i < c.length(); i++ ) {
      if ( c.charAt( i ) == 'L' )
        sbL.append( "L" );
      if ( sbL.indexOf( "LL" ) == 0 ) {
        sbL.delete( 0, 2 );
        sbC.append( "C" );
      }
    }
  }

  private void getC() {
    for ( int i = 0; i < c.length(); i++ ) {
      if ( c.charAt( i ) == 'C' )
        sbC.append( "C" );
      if ( sbC.indexOf( "CCCCC" ) == 0 ) {
        sbC.delete( 0, 5 );
        sbD.append( "D" );
      }
    }
  }
  
  private void getD() {
    for ( int i = 0; i < c.length(); i++ ) {
      if ( c.charAt( i ) == 'D' )
        sbD.append( "D" );
      if ( sbD.indexOf( "DD" ) == 0 ) {
        sbD.delete( 0, 2 );
        sbM.append( "M" );
      }
    }
  }
  
  private void getM() {
    for ( int i = 0; i < c.length(); i++ ) {
      if ( c.charAt( i ) == 'M' )
        sbM.append( "M" );
      if ( sbM.indexOf( "MMMMM" ) == 0 ) {
        sbI.delete( 0, 5 );
        sbV.delete( 0, 2 );
        sbX.delete( 0, 5 );
        sbL.delete( 0, 2 );
        sbC.delete( 0, 5 );
        sbD.delete( 0, 2 );
        sbM.delete( 0, 5 );
        
        sbM.append( "Ugyldig Input" );
      }
    }
  }

}
