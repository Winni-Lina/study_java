package Chapter02_Control;

public class Ex02_else_if {

    public static void main(String[] args) {

        // 🔹 조건문 (else if문)
        // 만약에 ~이면 ~을 실행해라
        // '위 조건이 아니고 만약 ~이면 ~을 실행해라'

        // ✅ 기본 형태:
        // if(조건) { 조건이 참일 경우 실행되는 코드 }
        // else if(조건) { 위쪽 조건이 거짓이고 이 조건이 참일 경우 실행되는 코드 }

        int a = 3;

        System.out.println("첫 번째 else if 문");
        if (a == 3) {
            // 조건이 참이므로 실행됨
            System.out.println("첫 조건은 참입니다!");
        } else if (a >= 0) {
            // 조건이 참이지만, 이전 조건이 이미 성립했으므로 실행되지 않음
            System.out.println("첫 조건은 거짓, 두 번째 조건은 참입니다!");
        }

        System.out.println("두 번째 else if 문");
        if (a == 2) {
            // 조건이 거짓이므로 실행되지 않음
            System.out.println("첫 조건은 참입니다!");
        } else if (a >= 0) {
            // 이전 조건이 거짓이고 현재 조건이 참이므로 실행됨
            System.out.println("첫 조건은 거짓, 두 번째 조건은 참입니다!");
        }

        System.out.println("세 번째 else if 문");
        if (a == 1) {
            // 조건이 거짓이므로 다음 조건 확인
            System.out.println("첫 번째 조건은 참입니다!");
        } else if (a == 2) {
            // 조건이 거짓이므로 다음 조건 확인
            System.out.println("두 번째 조건은 참입니다!");
        } else if (a == 3) {
            // 조건이 참이므로 실행됨 (이후 조건은 확인하지 않음)
            System.out.println("세 번째 조건은 참입니다!");
        } else if (a == 4) {
            System.out.println("네 번째 조건은 참입니다!");
        }

        // 확인할 조건이 많다면, 그만큼 else if를 사용할 수 있다.
    }
}
