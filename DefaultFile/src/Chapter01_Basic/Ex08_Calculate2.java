package Chapter01_Basic;

public class Ex08_Calculate2 {

    public static void main(String[] args) {
        // 🔹 7. 문자 + 문자, 문자 + 숫자 계산

        // ✅ 문자 + 문자 (문자열 연결)
        String s1 = "안녕하세요!";
        String s2 = "반가워요!";

        System.out.println(s1 + s2 + s1); // 문자열 결합

        // ✅ 문자 + 숫자 (문자열과 숫자 연결)
        String s3 = "n1은 ";
        int n1 = 3;

        System.out.println(s3 + n1 + "입니다."); // 문자열과 숫자 결합
    }
}
