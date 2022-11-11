package kodlama.io.business;

import kodlama.io.core.log.Logger;
import kodlama.io.dataaccess.InstructorDao;
import kodlama.io.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    private InstructorDao instructorDao;
    private List<Logger> loggers;
    private List<Instructor> instructorList = new ArrayList<>();

    public InstructorManager() {
    }

    public InstructorManager(InstructorDao instructorDao, List<Logger> loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }
    public void add(Instructor instructor) throws Exception{
        for (Instructor i : instructorList){
            if (i.getFirstName().equals(instructor.getFirstName()) && i.getLastName().equals(instructor.getLastName())){
                throw new Exception("Bu isim ve soyisimde bir eğitmen mevcut.");
            }
        }
        instructorDao.add(instructor);
        instructorList.add(instructor);
        for (Logger logger : loggers){
            logger.log(instructor.getFirstName() + " " + instructor.getLastName());
        }
    }
}
