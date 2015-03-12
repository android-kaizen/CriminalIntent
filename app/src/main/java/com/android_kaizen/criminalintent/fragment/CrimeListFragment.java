package com.android_kaizen.criminalintent.fragment;

import android.app.ListFragment;
import android.os.Bundle;

import com.android_kaizen.criminalintent.R;
import com.android_kaizen.criminalintent.model.Crime;
import com.android_kaizen.criminalintent.model.CrimeLab;

import java.util.ArrayList;

/**
 * Created by Andy on 13-Mar-15.
 */
public class CrimeListFragment extends ListFragment {

    private ArrayList<Crime> mCrimes;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the Title of the Activity hosting the Fragment
        getActivity().setTitle(R.string.crimes_title);

        // Get the CrimeLab Singleton and the list of crimes
        mCrimes = CrimeLab.get(getActivity()).getCrimes();
    }
}
