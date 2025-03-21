package Chapter01_Basic;

public class Ex07_Calculate1 {

    public static void main(String[] args) {
        // 🔹 숫자의 사칙연산과 나머지 계산

        // ✅ 기본 연산
        System.out.println("덧셈 : " + (5 + 3)); // 덧셈
        System.out.println("뺄셈 : " + (5 - 3)); // 뺄셈
        System.out.println("곱셈 : " + (5 * 3)); // 곱셈
        System.out.println("나눗셈 : " + (5 / 3)); // 나눗셈 (정수 나눗셈)

        // ✅ 나눗셈 (소수점 포함)
        // ※ 소수점을 표현하기 위해 강제 형 변환 사용
        System.out.println("나눗셈 (소수점 포함) : " + ((double) 5 / 3));

        // ✅ 나머지 연산
        System.out.println("나머지 : " + (5 % 3));

        System.out.println();

        // ✅ 변수 활용한 연산
        int a = 14;
        int b = 5;

        System.out.println("변수 a와 b의 사칙연산 및 나머지");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("a + b : " + (a + b)); // 덧셈
        System.out.println("a - b : " + (a - b)); // 뺄셈
        System.out.println("a * b : " + (a * b)); // 곱셈
        System.out.println("a / b : " + (a / b)); // 나눗셈 (정수 나눗셈)
        System.out.println("a % b : " + (a % b)); // 나머지 연산
    }
}
