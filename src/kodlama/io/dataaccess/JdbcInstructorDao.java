package kodlama.io.dataaccess;

import kodlama.io.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Jdbc ile eklendi: " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Jdbc ile güncellendi: " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Jdbc ile silindi: " +  instructor.getFirstName() + " " + instructor.getLastName());
    }
}
