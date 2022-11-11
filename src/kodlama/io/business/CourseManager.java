package kodlama.io.business;

import kodlama.io.core.log.Logger;
import kodlama.io.dataaccess.CourseDao;
import kodlama.io.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private List<Course> courseList = new ArrayList<>();
    private CourseDao courseDao;
    private List<Logger> loggers;

    public CourseManager(CourseDao courseDao, List<Logger> logger) {
        this.courseDao = courseDao;
        this.loggers = logger;
    }

    public void add(Course course) throws Exception {
        for (Course c : courseList){
            if (c.getName().equals(course.getName())){
                throw new Exception("Bu isimde bir kurs mevcut.");
            }
        }
        if(course.getPrice()<10){
            throw new Exception("Kurs fiyatı 10'dan düşük olamaz.");
        }
        courseDao.add(course);
        courseList.add(course);
        for (Logger logger : loggers){
            logger.log(course.getName());
        }
    }
}
