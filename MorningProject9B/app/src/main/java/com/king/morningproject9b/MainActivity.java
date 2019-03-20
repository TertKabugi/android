package com.king.morningproject9b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

ListView list;
ArrayList<Item> users;
CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        users = new ArrayList();
        adapter = new CustomAdapter(this,users);
        list = findViewById(R.id.listWatu);
        Item person = new Item("King","0792756566",R.drawable.kenya);
        Item person1 = new Item("Seffu","0784523174",R.drawable.kenya);
        Item person2 = new Item("Nelly","0792756586",R.drawable.kenya);
        Item person3 = new Item("Clare","0792546566",R.drawable.kenya);
        Item person4 = new Item("John","0792706566",R.drawable.kenya);
        Item person5 = new Item("Sam","0792256566",R.drawable.kenya);
        Item person6 = new Item("Andy","0792356566",R.drawable.kenya);
        Item person7 = new Item("Willy","0792778566",R.drawable.kenya);
        Item person8 = new Item("ME","0784756566",R.drawable.kenya);
        Item person9 = new Item("Ray","0792700566",R.drawable.kenya);
        Item person10 = new Item("Agevi","0792709566",R.drawable.kenya);
        users.add(person);
        users.add(person1);
        users.add(person2);
        users.add(person3);
        users.add(person4);
        users.add(person5);
        users.add(person6);
        users.add(person7);
        users.add(person8);
        users.add(person9);
        users.add(person10);

        list.setAdapter(adapter);
    }
}
