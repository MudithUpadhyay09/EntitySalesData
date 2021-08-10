package com.api.entitysalesdata.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.api.entitysalesdata.constant.EntitySalesDataConstant;
import com.api.entitysalesdata.entities.EntitySalesData;
import com.api.entitysalesdata.response.EntitySalesDataResponse;
import com.api.entitysalesdata.service.EntitySalesDataService;


/**
*  Processing Entity Sales Data Record
* This controller will perform create, update and 
* retrieval operations on the Entity Sales Data
*
*/
@RestController
public class EntitySalesDataController {
	@Autowired
	private EntitySalesDataService entitySalesDataService;
	
	/**
	 * Retrieves All Entity Sales Data Record
	 * @return All Entity Sales Data Record Response
	 */
	
	@GetMapping(EntitySalesDataConstant.ENTITY_SALES_DATA_GET_ALL_API_PATH)
	public List<EntitySalesData> getEntitySalesData(){
		return entitySalesDataService.getEntitySalesData();
	}
	
	/**
	 * Retrieves All Entity Sales Data For The Given Id
	 * @param Long Id
	 * @return All Entity Sales Data Response By Id
	 */
	
	@GetMapping(EntitySalesDataConstant.ENTITY_SALES_DATA_GET_API_PATH)
	public ResponseEntity<EntitySalesData> getEntitySalesDataById(@PathVariable("id")Long id){
		return new ResponseEntity<>(entitySalesDataService.getEntitySalesDataById(id),HttpStatus.OK);
	}
	
	/**
	 * Creates/updates Entity Sales Data
	 * @param entitySalesData
	 * @return Entity Sales Data
	 */
	
	@PostMapping (EntitySalesDataConstant.ENTITY_SALES_DATA_UPDATE_API_PATH)
	public ResponseEntity<EntitySalesDataResponse> addEntitySalesData(@RequestBody EntitySalesData entitySalesData){
		return new ResponseEntity<>(entitySalesDataService.addEntitySalesData(entitySalesData),HttpStatus.OK);
	}
}