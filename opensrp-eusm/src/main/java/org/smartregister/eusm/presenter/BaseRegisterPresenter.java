package org.smartregister.eusm.presenter;

import org.smartregister.eusm.interactor.TaskRegisterInteractor;
import org.smartregister.view.contract.BaseRegisterContract;

import java.util.List;

public class BaseRegisterPresenter implements BaseRegisterContract.Presenter {

   // protected TaskRegisterInteractor taskRegisterInteractor;

    public BaseRegisterPresenter(BaseRegisterContract.View view) {
       // taskRegisterInteractor = new TaskRegisterInteractor(null);
    }

    @Override
    public void registerViewConfigurations(List<String> viewIdentifiers) {
        //taskRegisterInteractor.registerViewConfigurations(viewIdentifiers);
    }

    @Override
    public void unregisterViewConfiguration(List<String> viewIdentifiers) {
       // taskRegisterInteractor.unregisterViewConfiguration(viewIdentifiers);
    }

    @Override
    public void onDestroy(boolean isChangingConfiguration) {
       // taskRegisterInteractor.cleanupResources();
    }

    @Override
    public void updateInitials() {//do nothing
    }
}
