/**
 *
 */
package com.etourtravelb2b.core.comingsoon.service;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import javax.annotation.Resource;

import com.etourtravelb2b.core.comingsoon.dao.ComingSoonDao;


/**
 * @author GJANNU
 *
 */
public class ComingSoonService
{
	@Resource(name = "comingSoonDao")
	private ComingSoonDao comingSoonDao;

	@Resource(name = "modelService")
	private ModelService modelService;

	public List<ProductModel> productreturnedlist()
	{
		final List<ProductModel> listproducts = comingSoonDao.findcomingsoonproduct();
		return listproducts;
	}
}
