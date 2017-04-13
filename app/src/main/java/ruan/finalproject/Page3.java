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

public class Page3 extends Fragment implements View.OnClickListener {
    RadioButton q3a3;
    Button btn3;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_page3, container, false);
        rootView.findViewById(R.id.q3a1).setOnClickListener(this);
        rootView.findViewById(R.id.q3a2).setOnClickListener(this);
        rootView.findViewById(R.id.q3a3).setOnClickListener( this);
        return rootView;
    }

@Override
public void onClick(View view) {
    boolean checked = ((RadioButton) view).isChecked();
    WrongDialog dialog= new WrongDialog();
    CustomDialog d= new CustomDialog();
    switch (view.getId()) {
        case R.id.q3a1:
            Toast.makeText(getActivity(), "Pacific is Incorrect", Toast.LENGTH_SHORT).show();
            dialog.show(getFragmentManager(),"WrongDialog");
            Toast.makeText(getActivity(), "Try Again", Toast.LENGTH_SHORT).show();
            break;
        case R.id.q3a2:
            Toast.makeText(getActivity(), "Atlantic is Incorrect", Toast.LENGTH_SHORT).show();
            dialog.show(getFragmentManager(),"WrongDialog");
            Toast.makeText(getActivity(), "Try Again", Toast.LENGTH_SHORT).show();
            break;
        case R.id.q3a3:
            Toast.makeText(getActivity(), "Arctic is Correct", Toast.LENGTH_SHORT).show();
            d.show(getFragmentManager(),"CustomDialog");
            Toast.makeText(getActivity(), "Go to Next Question", Toast.LENGTH_SHORT).show();
            break;
    }
}

}
