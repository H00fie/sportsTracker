package bm.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ExerciseService {

    // BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/spring.xml"));

    ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring.xml");

    private static final Logger logger = LoggerFactory.getLogger(ExerciseService.class);




}
