package repository;

import java.util.List;

public interface BaseRepository <T>{

List <T> findAll();
	
	T findByld(int id);
	
     void adiciona(T objeto);
}
