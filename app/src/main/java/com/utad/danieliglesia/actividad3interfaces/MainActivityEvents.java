package com.utad.danieliglesia.actividad3interfaces;

import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

/**
 * Created by daniel.iglesia on 09/01/2018.
 */

public class MainActivityEvents implements FragmentListener1, FragmentListener2, FragmentListener3, FragmentListener4, View.OnClickListener {
    MainActivity mainActivity;
    public MainActivityEvents(MainActivity mainActivity){
        this.mainActivity=mainActivity;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.fab) {
            FragmentTransaction transition = mainActivity.getSupportFragmentManager().beginTransaction();
            transition.show(mainActivity.fragment4);
            transition.hide(mainActivity.fragment2);
            transition.hide(mainActivity.fragment3);
            transition.hide(mainActivity.mainActivityFragment);

            transition.commit();
        }
    }

    @Override
    public void OnSiguienteClicked() {
        FragmentTransaction transition = mainActivity.getSupportFragmentManager().beginTransaction();
        transition.show(mainActivity.fragment2);
        transition.hide(mainActivity.mainActivityFragment);
        transition.hide(mainActivity.fragment3);
        transition.commit();
    }

    @Override
    public void OnAnteriorClicked() {
        FragmentTransaction transition = mainActivity.getSupportFragmentManager().beginTransaction();
        transition.show(mainActivity.fragment3);
        transition.hide(mainActivity.mainActivityFragment);
        transition.hide(mainActivity.fragment2);
        transition.commit();
    }

    @Override
    public void OnSiguienteClicked2() {
        FragmentTransaction transition = mainActivity.getSupportFragmentManager().beginTransaction();
        transition.show(mainActivity.fragment3);
        transition.hide(mainActivity.mainActivityFragment);
        transition.hide(mainActivity.fragment2);
        transition.commit();
    }

    @Override
    public void OnAnteriorClicked2() {
        FragmentTransaction transition = mainActivity.getSupportFragmentManager().beginTransaction();
        transition.show(mainActivity.mainActivityFragment);
        transition.hide(mainActivity.fragment3);
        transition.hide(mainActivity.fragment2);
        transition.commit();
    }

    @Override
    public void OnSiguienteClicked3() {
        FragmentTransaction transition = mainActivity.getSupportFragmentManager().beginTransaction();
        transition.show(mainActivity.mainActivityFragment);
        transition.hide(mainActivity.fragment3);
        transition.hide(mainActivity.fragment2);
        transition.commit();

    }

    @Override
    public void OnAnteriorClicked3() {
        FragmentTransaction transition = mainActivity.getSupportFragmentManager().beginTransaction();
        transition.show(mainActivity.fragment2);
        transition.hide(mainActivity.mainActivityFragment);
        transition.hide(mainActivity.fragment3);
        transition.commit();

    }

    @Override
    public void OnAnteriorClicked4() {
        FragmentTransaction transition = mainActivity.getSupportFragmentManager().beginTransaction();
        transition.show(mainActivity.mainActivityFragment);
        transition.hide(mainActivity.fragment2);
        transition.hide(mainActivity.fragment3);
        transition.hide(mainActivity.fragment4);
        transition.commit();
    }
}
