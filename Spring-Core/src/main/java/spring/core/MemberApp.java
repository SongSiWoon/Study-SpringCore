package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.core.member.Grade;
import spring.core.member.Member;
import spring.core.member.MemberService;
import spring.core.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        // 순수 자바
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
        // 스프링 사용
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());
    }
}
