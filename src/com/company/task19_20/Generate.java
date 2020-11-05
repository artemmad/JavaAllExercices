package com.company.task19_20;

import java.util.*;

public class Generate {
    private final ArrayList<String> plates= new ArrayList<>();
    private final HashSet<String> plates_hash = new HashSet<String>();
    private final Set<String> plates_tree = new TreeSet<>();
    public void beatifulplates(){
        String[] bukvy = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        for (int i=1;i<=199;i++){
            for(int j=1; j<=9; j++)
                for (String s : bukvy)
                 {
                    String e = s + (j) + (j) + (j) + s + s + (i);
                    plates.add(e);
                    plates_hash.add(e);
                    plates_tree.add(e);
                }
        }
        for (int i=1;i<=199;i++){
            for(int l=1; l<=9; l++)
                for (int j = 0; j < bukvy.length; j++) {
                    for (int j2 = 0; j2 < bukvy.length; j2++) {
                        for (int k = 0; k < bukvy.length; k++) {
                            String e = bukvy[j] + (l) + (l) + (l) +bukvy[j2] +  bukvy[k] + (i);
                            plates.add(e);
                            plates_hash.add(e);
                            plates_hash.add(e);
                            plates_tree.add(e);
                        }
                    }
                }
        }
    }

    public void search(String plate){
        boolean found;
        long startTime = System.nanoTime();
        found= plates.contains(plate);
        long estimatedTime = System.nanoTime() - startTime;
        if (found){
            System.out.println("Найден  "+estimatedTime+"нс");
        }
        else
            System.out.println("не найден  "+estimatedTime+"нс");
        Collections.sort(plates);
        int x;
        startTime = System.nanoTime();
        x=Collections.binarySearch(plates,plate);
        estimatedTime = System.nanoTime() - startTime;
        if (x>0 && x<=plates.size()){
            System.out.println("Найден  "+estimatedTime+"нс");
        }
        else
            System.out.println("не найден  "+estimatedTime+"нс");
        startTime = System.nanoTime();
        found=plates_hash.contains(plate);
        estimatedTime = System.nanoTime() - startTime;
        if (found){
            System.out.println("Найден  "+estimatedTime+"нс");
        }
        else
            System.out.println("не найден  "+estimatedTime+"нс");
        startTime = System.nanoTime();
        found=(plates_tree.contains(plate));
        estimatedTime = System.nanoTime() - startTime;
        if (found){
            System.out.println("Найден  "+estimatedTime+"нс");
        }
        else
            System.out.println("не найден  "+estimatedTime+"нс");
    }
}
