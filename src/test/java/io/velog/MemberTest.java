package io.velog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class MemberTest {

    @Autowired
    MemberRepository memberRepository;

    @Transactional
    @Rollback(value = false)
    @Test
    void save() {
        Member member = new Member();
        member.setId(1L);
        member.setName("name");

        memberRepository.save(member);
    }
}