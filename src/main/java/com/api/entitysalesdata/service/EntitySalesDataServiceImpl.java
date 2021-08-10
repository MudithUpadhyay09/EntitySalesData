package com.api.entitysalesdata.service;
import java.util.List;
import java.util.Optional;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entitysalesdata.constant.EntitySalesDataConstant;
import com.api.entitysalesdata.entities.EntitySalesData;
import com.api.entitysalesdata.repository.EntitySalesDataRepository;
import com.api.entitysalesdata.response.EntitySalesDataResponse;
/**
 * This is a service class for Entity Sales Data Service interface
 * to implement abstract methods
 * This Class contains all the logical operations
 *
 */
@Service
public class EntitySalesDataServiceImpl implements EntitySalesDataService {

	@Autowired
	EntitySalesDataRepository entitySalesDataRepository;
	
	public EntitySalesDataServiceImpl() {
		
	}
	
	/**
	 * Retrieves All Entity Sales Data 
	 * 
	 */
	
	@Override
	public List<EntitySalesData> getEntitySalesData() {
		
		return entitySalesDataRepository.findAll();
	}
	
	/**
	 * Retrieves Entity Sales Data for the given id
	 * 
	 */
	
	@Override
	public EntitySalesData getEntitySalesDataById(Long id) {
		Optional<EntitySalesData>entitySalesDataList=entitySalesDataRepository.findById(id);
		if (entitySalesDataList.isPresent()) {
			return entitySalesDataList.get();
		}else {
			throw new NoResultException(EntitySalesDataConstant.ENTITY_SALES_DATA_INFO_NOT_FOUND+id);
		}
	}

	
	/**
	 * Creates/updates 
	 * Entity Sales Data
	 */
	@Override
	public EntitySalesDataResponse addEntitySalesData(EntitySalesData entitySalesData) {
		EntitySalesDataResponse entitySalesDataResponse=new EntitySalesDataResponse();
		Long id=entitySalesData.getId();
		if(null==id || null!=getEntitySalesDataById(id)) {
			entitySalesDataRepository.save(entitySalesData);
		}else {
			throw new NoResultException(EntitySalesDataConstant.ENTITY_SALES_DATA_INFO_NOT_FOUND+id);
		}
		entitySalesDataResponse.setId(entitySalesData.getId());
		entitySalesDataResponse.setApplicationEntityId(entitySalesData.getApplicationEntityId());
		entitySalesDataResponse.setResult(EntitySalesDataConstant.ENTITY_SALES_DATA_INFO_UPDATE);
		return entitySalesDataResponse;
		
	}

}
