package me.whiteship.chapter01.item01;

/**
 * 이 클래스의 인스턴스는 #getInstance()를 통해 사용한다.
 * @see #getInstance()
 */
public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    private Settings() {}

    /*
    아래와 같이 미리 인스턴스를 생성한다.
     */
    private static final Settings SETTINGS = new Settings();

    /*
    해당 메서드가 정적 팩토리 메서드이다.
    동일한 객체를 반복해서 생성해야할 때 다음과 같이 인스턴스를 반환하는 정적 팩토리 메서드를 사용하면
    불필요한 인스턴스의 생성을 줄일 수 있다.
     */
    public static Settings getInstance() {
        return SETTINGS;
    }

}
