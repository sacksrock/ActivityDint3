package com.utad.danieliglesia.actividad3interfaces;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment2 extends Fragment {
    private Button nextButton, backButton;
    FragmentListener2 listener2;
    FragmentEvents2 events2;

    public void setListener(FragmentListener2 listener2) {
        this.listener2 = listener2;
    }

    public BlankFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
        this.setListener(listener2);
        events2=new FragmentEvents2(this);

        nextButton=v.findViewById(R.id.nextButton);
        nextButton.setOnClickListener(events2);

        backButton=v.findViewById(R.id.backButton);
        backButton.setOnClickListener(events2);

        return v;
    }

}
class FragmentEvents2 implements View.OnClickListener{
    BlankFragment2 fragment2;

    public FragmentEvents2(BlankFragment2 fragment2) {
        this.fragment2 = fragment2;
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.nextButton){
            if (this.fragment2.listener2!=null);
            this.fragment2.listener2.OnSiguienteClicked2();
        }else if (v.getId()==R.id.backButton){
            if (this.fragment2.listener2!=null);
            this.fragment2.listener2.OnAnteriorClicked2();
        }
    }
}