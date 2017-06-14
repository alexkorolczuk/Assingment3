package com.derrick.park.criminalmind;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.DatePicker;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by aleksandrakorolczuk1 on 2017-06-13.
 */

public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {


@Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        View v = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_date,null);


    return new AlertDialog.Builder(getActivity()).setView(v).setTitle("Date of th crime").setPositiveButton("OK", null).create();


    }

    public void onDateSet(DatePicker view, int yy, int mm, int dd) {
        populateSetDate(yy, mm+1, dd);
        Calendar calednar = Calendar.getInstance();
        Bundle setDate = this.getArguments();
        Long currDate = setDate.getLong("setDate");
        calednar.setTimeInMillis(currDate);

        int year = calednar.get(Calendar.YEAR);
        int month = calednar.get(Calendar.MONTH);
        int day = calednar.get(Calendar.DAY_OF_MONTH);
        DatePicker.updateDate(year,month,day);

    }
    public void populateSetDate(int year, int month, int day) {
//        DatePicker dp = new DatePicker(getContext(),getActivity());
//        dp.init(year, month, day);
//        dob.setText(month+"/"+day+"/"+year);
    }


}


