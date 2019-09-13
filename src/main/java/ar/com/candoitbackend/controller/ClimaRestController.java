package ar.com.candoitbackend.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import ar.com.candoitbackend.dto.ClimaDTO;
import ar.com.candoitbackend.service.IClimaService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ClimaRestController {
	
	@Autowired
	private IClimaService climaService;
	
	@Autowired
	private Environment env;
	 
//	@Autowired
//	private Log log;

	@RequestMapping(value = "/clima")
    public @ResponseBody ResponseEntity<List<ClimaDTO>> clima() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		URI uri = new URI(env.getProperty("uri.clima"));
		ResponseEntity<List<ClimaDTO>> response = null;
		List<ClimaDTO> climaList = new ArrayList<>();
		try{
			response = restTemplate.exchange(uri, HttpMethod.GET, null,
				  new ParameterizedTypeReference<List<ClimaDTO>>(){});
			climaList = response.getBody();
		}catch(Exception e){
			System.out.println("Hubo un error al realizar el llamado a la API");
			return new ResponseEntity<List<ClimaDTO>>(climaList, HttpStatus.INTERNAL_SERVER_ERROR);	
//			log.error("Hubo un error al realizar el llamado a la API", e);
		}

		if(climaList != null){
			climaList = climaService.filtrarBuenosAires(climaList);
			climaService.guardarClima(climaList);
		}
		return new ResponseEntity<List<ClimaDTO>>(climaList, HttpStatus.OK);	
    }
}
