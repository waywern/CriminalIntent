package com.waywern.criminalintent;

import android.os.Bundle;
import android.support.v4.app.ListFragment;

import java.util.ArrayList;

/**
 * Created by slisovtsov on 9/15/2016.
 */
public class CrimeListFragment extends ListFragment {
    private ArrayList<Crime> mCrimes;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.crimes_title);
        mCrimes = CrimeLab.get(getActivity()).getmCrimes();
    }
}
