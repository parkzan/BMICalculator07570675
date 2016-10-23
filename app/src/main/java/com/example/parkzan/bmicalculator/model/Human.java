package com.example.parkzan.bmicalculator.model;

import android.content.Intent;
import android.widget.EditText;

import com.example.parkzan.bmicalculator.MainActivity;
import com.example.parkzan.bmicalculator.R;



public class Human extends MainActivity {
    private  String height ;
    private String weight;
    public Human(String h,String w){
       this.height = h;
        this.weight = w;
    }
    public Human() {

    }
    public void addNumber(String h,String w){
        this.height = h;
        this.weight = w;
    }
  public String getNumber() {
      double x = Double.parseDouble(height);
      double y = Double.parseDouble(weight);
      double q = Math.pow(x / 100, 2);
      double bmi = y / q;
      if (bmi < 18.5) {
          return String.format("%.2f", bmi);

      } else if (bmi >= 18.5 && bmi < 25) {
          return String.format("%.2f", bmi);
      } else if (bmi >= 25 && bmi < 30) {
          return String.format("%.2f", bmi);
      }
      else
          return String.format("%.2f", bmi);

  }
    public String getTet() {
        double x = Double.parseDouble(height);
        double y = Double.parseDouble(weight);
        double q = Math.pow(x / 100, 2);
        double bmi = y / q;
        if (bmi < 18.5) {
            return "น้ำหนักน้อยกว่ากติ(ผอม)";

        } else if (bmi >= 18.5 && bmi < 25) {
            return "น้ำหนักปกติ";
        } else if (bmi >= 25 && bmi < 30) {
            return "น้ำหนักมากว่าปกติ(ท้วม)";
        }
        else
            return"น้ำหนักมากกว่าปกติ(อ้วน)";

    }
}
