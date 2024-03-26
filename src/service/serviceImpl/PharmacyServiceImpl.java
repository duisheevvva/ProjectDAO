package service.serviceImpl;

import dao.PharmacyDao;
import dao.daoImpl.PharmacyDaoImpl;
import model.Pharmacy;
import service.PharmacyService;

import java.util.List;

public class PharmacyServiceImpl implements PharmacyService {

    PharmacyDao pharmacyDao = new PharmacyDaoImpl();
    @Override
    public String savePharmacy(Pharmacy pharmacy) {
        return pharmacyDao.savePharmacy(pharmacy);
    }

    @Override
    public List<Pharmacy> getAllPharmacy() {
        return pharmacyDao.getAllPharmacy();
    }

    @Override
    public Pharmacy gertByIdPharmacy(Long pharmacyId) {
        return pharmacyDao.gertByIdPharmacy(pharmacyId);
    }

    @Override
    public String updatePharmacyById(Long pharmacyId, Pharmacy newPharmacy) {
        return pharmacyDao.updatePharmacyById(pharmacyId,newPharmacy);
    }

    @Override
    public String deletePharmacyById(Long pharmacyId) {
        return pharmacyDao.deletePharmacyById(pharmacyId);
    }
}
