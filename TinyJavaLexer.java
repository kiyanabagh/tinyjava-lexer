
import java_cup.runtime.ComplexSymbolFactory;


@SuppressWarnings("fallthrough")
public class TinyJavaLexer {

  public static final int YYEOF = -1;

  
  private static final int ZZ_BUFFERSIZE = 16384;

  public static final int YYINITIAL = 0;

  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\2\2\22\0\1\1\1\4"+
    "\4\0\1\5\1\0\4\6\1\7\1\6\1\7\1\10"+
    "\12\11\1\0\1\7\1\4\1\12\1\4\2\0\10\13"+
    "\1\14\11\13\1\15\7\13\1\6\1\0\1\6\1\0"+
    "\1\16\1\0\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\13\1\31\1\32\1\33"+
    "\1\34\1\35\1\13\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\13\1\7\1\46\1\7\7\0"+
    "\1\3\u01a2\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\3\1\4\1\3"+
    "\1\5\23\6\1\1\1\7\1\0\7\6\1\10\1\6"+
    "\1\10\60\6";

  private static int [] zzUnpackAction() {
    int [] result = new int[89];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\47\0\116\0\165\0\234\0\47\0\47\0\303"+
    "\0\352\0\u0111\0\u0138\0\u015f\0\u0186\0\u01ad\0\u01d4\0\u01fb"+
    "\0\u0222\0\u0249\0\u0270\0\u0297\0\u02be\0\u02e5\0\u030c\0\u0333"+
    "\0\u035a\0\u0381\0\u03a8\0\u03cf\0\u03f6\0\u041d\0\u0444\0\u046b"+
    "\0\u0492\0\u04b9\0\u04e0\0\u0507\0\u052e\0\u0555\0\u0111\0\u057c"+
    "\0\u05a3\0\u05ca\0\u05f1\0\u0618\0\u05a3\0\u063f\0\u0666\0\u068d"+
    "\0\u06b4\0\u06db\0\u0702\0\u0729\0\u0750\0\u0777\0\u079e\0\u07c5"+
    "\0\u07ec\0\u0813\0\u083a\0\u0861\0\u0888\0\u08af\0\u08d6\0\u08fd"+
    "\0\u0924\0\u094b\0\u0972\0\u0999\0\u09c0\0\u09e7\0\u0a0e\0\u0a35"+
    "\0\u0a5c\0\u0a83\0\u0aaa\0\u0ad1\0\u0af8\0\u0b1f\0\u0b46\0\u0b6d"+
    "\0\u0b94\0\u0bbb\0\u0be2\0\u0c09\0\u0c30\0\u0c57\0\u0c7e\0\u0ca5"+
    "\0\u0ccc";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[89];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }


  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\4\2\12\1\13\1\2\1\14\1\15\1\16"+
    "\1\12\1\17\1\20\2\12\1\21\1\22\1\12\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\2\12\1\35\50\0\2\3\56\0\1\6\41\0"+
    "\1\6\51\0\1\36\47\0\1\11\46\0\1\12\1\0"+
    "\3\12\1\37\27\12\12\0\1\12\1\0\3\12\1\37"+
    "\2\12\1\40\16\12\1\41\4\12\1\42\12\0\1\12"+
    "\1\0\3\12\1\37\17\12\1\43\7\12\12\0\1\12"+
    "\1\0\3\12\1\37\15\12\1\44\11\12\12\0\1\12"+
    "\1\0\3\12\1\37\12\12\1\45\14\12\12\0\1\12"+
    "\1\0\3\12\1\37\12\12\1\46\14\12\12\0\1\12"+
    "\1\0\3\12\1\37\1\17\26\12\12\0\1\12\1\0"+
    "\3\12\1\37\5\12\1\47\5\12\1\50\1\51\12\12"+
    "\12\0\1\12\1\0\3\12\1\37\1\52\26\12\12\0"+
    "\1\12\1\0\3\12\1\37\1\53\26\12\12\0\1\12"+
    "\1\0\3\12\1\37\4\12\1\54\22\12\12\0\1\12"+
    "\1\0\3\12\1\37\22\12\1\55\4\12\12\0\1\12"+
    "\1\0\3\12\1\37\17\12\1\56\2\12\1\57\4\12"+
    "\12\0\1\12\1\0\3\12\1\37\4\12\1\60\22\12"+
    "\12\0\1\12\1\0\3\12\1\37\21\12\1\61\5\12"+
    "\12\0\1\12\1\0\3\12\1\37\7\12\1\62\7\12"+
    "\1\63\7\12\12\0\1\12\1\0\3\12\1\37\21\12"+
    "\1\64\5\12\12\0\1\12\1\0\3\12\1\37\15\12"+
    "\1\65\11\12\12\0\1\12\1\0\3\12\1\37\7\12"+
    "\1\66\17\12\47\0\1\6\2\36\2\0\43\36\11\0"+
    "\1\12\1\0\3\12\1\0\27\12\12\0\1\12\1\0"+
    "\3\12\1\37\1\67\26\12\12\0\1\12\1\0\3\12"+
    "\1\37\17\12\1\70\7\12\12\0\1\12\1\0\3\12"+
    "\1\37\20\12\1\71\6\12\12\0\1\12\1\0\3\12"+
    "\1\37\6\12\1\72\20\12\12\0\1\12\1\0\3\12"+
    "\1\37\15\12\1\73\11\12\12\0\1\12\1\0\3\12"+
    "\1\37\1\74\26\12\12\0\1\12\1\0\3\12\1\37"+
    "\20\12\1\75\6\12\12\0\1\12\1\0\3\12\1\37"+
    "\16\12\1\76\10\12\12\0\1\12\1\0\3\12\1\37"+
    "\21\12\1\47\5\12\12\0\1\12\1\0\3\12\1\37"+
    "\23\12\1\77\3\12\12\0\1\12\1\0\3\12\1\37"+
    "\10\12\1\100\16\12\12\0\1\12\1\0\3\12\1\37"+
    "\24\12\1\47\1\101\1\12\12\0\1\12\1\0\3\12"+
    "\1\37\10\12\1\102\16\12\12\0\1\12\1\0\3\12"+
    "\1\37\1\12\1\103\25\12\12\0\1\12\1\0\3\12"+
    "\1\37\21\12\1\104\5\12\12\0\1\12\1\0\3\12"+
    "\1\37\1\105\26\12\12\0\1\12\1\0\3\12\1\37"+
    "\10\12\1\72\16\12\12\0\1\12\1\0\3\12\1\37"+
    "\22\12\1\75\4\12\12\0\1\12\1\0\3\12\1\37"+
    "\10\12\1\106\16\12\12\0\1\12\1\0\3\12\1\37"+
    "\10\12\1\107\16\12\12\0\1\12\1\0\3\12\1\37"+
    "\10\12\1\110\16\12\12\0\1\12\1\0\3\12\1\37"+
    "\14\12\1\111\12\12\12\0\1\12\1\0\3\12\1\37"+
    "\10\12\1\112\16\12\12\0\1\12\1\0\3\12\1\37"+
    "\21\12\1\113\5\12\12\0\1\12\1\0\3\12\1\37"+
    "\20\12\1\47\6\12\12\0\1\12\1\0\3\12\1\37"+
    "\12\12\1\114\14\12\12\0\1\12\1\0\3\12\1\37"+
    "\20\12\1\72\6\12\12\0\1\12\1\0\3\12\1\37"+
    "\4\12\1\47\22\12\12\0\1\12\1\0\3\12\1\37"+
    "\15\12\1\115\11\12\12\0\1\12\1\0\3\12\1\37"+
    "\1\47\26\12\12\0\1\12\1\0\3\12\1\37\14\12"+
    "\1\47\12\12\12\0\1\12\1\0\3\12\1\37\21\12"+
    "\1\116\5\12\12\0\1\12\1\0\3\12\1\37\14\12"+
    "\1\117\12\12\12\0\1\12\1\0\3\12\1\37\12\12"+
    "\1\120\14\12\12\0\1\12\1\0\3\12\1\37\22\12"+
    "\1\121\4\12\12\0\1\12\1\0\3\12\1\37\21\12"+
    "\1\120\5\12\12\0\1\12\1\0\3\12\1\37\12\12"+
    "\1\47\14\12\12\0\1\12\1\0\3\12\1\37\3\12"+
    "\1\47\23\12\12\0\1\12\1\0\3\12\1\37\12\12"+
    "\1\75\14\12\12\0\1\12\1\0\3\12\1\37\14\12"+
    "\1\122\12\12\12\0\1\12\1\0\3\12\1\37\14\12"+
    "\1\123\12\12\12\0\1\12\1\0\3\12\1\37\4\12"+
    "\1\124\22\12\12\0\1\12\1\0\3\12\1\37\4\12"+
    "\1\125\22\12\12\0\1\12\1\0\3\12\1\37\17\12"+
    "\1\55\7\12\12\0\1\12\1\0\1\12\1\126\1\12"+
    "\1\37\27\12\12\0\1\12\1\0\3\12\1\37\21\12"+
    "\1\127\5\12\12\0\1\12\1\0\3\12\1\37\10\12"+
    "\1\130\16\12\12\0\1\12\1\0\3\12\1\37\17\12"+
    "\1\100\7\12\12\0\1\12\1\0\3\12\1\37\4\12"+
    "\1\131\22\12\12\0\1\12\1\0\3\12\1\37\6\12"+
    "\1\47\20\12\12\0\1\12\1\0\3\12\1\37\13\12"+
    "\1\47\13\12\12\0\1\12\1\0\3\12\1\37\1\100"+
    "\26\12\12\0\1\12\1\0\3\12\1\37\14\12\1\55"+
    "\12\12\12\0\1\12\1\0\3\12\1\37\12\12\1\100"+
    "\14\12\12\0\1\12\1\0\3\12\1\37\2\12\1\47"+
    "\24\12\12\0\1\12\1\0\3\12\1\37\17\12\1\47"+
    "\7\12\1\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[3315];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;


  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\2\11\27\1\1\0\72\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[89];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  private java.io.Reader zzReader;

  private int zzState;

  private int zzLexicalState = YYINITIAL;

  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  private int zzMarkedPos;

  private int zzCurrentPos;

  private int zzStartRead;

  private int zzEndRead;

  private boolean zzAtEOF;

  private int zzFinalHighSurrogate = 0;

  private int yyline;

  private int yycolumn;

  @SuppressWarnings("unused")
  private long yychar;

  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  private java_cup.runtime.Symbol tok(String category, String lexeme) {
    String name = "(" + category + ", " + lexeme + ")";
    return new ComplexSymbolFactory.ComplexSymbol(name, 0, lexeme);
  }

  private java_cup.runtime.Symbol eofTok() {
    return new java_cup.runtime.Symbol(Symbol.EOF);
  }



  public TinyJavaLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  private boolean zzCanGrow() {
    return true;
  }

  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  private boolean zzRefill() throws java.io.IOException {


    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);


      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }


    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {

      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }


    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);


    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {
          int c = zzReader.read();
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }

      return false;
    }


    return true;
  }


  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;
    zzEndRead = zzStartRead;

    if (zzReader != null) {
      zzReader.close();
    }
  }


  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  public final int yystate() {
    return zzLexicalState;
  }


  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;


    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
              {
                return eofTok();
              }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return tok("unknown", yytext());
            }
          case 9: break;
          case 2:
            {
            }
          case 10: break;
          case 3:
            { return tok("operator", yytext());
            }
          case 11: break;
          case 4:
            { return tok("punctuation", yytext());
            }
          case 12: break;
          case 5:
            { return tok("integer", yytext());
            }
          case 13: break;
          case 6:
            { return tok("id", yytext());
            }
          case 14: break;
          case 7:
            {
            }
          case 15: break;
          case 8:
            { return tok("keyword", yytext());
            }
          case 16: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
