package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       Log.d("Activity1","OnCreate invoke");
   }

   @Override
   protected void onStart() {
       super.onStart();
       Log.d("Activity1","Onstart invoke");
   }

   @Override
   protected void onResume() {
       super.onResume();
       Log.d("Activity1","OnResume invoke");
   }

   @Override
   protected void onPause() {
       super.onPause();
       Log.d("Activity1","OnPause invoke");
   }

   @Override
   protected void onStop() {
       super.onStop();
       Log.d("Activity1","OnStope invoke");
   }

   @Override
   protected void onRestart() {
       super.onRestart();
       Log.d("Activity1","OnRestart invoke");
   }

   @Override
   protected void onDestroy() {
       super.onDestroy();
       Log.d("Activity1","OnDestroy invoke");
   }
}
