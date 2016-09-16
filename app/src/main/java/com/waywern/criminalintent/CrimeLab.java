package com.waywern.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

/**
 * Created by slisovtsov on 9/15/2016.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private Context mAppContext;

    private ArrayList<Crime> mCrimes;

    public CrimeLab(Context AppContext) {
        mAppContext = AppContext;
        mCrimes = new ArrayList<Crime>();
        for(int i=0; i<100; i++) {
            Crime c = new Crime();
            if(i%2 == 0)
                c.setmSolved(true);
            c.setmTitle("Crime #:"+i);
            mCrimes.add(c);
        }
        String nuEtoZheTakProsto;

        String nuEtoZheTakTrudno;

        //nezt
        ArrayList<String> ddfa = new ArrayList<>();
    }

    public static CrimeLab get(Context c) {
        if(sCrimeLab == null)
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        return sCrimeLab;
    }

    public ArrayList<Crime> getmCrimes() {
        return mCrimes;
    }

    public Crime getCrimeUUID(UUID id) {
        for(Crime c: mCrimes) {
            if(c.getmId().equals(id))
                return c;
        }
        return null;
    }
}
