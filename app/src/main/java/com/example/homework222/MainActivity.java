package com.example.homework222;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

//import android.widget.Toolbar;
//import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_open_notes) {
            Toast.makeText(MainActivity.this, "Отркыть записную книжку", Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intentNotes);
            return true;
        }

        if (id == R.id.mutually_exclusive_checkbox) {
            Toast.makeText(MainActivity.this, "Отркыть взаимоисключающие checkbox", Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(MainActivity.this, CheckboxActivity.class);
            startActivity(intentNotes);
            return true;
        }

        if (id == R.id.spinner_country) {
            Toast.makeText(MainActivity.this, "Отркыть Spinner «Страны-города-улицы»", Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(MainActivity.this, SpinnerActivity.class);
            startActivity(intentNotes);
            return true;
        }

        if (id == R.id.calendar) {
            Toast.makeText(MainActivity.this, "Отркыть CalendarView «Сроки задачи»", Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(MainActivity.this, CalendarActivity.class);
            startActivity(intentNotes);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }





}

