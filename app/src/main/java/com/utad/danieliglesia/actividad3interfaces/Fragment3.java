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
public class Fragment3 extends Fragment {
    private Button nextButton, backButton;
    FragmentListener3 listener3;
    FragmentEvents3 events3;

    public void setListener(FragmentListener3 listener3) {
        this.listener3 = listener3;
    }

    public Fragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View v = inflater.inflate(R.layout.fragment_fragment3, container, false);

        this.setListener(listener3);
        events3=new FragmentEvents3(this);

        nextButton=v.findViewById(R.id.nextButton);
        nextButton.setOnClickListener(events3);

        backButton=v.findViewById(R.id.backButton);
        backButton.setOnClickListener(events3);

        return v;
    }

}
class FragmentEvents3 implements View.OnClickListener{
        Fragment3 fragment3;

public FragmentEvents3 (Fragment3 fragment3) {
        this.fragment3 = fragment3;
        }

@Override
public void onClick(View v) {
        if (v.getId()==R.id.nextButton){
        if (this.fragment3.listener3!=null);
        this.fragment3.listener3.OnSiguienteClicked3();
        }else if (v.getId()==R.id.backButton){
        if (this.fragment3.listener3!=null);
        this.fragment3.listener3.OnAnteriorClicked3();
        }
        }
}
