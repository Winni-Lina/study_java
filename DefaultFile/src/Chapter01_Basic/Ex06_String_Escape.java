package Chapter01_Basic;  

public class Ex06_String_Escape {  
    public static void main(String[] args) {  
        // 🔹 이스케이프 문자 (Escape Characters)  
        // 문자열에서 일반적으로 입력할 수 없는 특수 문자를 표현하는 방법  

        // ✅ 주요 이스케이프 문자  
        //  \'  → 작은따옴표 (')  
        //  \"  → 큰따옴표 (")  
        //  \\  → 백슬래시 (\)  
        //  \n  → 줄바꿈 (Next Line)  

        // 작은따옴표, 큰따옴표, 백슬래시 출력  
        System.out.println("\' \" \\");  

        // 줄바꿈 적용  
        System.out.println("안녕하세요!\n반가워요!");  
    }  
}