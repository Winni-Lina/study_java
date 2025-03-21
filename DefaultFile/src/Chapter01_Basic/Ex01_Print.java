package Chapter01_Basic;  

public class Ex01_Print {  
    public static void main(String[] args) {  

        // 🔹 처리문: 특정 기능을 수행하는 문장  
        //    - ex) 출력문, 입력문, ...
        //    - 모든 처리문 끝에는 `;`(세미콜론) 필수!  

        // 🔹 출력문 (Print Statement)  

        // ✅ `System.out.println()`: 출력 후 줄바꿈  
        System.out.println("줄바꿈 있는 출력:");
        System.out.println("안녕하세요!");
        System.out.println("반갑습니다!");
        System.out.println(12345);  

        // ✅ `System.out.print()`: 출력 후 줄바꿈 없음  
        System.out.print("줄바꿈 없는 출력:");
        System.out.print("안녕하세요!");
        System.out.print("반갑습니다!");
        System.out.print(12345);  
    }  
}