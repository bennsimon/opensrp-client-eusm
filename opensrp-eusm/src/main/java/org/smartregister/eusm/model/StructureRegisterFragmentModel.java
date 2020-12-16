package org.smartregister.eusm.model;

import org.smartregister.domain.Location;
import org.smartregister.eusm.application.EusmApplication;
import org.smartregister.eusm.domain.StructureDetail;
import org.smartregister.eusm.repository.AppStructureRepository;
import org.smartregister.tasking.util.PreferencesUtil;
import org.smartregister.tasking.util.Utils;

import java.util.ArrayList;
import java.util.List;

public class StructureRegisterFragmentModel {

    private final AppStructureRepository appStructureRepository;

    public StructureRegisterFragmentModel() {
        appStructureRepository = EusmApplication.getInstance().getStructureRepository();
    }

    public int countOfStructures(String nameFilter) {
        return appStructureRepository.countOfStructures(nameFilter);
    }

    public List<StructureDetail> fetchStructures(int pageNo, String nameFilter) {
        Location location = Utils.getOperationalAreaLocation(PreferencesUtil.getInstance().getCurrentOperationalArea());
        if (location != null) {
            return appStructureRepository.fetchStructureDetails(pageNo, location.getId(), nameFilter);
        } else {
            return new ArrayList<>();
        }
    }
}
