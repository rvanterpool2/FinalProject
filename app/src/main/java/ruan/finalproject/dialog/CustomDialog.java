package ruan.finalproject.dialog;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import ruan.finalproject.R;

/**
 * Created by Ruan on 2/15/2017.
 */

public class CustomDialog extends DialogFragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.custom_dialog, null);
        rootView.findViewById(R.id.dialog_ok2).setOnClickListener(this);
        return rootView;
    }


    @Override
    public void onClick(View v) {
        boolean checked = ((RadioButton) v).isChecked();
        switch (v.getId()) {
            case R.id.dialog_ok2:
                dismiss();
                break;
        }
    }
}