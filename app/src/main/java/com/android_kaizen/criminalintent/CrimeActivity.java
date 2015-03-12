package com.android_kaizen.criminalintent;

import android.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.android_kaizen.criminalintent.fragment.CrimeFragment;


public class CrimeActivity extends SingleFragmentActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_fragment);
//
//
//        Fragment fragment = getFragmentManager().findFragmentById(R.id.fragmentContainer);
//        if (fragment == null) {
//            fragment = new CrimeFragment();
//            getFragmentManager().beginTransaction()
//                    .replace(R.id.fragmentContainer, fragment)
//                    .commit();
//        }
//
//    }




    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
