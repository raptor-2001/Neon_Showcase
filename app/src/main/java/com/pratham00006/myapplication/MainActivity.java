package com.pratham00006.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Toast;

import com.pratham00006.myapplication.databinding.ActivityMainBinding;
import com.pratham00006.myapplication.fragment.foodFragment;
import com.pratham00006.myapplication.fragment.sweetsFragment;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ImageButton food,sweets;
    FrameLayout topFrame,container;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


           food = findViewById(R.id.food_btn);
           sweets = findViewById(R.id.sweets_btn);
           container = findViewById(R.id.container);
           topFrame = findViewById(R.id.topFrame);



           food.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   foodFragment foodFragment = new foodFragment();
                   FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                   transaction.replace(R.id.container, new foodFragment());
                   transaction.commit();
               }

           });

           sweets.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   sweetsFragment sweetsFragment = new sweetsFragment();
                   FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                   transaction1.replace(R.id.container, new sweetsFragment());
                   transaction1.commit();
               }
           });




    }
}