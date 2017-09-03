package pl.hibernateTest.author;

import java.util.List;

import org.hibernate.Session;


public class hibernate_test_1 {


    public static void main(String[] args) {
        Session session = hibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Author author = new Author();
        author.setName("Henryk");
        author.setSurname("Sienkiewicz");
        session.save(author);

        List<Author> authors = session.createQuery("from Autor").list();
        for (Author a : authors) {
            System.out.println(a.getId() + "\t" + a.getName() + "\t" + a.getSurname());
        }

        session.getTransaction().commit();

        hibernateUtil.getSessionFactory().close();
    }
}

