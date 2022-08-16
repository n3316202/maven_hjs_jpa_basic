import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {

        //엔티티 매니저 팩토리 생성
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
        EntityManager em = emf.createEntityManager(); //엔티티 매니저 생성


        EntityTransaction transaction = em.getTransaction();
        transaction.begin(); // 트랜잭션 시작

        Member member = new Member();


        member.setUsername("홍길동");
        em.persist(member);

        transaction.commit(); // 트랜잭션 커밋
        //em.clear();
    }
}
