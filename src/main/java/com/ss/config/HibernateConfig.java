package com.ss.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ss.entity.User;
import com.ss.entity.Jobs;

import static org.hibernate.cfg.Environment.*;

/**
 * @author imssbora
 */
@Configuration
@PropertySource("classpath:db3.properties")
@EnableTransactionManagement
@ComponentScans(value = { @ComponentScan("com.ss.dao"),
      @ComponentScan("com.ss.service"),@ComponentScan("com.ss.entity") })
public class HibernateConfig {

   @Autowired
   private Environment env;
   private Properties getHibernateProperties() {
	   Properties props = new Properties();
	      // Setting JDBC properties
	      props.put(DRIVER, env.getProperty("mysql.driver"));
	      props.put(URL, env.getProperty("mysql.url"));
	      props.put(USER, env.getProperty("mysql.user"));
	      props.put(PASS, env.getProperty("mysql.password"));

	      // Setting Hibernate properties
	      props.put(SHOW_SQL, env.getProperty("hibernate.show_sql"));
	      props.put(HBM2DDL_AUTO, env.getProperty("hibernate.hbm2ddl.auto"));

	      // Setting C3P0 properties
	      props.put(C3P0_MIN_SIZE, 
	            env.getProperty("hibernate.c3p0.min_size"));
	      props.put(C3P0_MAX_SIZE, 
	            env.getProperty("hibernate.c3p0.max_size"));
	      props.put(C3P0_ACQUIRE_INCREMENT,
	            env.getProperty("hibernate.c3p0.acquire_increment"));
	      props.put(C3P0_TIMEOUT, 
	            env.getProperty("hibernate.c3p0.timeout"));
	      props.put(C3P0_MAX_STATEMENTS, 
	            env.getProperty("hibernate.c3p0.max_statements"));
	    return props;
	}
   
   @Bean
   public LocalSessionFactoryBean getSessionFactory() {
      LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
      factoryBean.setHibernateProperties(getHibernateProperties());
      //factoryBean.setAnnotatedClasses(User.class);
      //factoryBean.setAnnotatedClasses(jobs.class);
      factoryBean.setPackagesToScan(new String[] {"com.ss.entity"});
      return factoryBean;
   }

   @Bean
   public HibernateTransactionManager getTransactionManager() {
      HibernateTransactionManager transactionManager = new HibernateTransactionManager();
      transactionManager.setSessionFactory(getSessionFactory().getObject());
      return transactionManager;
   }
}