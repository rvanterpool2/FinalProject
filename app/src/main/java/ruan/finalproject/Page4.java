package ruan.finalproject;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import ruan.finalproject.dialog.CustomDialog;
import ruan.finalproject.dialog.WrongDialog;

public class Page4 extends Fragment implements View.OnClickListener {
    RadioButton q4a3;
    Button btn4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_page4, container, false);
        rootView.findViewById(R.id.q4a1).setOnClickListener(this);
        rootView.findViewById(R.id.q4a2).setOnClickListener(this);
        rootView.findViewById(R.id.q4a3).setOnClickListener( this);
        return rootView;
    }

    @Override
    public void onClick(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        WrongDialog dialog= new WrongDialog();
        CustomDialog d= new CustomDialog();
        switch (view.getId()) {
            case R.id.q4a1:
                Toast.makeText(getActivity(), "PEREGRINE FALCON is Correct", Toast.LENGTH_SHORT).show();
                d.show(getFragmentManager(),"CustomDialog");
                Toast.makeText(getActivity(), "Go to Next Question", Toast.LENGTH_SHORT).show();
                break;
            case R.id.q4a2:
                Toast.makeText(getActivity(), "CHEETAH is Incorrect", Toast.LENGTH_SHORT).show();
                dialog.show(getFragmentManager(),"WrongDialog");
                Toast.makeText(getActivity(), "Try Again", Toast.LENGTH_SHORT).show();
                break;
            case R.id.q4a3:
                Toast.makeText(getActivity(), "BROWN HARE is Incorrect", Toast.LENGTH_SHORT).show();
                dialog.show(getFragmentManager(),"WrongDialog");
                Toast.makeText(getActivity(), "Try Again", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
