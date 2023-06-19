package edu.mehmed.movieproject.repository;

import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import edu.mehmed.movieproject.entity.MovieDetails;
import edu.mehmed.movieproject.entity.MovieSchedule;
import edu.mehmed.movieproject.entity.TheatreInfo;
import edu.mehmed.movieproject.entity.TicketsBooked;


@org.springframework.stereotype.Repository
public class Repository {

	@Autowired
	private SessionFactory sessionFactory;

	public void saveTheatreDetails(TheatreInfo info) {
		Session session = sessionFactory.openSession();
		try {
			Transaction transaction = session.beginTransaction();
			session.merge(info);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void saveMovieDetails(MovieDetails movie) {
		Session session = sessionFactory.openSession();
		try {
			Transaction transaction = session.beginTransaction();
			session.merge(movie);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void saveMovieSchedule(MovieSchedule schedule) {
		Session session = sessionFactory.openSession();
		try {
			Transaction transaction = session.beginTransaction();
			session.merge(schedule);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	public void saveTicketsBooked(TicketsBooked booked) {
		Session session = sessionFactory.openSession();
		try {
			Transaction transaction = session.beginTransaction();
			session.merge(booked);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public List<TheatreInfo> findAllTheatreInfo() {
		Session session = sessionFactory.openSession();
		try {
			String query = "from TheatreInfo";
			Query createQuery = session.createQuery(query);
			createQuery.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.EMPTY_LIST;

	}
}
