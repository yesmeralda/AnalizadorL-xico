import compilerTools.Token;

@SuppressWarnings("FallThrough")
class Lexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
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


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\1\1\4\22\0\1\1"+
    "\1\5\1\6\4\0\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\11\21\1\22\1\23"+
    "\1\24\1\25\1\26\2\0\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\1\53\1\40\1\54\1\55\1\56\1\40\1\57\1\0"+
    "\1\60\1\0\1\40\1\0\1\61\1\62\1\63\1\64"+
    "\1\65\1\66\1\67\1\70\1\71\1\40\1\72\1\73"+
    "\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103"+
    "\1\104\1\40\1\105\1\106\1\107\1\40\1\110\1\0"+
    "\1\111\7\0\1\3\73\0\1\112\7\0\1\112\3\0"+
    "\1\112\3\0\1\112\1\0\1\112\6\0\1\112\1\0"+
    "\1\112\4\0\1\112\7\0\1\112\3\0\1\112\3\0"+
    "\1\112\1\0\1\112\6\0\1\112\1\0\1\112\u012b\0"+
    "\2\3\326\0\u0100\3";

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

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\2\15\1\16"+
    "\1\17\1\20\1\21\1\22\17\23\1\24\1\25\16\23"+
    "\1\26\1\27\1\30\1\31\1\0\1\32\1\33\1\0"+
    "\1\2\1\0\1\34\1\35\1\36\30\23\1\37\1\23"+
    "\1\40\1\23\1\40\4\23\1\41\24\23\2\0\2\42"+
    "\1\43\10\23\1\44\1\23\1\45\5\23\1\46\4\23"+
    "\1\47\3\23\1\50\22\23\1\51\3\23\1\0\1\2"+
    "\10\23\1\52\12\23\1\53\12\23\1\54\1\55\2\23"+
    "\1\56\2\23\1\57\1\23\1\60\1\23\1\61\2\23"+
    "\1\62\1\63\1\23\1\64\3\23\1\65\1\66\1\67"+
    "\4\23\1\70\2\23\1\71\1\72\1\73\1\74\1\75"+
    "\1\76";

  private static int [] zzUnpackAction() {
    int [] result = new int[242];
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


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\113\0\113\0\226\0\341\0\u012c\0\113\0\113"+
    "\0\113\0\113\0\u0177\0\113\0\u01c2\0\113\0\u020d\0\u0258"+
    "\0\u02a3\0\113\0\113\0\u02ee\0\u0339\0\u0384\0\u03cf\0\u041a"+
    "\0\u0465\0\u04b0\0\u04fb\0\u0546\0\u0591\0\u05dc\0\u0627\0\u0672"+
    "\0\u06bd\0\u0708\0\u0753\0\u079e\0\u07e9\0\113\0\113\0\u0834"+
    "\0\u087f\0\u08ca\0\u0915\0\u0960\0\u09ab\0\u09f6\0\u0a41\0\u0a8c"+
    "\0\u0ad7\0\u0b22\0\u0b6d\0\u0bb8\0\u0c03\0\113\0\113\0\113"+
    "\0\113\0\u012c\0\113\0\113\0\u0c4e\0\u0c99\0\u0ce4\0\113"+
    "\0\113\0\113\0\u0d2f\0\u0d7a\0\u0dc5\0\u0e10\0\u0e5b\0\u0ea6"+
    "\0\u0ef1\0\u0f3c\0\u0f87\0\u0fd2\0\u101d\0\u1068\0\u10b3\0\u10fe"+
    "\0\u1149\0\u1194\0\u11df\0\u122a\0\u1275\0\u12c0\0\u130b\0\u1356"+
    "\0\u13a1\0\u13ec\0\u0591\0\u1437\0\u1482\0\u14cd\0\u1518\0\u1563"+
    "\0\u15ae\0\u15f9\0\u1644\0\u0591\0\u168f\0\u16da\0\u1725\0\u1770"+
    "\0\u17bb\0\u1806\0\u1851\0\u189c\0\u18e7\0\u1932\0\u197d\0\u19c8"+
    "\0\u1a13\0\u1a5e\0\u1aa9\0\u1af4\0\u1b3f\0\u1b8a\0\u1bd5\0\u1c20"+
    "\0\u1c6b\0\u1cb6\0\113\0\u1d01\0\u0591\0\u1d4c\0\u1d97\0\u1de2"+
    "\0\u1e2d\0\u1e78\0\u1ec3\0\u1f0e\0\u1f59\0\u0591\0\u1fa4\0\u0591"+
    "\0\u1fef\0\u203a\0\u2085\0\u20d0\0\u211b\0\u0591\0\u2166\0\u21b1"+
    "\0\u21fc\0\u2247\0\u0591\0\u2292\0\u22dd\0\u2328\0\u0591\0\u2373"+
    "\0\u23be\0\u2409\0\u2454\0\u249f\0\u24ea\0\u2535\0\u2580\0\u25cb"+
    "\0\u2616\0\u2661\0\u26ac\0\u26f7\0\u2742\0\u278d\0\u27d8\0\u2823"+
    "\0\u286e\0\u0591\0\u28b9\0\u2904\0\u294f\0\u299a\0\u1c6b\0\u29e5"+
    "\0\u2a30\0\u2a7b\0\u2ac6\0\u2b11\0\u2b5c\0\u2ba7\0\u2bf2\0\u0591"+
    "\0\u2c3d\0\u2c88\0\u2cd3\0\u2d1e\0\u2d69\0\u2db4\0\u2dff\0\u2e4a"+
    "\0\u2e95\0\u2ee0\0\u0591\0\u2f2b\0\u2f76\0\u2fc1\0\u300c\0\u3057"+
    "\0\u30a2\0\u30ed\0\u3138\0\u3183\0\u31ce\0\u0591\0\u0591\0\u3219"+
    "\0\u3264\0\u0591\0\u32af\0\u32fa\0\u0591\0\u3345\0\u0591\0\u3390"+
    "\0\u0591\0\u33db\0\u3426\0\u0591\0\u0591\0\u3471\0\u0591\0\u34bc"+
    "\0\u3507\0\u3552\0\u0591\0\u0591\0\u0591\0\u359d\0\u35e8\0\u3633"+
    "\0\u367e\0\u0591\0\u36c9\0\u3714\0\u0591\0\u0591\0\u0591\0\u0591"+
    "\0\u0591\0\u0591";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[242];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\2\35\1\36\4\35\1\37"+
    "\1\40\1\41\1\35\1\42\1\43\1\44\1\35\1\45"+
    "\2\35\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\1\55\2\35\1\56\3\35\1\57\1\60\1\61\1\35"+
    "\1\62\1\63\1\64\1\35\1\65\2\35\1\66\1\67"+
    "\1\35\115\0\1\3\135\0\1\70\73\0\1\71\6\0"+
    "\2\72\1\0\2\72\5\0\30\72\2\0\27\72\16\0"+
    "\1\73\114\0\1\74\107\0\1\75\4\0\1\76\111\0"+
    "\1\77\112\0\1\77\1\0\2\21\116\0\1\100\112\0"+
    "\1\101\112\0\1\102\105\0\2\35\5\0\15\35\1\103"+
    "\12\35\2\0\14\35\1\104\12\35\2\0\1\35\20\0"+
    "\2\35\5\0\4\35\1\105\11\35\1\106\2\35\1\107"+
    "\6\35\2\0\4\35\1\110\10\35\1\111\2\35\1\112"+
    "\6\35\2\0\1\35\20\0\2\35\5\0\13\35\1\113"+
    "\14\35\2\0\12\35\1\114\14\35\2\0\1\35\20\0"+
    "\2\35\5\0\4\35\1\115\23\35\2\0\4\35\1\116"+
    "\22\35\2\0\1\35\20\0\2\35\5\0\13\35\1\117"+
    "\1\35\1\120\10\35\1\121\1\35\2\0\12\35\1\122"+
    "\1\35\1\123\10\35\1\124\1\35\2\0\1\35\20\0"+
    "\2\35\5\0\1\125\12\35\1\126\2\35\1\127\11\35"+
    "\2\0\1\130\11\35\1\131\2\35\1\132\11\35\2\0"+
    "\1\35\20\0\2\35\5\0\30\35\2\0\27\35\2\0"+
    "\1\35\20\0\2\35\5\0\5\35\1\133\6\35\1\134"+
    "\1\135\12\35\2\0\5\35\1\133\5\35\1\136\1\137"+
    "\12\35\2\0\1\35\20\0\2\35\5\0\4\35\1\140"+
    "\11\35\1\141\11\35\2\0\4\35\1\142\10\35\1\143"+
    "\11\35\2\0\1\35\20\0\2\35\5\0\21\35\1\144"+
    "\2\35\1\145\3\35\2\0\20\35\1\144\2\35\1\146"+
    "\3\35\2\0\1\35\20\0\2\35\5\0\16\35\1\147"+
    "\2\35\1\150\6\35\2\0\15\35\1\151\2\35\1\152"+
    "\6\35\2\0\1\35\20\0\2\35\5\0\1\153\3\35"+
    "\1\154\23\35\2\0\1\155\3\35\1\156\22\35\2\0"+
    "\1\35\20\0\2\35\5\0\4\35\1\157\13\35\1\160"+
    "\2\35\1\161\4\35\2\0\4\35\1\162\12\35\1\163"+
    "\2\35\1\164\4\35\2\0\1\35\20\0\2\35\5\0"+
    "\21\35\1\165\6\35\2\0\20\35\1\166\6\35\2\0"+
    "\1\35\20\0\2\35\5\0\7\35\1\167\20\35\2\0"+
    "\7\35\1\170\17\35\2\0\1\35\20\0\2\35\5\0"+
    "\30\35\2\0\14\35\1\104\12\35\2\0\1\35\20\0"+
    "\2\35\5\0\30\35\2\0\4\35\1\110\10\35\1\111"+
    "\2\35\1\112\6\35\2\0\1\35\20\0\2\35\5\0"+
    "\30\35\2\0\12\35\1\114\14\35\2\0\1\35\20\0"+
    "\2\35\5\0\30\35\2\0\4\35\1\116\22\35\2\0"+
    "\1\35\20\0\2\35\5\0\30\35\2\0\12\35\1\122"+
    "\1\35\1\123\10\35\1\124\1\35\2\0\1\35\20\0"+
    "\2\35\5\0\30\35\2\0\1\130\11\35\1\131\2\35"+
    "\1\132\11\35\2\0\1\35\20\0\2\35\5\0\30\35"+
    "\2\0\5\35\1\133\5\35\1\136\1\137\12\35\2\0"+
    "\1\35\20\0\2\35\5\0\30\35\2\0\4\35\1\142"+
    "\10\35\1\143\11\35\2\0\1\35\20\0\2\35\5\0"+
    "\30\35\2\0\20\35\1\144\2\35\1\146\3\35\2\0"+
    "\1\35\20\0\2\35\5\0\30\35\2\0\15\35\1\151"+
    "\2\35\1\152\6\35\2\0\1\35\20\0\2\35\5\0"+
    "\30\35\2\0\1\155\3\35\1\156\22\35\2\0\1\35"+
    "\20\0\2\35\5\0\30\35\2\0\4\35\1\162\12\35"+
    "\1\163\2\35\1\164\4\35\2\0\1\35\20\0\2\35"+
    "\5\0\30\35\2\0\20\35\1\166\6\35\2\0\1\35"+
    "\20\0\2\35\5\0\30\35\2\0\7\35\1\170\17\35"+
    "\2\0\1\35\12\171\1\172\100\171\2\76\1\3\1\76"+
    "\1\4\106\76\20\0\1\173\1\174\111\0\2\35\5\0"+
    "\3\35\1\175\24\35\2\0\27\35\2\0\1\35\20\0"+
    "\2\35\5\0\30\35\2\0\3\35\1\175\23\35\2\0"+
    "\1\35\20\0\2\35\5\0\6\35\1\176\21\35\2\0"+
    "\27\35\2\0\1\35\20\0\2\35\5\0\16\35\1\177"+
    "\11\35\2\0\27\35\2\0\1\35\20\0\2\35\5\0"+
    "\4\35\1\200\23\35\2\0\27\35\2\0\1\35\20\0"+
    "\2\35\5\0\30\35\2\0\6\35\1\201\20\35\2\0"+
    "\1\35\20\0\2\35\5\0\30\35\2\0\15\35\1\202"+
    "\11\35\2\0\1\35\20\0\2\35\5\0\30\35\2\0"+
    "\4\35\1\203\22\35\2\0\1\35\20\0\2\35\5\0"+
    "\1\204\27\35\2\0\27\35\2\0\1\35\20\0\2\35"+
    "\5\0\30\35\2\0\1\205\26\35\2\0\1\35\20\0"+
    "\2\35\5\0\5\35\1\206\22\35\2\0\27\35\2\0"+
    "\1\35\20\0\2\35\5\0\30\35\2\0\5\35\1\206"+
    "\21\35\2\0\1\35\20\0\2\35\5\0\22\35\1\207"+
    "\5\35\2\0\27\35\2\0\1\35\20\0\2\35\5\0"+
    "\3\35\1\210\24\35\2\0\27\35\2\0\1\35\20\0"+
    "\2\35\5\0\2\35\1\211\25\35\2\0\27\35\2\0"+
    "\1\35\20\0\2\35\5\0\30\35\2\0\21\35\1\212"+
    "\5\35\2\0\1\35\20\0\2\35\5\0\30\35\2\0"+
    "\3\35\1\210\23\35\2\0\1\35\20\0\2\35\5\0"+
    "\30\35\2\0\2\35\1\213\24\35\2\0\1\35\20\0"+
    "\2\35\5\0\13\35\1\214\14\35\2\0\27\35\2\0"+
    "\1\35\20\0\2\35\5\0\16\35\1\215\11\35\2\0"+
    "\27\35\2\0\1\35\20\0\2\35\5\0\21\35\1\216"+
    "\6\35\2\0\27\35\2\0\1\35\20\0\2\35\5\0"+
    "\30\35\2\0\12\35\1\217\14\35\2\0\1\35\20\0"+
    "\2\35\5\0\30\35\2\0\15\35\1\220\11\35\2\0"+
    "\1\35\20\0\2\35\5\0\30\35\2\0\20\35\1\216"+
    "\6\35\2\0\1\35\20\0\2\35\5\0\17\35\1\221"+
    "\10\35\2\0\27\35\2\0\1\35\20\0\2\35\5\0"+
    "\17\35\1\222\3\35\1\223\4\35\2\0\27\35\2\0"+
    "\1\35\20\0\2\35\5\0\30\35\2\0\16\35\1\224"+
    "\10\35\2\0\1\35\20\0\2\35\5\0\30\35\2\0"+
    "\16\35\1\225\3\35\1\223\4\35\2\0\1\35\20\0"+
    "\2\35\5\0\26\35\1\226\1\35\2\0\27\35\2\0"+
    "\1\35\20\0\2\35\5\0\23\35\1\227\4\35\2\0"+
    "\27\35\2\0\1\35\20\0\2\35\5\0\30\35\2\0"+
    "\25\35\1\230\1\35\2\0\1\35\20\0\2\35\5\0"+
    "\30\35\2\0\22\35\1\227\4\35\2\0\1\35\20\0"+
    "\2\35\5\0\23\35\1\231\4\35\2\0\27\35\2\0"+
    "\1\35\20\0\2\35\5\0\30\35\2\0\22\35\1\232"+
    "\4\35\2\0\1\35\20\0\2\35\5\0\25\35\1\233"+
    "\2\35\2\0\27\35\2\0\1\35\20\0\2\35\5\0"+
    "\10\35\1\234\17\35\2\0\27\35\2\0\1\35\20\0"+
    "\2\35\5\0\30\35\2\0\24\35\1\235\2\35\2\0"+
    "\1\35\20\0\2\35\5\0\30\35\2\0\10\35\1\236"+
    "\16\35\2\0\1\35\20\0\2\35\5\0\15\35\1\237"+
    "\12\35\2\0\27\35\2\0\1\35\20\0\2\35\5\0"+
    "\23\35\1\240\4\35\2\0\27\35\2\0\1\35\20\0"+
    "\2\35\5\0\30\35\2\0\14\35\1\241\12\35\2\0"+
    "\1\35\20\0\2\35\5\0\30\35\2\0\22\35\1\242"+
    "\4\35\2\0\1\35\20\0\2\35\5\0\13\35\1\243"+
    "\14\35\2\0\27\35\2\0\1\35\20\0\2\35\5\0"+
    "\21\35\1\244\6\35\2\0\27\35\2\0\1\35\20\0"+
    "\2\35\5\0\21\35\1\245\6\35\2\0\27\35\2\0"+
    "\1\35\20\0\2\35\5\0\30\35\2\0\12\35\1\246"+
    "\14\35\2\0\1\35\20\0\2\35\5\0\30\35\2\0"+
    "\20\35\1\247\6\35\2\0\1\35\20\0\2\35\5\0"+
    "\30\35\2\0\20\35\1\250\6\35\2\0\1\35\20\0"+
    "\2\35\5\0\24\35\1\251\2\35\1\252\2\0\27\35"+
    "\2\0\1\35\20\0\2\35\5\0\30\35\2\0\23\35"+
    "\1\253\2\35\1\252\2\0\1\35\20\0\2\35\5\0"+
    "\10\35\1\254\17\35\2\0\27\35\2\0\1\35\20\0"+
    "\2\35\5\0\30\35\2\0\10\35\1\255\16\35\2\0"+
    "\1\35\12\171\1\256\112\171\1\256\4\171\1\257\73\171"+
    "\20\0\2\174\111\0\2\35\5\0\10\35\1\260\17\35"+
    "\2\0\27\35\2\0\1\35\20\0\2\35\5\0\13\35"+
    "\1\261\14\35\2\0\27\35\2\0\1\35\20\0\2\35"+
    "\5\0\1\262\27\35\2\0\27\35\2\0\1\35\20\0"+
    "\2\35\5\0\30\35\2\0\10\35\1\263\16\35\2\0"+
    "\1\35\20\0\2\35\5\0\30\35\2\0\12\35\1\264"+
    "\14\35\2\0\1\35\20\0\2\35\5\0\30\35\2\0"+
    "\1\265\26\35\2\0\1\35\20\0\2\35\5\0\22\35"+
    "\1\266\5\35\2\0\27\35\2\0\1\35\20\0\2\35"+
    "\5\0\30\35\2\0\21\35\1\267\5\35\2\0\1\35"+
    "\20\0\2\35\5\0\4\35\1\270\23\35\2\0\27\35"+
    "\2\0\1\35\20\0\2\35\5\0\4\35\1\271\23\35"+
    "\2\0\27\35\2\0\1\35\20\0\2\35\5\0\30\35"+
    "\2\0\4\35\1\270\22\35\2\0\1\35\20\0\2\35"+
    "\5\0\30\35\2\0\4\35\1\272\22\35\2\0\1\35"+
    "\20\0\2\35\5\0\22\35\1\273\5\35\2\0\27\35"+
    "\2\0\1\35\20\0\2\35\5\0\1\274\27\35\2\0"+
    "\27\35\2\0\1\35\20\0\2\35\5\0\30\35\2\0"+
    "\21\35\1\275\5\35\2\0\1\35\20\0\2\35\5\0"+
    "\30\35\2\0\1\276\26\35\2\0\1\35\20\0\2\35"+
    "\5\0\16\35\1\277\11\35\2\0\27\35\2\0\1\35"+
    "\20\0\2\35\5\0\24\35\1\300\3\35\2\0\27\35"+
    "\2\0\1\35\20\0\2\35\5\0\30\35\2\0\15\35"+
    "\1\301\11\35\2\0\1\35\20\0\2\35\5\0\30\35"+
    "\2\0\23\35\1\302\3\35\2\0\1\35\20\0\2\35"+
    "\5\0\23\35\1\303\4\35\2\0\27\35\2\0\1\35"+
    "\20\0\2\35\5\0\30\35\2\0\22\35\1\303\4\35"+
    "\2\0\1\35\20\0\2\35\5\0\17\35\1\304\10\35"+
    "\2\0\27\35\2\0\1\35\20\0\2\35\5\0\30\35"+
    "\2\0\16\35\1\305\10\35\2\0\1\35\20\0\2\35"+
    "\5\0\4\35\1\306\23\35\2\0\27\35\2\0\1\35"+
    "\20\0\2\35\5\0\15\35\1\307\12\35\2\0\27\35"+
    "\2\0\1\35\20\0\2\35\5\0\30\35\2\0\4\35"+
    "\1\310\22\35\2\0\1\35\20\0\2\35\5\0\30\35"+
    "\2\0\14\35\1\311\12\35\2\0\1\35\20\0\2\35"+
    "\5\0\6\35\1\312\21\35\2\0\27\35\2\0\1\35"+
    "\20\0\2\35\5\0\24\35\1\313\3\35\2\0\27\35"+
    "\2\0\1\35\20\0\2\35\5\0\30\35\2\0\6\35"+
    "\1\314\20\35\2\0\1\35\20\0\2\35\5\0\30\35"+
    "\2\0\23\35\1\315\3\35\2\0\1\35\20\0\2\35"+
    "\5\0\5\35\1\316\22\35\2\0\27\35\2\0\1\35"+
    "\20\0\2\35\5\0\23\35\1\317\4\35\2\0\27\35"+
    "\2\0\1\35\20\0\2\35\5\0\10\35\1\320\17\35"+
    "\2\0\27\35\2\0\1\35\20\0\2\35\5\0\30\35"+
    "\2\0\5\35\1\316\21\35\2\0\1\35\20\0\2\35"+
    "\5\0\30\35\2\0\22\35\1\317\4\35\2\0\1\35"+
    "\20\0\2\35\5\0\30\35\2\0\10\35\1\321\16\35"+
    "\2\0\1\35\20\0\2\35\5\0\4\35\1\322\23\35"+
    "\2\0\27\35\2\0\1\35\20\0\2\35\5\0\30\35"+
    "\2\0\4\35\1\322\22\35\2\0\1\35\20\0\2\35"+
    "\5\0\13\35\1\323\14\35\2\0\27\35\2\0\1\35"+
    "\20\0\2\35\5\0\30\35\2\0\12\35\1\324\14\35"+
    "\2\0\1\35\12\171\1\256\4\171\1\3\73\171\20\0"+
    "\2\35\5\0\15\35\1\325\12\35\2\0\27\35\2\0"+
    "\1\35\20\0\2\35\5\0\4\35\1\326\23\35\2\0"+
    "\27\35\2\0\1\35\20\0\2\35\5\0\12\35\1\327"+
    "\15\35\2\0\27\35\2\0\1\35\20\0\2\35\5\0"+
    "\30\35\2\0\14\35\1\325\12\35\2\0\1\35\20\0"+
    "\2\35\5\0\30\35\2\0\4\35\1\330\22\35\2\0"+
    "\1\35\20\0\2\35\5\0\30\35\2\0\11\35\1\327"+
    "\15\35\2\0\1\35\20\0\2\35\5\0\22\35\1\331"+
    "\5\35\2\0\27\35\2\0\1\35\20\0\2\35\5\0"+
    "\30\35\2\0\21\35\1\331\5\35\2\0\1\35\20\0"+
    "\2\35\5\0\17\35\1\332\10\35\2\0\27\35\2\0"+
    "\1\35\20\0\2\35\5\0\30\35\2\0\16\35\1\333"+
    "\10\35\2\0\1\35\20\0\2\35\5\0\4\35\1\334"+
    "\23\35\2\0\27\35\2\0\1\35\20\0\2\35\5\0"+
    "\23\35\1\335\4\35\2\0\27\35\2\0\1\35\20\0"+
    "\2\35\5\0\30\35\2\0\4\35\1\334\22\35\2\0"+
    "\1\35\20\0\2\35\5\0\30\35\2\0\22\35\1\335"+
    "\4\35\2\0\1\35\20\0\2\35\5\0\21\35\1\336"+
    "\6\35\2\0\27\35\2\0\1\35\20\0\2\35\5\0"+
    "\23\35\1\337\4\35\2\0\27\35\2\0\1\35\20\0"+
    "\2\35\5\0\30\35\2\0\20\35\1\340\6\35\2\0"+
    "\1\35\20\0\2\35\5\0\30\35\2\0\22\35\1\337"+
    "\4\35\2\0\1\35\20\0\2\35\5\0\24\35\1\341"+
    "\3\35\2\0\27\35\2\0\1\35\20\0\2\35\5\0"+
    "\30\35\2\0\23\35\1\342\3\35\2\0\1\35\20\0"+
    "\2\35\5\0\21\35\1\343\6\35\2\0\27\35\2\0"+
    "\1\35\20\0\2\35\5\0\23\35\1\344\4\35\2\0"+
    "\27\35\2\0\1\35\20\0\2\35\5\0\30\35\2\0"+
    "\20\35\1\343\6\35\2\0\1\35\20\0\2\35\5\0"+
    "\30\35\2\0\22\35\1\344\4\35\2\0\1\35\20\0"+
    "\2\35\5\0\4\35\1\345\23\35\2\0\27\35\2\0"+
    "\1\35\20\0\2\35\5\0\21\35\1\346\6\35\2\0"+
    "\27\35\2\0\1\35\20\0\2\35\5\0\30\35\2\0"+
    "\4\35\1\345\22\35\2\0\1\35\20\0\2\35\5\0"+
    "\30\35\2\0\20\35\1\347\6\35\2\0\1\35\20\0"+
    "\2\35\5\0\15\35\1\350\12\35\2\0\27\35\2\0"+
    "\1\35\20\0\2\35\5\0\30\35\2\0\14\35\1\351"+
    "\12\35\2\0\1\35\20\0\2\35\5\0\4\35\1\352"+
    "\23\35\2\0\27\35\2\0\1\35\20\0\2\35\5\0"+
    "\30\35\2\0\4\35\1\352\22\35\2\0\1\35\20\0"+
    "\2\35\5\0\1\353\27\35\2\0\27\35\2\0\1\35"+
    "\20\0\2\35\5\0\30\35\2\0\1\354\26\35\2\0"+
    "\1\35\20\0\2\35\5\0\23\35\1\355\4\35\2\0"+
    "\27\35\2\0\1\35\20\0\2\35\5\0\30\35\2\0"+
    "\22\35\1\355\4\35\2\0\1\35\20\0\2\35\5\0"+
    "\23\35\1\356\4\35\2\0\27\35\2\0\1\35\20\0"+
    "\2\35\5\0\30\35\2\0\22\35\1\356\4\35\2\0"+
    "\1\35\20\0\2\35\5\0\23\35\1\357\4\35\2\0"+
    "\27\35\2\0\1\35\20\0\2\35\5\0\30\35\2\0"+
    "\22\35\1\357\4\35\2\0\1\35\20\0\2\35\5\0"+
    "\15\35\1\360\12\35\2\0\27\35\2\0\1\35\20\0"+
    "\2\35\5\0\30\35\2\0\14\35\1\360\12\35\2\0"+
    "\1\35\20\0\2\35\5\0\6\35\1\361\21\35\2\0"+
    "\27\35\2\0\1\35\20\0\2\35\5\0\30\35\2\0"+
    "\6\35\1\361\20\35\2\0\1\35\20\0\2\35\5\0"+
    "\15\35\1\362\12\35\2\0\27\35\2\0\1\35\20\0"+
    "\2\35\5\0\30\35\2\0\14\35\1\362\12\35\2\0"+
    "\1\35";

  private static int [] zzUnpackTrans() {
    int [] result = new int[14175];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
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

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\3\1\4\11\1\1\1\11\1\1\1\11"+
    "\3\1\2\11\22\1\2\11\16\1\4\11\1\0\2\11"+
    "\1\0\1\1\1\0\3\11\66\1\2\0\1\11\62\1"+
    "\1\0\104\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[242];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
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


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
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
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return token(yytext(), "ERROR", yyline, yycolumn);
            }
            // fall through
          case 63: break;
          case 2:
            { /*Ignorar*/
            }
            // fall through
          case 64: break;
          case 3:
            { return token(yytext(), "COMILLADOBLE", yyline, yycolumn);
            }
            // fall through
          case 65: break;
          case 4:
            { return token(yytext(), "COMILLASIMPLE", yyline, yycolumn);
            }
            // fall through
          case 66: break;
          case 5:
            { return token(yytext(), "PARENTESISABIERTO", yyline, yycolumn);
            }
            // fall through
          case 67: break;
          case 6:
            { return token(yytext(), "PARENTESISCERRADO", yyline, yycolumn);
            }
            // fall through
          case 68: break;
          case 7:
            { return token(yytext(), "MULTIPLICACION", yyline, yycolumn);
            }
            // fall through
          case 69: break;
          case 8:
            { return token(yytext(), "SUMA", yyline, yycolumn);
            }
            // fall through
          case 70: break;
          case 9:
            { return token(yytext(), "COMA", yyline, yycolumn);
            }
            // fall through
          case 71: break;
          case 10:
            { return token(yytext(), "RESTA", yyline, yycolumn);
            }
            // fall through
          case 72: break;
          case 11:
            { return token(yytext(), "PUNTO", yyline, yycolumn);
            }
            // fall through
          case 73: break;
          case 12:
            { return token(yytext(), "DIVISION", yyline, yycolumn);
            }
            // fall through
          case 74: break;
          case 13:
            { return token(yytext(), "NUMERO", yyline, yycolumn);
            }
            // fall through
          case 75: break;
          case 14:
            { return token(yytext(), "DOSPUNTOS", yyline, yycolumn);
            }
            // fall through
          case 76: break;
          case 15:
            { return token(yytext(), "PUNTOCOMA", yyline, yycolumn);
            }
            // fall through
          case 77: break;
          case 16:
            { return token(yytext(), "MENORQUE", yyline, yycolumn);
            }
            // fall through
          case 78: break;
          case 17:
            { return token(yytext(), "ASIGNACION", yyline, yycolumn);
            }
            // fall through
          case 79: break;
          case 18:
            { return token(yytext(), "MAYORQUE", yyline, yycolumn);
            }
            // fall through
          case 80: break;
          case 19:
            { return token(yytext(), "ID", yyline, yycolumn);
            }
            // fall through
          case 81: break;
          case 20:
            { return token(yytext(), "CORCHETEABIERTO", yyline, yycolumn);
            }
            // fall through
          case 82: break;
          case 21:
            { return token(yytext(), "CORCHETECERRADO", yyline, yycolumn);
            }
            // fall through
          case 83: break;
          case 22:
            { return token(yytext(), "LLAVEABIERTO", yyline, yycolumn);
            }
            // fall through
          case 84: break;
          case 23:
            { return token(yytext(), "LLAVECERRADO", yyline, yycolumn);
            }
            // fall through
          case 85: break;
          case 24:
            { return token(yytext(), "DIFERENTE", yyline, yycolumn);
            }
            // fall through
          case 86: break;
          case 25:
            { return token(yytext(), "CADENA", yyline, yycolumn);
            }
            // fall through
          case 87: break;
          case 26:
            { return token(yytext(), "INCREMENTO", yyline, yycolumn);
            }
            // fall through
          case 88: break;
          case 27:
            { return token(yytext(), "DECREMENTO", yyline, yycolumn);
            }
            // fall through
          case 89: break;
          case 28:
            { return token(yytext(), "MENORIGUALQUE", yyline, yycolumn);
            }
            // fall through
          case 90: break;
          case 29:
            { return token(yytext(), "IGUAL", yyline, yycolumn);
            }
            // fall through
          case 91: break;
          case 30:
            { return token(yytext(), "MAYORIGUALQUE", yyline, yycolumn);
            }
            // fall through
          case 92: break;
          case 31:
            { return token(yytext(), "IF", yyline, yycolumn);
            }
            // fall through
          case 93: break;
          case 32:
            { return token(yytext(), "IN", yyline, yycolumn);
            }
            // fall through
          case 94: break;
          case 33:
            { return token(yytext(), "OR", yyline, yycolumn);
            }
            // fall through
          case 95: break;
          case 34:
            { return token(yytext(), "REAL", yyline, yycolumn);
            }
            // fall through
          case 96: break;
          case 35:
            { return token(yytext(), "AND", yyline, yycolumn);
            }
            // fall through
          case 97: break;
          case 36:
            { return token(yytext(), "DEF", yyline, yycolumn);
            }
            // fall through
          case 98: break;
          case 37:
            { return token(yytext(), "END", yyline, yycolumn);
            }
            // fall through
          case 99: break;
          case 38:
            { return token(yytext(), "FOR", yyline, yycolumn);
            }
            // fall through
          case 100: break;
          case 39:
            { return token(yytext(), "INT", yyline, yycolumn);
            }
            // fall through
          case 101: break;
          case 40:
            { return token(yytext(), "NOT", yyline, yycolumn);
            }
            // fall through
          case 102: break;
          case 41:
            { return token(yytext(), "TRY", yyline, yycolumn);
            }
            // fall through
          case 103: break;
          case 42:
            { return token(yytext(), "ELSE", yyline, yycolumn);
            }
            // fall through
          case 104: break;
          case 43:
            { return token(yytext(), "NEXT", yyline, yycolumn);
            }
            // fall through
          case 105: break;
          case 44:
            { return token(yytext(), "SELF", yyline, yycolumn);
            }
            // fall through
          case 106: break;
          case 45:
            { return token(yytext(), "SQRT", yyline, yycolumn);
            }
            // fall through
          case 107: break;
          case 46:
            { return token(yytext(), "TRUE", yyline, yycolumn);
            }
            // fall through
          case 108: break;
          case 47:
            { return token(yytext(), "BEGIN", yyline, yycolumn);
            }
            // fall through
          case 109: break;
          case 48:
            { return token(yytext(), "BREAK", yyline, yycolumn);
            }
            // fall through
          case 110: break;
          case 49:
            { return token(yytext(), "CLASS", yyline, yycolumn);
            }
            // fall through
          case 111: break;
          case 50:
            { return token(yytext(), "FALSE", yyline, yycolumn);
            }
            // fall through
          case 112: break;
          case 51:
            { return token(yytext(), "FLOAT", yyline, yycolumn);
            }
            // fall through
          case 113: break;
          case 52:
            { return token(yytext(), "INPUT", yyline, yycolumn);
            }
            // fall through
          case 114: break;
          case 53:
            { return token(yytext(), "POWER", yyline, yycolumn);
            }
            // fall through
          case 115: break;
          case 54:
            { return token(yytext(), "PRINT", yyline, yycolumn);
            }
            // fall through
          case 116: break;
          case 55:
            { return token(yytext(), "RANGE", yyline, yycolumn);
            }
            // fall through
          case 117: break;
          case 56:
            { return token(yytext(), "WHILE", yyline, yycolumn);
            }
            // fall through
          case 118: break;
          case 57:
            { return token(yytext(), "EXCEPT", yyline, yycolumn);
            }
            // fall through
          case 119: break;
          case 58:
            { return token(yytext(), "IMPORT", yyline, yycolumn);
            }
            // fall through
          case 120: break;
          case 59:
            { return token(yytext(), "OUTPUT", yyline, yycolumn);
            }
            // fall through
          case 121: break;
          case 60:
            { return token(yytext(), "RETURN", yyline, yycolumn);
            }
            // fall through
          case 122: break;
          case 61:
            { return token(yytext(), "STRING", yyline, yycolumn);
            }
            // fall through
          case 123: break;
          case 62:
            { return token(yytext(), "BOOLEAN", yyline, yycolumn);
            }
            // fall through
          case 124: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
