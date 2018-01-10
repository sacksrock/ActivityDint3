package com.utad.danieliglesia.actividad3interfaces;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment4 extends Fragment {
    private TextView txt1;
    private Button backButton;
    FragmentListener4 listener4;
    FragmentEvents4 events4;

    public void setListener(FragmentListener4 listener4) {
        this.listener4 = listener4;
    }

    public Fragment4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment4, container, false);

        this.setListener(listener4);
        events4=new FragmentEvents4(this);

        txt1=v.findViewById(R.id.txt1);

        backButton=v.findViewById(R.id.backButton);
        backButton.setOnClickListener(events4);


        return v;
    }

}
class FragmentEvents4 implements View.OnClickListener{
    Fragment4 fragment4;

    public FragmentEvents4 (Fragment4 fragment4) {
        this.fragment4 = fragment4;
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.backButton){
            if (this.fragment4.listener4!=null);
            this.fragment4.listener4.OnAnteriorClicked4();
        }
    }
}
