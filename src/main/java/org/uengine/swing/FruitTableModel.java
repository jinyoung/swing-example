package org.uengine.swing;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.List;

/**
 * Created by uengine on 2018. 1. 31..
 */
public class FruitTableModel implements TableModel {

    static String[] columnNames = new String[]{"이름", "수량", "가격"};
    static Class[] columnClasses = new Class[]{String.class, Integer.class, int.class};

    List<Fruit> fruitList;
        public List<Fruit> getFruitList() {
            return fruitList;
        }
        public void setFruitList(List<Fruit> fruitList) {
            this.fruitList = fruitList;
        }



    public int getRowCount() {
        return getFruitList().size();
    }

    public int getColumnCount() {
        return 3;
    }

    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    public Class<?> getColumnClass(int columnIndex) {
        return columnClasses[columnIndex];
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex==0) return getFruitList().get(rowIndex).getName();
        else if(columnIndex==1) return getFruitList().get(rowIndex).getQty();
        else if(columnIndex==2) return getFruitList().get(rowIndex).getPrice();

        return null;
    }

    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    public void addTableModelListener(TableModelListener l) {

    }

    public void removeTableModelListener(TableModelListener l) {

    }
}
