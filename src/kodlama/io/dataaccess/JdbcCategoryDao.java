package kodlama.io.dataaccess;

import kodlama.io.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Jdbc ile eklendi: " + category.getName());
    }

    @Override
    public void update(Category category) {
        System.out.println("Jdbc ile güncellendi: " + category.getName());
    }

    @Override
    public void delete(Category category) {
        System.out.println("Jdbc ile silindi: " + category.getName());
    }
}
