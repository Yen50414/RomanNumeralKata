# RomanNumeralKata
A program developed using TDD to convert Arabic numbers to their Roman Numeral equivalents.

##Introduction
Roman Numerals are represented by letters.

- I = 1
- V = 5
- X = 10
- L = 50
- C = 100
- D = 500
- M = 1000

The letters representing "1"s (I, X, C, M) can be repeated up to three times.

e.g. II = 2, III = 3, XXX = 30, but IIII does not represent 4.

They can also be subtracted from letters representing the next two higher values, but only once.

e.g. IV = 4, IX = 9, XC = 90, but not IC or XXC.

The letters representing "5"s (V, L, D) can never be repeated, nor subtracted.

Values represented by the letters are added together to obtain the total value.

e.g. 
- VII = V + I + I = 5 + 1 + 1 = 7
- CXLV = C + XL + V = 100 + (50 - 10) + 5 = 145

These combination of letters and rules allow us to represent numbers between 1 and 3999 inclusive.

##Instructions
Download all files in this repo to your file system.

From the directory where you downloaded this project, run
```
gradlew build
```
on Windows or 
```
./gradlew build
```
to build the project, then
```
java -jar build/libs/RomanNumeralsKata.jar
```
The program will prompt for an Arabic number and print its Roman Numeral representation.  The user can also choose to type in "PRINT" to print a list of all Roman Numerals (between 1 and 3999).  Currently working on adding support for converting Roman Numerals to Arabic values.  Will update when it is finished.

Alternatively you can also use the gradle run command.  Note that when running through gradle, the output will conflict visually with the gradle status bar.  I added -q in the command to run it in quiet mode to avoid this issue.
```
gradlew -q run
```
```
./gradlew -q run
```
