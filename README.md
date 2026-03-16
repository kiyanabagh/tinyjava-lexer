# TinyJava Lexer

A lexical analyzer for TinyJava, a subset of the Java programming language, built with
JFlex for CSCE 4650/5650 (Compiler Design) at the University of North Texas.

The lexer reads a TinyJava source program, prints the source, then scans and prints each
token in the format `(category, lexeme)`.

---

## Token Categories

| Category | Examples |
|---|---|
| `keyword` | `class`, `public`, `static`, `int`, `boolean`, `if`, `else`, `while`, `return`, `new`, `true`, `false`, `import`, `Scanner`, `System`, ... |
| `id` | Any valid identifier: starts with a letter, contains letters/digits/underscores, no consecutive underscores, cannot end with underscore |
| `integer` | Unsigned integer literals: `0`, `42`, `100` |
| `operator` | `+`, `-`, `*`, `/`, `=`, `==`, `!=`, `<`, `<=`, `>`, `>=`, `&&`, `\|\|`, `!`, `(`, `)`, `[`, `]` |
| `punctuation` | `{`, `}`, `;`, `,`, `.` |
| `unknown` | Any unrecognized character |

Single-line comments (`//`) and whitespace are silently skipped.

Multi-character operators (`<=`, `>=`, `==`, `!=`, `&&`, `||`) are matched before
single-character operators to avoid incorrect tokenization.

---

## File Structure

| File | Role |
|---|---|
| `TinyJava.jflex` | JFlex specification: regex rules defining all token categories |
| `TinyJavaLexer.java` | Generated lexer (produced by running JFlex on the spec file) |
| `TinyJavaLex.java` | Driver: reads source from stdin, invokes the lexer, prints tokens |
| `Symbol.java` | Defines the EOF constant used by the
