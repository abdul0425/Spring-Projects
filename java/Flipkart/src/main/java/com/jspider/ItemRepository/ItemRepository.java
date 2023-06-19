package com.jspider.ItemRepository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.jspider.ItemEntity.Item;
import com.jspider.Utility.Resource;

public class ItemRepository {

	public void saveItemDetails(Item item) {
		try {
			SessionFactory sessionFactory = Resource.sessionFactoryObject();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(item);
			transaction.commit();
		} catch (Exception e) {
		}
	}

	public Item findByItemId(long id) {
		SessionFactory sessionFactory = Resource.sessionFactoryObject();
		Session session = sessionFactory.openSession();
		return session.get(Item.class, id);
	}

	public void updateItemById(long id) {

	}

	public void deleteItemById(long id) {

	}
}
