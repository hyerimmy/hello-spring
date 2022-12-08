package hyerimland.hellospring;

import hyerimland.hellospring.repository.MemberRepository;
import hyerimland.hellospring.repository.MemoryMemberRepository;
import hyerimland.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
