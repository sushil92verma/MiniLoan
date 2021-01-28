package com.nucleus.loan.config;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableWebMvc
@ComponentScan("com.nucleus.loan")
@EnableTransactionManagement
public class AppConfig extends WebMvcConfigurerAdapter {

    @Bean
    public InternalResourceViewResolver getResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/view/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
    @Bean
    public CommonsMultipartResolver multipartResolver()
    {
        CommonsMultipartResolver resolver=new CommonsMultipartResolver();
        return resolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");
    }

    //this to be added
   @Bean
    public LocalSessionFactoryBean getSessionFactoryBean(){
        LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
        bean.setDataSource(getDataSource());
        bean.setHibernateProperties(hibernateProperties());
        //bean.setAnnotatedClasses(com.nucleus.loan.entity.EligibilityPolicy.class);
       //bean.setAnnotatedClasses(com.nucleus.loan.entity.EligibilityParameter.class);
       bean.setPackagesToScan(new String[] { "com.nucleus.loan.model" });
        return bean;
    }

    private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle12cDialect");
        properties.setProperty("hibernate.show_sql","true");
        properties.setProperty("hibernate.hbm2ddl.auto","update");
        properties.setProperty("current_session_context_class","thread");

        return properties;
    }
    @Bean
    public DataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
        dataSource.setUsername("system");
        dataSource.setPassword("oracle");

        return dataSource;
    }

    @Bean
    public HibernateTransactionManager transactionManager() {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(getSessionFactoryBean().getObject());
        return transactionManager;
    }

}