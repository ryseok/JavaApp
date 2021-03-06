package com.encore.j0508;

public class MatchesTest {
   public static void main(String[] args) {
	   String str="";
	          str="a";
	          //str="aa";
	          //str="aaaaaaaaaaaaaaa";
	  
	   //boolean str.matches(String regex);
	   //regex ----> regular expression (정규 표현식)
	   //regex를 통해 전달되는 패턴에 str이 부합(match)된다면 true를 리턴.
	   
	   //출현횟수에 관련된 부호: ?, *, +
	   System.out.println(str.matches("[a]")); //a문자: 한번
	   System.out.println(str.matches("[a]?")); //a문자: 0,1
	   System.out.println(str.matches("[a]*")); //a문자: 0~무한대
	   System.out.println(str.matches("[a]+")); //a문자: 1~무한대
	   System.out.println("========================");
	   System.out.println(str.matches("[abc]"));//a 또는 b 또는 c 문자 중 1번 출현
	   
	   String name="gildongA";
	   //name변수에 대한 영문자 체크!!
	   System.out.println("이름체크: "+ 
	         //name.matches("[abcdefghijklmnopqrstuvwxyz]+"));
			   name.matches("[a-zA-Z]+")); //[]안에서 '-'는 범위를 표현
	   
	   String su="345678a";
	   //su변수에 대한 숫자 체크!!
	   System.out.println("숫자체크: "+ su.matches("[0-9]+"));
	   
	   String hangul="나한글";
	   //hangul변수에 대한 한글 체크!!
	   System.out.println("한글체크: "+ hangul.matches("[ㄱ-힣]+"));
	   
	   String id="gildong100456";
	   //id변수는 8~12자리, 영문자와 숫자조합
	   
	   String idPattern="[a-zA-Z0-9]{8,12}";//8~12
	   //{8,12}  8이상~12이하    {8,}: 8이상    {8} : 8번
	   System.out.println("아이디체크: "+ id.matches(idPattern));
	   
	   String juminBunho = "960302-1012345";
	   String juminPattern = "[0-9]{6}-[\\d]{7}";
	   System.out.println("주민번호체크: "+ juminBunho.matches(juminPattern));
	   
	   String test="1";
	   System.out.println(test.matches("^[0-9-[1]]+$"));
	   
   }//main
}







