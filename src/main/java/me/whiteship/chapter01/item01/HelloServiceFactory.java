package me.whiteship.chapter01.item01;

import me.whiteship.hello.ChineseHelloService;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*
        아래의 코드는 ChineseHelloService에 의존적이지 않다.
        HelloService의 구현체들이 maven install을 통해 메모리에 올라가 있다.
        이렇게 메모리에 저장되어 있는 구현체 ChineseHelloService가 존재한다.
        위와 같은 구현체의 이름을 모르더라도 아래와 같이 ServiceLoader를 통해 HelloService의 구현체를 사용할 수 있다.
         */
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        Optional<HelloService> helloServiceOptional = loader.findFirst();
        helloServiceOptional.ifPresent(h -> {
            System.out.println(h.hello());
        });

        /*
        아래의 코드는 ChineseHelloService에 의존적이다.
        직접적으로 HelloService의 구현체인 ChineseHelloService의 생성자를 통해 인스턴스를 생성하였다.
        아래의 방법은 ChineseHelloService에 변경사항등이 발생했을 때 코드자체도 바뀔 수 있다.
         */
        HelloService helloService = new ChineseHelloService();
        System.out.println(helloService.hello());


        /*
        아래의 코드는 Java에서 제공하는 Reflection을 통해 ChineseHelloService를 호출하는 코드이다.
         */
//        Class<?> aClass = Class.forName("me.whiteship.hello.ChineseHelloService");
//        Constructor<?> constructor = aClass.getConstructor();
//        HelloService helloService = (HelloService) constructor.newInstance();
//        System.out.println(helloService.hello());
    }

}
