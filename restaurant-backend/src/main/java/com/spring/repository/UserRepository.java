package com.spring.repository;

import com.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Transactional //javax.persistence.TransactionRequiredException: Executing an update/delete query
    @Modifying // using with DML 
    @Query("UPDATE User u SET u.userName = :userName , u.email = :email ,u.phone = :phone "
            + ", u.password = :password ,  u.creditLimit= :creditLimit ,u.role= :role"
            + " WHERE u.id = :id")
    public void updateUserById(@Param("userName") String userName,
            @Param("email") String email,
            @Param("phone") String phone,
            @Param("password") String password,
            @Param("creditLimit") int creditLimit,
            @Param("role") String role,
            @Param("id") long id);

    public User findByUserNameAndPassword(String userName, String password);

    public User findByUserName(String userName);
    
     public User findByEmail(String email);

}
