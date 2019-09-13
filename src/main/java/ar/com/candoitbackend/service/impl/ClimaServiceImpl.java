package ar.com.candoitbackend.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.candoitbackend.dao.IClimaDAO;
import ar.com.candoitbackend.domain.Clima;
import ar.com.candoitbackend.dto.ClimaDTO;
import ar.com.candoitbackend.service.IClimaService;

@Service
public class ClimaServiceImpl implements IClimaService {

	@Autowired
	private IClimaDAO climaDao;
	
	@Autowired
    private DozerBeanMapper mapper;

	@Override
	public List<ClimaDTO> filtrarBuenosAires(List<ClimaDTO> climaList){
		List<ClimaDTO> climasFiltrados = new ArrayList<>();
		if(!climaList.isEmpty()){
			for(int i = 0 ; i < climaList.size() ; i++){
				if(climaList.get(i).getProvince().equalsIgnoreCase("Buenos Aires")){
					climasFiltrados.add(climaList.get(i));
				}
			}
			for(int i = 0 ; i < climasFiltrados.size() ; i++){
		         switch(climasFiltrados.get(i).getWeather().getDescription()){
		           case "Despejado": climasFiltrados.get(i).setTipoClima("sol"); break;
		           case "Algo nublado": climasFiltrados.get(i).setTipoClima("nube"); break;
		           case "Parcialmente nublado": climasFiltrados.get(i).setTipoClima("nube"); break;
		           case "Nublado": climasFiltrados.get(i).setTipoClima("nublado"); break;
		           case "Cubierto": climasFiltrados.get(i).setTipoClima("nublado"); break;
		           case "Despejado con neblina": climasFiltrados.get(i).setTipoClima("sol"); break;
		           default: climasFiltrados.get(i).setTipoClima("sol"); break;
		         }
	       }
		}
		return climasFiltrados;
	}
	
	@Override
	public void guardarClima(List<ClimaDTO> climaList){
		for(int i = 0 ; i < climaList.size(); i++){
			Clima nuevoClima = new Clima();
			mapper.map(climaList.get(i), nuevoClima);
			climaDao.save(nuevoClima);
		}
	}

}
