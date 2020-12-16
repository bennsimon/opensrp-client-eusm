package org.smartregister.eusm.activity;

import androidx.annotation.NonNull;

import org.smartregister.eusm.R;
import org.smartregister.eusm.fragment.EusmAvailableOfflineMapsFragment;
import org.smartregister.tasking.activity.OfflineMapsActivity;
import org.smartregister.tasking.fragment.AvailableOfflineMapsFragment;

public class EusmOfflineMapsActivity extends OfflineMapsActivity {

    @NonNull
    @Override
    public String getMapStyleAssetPath() {
        return getString(R.string.reveal_offline_map_download_style);
    }

    @Override
    protected AvailableOfflineMapsFragment getAvailableOfflineMapsFragment() {
        return EusmAvailableOfflineMapsFragment.newInstance(this.getIntent().getExtras(), this.getMapStyleAssetPath());
    }
}
