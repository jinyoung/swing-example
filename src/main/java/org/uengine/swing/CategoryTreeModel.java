package org.uengine.swing;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 * Created by uengine on 2018. 1. 31..
 */
public class CategoryTreeModel implements TreeModel{

    Category rootCategory;

    public CategoryTreeModel(Category root) {
        rootCategory = root;
    }

    public Category getRootCategory() {
            return rootCategory;
        }
        public void setRootCategory(Category rootCategory) {
            this.rootCategory = rootCategory;
        }


    public Object getRoot() {
        return getRootCategory();
    }

    public Object getChild(Object parent, int index) {

        Category category = (Category)parent;

        return category.getSubCategories().get(index);
    }

    public int getChildCount(Object parent) {
        Category category = (Category)parent;

        return category.getSubCategories().size();
    }

    public boolean isLeaf(Object node) {
        Category category = (Category)node;

        return category.getSubCategories().size() == 0;
    }

    public void valueForPathChanged(TreePath path, Object newValue) {

    }

    public int getIndexOfChild(Object parent, Object child) {
        Category category = (Category)parent;
        return category.getSubCategories().indexOf(child);
    }

    public void addTreeModelListener(TreeModelListener l) {

    }

    public void removeTreeModelListener(TreeModelListener l) {

    }
}
