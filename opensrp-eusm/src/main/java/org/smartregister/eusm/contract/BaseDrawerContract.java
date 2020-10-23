package org.smartregister.eusm.contract;

import android.app.Activity;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.util.Pair;
import androidx.drawerlayout.widget.DrawerLayout;

import org.smartregister.domain.PlanDefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by samuelgithengi on 3/21/19.
 */
public interface BaseDrawerContract {

    interface DrawerActivity {
        void onDrawerClosed();

        Activity getActivity();
    }

    interface View {

        Activity getContext();

        void initializeDrawerLayout();

        String getPlan();

        void setPlan(String campaign);

        String getOperationalArea();

        void setOperationalArea(String operationalArea);

        void setDistrict(String district);

        void setFacility(String facility, String facilityLevel);

        void setOperator();

        void unlockNavigationDrawer();

        void lockNavigationDrawerForSelection();

        void lockNavigationDrawerForSelection(int title, int message);

        void showOperationalAreaSelector(Pair<String, ArrayList<String>> locationHierarchy);

        void showPlanSelector(List<String> campaigns, String entireTreeString);

        void displayNotification(int title, @StringRes int message, Object... formatArgs);

        void openDrawerLayout();

        Presenter getPresenter();

        void onResume();

        void openOfflineMapsView();

        void checkSynced();

        void toggleProgressBarView(boolean syncing);

        @Nullable
        String getManifestVersion();

        DrawerActivity getActivity();
    }

    interface Presenter {

        void onDrawerClosed();

        void onShowOperationalAreaSelector();

        void onOperationalAreaSelectorClicked(ArrayList<String> name);

        void onShowPlanSelector();

        void onPlanSelectorClicked(ArrayList<String> value, ArrayList<String> name);

        void onPlansFetched(Set<PlanDefinition> planDefinitionSet);

        boolean isChangedCurrentSelection();

        void setChangedCurrentSelection(boolean changedCurrentSelection);

        View getView();

        void onViewResumed();

        void onShowOfflineMaps();

        boolean isPlanAndOperationalAreaSelected();

        void onPlanValidated(boolean isValid);

        void updateSyncStatusDisplay(boolean synced);
    }

    interface Interactor {

        void fetchPlans(String jurisdictionName);

        void validateCurrentPlan(String selectedOperationalArea, String currentPlanId);

        void checkSynced();
    }
}
