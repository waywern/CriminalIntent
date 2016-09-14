package com.waywern.criminalintent;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

/**
 * Created by slisovtsov on 9/14/2016.
 */
public class CrimeFragment extends Fragment {

    private Crime mCrime;
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mSolved;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime, parent, false);
        mTitleField = (EditText)v.findViewById(R.id.crime_title);

        mTitleField.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence c, int start, int before, int count) {
                mCrime.setmTitle(c.toString());
            }
            public void beforeTextChanged(CharSequence c, int start, int count, int after) {
// This space intentionally left blank
            }
            public void afterTextChanged(Editable c) {
// This one too
            }
        });

        mDateButton = (Button)v.findViewById(R.id.crime_date);
        android.text.format.DateFormat df = new android.text.format.DateFormat();
        CharSequence Date_Formatted = df.format("yyyy-MM-dd", mCrime.getmDate());
        mDateButton.setText(Date_Formatted);
        mDateButton.setEnabled(false);

        mSolved = (CheckBox) v.findViewById(R.id.checkBox);
        mSolved.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mCrime.setmSolved(isChecked);
            }
        });

        return v;
    }
}
