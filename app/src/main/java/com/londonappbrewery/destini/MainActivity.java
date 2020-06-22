package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
  private static int      storyState;
  private        Button   buttonTop;
  private        Button   buttonBottom;
  private        TextView storyTextView;
  
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    storyState    = 1;
    buttonTop     = findViewById(R.id.buttonTop);
    buttonBottom  = findViewById(R.id.buttonBottom);
    storyTextView = findViewById(R.id.storyTextView);
  }//end onCreate
  
  public void buttonTopFunction(View v)
  {
    switch (storyState)
    {
      case 1:
      case 2:
        storyState = 3;
        storyTextView.setText(R.string.T3_Story);
        buttonTop.setText(R.string.T3_Ans1);
        buttonBottom.setText(R.string.T3_Ans2);
        break;
      case 3:
        storyState = 6;
        storyTextView.setText(R.string.T6_End);
        buttonTop.setVisibility(View.INVISIBLE);
        buttonBottom.setVisibility(View.INVISIBLE);
        break;
    }// end switch storyState
  }// end buttonTopFunction
  
  public void buttonBottomFunction(View v)
  {
    switch (storyState)
    {
      case 1:
        storyState = 2;
        storyTextView.setText(R.string.T2_Story);
        buttonTop.setText(R.string.T2_Ans1);
        buttonBottom.setText(R.string.T2_Ans2);
        break;
      case 2:
        storyTextView.setText(R.string.T4_End);
        buttonTop.setVisibility(View.INVISIBLE);
        buttonBottom.setVisibility(View.INVISIBLE);
        break;
      case 3:
        storyTextView.setText(R.string.T5_End);
        buttonTop.setVisibility(View.INVISIBLE);
        buttonBottom.setVisibility(View.INVISIBLE);
        break;
    }// end switch storyState
  }// end buttonBottomFunction
}//end MainActivity - class
