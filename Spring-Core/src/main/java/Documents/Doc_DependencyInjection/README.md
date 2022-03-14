# 의존관계 자동 주입

- ## 의존관계 주입 방법
    - [생성자 주입](#생성자-주입)
    - 수정자 주입(setter 주입)
    - 필드 주입
    - 일반 메서드 주입

- ### 생성자 주입
    ```java
    @Component
    public class OrderServiceImpl implements OrderService {
    
        private final MemberRepository memberRepository;
        private final DiscountPolicy discountPolicy;
        
        @Autowired // 생략 가능
        public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
            this.memberRepository = memberRepository;
            this.discountPolicy = discountPolicy;
        }
    }
    ```
  - 생성자 호출시점에 딱 1번만 호출되는 것이 보장
  - **불변, 필수 의존관계에 사용**
  - `@Autowired`는 스프링 빈에서 생성자가 1개일 때 생략 가능
