/**
 *
 */
package com.etourtravelb2b.facades.populators;

import de.hybris.platform.commercefacades.product.converters.populator.ProductBasicPopulator;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;


/**
 * @author GJANNU
 *
 */
public class Etourtravelb2bProductAttributesPopulator<SOURCE extends ProductModel, TARGET extends ProductData> extends
		ProductBasicPopulator<ProductModel, ProductData>
{

	@Override
	public void populate(final ProductModel source, final ProductData target)
	{
		super.populate(source, target);

		target.setProductRating(source.getProductRating());
		target.setProductCustomerSatisfaction(source.getProductCustomerSatisfaction());

	}
}
