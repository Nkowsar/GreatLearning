package org.example.repository;




import org.example.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends JpaRepository<Login, Integer> {

    @Query(value = "Select * from Login l where l.user_name= :userName and l.password= :pwd ", nativeQuery = true)
    Login findByUserNameAndPassword(@Param("userName") String userName,@Param("pwd") String password);
}