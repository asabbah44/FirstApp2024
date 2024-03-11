package com.example.firstapp2024;

import java.util.ArrayList;
import java.util.List;

public class CitiesData {
   private List<Cities> citiesList;

   public CitiesData(){
      citiesList =new ArrayList<>();
      citiesList.add(new Cities (1,"Jenen"));
      citiesList.add(new Cities(2,"Ramallah"));
      citiesList.add( new Cities(3,"Nablus"));
      citiesList.add(new Cities(4,"Tulkarem"));
      citiesList.add(new Cities (5,"Jerusalem"));
   }

   public List<Cities> getCities()
   {
     return citiesList;
   }

   public List<String> getCitiesName()
   {
      List<String> citiesNames=new ArrayList<>();
      for (Cities c:citiesList) {
      citiesNames.add(c.name);
      }

      return citiesNames;
   }
}
