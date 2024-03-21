package fr.dawan.di.bad;

public class ContactService {

    public Contact findById(int id) {
        ContactDao dao = new ContactDao(); // Le service dépend de l'implémentation de dépendance
        return dao.findById(id);
    }
}
