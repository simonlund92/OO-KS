package rt;

public class Romertal {
  private String a, b, c;
  private StringBuilder sb = new StringBuilder( "" );
  private StringBuilder sbI = new StringBuilder( "" );
  private StringBuilder sbV = new StringBuilder( "" );
  private StringBuilder sbX = new StringBuilder( "" );
  private StringBuilder sbL = new StringBuilder( "" );

  public Romertal( String a, String b ) {
    this.a = a;
    this.b = b;
    c = a + b;
  }

  public String getFaceit() {
    getI();
    getV();
    getX();
    return sb.append( sbX ).append( sbV ).append( sbI ).append(sbL).toString();
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
        sbV.append( "X" );
      if ( sbV.indexOf( "XXXXX" ) == 0 ) {
        sbV.delete( 0, 5 );
        sbX.append( "L" );
      }

    }

  }
}
