package dao;

import model.Pharmacy;

import java.util.List;

public interface PharmacyDao {
    String savePharmacy(Pharmacy pharmacy);

    List<Pharmacy> getAllPharmacy();

    Pharmacy gertByIdPharmacy(Long pharmacyId);

    String updatePharmacyById(Long pharmacyId, Pharmacy newPharmacy);

    String deletePharmacyById(Long pharmacyId);
}
