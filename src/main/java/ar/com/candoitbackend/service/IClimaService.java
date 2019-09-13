package ar.com.candoitbackend.service;

import java.util.List;

import ar.com.candoitbackend.dto.ClimaDTO;


public interface IClimaService {
	
	/**
	 * @Proposito: Filtrar por provincia Buenos aires
	 * @param climaList
	 * @return
	 */
	public List<ClimaDTO> filtrarBuenosAires(List<ClimaDTO> climaList);
	
	/**
	 * @Proposito: Guardar los climas en la base de datos
	 * @param climaList
	 * @return
	 */
	public void guardarClima(List<ClimaDTO> climaList);

}
