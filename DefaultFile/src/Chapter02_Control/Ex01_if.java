package Chapter02_Control;

public class Ex01_if {

    public static void main(String[] args) {

        // 🔹 조건문 (if문)
        // '만약에 ~이면 ~을 실행해라'

        // ✅ 기본 형태: if(조건) { 조건이 참일 경우 실행되는 코드 }

        if (1 < 0) {
            // 조건이 거짓이므로 실행되지 않음
            System.out.println("1번 조건은 참입니다!");
        }

        if (1 > 0) {
            // 조건이 참이므로 실행됨
            System.out.println("2번 조건은 참입니다!");
        }
    }
}