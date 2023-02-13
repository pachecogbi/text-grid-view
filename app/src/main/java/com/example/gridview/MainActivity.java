package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.gridview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String[] flowerName = {"Icaro","Murilo","Luis","Leo e seu cachorro",
        "Jamal","Iuri","Gragas","Gili;-;Pereira","IcaroAgain","BTSdefault"};
        int[] flowerImages = {R.drawable.joao,R.drawable.murilo,R.drawable.luis,R.drawable.leo,R.drawable.jamal,R.drawable.iuri,R.drawable.gragas,
                R.drawable.gili,R.drawable.caro,R.drawable.bts};

        GridAdapter gridAdapter = new GridAdapter(MainActivity.this,flowerName,flowerImages);
        binding.gridView.setAdapter(gridAdapter);


        binding.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this,"You Clicked on "+ flowerName[position],Toast.LENGTH_SHORT).show();

            }
        });

    }
}