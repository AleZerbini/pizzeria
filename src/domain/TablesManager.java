package domain;

import java.util.HashMap;
import java.util.Map;

public class TablesManager {
    private static int tablesLimit = 20; //table quantity in pizzeria - changeable by manager
    public static Map<Integer, Map <String, Integer>> tableStatus = new HashMap<>();

    public static int getTablesLimit() {
        return tablesLimit;
    }

    public static void setTablesLimit(int tablesLimit) {
        TablesManager.tablesLimit = tablesLimit;
    }

    public static void init() {
        for (int i = 1; i < tablesLimit + 1; i++) {
            tableStatus.put(i, null);
        }
    }

    public static Map<String, Integer> tableOrders (Integer mesa){
        return TablesManager.tableStatus.get(mesa);
    }



    //teste de inicializacao --> okay!
    public static void main(String[] args) {
        init();
        for (Map.Entry<Integer, Map<String,Integer>> table : tableStatus.entrySet()) {
            System.out.print(table.getKey()+" ==>");
            System.out.println(table.getValue());
        }
    }


}