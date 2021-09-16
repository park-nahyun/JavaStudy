/*=====================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - 문자열 관련 클래스
  - 캐릭터 셋(CharacterSet)
=====================================*/
/*
○ 캐릭터 셋(Character Set)
	
	- 유니코드(unicode)
	  국제 표준으로 제정된 2바이트계의 만국 공통의 국제 문자부호
	  체계(UCS : Universal Code System)를 말한다.
	  애플컴퓨터, IBM, 마이크로소프트 등이 컨소시엄으로 설립한
	  유니코드(Unicode)가 1990년에 첫 버전을 발표하였고,
	  ISO/IEX JTC1 에서 1995년 9월 국제 표준으로 제정하였다.
	  공식 명칭은 ISO/IEC 10646-1(Universal Multiple-Octet Coded
	  Chracter Set)이다.

	  데이터의 교환을 원활하게 하기 위하여 문자 1개에 부여되는 값을
	  16비트로 통일하였다. 코드 1문자 당 영어는 7비트, 비영어는 8비트,
	  한글이나 일본어는 16비트의 값을 가지게 되는데 이들을 모두
	  16비트로 통일한 것이다.

	- UTF-8 과 UTF-16
	  UTF-8 과 UTF-16의 차이를 한 마디로 말하면
	  문자를 표현할 때의 단위가 다르다는 것이다.
	  UTF-8은 8비트의 가변장 멀티바이트에서 문자를 표현하고
	  UTF-16은 16비트의 가변장 멀티바이트에서 문자를 표현한다.

	  ·UTF-8(8bit UCS Transformation Format)
	    웹에서 기본적으로 사용하는 코드.
		UCS-2로 정의되는 문자 집합을 이용하여 기술된 문자열을
		바이트 열로 변환하는 방식의 1개 1문자를 1~6바이트 가변장
		멀티바이트로 변환한다.

	  ·UTF-16(16bit UCS Transformation Format)
		자바의 기본 코드. 자바에서는 문자 하나를 저장하면 바이트 수는
		영문자이든, 한글문자이든 2바이트를 차지하게 된다.
		UCS-2로 정의되는 문자 집합을 이용해서 기술된 문자열에
		UCS-4의 일부의 문자를 채워넣기 위한 인코딩 방식.
		UTF-8과 병용할 수 있다.
		UCS-2로 이용할 수 있는 문자수를 대폭 늘릴 수 있다.

	※ 자바단에서는 UTF-16을 사용하고 웹에서는 UTF-8을 사용하기 때문에
	   경우에 따라 변환해야 하는 상황이 발생할 수 있다.


○ 문자 코드의 종류

   - KSC5601
     한글 완성형 표준(한글 2,350자 표현).
	 한국공업표준 정보처리분야(C)의 5601번 표준안.

   - KSC5636
     영문자에 대한 표준.
	 한국공업표준 정보처리분야(C)의 5636번 표준안.
	 기존 ASCII Code에서 역슬래시(\)를 원(\) 표시로 대체.

   - EUC-KR(Ms949)
     Bell-Laboratories에서 유닉스 상에서 영문자 이외의 문자를
	 지원하기 위해 제안한 확장 유닉스 코드(Extend UNIX code) 중
	 한글 인코딩 방식.
	 영문은 KSC5636으로 처리하고, 한글은 KSC5601로 처리.
	 (EUC-KR(MS949) = LSC5601 + KSC5636)

   - UTF-8
     영문과 숫자는 1바이트, 한글은 3바이트로 표현.
	 (웹에서 많이 사용, UTF-8 형식으로 JSP를 작성할 때에는
	  파일도 UTF-8 형식으로 저장해야 한다.)

   - UTF-16
     자바 기본 문자코드.
	 영문과 숫자는 1바이트, 한글은 2바이트로 표현.

   - ISO-8859-1
     서유럽 언어 표기에 필요한 US-ASCII에 없는 94개의 글자의 순차적 나열.
*/

import java.io.UnsupportedEncodingException;

public class Test136
{												// 시스템에서 지원하지 않는 인코딩 방식을 요구받았을 때
	public static void main(String[] args) // throws UnsupportedEncodingException
	{
		byte[] buf;
		String name = new String("김철수");

		System.out.println("디폴트 캐릭터셋 : " + System.getProperty("file.encoding"));
		//--==>> 디폴트 캐릭터셋 : MS949
		
		// 『String.getBytes()』
		//  : 디폴트 캐릭터셋을 기반으로 바이트 배열을 반환하는 메소드
		buf = name.getBytes();

		System.out.println("buf 배열의 length : " + buf.length);
		//--==>> buf 배열의 length : 6

		System.out.println();

		
		try
		{
			// UTF-8 캐릭터 셋을 기반으로 바이트 배열을 반환
			buf = name.getBytes("UTF-8");
			// 자바가 불편해함^^;; 자바가 이 인코딩 방식이 없을 수도 있으므로..
			// 그럼 자바한테 이해할 수 없을 때 밖으로 던지라고 할 수 있지~!
			// 그게 Exception 쓰는 것.

			// try~ catch는 일종의 폭탄 처리반.
			// 뭔가를 실행하고 어떤 상황이 생기면 이걸 잡아내도록 하는 것~!

			System.out.println("buf 배열의 length : " + buf.length);
			//--==>> buf 배열의 length : 9
			
			System.out.println();


			// UTF-8 형태로 저장된 바이트 배열을
			// String 객체로 파라미터값 UTF-8을 부여하여 생성
			// System.out.println("value1 : " + new String(바이트배열, 인코딩방식));
												// 바이트배열을 이 인코딩방식으로 합쳐서 문자열 만드는 생성자..
			System.out.println("value1 : " + new String(buf, "UTF-8"));
			//--==>> value1 : 김철수

			System.out.println();


			// 디폴트 캐릭터셋으로 저장된 바이트 배열을
			// String 객체로 생성
			//System.out.println("value2 : " + new String(바이트배열)); // 두번째 인자 없으면 디폴트 코드로..
			System.out.println("value2 : " + new String(buf));
			//--==>> value2 : 源?泥좎닔

			System.out.println();

			//------------------------------- 주의

			// check~!!!
			//-- 인코딩 방식 변환한 것이 아님~!!!
			String convert = new String(name.getBytes("EUC-KR"), "UTF-8");
			System.out.println("value3 : " + convert);
			//--==>> value3 : ?????

			buf = convert.getBytes();	// EUC-KR
			System.out.println("buf 배열의 length : " + buf.length);
			//--==>> buf 배열의 length : 5

			buf = convert.getBytes("UTF-8");
			System.out.println("buf 배열의 length : " + buf.length);
			//--==>> buf 배열의 length : 14

			/*
			※ EUC-KR을 UTF-8로 변환한다고 위와 같이 코딩을 해버리면
			   이러한 변환으로 인해 바이트 배열이 깨져서
			   EUC-KR 이든... UTF-8이든...
			   어떠한 바이트 배열로 읽어오든 깨져있는 것을 확인할 수 있다.

			   이미 깨진 상태로 생성된 String 객체의 바이트 배열은
			   어떤 방식으로든 복구가 불가능하다. 
			*/

			
		
		}
		catch (UnsupportedEncodingException e) // 얘를 잡아서 e라는 스티커를 붙이겠다.
		{
			System.out.println(e.toString());  // 이걸 이렇게 처리하겠다.
		// UnsupportedEncodingException가 toString을 오버라이딩하면
		// 오류내용을 출력하게 돼있음.
		}
	}
}