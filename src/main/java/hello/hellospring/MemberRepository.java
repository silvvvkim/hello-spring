package hello.hellospring;

import java.util.List;
import java.util.Optional;
import hello.hellospring.domain.Member;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> finbByName(String name);
    List<Member> findAll();
}
