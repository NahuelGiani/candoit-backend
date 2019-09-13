package ar.com.candoitbackend.dao;

import org.springframework.data.repository.CrudRepository;

import ar.com.candoitbackend.domain.Clima;

public interface IClimaDAO extends CrudRepository<Clima, Integer>{
	
}
