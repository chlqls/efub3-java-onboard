# 자바 핵심 개념 정리
<details>
<summary>Java에서 제공하는 원시 타입들에 무엇이 있고, 각각 몇 바이트를 차지하나요?</summary>
<div markdown="1">

- `boolean` (1byte)
- `char` (2byte)
- `byte` (1byte)
- `short` (2byte)
- `int` (4byte)
- `long` (8byte)
- `float` (4byte)
- `double` (8byte)

</div>
</details>
<br>

<details>
<summary>오버라이딩(OverRiding)과 오버로딩(OverLoading)에 대해 설명해주세요.</summary>
<div markdown="1">

- `오버라이딩`은 조상클래스로부터 상속받은 메서드의 내용을 상속받는 클래스에 맞게 변경하는 것이다. 이 때 메서드 이름, 매개변수, 리턴 타입이 같아야 한다.
- `오버로딩`은 하나의 클래스에 같은 이름의 메서드를 여러 개 정의하는 것이다. 이 때 메서드의 이름이 같아야 하고, 매개변수의 개수 또는 타입이 달라야 한다. 리턴타입은 관계없다.

</div>
</details>
<br>

<details>
<summary>객체지향 프로그래밍(OOP)에 대해 설명해주세요</summary>
<div markdown="1">

- 프로그래밍에서 필요한 데이터를 상태와 행위를 가진 객체로 만들고, 객체들간의 상호작용을 통해 로직을 구성하는 프로그래밍 방법이다. 
- 코드의 재사용성이 높고, 코드의 관리가 용이하며, 신뢰성이 높은 프로그래밍을 가능하게 한다.

</div>
</details>
<br>

<details>
<summary>추상 클래스와 인터페이스에 대해 설명해주시고, 차이에 대해 설명해주세요.</summary>
<div markdown="1">

- `추상클래스`는 선언부만 있고 구현부가 없는 추상메서드를 포함하고 있는 클래스이다. 추상클래스를 상속받는 자손클래스에서 추상메서드의 구현부를 완성해서 사용하므로 자손마다 다르게 구현될 것으로 예상되는 경우에 사용된다.
- `인터페이스`는 추상클래스보다 추상화 정도가 높아서 추상메서드와 상수만을 멤버로 가질 수 있다. 미리 정해진 규칙에 맞게 구현하도록 표준을 제시하는 데 사용된다.


- 추상클래스는 자손클래스에서 상속(extends)받지만, 인터페이스는 자손클래스에서 구현(implements)한다. 따라서 한 클래스에서 상속과 구현이 동시에 가능하다. 또한 인터페이스는 클래스와 달리 다중상속이 허용되며 인터페이스 간에도 클래스처럼 상속이 가능하다.

</div>
</details>
<br>

<details>
<summary>가비지 컬렉션(gc)란 무엇일까요?</summary>
<div markdown="1">

- `가비지 컬렉션(Garbage Collection)`은 자바의 메모리 관리 방 중의 하나로 JVM의 Heap 영역에서 동적으로 할당했던 메모리 영역 중 필요 없게 된 메모리 영역을 주기적으로 삭제하는 프로제스를 말한다. 
- 이처럼 가비지 컬렉터가 메모리 관리를 대행해주기 때문에 개발자가 메모리 관리, 메모리 누수 문제에 대해 완벽하게 관리하지 않아도 된다는 장점이 있다.

</div>
</details>
<br>

<details>
<summary>JVM의 동작 방식에 대해 설명해 주세요.</summary>
<div markdown="1">

- 자바로 작성된 애플리케이션은 모두 `JVM(Java virtual machine)`에서만 실행되기 때문에, 자바 애플리케이션이 실행되기 위해서는 반드시 JVM이 필요하다.
1. 프로그램이 실행되면 OS로부터 프로그램이 필요로 하는 메모리를 먼저 할당 받는다.
2. 자바 컴파일러를 통해 개발자가 작성한 코드(.java)를 바이트코드(.class)로 변환한다.
3. `Class Loader`에서 바이트코드를 JVM에 로딩 시킨다.
4. 로딩된 바이트코드는 `Execution Engine`을 통해 기계어로 해석된다.
5. 해석된 바이트 코드들은 `Runtime Data Areas`에 배치되어 실질적인 수행이 이뤄진다.


</div>
</details>
<br>

<details>
<summary>불변 객체란 무엇이고, final은 무엇일까요? 사용하는 이유와 함께 설명해주세요.</summary>
<div markdown="1">

- `불변 객체(Immutable Object)`는 생성 후 그 상태를 바꿀 수 없는 객체를 말한다. 불변객체는 재할당은 가능하지만, 한번 할당하면 내부 데이터를 변경할 수 없는 객체이다. 
- 불변 객체를 사용하면 멀티 쓰레드 환경에서 동기화 고려하지 않아도 되고, 객체에 대한 신뢰도를 높이고 가비지 컬렉션의 성능을 높일 수 있다.


- `final`은 최종적인, 더 이상 변경 불가능한 것 앞에 붙는 제어자이다. 클래스, 메서드, 멤버변수, 지역변수 앞에 사용 가능하며 코드의 의미를 명확하게 하고 코드 가독성을 높이기 위해 사용한다.

</div>
</details>
<br>

<details>
<summary>자바의 메모리 영역에 대해 설명해주세요.</summary>
<div markdown="1">


- JVM의 메모리 구조는 크게 Method Area, Call Stack, Heap으로 나뉜다. 
- `Method Area`에는 클래스 정보와 클래스 변수가 저장된다.
- `Call Stack`은 메서드의 작업공간으로써 메서드가 호출되면 메서드 수행에 필요한 메모리 공간을 할당하고 메서드 종료 시에 메모리를 반환한다. 
- `Heap`은 인스턴스가 생성되는 공간으로, new 연산자에 의해서 생성되는 배열과 객체가 모두 여기에 생성된다.

</div>
</details>
<br>

<details>
<summary>new String()과 리터럴(" ")의 차이에 대해 설명해주세요.</summary>
<div markdown="1">

- `new String`으로 문자열 객체를 생성하면 다른 객체들처럼 Heap 메모리에 새로운 주소를 할당받는다. 따라서, 모든 String 변수의 주소가 다르게 저장된다.
- `문자열 리터럴`은 Heap 내의 String Constant Pool 이라는 영역에 할당된다. 만약, 이미 같은 값을 가지고있는 리터럴이 ConstantPool 에 존재할때, 새로운 객체를 생성하지 않고, 기존에 존재하는 리터럴을 사용한다.


</div>
</details>
<br>

<details>
<summary>⭐️ 추가 과제: 람다(lambda)에 대해 알아볼까요?</summary>
<div markdown="1">

- `람다식(Lambda Expression)`이란 함수를 하나의 식(expression)으로 표현한 것이다. 함수를 람다식으로 표현하면 메소드의 이름이 필요 없기 때문에, 람다식은 익명 함수(Anonymous Function)의 한 종류라고 볼 수 있다.
- 불필요한 코드를 줄이고, 가독성을 높이기 위해서 사용된다.

</div>
</details>
<br>

<details>
<summary>⭐️ 추가 과제: 스트림(stream)에 대해 알아볼까요?</summary>
<div markdown="1">

- `스트림(stream)`은 다양한 데이터 소스(컬렉션, 배열 등)를 표준화된 방법으로 다루기 위해 Java 8부터 지원되기 시작한 기능이다.
- 스트림 생성, 중간연산(반복 적용 가능, 연산 결과가 스트림), 최종연산 (스트림의 요소를 소모) -> 결과 리턴의 순서로 사용할 수 있다.
</div>
</details>
<br>

