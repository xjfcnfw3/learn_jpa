package jpabook.start;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Code3_6 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
        EntityManager em = emf.createEntityManager();
        // em.persist(memberA);
        // em.persist(memberB);
        // em.persist(memberC);

        // 중간에 JPQL 실행
        // query = em.createQuery("select m from Member m",Member.class);
        // List<Member> members = query.getResultList();
    }
}
