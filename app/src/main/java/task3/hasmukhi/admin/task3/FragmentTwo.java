package task3.hasmukhi.admin.task3;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */

public class FragmentTwo extends Fragment {

    private Button btna;
    private Button btnc;
    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_two, container, false);
        btna=(Button)view.findViewById(R.id.btn_goto_a);
        btnc =(Button)view.findViewById(R.id.btn_goto_c);
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentOne fragmentOne=new FragmentOne();
                FragmentManager fm =getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                //ft.replace(R.id.ll_layout,fragmentOne);
                        //ft.addToBackStack("");
                fm.popBackStack();
                ft.commit();

            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentThree fragmentThree=new FragmentThree();
                FragmentManager fm =getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.ll_layout,fragmentThree);
                ft.addToBackStack("");
                ft.commit();
            }
        });
        return view;
    }

}
