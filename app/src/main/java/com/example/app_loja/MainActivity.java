package com.example.app_loja;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Produto> mListProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        mListProduto = new ArrayList<>();
        mListProduto.add(new Produto("Smart-phone", 1800f));
        mListProduto.add(new Produto("Tablet", 3600f));
        mListProduto.add(new Produto("Tv 50", 2100f));

    }
}