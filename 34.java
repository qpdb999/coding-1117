
/*
제네릭(Generic)

    오늘 배운 내용

이번에는 자바에서 자료형을 미리 지정하여 사용할 수 있도록 도와주는
제네릭(Generic)에 대해 배웠다.

제네릭은 클래스나 메서드를 만들 때 사용할 자료형을
미리 정하지 않고 객체를 생성하거나 메서드를 호출할 때 지정하는 기능이다.

컬렉션 프레임워크에서 사용했던 ArrayList<String>이나
HashMap<String, Integer>도 제네릭을 활용한 예시이다.

제네릭을 사용하면 자료형에 맞지 않는 데이터가 들어가는 것을
컴파일 단계에서 확인할 수 있고, 형변환을 줄일 수 있다.


    정의

제네릭(Generic)이란 클래스나 메서드에서 사용할 자료형을
매개변수처럼 전달받아 다양한 자료형에 대응할 수 있도록 하는 기능이다.

제네릭에서 사용하는 T, E, K, V 등은 자료형을 나타내는
타입 매개변수이며, 일반적으로 다음과 같은 의미로 사용한다.

- T(Type) : 일반적인 자료형
- E(Element) : 요소
- K(Key) : 키
- V(Value) : 값


    사용 방법

1. 제네릭을 사용하지 않은 경우

class Box {
    Object value;

    void setValue(Object value) {
        this.value = value;
    }

    Object getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {

        Box box = new Box();

        box.setValue("안녕하세요");

        String text = (String) box.getValue();

        System.out.println(text);
    }
}

Object를 사용하면 여러 자료형을 저장할 수 있지만,
값을 가져올 때 원하는 자료형으로 형변환해야 한다.


2. 제네릭 클래스 만들기

class Box<T> {
    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {

        Box<String> box1 = new Box<>();
        box1.setValue("안녕하세요");

        Box<Integer> box2 = new Box<>();
        box2.setValue(100);

        System.out.println(box1.getValue());
        System.out.println(box2.getValue());
    }
}

<T>를 사용하면 객체를 생성할 때 자료형을 지정할 수 있다.

Box<String>은 문자열을 저장하고,
Box<Integer>는 정수를 저장한다.

자료형이 정해져 있기 때문에 별도의 형변환 없이
저장한 데이터를 가져올 수 있다.


3. 제네릭 메서드

class PrintData {

    public <T> void print(T data) {
        System.out.println(data);
    }
}

public class Main {
    public static void main(String[] args) {

        PrintData printer = new PrintData();

        printer.print("Java");
        printer.print(100);
        printer.print(3.14);
    }
}

제네릭 메서드는 메서드 앞에 <T>를 작성하여 사용한다.

호출할 때 전달하는 값에 따라 자료형이 결정되므로
하나의 메서드로 여러 자료형의 데이터를 처리할 수 있다.


    코드 분석

제네릭 클래스에서는 클래스 이름 뒤에 <T>를 작성한다.

T는 실제 자료형을 대신하는 타입 매개변수이며,
객체를 생성할 때 String이나 Integer처럼 원하는 자료형을 지정할 수 있다.

제네릭 메서드는 메서드 앞에 <T>를 작성하여 사용한다.

제네릭을 사용하면 같은 기능을 여러 자료형에 맞게
반복해서 작성하지 않아도 된다는 장점이 있다.


    알게 된 점

이번 학습을 통해 컬렉션 프레임워크에서 사용했던
<String>, <Integer>가 제네릭이라는 것을 알게 되었다.

처음에는 꺾쇠괄호 안에 자료형을 작성하는 이유를 잘 몰랐지만,
제네릭을 사용하면 자료형을 지정하고 잘못된 데이터가 들어가는 것을
방지할 수 있다는 점을 이해했다.

또한 클래스뿐만 아니라 메서드에도 제네릭을 사용할 수 있다는 것을 배웠다.


📌 AI 활용 복습 문제

1) 제네릭이란 무엇인가?

정답: 클래스나 메서드에서 사용할 자료형을 매개변수처럼 전달받아
다양한 자료형에 대응할 수 있도록 하는 기능이다.

2) 제네릭에서 T는 무엇을 의미하는가?

정답: Type의 약자로, 일반적인 자료형을 나타내는 타입 매개변수이다.

3) Box<String>과 Box<Integer>의 차이점은 무엇인가?

정답: Box<String>은 문자열을 저장하고,
Box<Integer>는 정수를 저장한다.

4) 제네릭을 사용하면 어떤 장점이 있는가?

정답: 자료형을 미리 지정하여 잘못된 데이터 입력을 방지하고,
불필요한 형변환을 줄일 수 있다.

5) 제네릭 메서드와 제네릭 클래스의 차이점은 무엇인가?

정답: 제네릭 클래스는 클래스 전체에서 타입 매개변수를 사용하고,
제네릭 메서드는 특정 메서드에서 타입 매개변수를 사용한다.
*/
