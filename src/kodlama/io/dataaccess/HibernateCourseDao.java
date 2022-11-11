package kodlama.io.dataaccess;

import kodlama.io.entities.Course;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile eklendi: " + course.getName());
    }

    @Override
    public void update(Course course) {
        System.out.println("Hibernate ile güncellendi: " + course.getName());
    }

    @Override
    public void delete(Course course) {
        System.out.println("Hibernate ile silindi: " + course.getName());
    }
}
