package week12;

import java.lang.annotation.*;

@Inherited  // 자식이 상속 받을 수 있음
@Documented // 문서에도 어노테이션 정보가 표현됨
@Retention(RetentionPolicy.RUNTIME) // 컴파일 이후 JVM에 의해 접근 가능
//@Retention(RetentionPolicy.CLASS) // 컴파일러가 클래스를 참조할 때 까지 유효
//@Retention(RetentionPolicy.SOURCE) // 어노테이션 정보는 컴파일 이후 사라짐
@Target({
        ElementType.PACKAGE, // 패키지 선언시
        ElementType.TYPE, // 타입 선언시
        ElementType.CONSTRUCTOR, // 생성자 선언시
        ElementType.FIELD, // 멤버 변수 선언시
        ElementType.METHOD, // 메소드 선언시
        ElementType.ANNOTATION_TYPE, // 어노테이션 타입 선언시
        ElementType.LOCAL_VARIABLE, // 지역 변수 선언시
        ElementType.PARAMETER, // 매개 변수 선언시
        ElementType.TYPE_PARAMETER, // 매개 변수 타입 선언시
        ElementType.TYPE_USE // 타입 사용시
})
public @interface CustomAnnotation {
    /* enum 타입을 선언 */
    public enum Quality {BAD, GOOD, VERYGOOD}
    /* String은 기본 자료형은 아니지만 사용 가능합니다. */
    String value();
    /* 배열 형태로도 사용할 수 있습니다. */
    int[] values();
    /* enum 형태를 사용하는 방법입니다. */
    CustomAnnotation.Quality quality() default CustomAnnotation.Quality.GOOD;
}
