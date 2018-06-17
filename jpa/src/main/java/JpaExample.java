import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpaExample {
	public static void main(String[] args) throws Exception {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("primary");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			// TODO Objekte erzeugen

			EntityTransaction transaction = entityManager.getTransaction();
			transaction.begin();
			try {
				// TODO Objekte persistieren

				transaction.commit();
			} catch (Exception ex) {
				ex.printStackTrace();
				transaction.rollback();
			}

			// TODO Objekte abfragen
			Query query = entityManager.createQuery("select x from ... x where ...");
			System.out.println(query.getResultList());
		} finally {
			entityManager.close();

			System.err.println(KILL);
			System.out.println(KILL);
			System.err.println(KILL);
			System.out.println(KILL);
		}
	}

	private static final String KILL = "The program is still running, please kill it via the red square :)";
}
