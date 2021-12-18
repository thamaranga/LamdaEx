package com.hasithat.withlamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//This class demonstrates how to write code with  lamda expressions
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
        Collections.sort(personList, (p1, p2)-> p1.getLastName().compareTo(p2.getLastName()));

        //Printing all the elements of  personList
        personList.forEach(p-> System.out.println(p));
        System.out.println("*************************");

        //Filter pearson objects which last name begining with j
        List<Pearson> filteredPersonList=personList.stream().filter(p->p.getLastName().startsWith("j")).collect(Collectors.toList());
        System.out.println(filteredPersonList);


    }





}



