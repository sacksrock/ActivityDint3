package com.utad.danieliglesia.actividad3interfaces;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    MainActivityFragment mainActivityFragment;
    BlankFragment2 fragment2;
    Fragment3 fragment3;
    Fragment4 fragment4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivityFragment = (MainActivityFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        fragment2 = (BlankFragment2) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        fragment3 = (Fragment3) getSupportFragmentManager().findFragmentById(R.id.fragment3);
        fragment4 = (Fragment4) getSupportFragmentManager().findFragmentById(R.id.fragment4);

        MainActivityEvents mainActivityEvents = new MainActivityEvents(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(mainActivityEvents);

        mainActivityFragment.setListener(mainActivityEvents);
        fragment2.setListener(mainActivityEvents);
        fragment3.setListener(mainActivityEvents);
        fragment4.setListener(mainActivityEvents);

        FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
        transition.show(mainActivityFragment);
        transition.hide(fragment2);
        transition.hide(fragment3);
        transition.hide(fragment4);
        transition.commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void botonClickedSiguiente(View v){
        FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
        transition.show(fragment2);
        transition.hide(mainActivityFragment);
        transition.hide(fragment3);
        transition.commit();
    }
    public void botonClickedAnterior(View v){
        FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
        transition.show(fragment3);
        transition.hide(mainActivityFragment);
        transition.hide(fragment2);
        transition.commit();
    }
}
