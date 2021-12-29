package spring.core.order;

import spring.core.discount.DiscountPolicy;
//import spring.core.discount.FixDiscountPolicy;
//import spring.core.discount.RateDiscountPolicy;
import spring.core.member.Member;
import spring.core.member.MemberRepository;
import spring.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository;

    //private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    //private final DiscountPolicy discountPolicy = new RateDiscountPolicy();

    // 위의 할인정책을 바꿀 때 OrderServiceImpl의 코드를 변경하게 된다 (DIP, OCP 위반)
    // 인터페이스만 의존하도록 아래처럼 변경(DIP 적용)
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
