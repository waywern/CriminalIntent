package com.waywern.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by slisovtsov on 9/15/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }


}
