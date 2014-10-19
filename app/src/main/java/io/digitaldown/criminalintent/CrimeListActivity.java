package io.digitaldown.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Eric on 10/10/2014.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
