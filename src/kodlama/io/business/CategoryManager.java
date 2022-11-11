package kodlama.io.business;

import kodlama.io.core.log.Logger;
import kodlama.io.dataaccess.CategoryDao;
import kodlama.io.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private List<Logger> loggersList;
    private List<Category> categoryList = new ArrayList<>();

    public CategoryManager(CategoryDao categoryDao, List<Logger> loggersList) {
        this.categoryDao = categoryDao;
        this.loggersList = loggersList;
    }

    public void add(Category category) throws Exception{
        for (Category c : categoryList){
            if (c.getName().equals(category.getName())){
                throw new Exception("Bu isimde bir kategori mevcut.");
            }
        }
        categoryDao.add(category);
        categoryList.add(category);
        for (Logger logger : loggersList) {
            logger.log(category.getName());
        }
    }
}
