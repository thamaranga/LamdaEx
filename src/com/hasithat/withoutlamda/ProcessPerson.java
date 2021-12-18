package com.hasithat.withoutlamda;

import java.util.*;

//This class demonstrates how to write code without using lamda expressions
public class ProcessPerson {


    public static void main(String[] args) {

        List<Pearson> personList= Arrays.asList(
                new Pearson("sanath","jayasuriya", 45),
                new Pearson("mahela","jayawardhana", 40),
                new Pearson("kumar","sangakkara", 42),
                new Pearson("lasith","malinga", 38),
                new Pearson("roshan","mahanama", 55)
                );


        //Sorting above   list using lastName of the Pearson object
        Collections.sort(personList, new Comparator<Pearson>() {
            @Override
            public int compare(Pearson o1, Pearson o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        ProcessPerson processPerson= new ProcessPerson();
        processPerson.printAllElements(personList);
        System.out.println("*****************");
        processPerson.filterByLastNameBeginingWithJ(personList);

    }

    //Printing all the elements of  personList
    public void printAllElements(List<Pearson> personList){
        for (Pearson pearson:personList) {
            System.out.println(pearson);
        }
    }

    //Filter pearson objects which last name begining with j
    public void  filterByLastNameBeginingWithJ(List<Pearson> personList){
        for (Pearson pearson:personList) {
            if(pearson.getLastName().startsWith("j")){
                System.out.println(pearson);
            }

        }
    }




}



