package Chapter02_Control;

public class Ex03_else {

    public static void main(String[] args) {
        // 🔹 조건문 (else문)
        // 만약에 ~이면 ~을 실행해라
        // 위 조건이 아니고 만약 ~이면 ~을 실행해라
        // '모든 조건이 아니면 이 코드를 실행해라'

        // ✅ 기본 형태:
        // if(조건) { 조건이 참일 경우 실행되는 코드 }
        // else if(조건) { 위쪽 조건이 거짓이고 이 조건이 참일 경우 실행되는 코드 }
        // else { 모든 조건이 거짓이면 실행되는 코드 }

        int a = -1;

        if (a == 0) {
            // 첫 번째 조건이 참일 경우 실행
            System.out.println("첫 번째 조건 성립 : a는 0입니다.");
        } else if (a > 0) {
            // 이전 조건이 거짓이고 두 번째 조건이 참일 경우 실행
            System.out.println("두 번째 조건 성립 : a는 양수입니다.");
        } else {
            // 이전의 모든 조건이 거짓일 경우 실행
            System.out.println("모든 조건이 성립하지 않음 : a는 음수입니다.");
        }
    }
}
