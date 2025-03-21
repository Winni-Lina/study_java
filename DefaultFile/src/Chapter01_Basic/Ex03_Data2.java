package Chapter01_Basic;  

public class Ex03_Data2 {  
    public static void main(String[] args) {  
        /* 🔹 변수 (Variable) - 데이터를 저장하는 공간  
         *  - 데이터의 형태(자료형)에 따라 저장 가능  
         *  
         * ✅ Java의 주요 자료형  
         *  1️. 정수 → int  
         *  2️. 실수 → double  
         *  3️. 문자 → String  
         *  4️. 논리 → boolean  
         *  
         * 📌 이처럼 데이터를 표현하는 방식을 "자료형"이라고 한다.  
         *  
         * ⚠️ 변수 규칙  
         *  - 동일한 이름의 변수를 중복 선언할 수 없음  
         *  - 변수 이름은 `$`, `_` 외의 특수문자를 포함할 수 없음  
         *  - 숫자로 시작하거나 수식을 포함할 수 없음  
         */  

        // ✅ 변수 선언 & 초기화 (즉시 값 할당)  
        int i1 = 3;  
        double d1 = 3.14;  
        String s1 = "hello";  
        boolean b1 = true;  

        // 변수 사용  
        System.out.println(i1);  
        System.out.println(s1);  

        // ✅ 변수 선언 (값 미할당)  
        int i2;  
        double d2;  
        String s2;  
        boolean b2;  

        // 아직 값이 없으므로 사용할 수 없음  
        // 데이터를 할당해야 함  

        // ✅ 값 할당 후 사용  
        d2 = 3.3333;  
        System.out.println(d2);  

        // ❌ 잘못된 예시 (자료형 불일치)  
        // double i = "에러입니다";  // 문자열을 숫자형 변수에 저장 → 오류  
        // int i = 3.14;  // 소수를 정수형 변수에 저장 → 오류  
        // String s = 3;  // 숫자를 문자열 변수에 저장 → 오류  
    }  
}