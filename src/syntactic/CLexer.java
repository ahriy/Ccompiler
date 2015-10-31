// Generated from C.g4 by ANTLR 4.2

    package syntactic;
    import absyn.*;
    import symbol.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__49=1, T__48=2, T__47=3, T__46=4, T__45=5, T__44=6, T__43=7, T__42=8, 
		T__41=9, T__40=10, T__39=11, T__38=12, T__37=13, T__36=14, T__35=15, T__34=16, 
		T__33=17, T__32=18, T__31=19, T__30=20, T__29=21, T__28=22, T__27=23, 
		T__26=24, T__25=25, T__24=26, T__23=27, T__22=28, T__21=29, T__20=30, 
		T__19=31, T__18=32, T__17=33, T__16=34, T__15=35, T__14=36, T__13=37, 
		T__12=38, T__11=39, T__10=40, T__9=41, T__8=42, T__7=43, T__6=44, T__5=45, 
		T__4=46, T__3=47, T__2=48, T__1=49, T__0=50, WS=51, IntegerConstant=52, 
		CharacterConstant=53, UniversalCharacterName=54, COMMA=55, COLON=56, SEMI_COLON=57, 
		OPEN_PAREN=58, CLOSE_PAREN=59, OPEN_BRACK=60, CLOSE_BRACK=61, OPEN_BRACE=62, 
		CLOSE_BRACE=63, LineTerm=64, PreProcessor=65, COMMENT=66, StringConstant=67, 
		Identifier=68;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'return '", "'+='", "'%='", "'char'", "'!='", "'while'", "'void'", "'>>'", 
		"'&&'", "'^='", "'='", "'^'", "'<<='", "'for'", "'|='", "'int'", "'union'", 
		"'-='", "'/='", "'>='", "'++'", "'<'", "'~'", "'sizeof'", "'+'", "'struct'", 
		"'/'", "'*='", "'continue'", "'&='", "'return'", "'||'", "'>>='", "'<<'", 
		"'if'", "'<='", "'break'", "'&'", "'*'", "'.'", "'->'", "'...'", "'--'", 
		"'=='", "'|'", "'>'", "'!'", "'%'", "'else'", "'-'", "WS", "IntegerConstant", 
		"CharacterConstant", "UniversalCharacterName", "','", "':'", "';'", "'('", 
		"')'", "'['", "']'", "'{'", "'}'", "LineTerm", "PreProcessor", "COMMENT", 
		"StringConstant", "Identifier"
	};
	public static final String[] ruleNames = {
		"T__49", "T__48", "T__47", "T__46", "T__45", "T__44", "T__43", "T__42", 
		"T__41", "T__40", "T__39", "T__38", "T__37", "T__36", "T__35", "T__34", 
		"T__33", "T__32", "T__31", "T__30", "T__29", "T__28", "T__27", "T__26", 
		"T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", 
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "WS", "IntegerConstant", "DecimalConstant", "OctalConstant", "HexadecimalConstant", 
		"HexadecimalPrefix", "NonzeroDigit", "OctalDigit", "HexadecimalDigit", 
		"IntegerSuffix", "UnsignedSuffix", "LongSuffix", "LongLongSuffix", "CharacterConstant", 
		"CChar", "EscapeSequence", "SimpleEscapeSequence", "OctalEscapeSequence", 
		"HexadecimalEscapeSequence", "UniversalCharacterName", "HexQuad", "COMMA", 
		"COLON", "SEMI_COLON", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACK", "CLOSE_BRACK", 
		"OPEN_BRACE", "CLOSE_BRACE", "LineTerm", "PreProcessor", "COMMENT", "TraditionalComment", 
		"SingleLineComment", "DocumentationComment", "InputCharacter", "CommentContent", 
		"StringConstant", "ScharSequence", "SChar", "Identifier", "Letter", "Digit"
	};


	    static symbol.Symbol symbol(String s) {
	        return symbol.Symbol.getSymbol(s);
	    }
	    private String format = new String("\r\n\t");


	public CLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "C.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2F\u0286\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!"+
		"\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/"+
		"\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\64\6\64\u0174"+
		"\n\64\r\64\16\64\u0175\3\64\3\64\3\65\3\65\5\65\u017c\n\65\3\65\3\65\5"+
		"\65\u0180\n\65\3\65\3\65\5\65\u0184\n\65\5\65\u0186\n\65\3\66\3\66\7\66"+
		"\u018a\n\66\f\66\16\66\u018d\13\66\3\66\5\66\u0190\n\66\3\67\3\67\7\67"+
		"\u0194\n\67\f\67\16\67\u0197\13\67\38\38\68\u019b\n8\r8\168\u019c\39\3"+
		"9\39\3:\3:\3;\3;\3<\3<\3=\3=\5=\u01aa\n=\3=\3=\3=\3=\3=\5=\u01b1\n=\3"+
		"=\3=\5=\u01b5\n=\5=\u01b7\n=\3>\3>\3?\3?\3@\3@\3@\3@\5@\u01c1\n@\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u01d9"+
		"\nA\3B\3B\5B\u01dd\nB\3C\3C\3C\3C\5C\u01e3\nC\3D\3D\3D\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\5E\u01f1\nE\3F\3F\3F\3F\6F\u01f7\nF\rF\16F\u01f8\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\5G\u0205\nG\3H\3H\3H\3H\3H\3I\3I\3J\3J\3K\3K\3"+
		"L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3R\3R\3R\5R\u0223\nR\3S\3S\7"+
		"S\u0227\nS\fS\16S\u022a\13S\3S\3S\3S\3S\3T\3T\3T\5T\u0233\nT\3T\3T\3U"+
		"\3U\3U\3U\7U\u023b\nU\fU\16U\u023e\13U\3U\3U\3U\3V\3V\3V\3V\7V\u0247\n"+
		"V\fV\16V\u024a\13V\3V\3V\3W\3W\3W\3W\3W\3W\6W\u0254\nW\rW\16W\u0255\3"+
		"W\3W\3X\3X\3Y\3Y\6Y\u025e\nY\rY\16Y\u025f\3Y\7Y\u0263\nY\fY\16Y\u0266"+
		"\13Y\3Z\3Z\5Z\u026a\nZ\3Z\3Z\3[\6[\u026f\n[\r[\16[\u0270\3\\\3\\\5\\\u0275"+
		"\n\\\3]\3]\5]\u0279\n]\3]\3]\3]\7]\u027e\n]\f]\16]\u0281\13]\3^\3^\3_"+
		"\3_\3\u023c\2`\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\67\u0083\2\u0085\2\u0087"+
		"\2\u0089\2\u008b\2\u008d8\u008f\2\u00919\u0093:\u0095;\u0097<\u0099=\u009b"+
		">\u009d?\u009f@\u00a1A\u00a3B\u00a5C\u00a7D\u00a9\2\u00ab\2\u00ad\2\u00af"+
		"\2\u00b1\2\u00b3E\u00b5\2\u00b7\2\u00b9F\u00bb\2\u00bd\2\3\2\22\5\2\13"+
		"\f\17\17\"\"\4\2ZZzz\3\2\63;\3\2\629\5\2\62;CHch\4\2WWww\4\2NNnn\4\2)"+
		")^^\f\2$$))AA^^cdhhppttvvxx\4\2\f\f\17\17\3\2,,\4\2,,\61\61\6\2\f\f\17"+
		"\17$$^^\4\2&&aa\4\2C\\c|\3\2\62;\u0299\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2\u0081\3\2\2\2\2\u008d\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5"+
		"\3\2\2\2\2\u00a7\3\2\2\2\2\u00b3\3\2\2\2\2\u00b9\3\2\2\2\3\u00bf\3\2\2"+
		"\2\5\u00c7\3\2\2\2\7\u00ca\3\2\2\2\t\u00cd\3\2\2\2\13\u00d2\3\2\2\2\r"+
		"\u00d5\3\2\2\2\17\u00db\3\2\2\2\21\u00e0\3\2\2\2\23\u00e3\3\2\2\2\25\u00e6"+
		"\3\2\2\2\27\u00e9\3\2\2\2\31\u00eb\3\2\2\2\33\u00ed\3\2\2\2\35\u00f1\3"+
		"\2\2\2\37\u00f5\3\2\2\2!\u00f8\3\2\2\2#\u00fc\3\2\2\2%\u0102\3\2\2\2\'"+
		"\u0105\3\2\2\2)\u0108\3\2\2\2+\u010b\3\2\2\2-\u010e\3\2\2\2/\u0110\3\2"+
		"\2\2\61\u0112\3\2\2\2\63\u0119\3\2\2\2\65\u011b\3\2\2\2\67\u0122\3\2\2"+
		"\29\u0124\3\2\2\2;\u0127\3\2\2\2=\u0130\3\2\2\2?\u0133\3\2\2\2A\u013a"+
		"\3\2\2\2C\u013d\3\2\2\2E\u0141\3\2\2\2G\u0144\3\2\2\2I\u0147\3\2\2\2K"+
		"\u014a\3\2\2\2M\u0150\3\2\2\2O\u0152\3\2\2\2Q\u0154\3\2\2\2S\u0156\3\2"+
		"\2\2U\u0159\3\2\2\2W\u015d\3\2\2\2Y\u0160\3\2\2\2[\u0163\3\2\2\2]\u0165"+
		"\3\2\2\2_\u0167\3\2\2\2a\u0169\3\2\2\2c\u016b\3\2\2\2e\u0170\3\2\2\2g"+
		"\u0173\3\2\2\2i\u0185\3\2\2\2k\u018f\3\2\2\2m\u0191\3\2\2\2o\u0198\3\2"+
		"\2\2q\u019e\3\2\2\2s\u01a1\3\2\2\2u\u01a3\3\2\2\2w\u01a5\3\2\2\2y\u01b6"+
		"\3\2\2\2{\u01b8\3\2\2\2}\u01ba\3\2\2\2\177\u01c0\3\2\2\2\u0081\u01d8\3"+
		"\2\2\2\u0083\u01dc\3\2\2\2\u0085\u01e2\3\2\2\2\u0087\u01e4\3\2\2\2\u0089"+
		"\u01f0\3\2\2\2\u008b\u01f2\3\2\2\2\u008d\u0204\3\2\2\2\u008f\u0206\3\2"+
		"\2\2\u0091\u020b\3\2\2\2\u0093\u020d\3\2\2\2\u0095\u020f\3\2\2\2\u0097"+
		"\u0211\3\2\2\2\u0099\u0213\3\2\2\2\u009b\u0215\3\2\2\2\u009d\u0217\3\2"+
		"\2\2\u009f\u0219\3\2\2\2\u00a1\u021b\3\2\2\2\u00a3\u0222\3\2\2\2\u00a5"+
		"\u0224\3\2\2\2\u00a7\u0232\3\2\2\2\u00a9\u0236\3\2\2\2\u00ab\u0242\3\2"+
		"\2\2\u00ad\u024d\3\2\2\2\u00af\u0259\3\2\2\2\u00b1\u0264\3\2\2\2\u00b3"+
		"\u0267\3\2\2\2\u00b5\u026e\3\2\2\2\u00b7\u0274\3\2\2\2\u00b9\u0278\3\2"+
		"\2\2\u00bb\u0282\3\2\2\2\u00bd\u0284\3\2\2\2\u00bf\u00c0\7t\2\2\u00c0"+
		"\u00c1\7g\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4\7t\2\2"+
		"\u00c4\u00c5\7p\2\2\u00c5\u00c6\7\"\2\2\u00c6\4\3\2\2\2\u00c7\u00c8\7"+
		"-\2\2\u00c8\u00c9\7?\2\2\u00c9\6\3\2\2\2\u00ca\u00cb\7\'\2\2\u00cb\u00cc"+
		"\7?\2\2\u00cc\b\3\2\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf\7j\2\2\u00cf\u00d0"+
		"\7c\2\2\u00d0\u00d1\7t\2\2\u00d1\n\3\2\2\2\u00d2\u00d3\7#\2\2\u00d3\u00d4"+
		"\7?\2\2\u00d4\f\3\2\2\2\u00d5\u00d6\7y\2\2\u00d6\u00d7\7j\2\2\u00d7\u00d8"+
		"\7k\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7g\2\2\u00da\16\3\2\2\2\u00db\u00dc"+
		"\7x\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7f\2\2\u00df"+
		"\20\3\2\2\2\u00e0\u00e1\7@\2\2\u00e1\u00e2\7@\2\2\u00e2\22\3\2\2\2\u00e3"+
		"\u00e4\7(\2\2\u00e4\u00e5\7(\2\2\u00e5\24\3\2\2\2\u00e6\u00e7\7`\2\2\u00e7"+
		"\u00e8\7?\2\2\u00e8\26\3\2\2\2\u00e9\u00ea\7?\2\2\u00ea\30\3\2\2\2\u00eb"+
		"\u00ec\7`\2\2\u00ec\32\3\2\2\2\u00ed\u00ee\7>\2\2\u00ee\u00ef\7>\2\2\u00ef"+
		"\u00f0\7?\2\2\u00f0\34\3\2\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3\7q\2\2\u00f3"+
		"\u00f4\7t\2\2\u00f4\36\3\2\2\2\u00f5\u00f6\7~\2\2\u00f6\u00f7\7?\2\2\u00f7"+
		" \3\2\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7v\2\2\u00fb"+
		"\"\3\2\2\2\u00fc\u00fd\7w\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7k\2\2\u00ff"+
		"\u0100\7q\2\2\u0100\u0101\7p\2\2\u0101$\3\2\2\2\u0102\u0103\7/\2\2\u0103"+
		"\u0104\7?\2\2\u0104&\3\2\2\2\u0105\u0106\7\61\2\2\u0106\u0107\7?\2\2\u0107"+
		"(\3\2\2\2\u0108\u0109\7@\2\2\u0109\u010a\7?\2\2\u010a*\3\2\2\2\u010b\u010c"+
		"\7-\2\2\u010c\u010d\7-\2\2\u010d,\3\2\2\2\u010e\u010f\7>\2\2\u010f.\3"+
		"\2\2\2\u0110\u0111\7\u0080\2\2\u0111\60\3\2\2\2\u0112\u0113\7u\2\2\u0113"+
		"\u0114\7k\2\2\u0114\u0115\7|\2\2\u0115\u0116\7g\2\2\u0116\u0117\7q\2\2"+
		"\u0117\u0118\7h\2\2\u0118\62\3\2\2\2\u0119\u011a\7-\2\2\u011a\64\3\2\2"+
		"\2\u011b\u011c\7u\2\2\u011c\u011d\7v\2\2\u011d\u011e\7t\2\2\u011e\u011f"+
		"\7w\2\2\u011f\u0120\7e\2\2\u0120\u0121\7v\2\2\u0121\66\3\2\2\2\u0122\u0123"+
		"\7\61\2\2\u01238\3\2\2\2\u0124\u0125\7,\2\2\u0125\u0126\7?\2\2\u0126:"+
		"\3\2\2\2\u0127\u0128\7e\2\2\u0128\u0129\7q\2\2\u0129\u012a\7p\2\2\u012a"+
		"\u012b\7v\2\2\u012b\u012c\7k\2\2\u012c\u012d\7p\2\2\u012d\u012e\7w\2\2"+
		"\u012e\u012f\7g\2\2\u012f<\3\2\2\2\u0130\u0131\7(\2\2\u0131\u0132\7?\2"+
		"\2\u0132>\3\2\2\2\u0133\u0134\7t\2\2\u0134\u0135\7g\2\2\u0135\u0136\7"+
		"v\2\2\u0136\u0137\7w\2\2\u0137\u0138\7t\2\2\u0138\u0139\7p\2\2\u0139@"+
		"\3\2\2\2\u013a\u013b\7~\2\2\u013b\u013c\7~\2\2\u013cB\3\2\2\2\u013d\u013e"+
		"\7@\2\2\u013e\u013f\7@\2\2\u013f\u0140\7?\2\2\u0140D\3\2\2\2\u0141\u0142"+
		"\7>\2\2\u0142\u0143\7>\2\2\u0143F\3\2\2\2\u0144\u0145\7k\2\2\u0145\u0146"+
		"\7h\2\2\u0146H\3\2\2\2\u0147\u0148\7>\2\2\u0148\u0149\7?\2\2\u0149J\3"+
		"\2\2\2\u014a\u014b\7d\2\2\u014b\u014c\7t\2\2\u014c\u014d\7g\2\2\u014d"+
		"\u014e\7c\2\2\u014e\u014f\7m\2\2\u014fL\3\2\2\2\u0150\u0151\7(\2\2\u0151"+
		"N\3\2\2\2\u0152\u0153\7,\2\2\u0153P\3\2\2\2\u0154\u0155\7\60\2\2\u0155"+
		"R\3\2\2\2\u0156\u0157\7/\2\2\u0157\u0158\7@\2\2\u0158T\3\2\2\2\u0159\u015a"+
		"\7\60\2\2\u015a\u015b\7\60\2\2\u015b\u015c\7\60\2\2\u015cV\3\2\2\2\u015d"+
		"\u015e\7/\2\2\u015e\u015f\7/\2\2\u015fX\3\2\2\2\u0160\u0161\7?\2\2\u0161"+
		"\u0162\7?\2\2\u0162Z\3\2\2\2\u0163\u0164\7~\2\2\u0164\\\3\2\2\2\u0165"+
		"\u0166\7@\2\2\u0166^\3\2\2\2\u0167\u0168\7#\2\2\u0168`\3\2\2\2\u0169\u016a"+
		"\7\'\2\2\u016ab\3\2\2\2\u016b\u016c\7g\2\2\u016c\u016d\7n\2\2\u016d\u016e"+
		"\7u\2\2\u016e\u016f\7g\2\2\u016fd\3\2\2\2\u0170\u0171\7/\2\2\u0171f\3"+
		"\2\2\2\u0172\u0174\t\2\2\2\u0173\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\b\64"+
		"\2\2\u0178h\3\2\2\2\u0179\u017b\5k\66\2\u017a\u017c\5y=\2\u017b\u017a"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u0186\3\2\2\2\u017d\u017f\5m\67\2\u017e"+
		"\u0180\5y=\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0186\3\2\2"+
		"\2\u0181\u0183\5o8\2\u0182\u0184\5y=\2\u0183\u0182\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0179\3\2\2\2\u0185\u017d\3\2\2\2\u0185"+
		"\u0181\3\2\2\2\u0186j\3\2\2\2\u0187\u018b\5s:\2\u0188\u018a\5\u00bd_\2"+
		"\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\u0190\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0190\7\62\2\2"+
		"\u018f\u0187\3\2\2\2\u018f\u018e\3\2\2\2\u0190l\3\2\2\2\u0191\u0195\7"+
		"\62\2\2\u0192\u0194\5u;\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196n\3\2\2\2\u0197\u0195\3\2\2\2"+
		"\u0198\u019a\5q9\2\u0199\u019b\5w<\2\u019a\u0199\3\2\2\2\u019b\u019c\3"+
		"\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019dp\3\2\2\2\u019e\u019f"+
		"\7\62\2\2\u019f\u01a0\t\3\2\2\u01a0r\3\2\2\2\u01a1\u01a2\t\4\2\2\u01a2"+
		"t\3\2\2\2\u01a3\u01a4\t\5\2\2\u01a4v\3\2\2\2\u01a5\u01a6\t\6\2\2\u01a6"+
		"x\3\2\2\2\u01a7\u01a9\5{>\2\u01a8\u01aa\5}?\2\u01a9\u01a8\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01b7\3\2\2\2\u01ab\u01ac\5{>\2\u01ac\u01ad\5\177"+
		"@\2\u01ad\u01b7\3\2\2\2\u01ae\u01b0\5}?\2\u01af\u01b1\5{>\2\u01b0\u01af"+
		"\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b7\3\2\2\2\u01b2\u01b4\5\177@\2"+
		"\u01b3\u01b5\5{>\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7"+
		"\3\2\2\2\u01b6\u01a7\3\2\2\2\u01b6\u01ab\3\2\2\2\u01b6\u01ae\3\2\2\2\u01b6"+
		"\u01b2\3\2\2\2\u01b7z\3\2\2\2\u01b8\u01b9\t\7\2\2\u01b9|\3\2\2\2\u01ba"+
		"\u01bb\t\b\2\2\u01bb~\3\2\2\2\u01bc\u01bd\7n\2\2\u01bd\u01c1\7n\2\2\u01be"+
		"\u01bf\7N\2\2\u01bf\u01c1\7N\2\2\u01c0\u01bc\3\2\2\2\u01c0\u01be\3\2\2"+
		"\2\u01c1\u0080\3\2\2\2\u01c2\u01c3\7)\2\2\u01c3\u01c4\5\u0083B\2\u01c4"+
		"\u01c5\7)\2\2\u01c5\u01d9\3\2\2\2\u01c6\u01c7\7N\2\2\u01c7\u01c8\7)\2"+
		"\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\5\u0083B\2\u01ca\u01cb\7)\2\2\u01cb"+
		"\u01d9\3\2\2\2\u01cc\u01cd\7w\2\2\u01cd\u01ce\7)\2\2\u01ce\u01cf\3\2\2"+
		"\2\u01cf\u01d0\5\u0083B\2\u01d0\u01d1\7)\2\2\u01d1\u01d9\3\2\2\2\u01d2"+
		"\u01d3\7W\2\2\u01d3\u01d4\7)\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\5\u0083"+
		"B\2\u01d6\u01d7\7)\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01c2\3\2\2\2\u01d8\u01c6"+
		"\3\2\2\2\u01d8\u01cc\3\2\2\2\u01d8\u01d2\3\2\2\2\u01d9\u0082\3\2\2\2\u01da"+
		"\u01dd\5\u0085C\2\u01db\u01dd\n\t\2\2\u01dc\u01da\3\2\2\2\u01dc\u01db"+
		"\3\2\2\2\u01dd\u0084\3\2\2\2\u01de\u01e3\5\u0087D\2\u01df\u01e3\5\u0089"+
		"E\2\u01e0\u01e3\5\u008bF\2\u01e1\u01e3\5\u008dG\2\u01e2\u01de\3\2\2\2"+
		"\u01e2\u01df\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3\u0086"+
		"\3\2\2\2\u01e4\u01e5\7^\2\2\u01e5\u01e6\t\n\2\2\u01e6\u0088\3\2\2\2\u01e7"+
		"\u01e8\7^\2\2\u01e8\u01f1\t\5\2\2\u01e9\u01ea\7^\2\2\u01ea\u01eb\t\5\2"+
		"\2\u01eb\u01f1\t\5\2\2\u01ec\u01ed\7^\2\2\u01ed\u01ee\t\5\2\2\u01ee\u01ef"+
		"\t\5\2\2\u01ef\u01f1\t\5\2\2\u01f0\u01e7\3\2\2\2\u01f0\u01e9\3\2\2\2\u01f0"+
		"\u01ec\3\2\2\2\u01f1\u008a\3\2\2\2\u01f2\u01f3\7^\2\2\u01f3\u01f4\7z\2"+
		"\2\u01f4\u01f6\3\2\2\2\u01f5\u01f7\t\6\2\2\u01f6\u01f5\3\2\2\2\u01f7\u01f8"+
		"\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u008c\3\2\2\2\u01fa"+
		"\u01fb\7^\2\2\u01fb\u01fc\7w\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0205\5\u008f"+
		"H\2\u01fe\u01ff\7^\2\2\u01ff\u0200\7W\2\2\u0200\u0201\3\2\2\2\u0201\u0202"+
		"\5\u008fH\2\u0202\u0203\5\u008fH\2\u0203\u0205\3\2\2\2\u0204\u01fa\3\2"+
		"\2\2\u0204\u01fe\3\2\2\2\u0205\u008e\3\2\2\2\u0206\u0207\t\6\2\2\u0207"+
		"\u0208\t\6\2\2\u0208\u0209\t\6\2\2\u0209\u020a\t\6\2\2\u020a\u0090\3\2"+
		"\2\2\u020b\u020c\7.\2\2\u020c\u0092\3\2\2\2\u020d\u020e\7<\2\2\u020e\u0094"+
		"\3\2\2\2\u020f\u0210\7=\2\2\u0210\u0096\3\2\2\2\u0211\u0212\7*\2\2\u0212"+
		"\u0098\3\2\2\2\u0213\u0214\7+\2\2\u0214\u009a\3\2\2\2\u0215\u0216\7]\2"+
		"\2\u0216\u009c\3\2\2\2\u0217\u0218\7_\2\2\u0218\u009e\3\2\2\2\u0219\u021a"+
		"\7}\2\2\u021a\u00a0\3\2\2\2\u021b\u021c\7\177\2\2\u021c\u00a2\3\2\2\2"+
		"\u021d\u0223\t\13\2\2\u021e\u021f\7\f\2\2\u021f\u0223\7\17\2\2\u0220\u0221"+
		"\7\17\2\2\u0221\u0223\7\f\2\2\u0222\u021d\3\2\2\2\u0222\u021e\3\2\2\2"+
		"\u0222\u0220\3\2\2\2\u0223\u00a4\3\2\2\2\u0224\u0228\7%\2\2\u0225\u0227"+
		"\n\13\2\2\u0226\u0225\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2"+
		"\u0228\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022c"+
		"\5\u00a3R\2\u022c\u022d\3\2\2\2\u022d\u022e\bS\3\2\u022e\u00a6\3\2\2\2"+
		"\u022f\u0233\5\u00a9U\2\u0230\u0233\5\u00abV\2\u0231\u0233\5\u00adW\2"+
		"\u0232\u022f\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0231\3\2\2\2\u0233\u0234"+
		"\3\2\2\2\u0234\u0235\bT\2\2\u0235\u00a8\3\2\2\2\u0236\u0237\7\61\2\2\u0237"+
		"\u0238\7,\2\2\u0238\u023c\3\2\2\2\u0239\u023b\13\2\2\2\u023a\u0239\3\2"+
		"\2\2\u023b\u023e\3\2\2\2\u023c\u023d\3\2\2\2\u023c\u023a\3\2\2\2\u023d"+
		"\u023f\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0240\7,\2\2\u0240\u0241\7\61"+
		"\2\2\u0241\u00aa\3\2\2\2\u0242\u0243\7\61\2\2\u0243\u0244\7\61\2\2\u0244"+
		"\u0248\3\2\2\2\u0245\u0247\5\u00afX\2\u0246\u0245\3\2\2\2\u0247\u024a"+
		"\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024b\u024c\5\u00a3R\2\u024c\u00ac\3\2\2\2\u024d\u024e"+
		"\7\61\2\2\u024e\u024f\7,\2\2\u024f\u0250\7,\2\2\u0250\u0251\3\2\2\2\u0251"+
		"\u0253\5\u00b1Y\2\u0252\u0254\7,\2\2\u0253\u0252\3\2\2\2\u0254\u0255\3"+
		"\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\3\2\2\2\u0257"+
		"\u0258\7\61\2\2\u0258\u00ae\3\2\2\2\u0259\u025a\n\13\2\2\u025a\u00b0\3"+
		"\2\2\2\u025b\u0263\n\f\2\2\u025c\u025e\7,\2\2\u025d\u025c\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\3\2"+
		"\2\2\u0261\u0263\n\r\2\2\u0262\u025b\3\2\2\2\u0262\u025d\3\2\2\2\u0263"+
		"\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u00b2\3\2"+
		"\2\2\u0266\u0264\3\2\2\2\u0267\u0269\7$\2\2\u0268\u026a\5\u00b5[\2\u0269"+
		"\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c\7$"+
		"\2\2\u026c\u00b4\3\2\2\2\u026d\u026f\5\u00b7\\\2\u026e\u026d\3\2\2\2\u026f"+
		"\u0270\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u00b6\3\2"+
		"\2\2\u0272\u0275\n\16\2\2\u0273\u0275\5\u0085C\2\u0274\u0272\3\2\2\2\u0274"+
		"\u0273\3\2\2\2\u0275\u00b8\3\2\2\2\u0276\u0279\5\u00bb^\2\u0277\u0279"+
		"\t\17\2\2\u0278\u0276\3\2\2\2\u0278\u0277\3\2\2\2\u0279\u027f\3\2\2\2"+
		"\u027a\u027e\t\17\2\2\u027b\u027e\5\u00bb^\2\u027c\u027e\5\u00bd_\2\u027d"+
		"\u027a\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027c\3\2\2\2\u027e\u0281\3\2"+
		"\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u00ba\3\2\2\2\u0281"+
		"\u027f\3\2\2\2\u0282\u0283\t\20\2\2\u0283\u00bc\3\2\2\2\u0284\u0285\t"+
		"\21\2\2\u0285\u00be\3\2\2\2&\2\u0175\u017b\u017f\u0183\u0185\u018b\u018f"+
		"\u0195\u019c\u01a9\u01b0\u01b4\u01b6\u01c0\u01d8\u01dc\u01e2\u01f0\u01f8"+
		"\u0204\u0222\u0228\u0232\u023c\u0248\u0255\u025f\u0262\u0264\u0269\u0270"+
		"\u0274\u0278\u027d\u027f\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}