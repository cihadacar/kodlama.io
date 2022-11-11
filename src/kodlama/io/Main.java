package kodlama.io;

import kodlama.io.business.CategoryManager;
import kodlama.io.business.CourseManager;
import kodlama.io.business.InstructorManager;
import kodlama.io.core.log.*;
import kodlama.io.dataaccess.*;
import kodlama.io.entities.Category;
import kodlama.io.entities.Course;
import kodlama.io.entities.Instructor;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new MailLogger(), new ConsoleLogger(), new DatabaseLogger(), new FileLogger()};

        Category category = new Category (1,"Backend");
        Course course = new Course(1, "Java",25);
        Instructor instructor = new Instructor(1, "Engin", "Demiroğ");

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), List.of(loggers));
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), List.of(loggers));
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), List.of(loggers));

        categoryManager.add(category);
        courseManager.add(course);
        instructorManager.add(instructor);

    }
}