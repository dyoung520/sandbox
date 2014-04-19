package com.dyoung.springapp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class UsersDao {
  @Autowired private SessionFactory sessionFactory;
   
  @Transactional
  public List<Users> findAll() {
    Session session = sessionFactory.getCurrentSession();
    List users = session.createQuery("from Users").list();
    return users;
  }
}