package kodlama.io.dataaccess;

import kodlama.io.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile eklendi: " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Hibernate ile güncellendi: " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Hibernate ile silindi: " + instructor.getFirstName() + " " + instructor.getLastName());
    }
}
