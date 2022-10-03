package jpabook.start;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Code3_2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx =em.getTransaction();

        // em.persist(memberA);
        // em.persist(memberB);
        // 여기서 INSERT SQL을 데이터베이스에 전달하지 않는다.

        // 커밋하는 순간 데이터베이스에 INSERT SQL을 보낸다.
        tx.commit();
    }
}
