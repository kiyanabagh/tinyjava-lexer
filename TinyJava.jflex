
/* TinyJava lexical analyzer specification for JFlex
 * CSCE 4650/5650 - Assignment 1 (Spring 2026)
 *
 * Generates TinyJavaLexer.java
 */

import java_cup.runtime.ComplexSymbolFactory;

%%

%public
%class TinyJavaLexer
%unicode
%line
%column

%function next_token
%type java_cup.runtime.Symbol

%{

  private java_cup.runtime.Symbol tok(String category, String lexeme) {
    // Match the sample output format: "Symbol: (category, lexeme)"
    String name = "(" + category + ", " + lexeme + ")";
    // sym code is not used by this assignment's driver except for EOF.
    return new ComplexSymbolFactory.ComplexSymbol(name, 0, lexeme);
  }

  private java_cup.runtime.Symbol eofTok() {
    // Driver stops on sym == Symbol.EOF; the EOF token itself is not printed.
    return new java_cup.runtime.Symbol(Symbol.EOF);
  }

%}

WHITESPACE = [ \t\f\r\n]+
LETTER     = [A-Za-z]
DIGIT      = [0-9]
ALNUM      = {LETTER}|{DIGIT}
ID         = {LETTER}{ALNUM}*(_{ALNUM}+)*

%%

/* ----------- Skip rules ----------- */
"//".*                 { /* skip single-line comment */ }
{WHITESPACE}           { /* skip whitespace */ }

/* ----------- Keywords ----------- */
"import"               { return tok("keyword", yytext()); }
"java"                 { return tok("keyword", yytext()); }
"util"                 { return tok("keyword", yytext()); }
"class"                { return tok("keyword", yytext()); }
"public"               { return tok("keyword", yytext()); }
"static"               { return tok("keyword", yytext()); }
"void"                 { return tok("keyword", yytext()); }
"main"                 { return tok("keyword", yytext()); }
"String"               { return tok("keyword", yytext()); }
"args"                 { return tok("keyword", yytext()); }
"int"                  { return tok("keyword", yytext()); }
"boolean"              { return tok("keyword", yytext()); }
"if"                   { return tok("keyword", yytext()); }
"else"                 { return tok("keyword", yytext()); }
"while"                { return tok("keyword", yytext()); }
"return"               { return tok("keyword", yytext()); }
"new"                  { return tok("keyword", yytext()); }
"this"                 { return tok("keyword", yytext()); }
"System"               { return tok("keyword", yytext()); }
"out"                  { return tok("keyword", yytext()); }
"println"              { return tok("keyword", yytext()); }
"Scanner"              { return tok("keyword", yytext()); }
"in"                   { return tok("keyword", yytext()); }
"nextInt"              { return tok("keyword", yytext()); }
"true"                 { return tok("keyword", yytext()); }
"false"                { return tok("keyword", yytext()); }

/* ----------- Multi-char operators (must come before single-char) ----------- */
"&&"                   { return tok("operator", yytext()); }
"||"                   { return tok("operator", yytext()); }
"<="                   { return tok("operator", yytext()); }
">="                   { return tok("operator", yytext()); }
"=="                   { return tok("operator", yytext()); }
"!="                   { return tok("operator", yytext()); }

/* ----------- Single-char operators ----------- */
"+"                    { return tok("operator", yytext()); }
"-"                    { return tok("operator", yytext()); }
"*"                    { return tok("operator", yytext()); }
"/"                    { return tok("operator", yytext()); }
"<"                    { return tok("operator", yytext()); }
">"                    { return tok("operator", yytext()); }
"="                    { return tok("operator", yytext()); }
"!"                    { return tok("operator", yytext()); }
"("                    { return tok("operator", yytext()); }
")"                    { return tok("operator", yytext()); }
"["                    { return tok("operator", yytext()); }
"]"                    { return tok("operator", yytext()); }

/* ----------- Punctuation ----------- */
"{"                    { return tok("punctuation", yytext()); }
"}"                    { return tok("punctuation", yytext()); }
";"                    { return tok("punctuation", yytext()); }
","                    { return tok("punctuation", yytext()); }
"."                    { return tok("punctuation", yytext()); }

/* ----------- Literals ----------- */
{DIGIT}+               { return tok("integer", yytext()); }

/* ----------- Identifiers ----------- */
{ID}                   { return tok("id", yytext()); }

/* ----------- End-of-file ----------- */
<<EOF>>                { return eofTok(); }

/* ----------- Anything else ----------- */
.                      { return tok("unknown", yytext()); }
