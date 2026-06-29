package com.javatechie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
   private int id;
   
   public int getId() {
        return id;
   }
   public void setId(int id) {
      this.id = id;
   }
    private String name;
    private double price;
    
}
