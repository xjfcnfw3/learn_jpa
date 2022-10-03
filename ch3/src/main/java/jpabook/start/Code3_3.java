package jpabook.start;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Code3_3 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx =em.getTransaction();

        Member memberA = em.find(Member.class, "memberA");

        //영속 엔티티 데이터 수정
        memberA.setUsername("hi");
        memberA.setAge(10);

        // em.update(member) 이런 코드가 있어야 하지 않을까?

        tx.commit();
    }
}
