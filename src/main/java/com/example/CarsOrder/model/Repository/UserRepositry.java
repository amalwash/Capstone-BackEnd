package com.example.CarsOrder.model.Repository;
import com.example.CarsOrder.model.Entitiec.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositry extends JpaRepository<User,String > {
    @Query("SELECT roles FROM User  where userName = :userName")
    String findRoles(@Param("userName") String userName);

    @Query("SELECT password FROM User  where userName = :userName")
    String findPassword(@Param("userName") String userName);
}
