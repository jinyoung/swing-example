package org.uengine.swing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by uengine on 2018. 1. 31..
 */
public class Category {

    public Category(String name) {
        this.name = name;
    }

    List<Category> subCategories = new ArrayList<Category>();
        public List<Category> getSubCategories() {
            return subCategories;
        }
        public void setSubCategories(List<Category> subCategories) {
            this.subCategories = subCategories;
        }

    String name;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

    @Override
    public String toString() {
        return getName();
    }
}
