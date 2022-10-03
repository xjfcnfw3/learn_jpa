package jpabook.start;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Code3_8 {
    public void testDetached(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx =em.getTransaction();
        // 회원 엔티티 생성, 비영속 상태
        Member member = new Member();
        member.setId("MemberA");
        member.setUsername("회원A");

        //회원 엔티티 영속 상태
        em.persist(member);

        //회원 엔티티를 영속성 컨텍스트에서 분리, 준영속 상태
        em.detach(member);

        tx.commit(); // 트랜잭션 커밋
    }
}
