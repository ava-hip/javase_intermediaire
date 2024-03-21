package fr.dawan.di.good;

public class ContactService {
    private ContactDao dao;

    // 1. Injection de dépendance via constructeur
    public ContactService(ContactDao dao) {
        this.dao = dao;
    }


    public Contact findById(int id) {
        return dao.findById(id);
    }

    // 2. Injection de dépendance via les paramètres de la méthode
    public ContactService() {
    }

    public Contact findById(int id, ContactDao dao) {
        return dao.findById(id);
    }

    // 3. Injection de dépendance via le setter

    public void setDao(ContactDao dao) {
        this.dao = dao;
    }
}