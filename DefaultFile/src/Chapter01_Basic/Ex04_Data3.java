package Chapter01_Basic;  

public class Ex04_Data3 {  
    public static void main(String[] args) {  
        // 🔹 데이터의 형태 변환 (형 변환)  
        int a = 24;  
        double b = 1.14;  

        // ✅ 1) 실수 → 정수 (double → int)  
        int result1;  

        // 강제 형 변환 (Casting)  
        // `double` 데이터를 `int`로 변환 → 소수점 제거  
        result1 = (int) b;  

        System.out.println(result1);   // 1  
        System.out.println((int) b);   // 1  

        // ✅ 2) 정수 → 실수 (int → double)  
        double result2;  

        // 정수를 실수로 변환하는 경우 자동 형 변환됨  
        result2 = a;  

        System.out.println(result2);   // 24.0  
        System.out.println((double) a); // 24.0  
    }  
}
