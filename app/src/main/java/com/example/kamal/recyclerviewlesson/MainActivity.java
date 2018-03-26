package com.example.kamal.recyclerviewlesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    private RecyclerView newsRecyclerView;
    private ArrayList<News> news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newsRecyclerView = findViewById(R.id.ma_news_rv);

        init();

        newsRecyclerView.setAdapter(new NewsAdapter(getApplicationContext(), news));

    }

    private void init(){
        News item1 = new News();
        item1.setId(UUID.randomUUID());
        item1.setTitle("Прилитело НЛО");
        item1.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.");

        News item2 = new News();
        item2.setId(UUID.randomUUID());
        item2.setTitle("1Прилитело НЛО");
        item2.setText("1Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.");

        News item3 = new News();
        item3.setId(UUID.randomUUID());
        item3.setTitle("2Прилитело НЛО");
        item3.setText("2Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.");

        News item4 = new News();
        item4.setId(UUID.randomUUID());
        item4.setTitle("3Прилитело НЛО");
        item4.setText("3Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.");

        news = new ArrayList<>();
        news.add(item1);
        news.add(item2);
        news.add(item3);
        news.add(item4);
    }
}
