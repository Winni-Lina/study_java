package Chapter01_Basic;

// 🔹 import (기능 불러오기)
import java.util.Scanner;
// 원하는 기능을 사용하기 위해 해당 기능의 위치(java.util.Scanner)를 프로그램에 알림

public class Ex05_Input_Data {

    public static void main(String[] args) {
        // 🔹 사용자 입력받기
        // 키보드를 통해 입력을 받으려면 Scanner를 사용해야 한다.
        // java.util 패키지에서 Scanner를 가져와야 하며, 해당 내용을 패키지 선언 아래에 작성한다.

        // ✅ Scanner 변수 선언
        Scanner scan = new Scanner(System.in);
        // 변수명은 자유롭게 설정 가능
        // Scanner의 기능은 '변수명.기능이름();' 형태로 사용

        // 🔸 문자열(String) 입력
        System.out.print("문자열을 입력하세요: ");
        String s = scan.nextLine();
        System.out.println("입력한 문자열: " + s);
        
        // 🔸 정수(int) 입력
        System.out.print("정수를 입력하세요: ");
        int n = scan.nextInt();
        System.out.println("입력한 정수: " + n);

        // 🔸 실수(double) 입력
        System.out.print("실수를 입력하세요: ");
        double d = scan.nextDouble();
        System.out.println("입력한 실수: " + d);


        // 🔹 입력 기능 사용 순서
        // 1. 기능의 주소 작성 (import java.util.Scanner;)
        // 2. Scanner 객체 생성 (Scanner 변수명 = new Scanner(System.in);)
        // 3. 데이터 입력받기
        //    - 정수 입력: scan.nextInt();
        //    - 실수 입력: scan.nextDouble();
        //    - 문자열 입력: scan.nextLine();
        //
        // 키보드를 통해 입력받는 기능을 자주 쓰이기에
        // 이 순서와 위치를 외워두는 것을 추천
        
    }
}
