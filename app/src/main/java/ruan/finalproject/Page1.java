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

public class Page1 extends Fragment implements View.OnClickListener {
//    private ListView listView;

    RadioButton q1a2;
    Button btn1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         View rootView = inflater.inflate(R.layout.activity_page1, container, false);


        rootView.findViewById(R.id.q1a1).setOnClickListener(this);
        rootView.findViewById(R.id.q1a2).setOnClickListener(this);
        rootView.findViewById(R.id.q1a3).setOnClickListener( this);
        return rootView;
    }




    @Override
    public void onClick(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        WrongDialog dialog= new WrongDialog();
        CustomDialog d= new CustomDialog();
        switch (view.getId()) {
            case R.id.q1a1:
                Toast.makeText(getActivity(), "Atlanta, GA is Incorrect", Toast.LENGTH_SHORT).show();
                dialog.show(getFragmentManager(),"WrongDialog");
                Toast.makeText(getActivity(), "Try Again", Toast.LENGTH_SHORT).show();
                break;
            case R.id.q1a2:
                Toast.makeText(getActivity(), "Richmond, VA is correct", Toast.LENGTH_SHORT).show();
                d.show(getFragmentManager(),"CustomDialog");
                Toast.makeText(getActivity(), "Go to Next Question", Toast.LENGTH_SHORT).show();
                break;
            case R.id.q1a3:
                Toast.makeText(getActivity(), "Columbia, SC is Incorrect", Toast.LENGTH_SHORT).show();
                dialog.show(getFragmentManager(),"WrongDialog");
                Toast.makeText(getActivity(), "Try Again", Toast.LENGTH_SHORT).show();
                break;
        }


//    String[] menuItems = {"Animation with the use of animator",
//            "RadioGroup(CheckBox)", "Mp3 Player"};
//
//        listView=(ListView)rootView.findViewById(R.id.list_view);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                getActivity(),
//                android.R.layout.simple_list_item_1, menuItems);
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (position == 0) {
//                    Page2 fragment = new Page2();
//                    FragmentManager fragmentManager = getFragmentManager();
//                    fragmentManager.beginTransaction().replace(R.id.container, fragment).commit();
//                    Toast.makeText(getActivity(),"You Clicked Animation  ",Toast.LENGTH_SHORT).show();
//   }
//
//                if (position == 1) {
//                    Toast.makeText(getActivity(),"You Clicked RadioGroup",Toast.LENGTH_SHORT).show();
//
//
////                    Intent intent = new Intent(view.getContext(), Page3.class);
////                    startActivityForResult(intent, 1);
//                }
//                if (position ==2 ) {
//                    Toast.makeText(getActivity(),"You Clicked Mp3Player",Toast.LENGTH_SHORT).show();
//
////                    Intent intent = new Intent(view.getContext(), Page4.class);
////                    startActivityForResult(intent, 2);
//                }
//            }
//
//        });


    }


}




