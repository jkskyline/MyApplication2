package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextWeight, editTextHeight;
    TextView textViewResult;
    ImageView imageViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextWeight = (EditText)findViewById(R.id.editTextWeight);
        editTextHeight = (EditText)findViewById(R.id.editText2);
        textViewResult = (TextView)findViewById(R.id.textViewResult);
        imageViewResult=(ImageView)findViewById(R.id.imageViewResult);

    }

  public void Display(View view) {
      double height, weight;
      double BMI;

      height = Double.parseDouble(editTextHeight.getText().toString());
      height=height/100;
      weight = Double.parseDouble(editTextWeight.getText().toString());

      BMI = weight / (height * height);

      if (BMI <= 18.5) {
          textViewResult.setText("Your BMI result :" + String.format("%.2f",BMI) + "\nYou are under weight");
          imageViewResult.setImageResource(R.drawable.under);

      } else if (BMI >= 25) {
          textViewResult.setText("Your BMI result :" + String.format("%.2f",BMI) + "\nYou are over weight");
          imageViewResult.setImageResource(R.drawable.over);
      } else {
          textViewResult.setText("Your BMI result :" + String.format("%.2f",BMI) + "\nYou are normal weight");
          imageViewResult.setImageResource(R.drawable.normal);
      }
  }

      public void reset(View view){
          editTextWeight.setText("");
          editTextHeight.setText("");
          textViewResult.setText("");
        imageViewResult.setImageResource(R.drawable.empty);

      }

}
