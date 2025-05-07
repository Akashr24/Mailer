package pkg1Mailer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE MONTH(u.birthday) = ?1 AND DAY(u.birthday) = ?2")
	static
    List<User> findUsersWithBirthdayToday(int month, int day) {
		// TODO Auto-generated method stub
		return null;
	}
}