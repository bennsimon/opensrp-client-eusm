package org.smartregister.eusm.contract;

import org.json.JSONObject;
import org.smartregister.domain.Location;
import org.smartregister.eusm.util.AppJsonFormUtils;
import org.smartregister.tasking.contract.UserLocationContract;
import org.smartregister.tasking.model.BaseTaskDetails;

/**
 * Created by samuelgithengi on 4/18/19.
 */
public interface BaseFormFragmentContract {

    interface Presenter extends UserLocationContract.UserLocationCallback {

        void onStructureFound(Location structure, BaseTaskDetails details);
    }

    interface View extends UserLocationContract.UserLocationView {
        void displayToast(String format);

        AppJsonFormUtils getJsonFormUtils();

        void startForm(JSONObject formJSON);

        void displayError(int title, int message);
    }

    interface Interactor {

    }
}
