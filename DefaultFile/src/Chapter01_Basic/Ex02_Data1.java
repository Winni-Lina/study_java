package Chapter01_Basic;  

public class Ex02_Data1 {  
    public static void main(String[] args) {  
        /* 🔹 데이터의 형태  
         * 1️. 숫자 (정수) → 예: -3, -2, -1, 0, 1, 2, 3 ... (소수점 없음)  
         * 2️. 숫자 (실수) → 예: 3.141592, -0.4, 10.0 ... (소수점 있음)  
         * 3️. 문자 → 예: "안녕하세요", 'a', 'b', 'c' ...  
         * 4️. 논리 → 예: true, false (참/거짓)  
         */  

        // ✅ 1) 숫자 (정수)  
        System.out.println("정수 :");  
        System.out.println(1034);  
        System.out.println(10 + 2);  
        System.out.println(7 - 2);  
        System.out.println();  

        // ✅ 2) 숫자 (실수)  
        System.out.println("실수 :");  
        System.out.println(0.421);  
        System.out.println(-4.125);  
        System.out.println(1.1);  
        System.out.println();  

        // ✅ 3) 문자  
        System.out.println("문자 :");  
        System.out.println("Hello, World!");  
        System.out.println("이 파일은 Ex02_Data1.java 파일입니다!");  

        // 작은따옴표('')는 한 글자만 가능  
        System.out.println('5');  
        System.out.println('원');  
        System.out.println();  

        // ✅ 4) 논리  
        System.out.println("논리 :");  
        System.out.println(true);  
        System.out.println(false);  
    }  
}