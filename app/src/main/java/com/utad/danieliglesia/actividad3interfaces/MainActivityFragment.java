package com.utad.danieliglesia.actividad3interfaces;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private Button nextButton, backButton;
    FragmentListener1 listener1;
    FragmentEvents1 events1;

    public void setListener(FragmentListener1 listener1) {
        this.listener1 = listener1;
    }

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        this.setListener(listener1);
        events1=new FragmentEvents1(this);

        nextButton=v.findViewById(R.id.nextButton);
        nextButton.setOnClickListener(events1);

        backButton=v.findViewById(R.id.backButton);
        backButton.setOnClickListener(events1);

        return v;
    }
}
class FragmentEvents1 implements View.OnClickListener{
    MainActivityFragment mainActivityFragment;

    public FragmentEvents1(MainActivityFragment mainActivityFragment) {
        this.mainActivityFragment = mainActivityFragment;
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.nextButton){
            if (this.mainActivityFragment.listener1!=null);
            this.mainActivityFragment.listener1.OnSiguienteClicked();
        }else if (v.getId()==R.id.backButton){
            if (this.mainActivityFragment.listener1!=null);
            this.mainActivityFragment.listener1.OnAnteriorClicked();
        }
    }
}

