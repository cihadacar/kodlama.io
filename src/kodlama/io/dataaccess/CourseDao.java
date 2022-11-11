package kodlama.io.dataaccess;

import kodlama.io.entities.Course;

public interface CourseDao {
    void add(Course course);
    void update(Course course);
    void delete(Course course);
}
