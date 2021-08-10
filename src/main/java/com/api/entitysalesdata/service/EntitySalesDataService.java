package com.api.entitysalesdata.service;
import java.util.List;

import com.api.entitysalesdata.entities.EntitySalesData;
import com.api.entitysalesdata.response.EntitySalesDataResponse;
/**
 * This is an interface for CRUD operations
 * of the Entity Sales Data
 *
 */
public interface EntitySalesDataService {
	
	/**
	 * Retrieves All Entity Sales Data Record
	 * @return All Entity Sales Data Record Response
	 */
	List<EntitySalesData> getEntitySalesData();
	
	/**
	 * Retrieves All Entity Sales Data For The Given Id
	 * @param Long Id
	 * @return All Entity Sales Data Response By Id
	 */

	EntitySalesData getEntitySalesDataById(Long id);
	
	/**
	 * Creates/updates Entity Sales Data
	 * @param entitySalesData
	 * @return Entity Sales Data
	 */
	
	EntitySalesDataResponse addEntitySalesData(EntitySalesData entitySalesData);

}
