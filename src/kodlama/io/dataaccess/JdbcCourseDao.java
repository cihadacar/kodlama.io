package kodlama.io.dataaccess;

import kodlama.io.entities.Course;

public class JdbcCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Jdbc ile eklendi: " + course.getName());
    }

    @Override
    public void update(Course course) {
        System.out.println("Jdbc ile güncellendi: " + course.getName());
    }

    @Override
    public void delete(Course course) {
        System.out.println("Jdbc ile silindi: " + course.getName());
    }
}
