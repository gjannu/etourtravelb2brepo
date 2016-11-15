/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Oct 25, 2016 12:40:42 PM                    ---
 * ----------------------------------------------------------------
 */
package com.etourtravelb2b.core.jalo;

import com.etourtravelb2b.core.constants.Etourtravelb2bCoreConstants;
import com.etourtravelb2b.core.jalo.ApparelProduct;
import com.etourtravelb2b.core.jalo.ApparelSizeVariantProduct;
import com.etourtravelb2b.core.jalo.ApparelStyleVariantProduct;
import com.etourtravelb2b.core.jalo.ElectronicsColorVariantProduct;
import com.etourtravelb2b.core.jalo.Etourtravelb2bDaysVariantProduct;
import com.etourtravelb2b.jalo.ProductQuantityThresholdFreeGiftPromotion;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>Etourtravelb2bCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEtourtravelb2bCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("comingSoon", AttributeMode.INITIAL);
		tmp.put("productRating", AttributeMode.INITIAL);
		tmp.put("productCustomerSatisfaction", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("contactNumber", AttributeMode.INITIAL);
		tmp.put("currentLocation", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.comingSoon</code> attribute.
	 * @return the comingSoon - Coming Soon Products
	 */
	public Boolean isComingSoon(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, Etourtravelb2bCoreConstants.Attributes.Product.COMINGSOON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.comingSoon</code> attribute.
	 * @return the comingSoon - Coming Soon Products
	 */
	public Boolean isComingSoon(final Product item)
	{
		return isComingSoon( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.comingSoon</code> attribute. 
	 * @return the comingSoon - Coming Soon Products
	 */
	public boolean isComingSoonAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isComingSoon( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.comingSoon</code> attribute. 
	 * @return the comingSoon - Coming Soon Products
	 */
	public boolean isComingSoonAsPrimitive(final Product item)
	{
		return isComingSoonAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.comingSoon</code> attribute. 
	 * @param value the comingSoon - Coming Soon Products
	 */
	public void setComingSoon(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, Etourtravelb2bCoreConstants.Attributes.Product.COMINGSOON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.comingSoon</code> attribute. 
	 * @param value the comingSoon - Coming Soon Products
	 */
	public void setComingSoon(final Product item, final Boolean value)
	{
		setComingSoon( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.comingSoon</code> attribute. 
	 * @param value the comingSoon - Coming Soon Products
	 */
	public void setComingSoon(final SessionContext ctx, final Product item, final boolean value)
	{
		setComingSoon( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.comingSoon</code> attribute. 
	 * @param value the comingSoon - Coming Soon Products
	 */
	public void setComingSoon(final Product item, final boolean value)
	{
		setComingSoon( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.contactNumber</code> attribute.
	 * @return the contactNumber
	 */
	public String getContactNumber(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, Etourtravelb2bCoreConstants.Attributes.Customer.CONTACTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.contactNumber</code> attribute.
	 * @return the contactNumber
	 */
	public String getContactNumber(final Customer item)
	{
		return getContactNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.contactNumber</code> attribute. 
	 * @param value the contactNumber
	 */
	public void setContactNumber(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, Etourtravelb2bCoreConstants.Attributes.Customer.CONTACTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.contactNumber</code> attribute. 
	 * @param value the contactNumber
	 */
	public void setContactNumber(final Customer item, final String value)
	{
		setContactNumber( getSession().getSessionContext(), item, value );
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Etourtravelb2bCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Etourtravelb2bCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Etourtravelb2bCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Etourtravelb2bCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public Etourtravelb2bDaysVariantProduct createEtourtravelb2bDaysVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Etourtravelb2bCoreConstants.TC.ETOURTRAVELB2BDAYSVARIANTPRODUCT );
			return (Etourtravelb2bDaysVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Etourtravelb2bDaysVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public Etourtravelb2bDaysVariantProduct createEtourtravelb2bDaysVariantProduct(final Map attributeValues)
	{
		return createEtourtravelb2bDaysVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductQuantityThresholdFreeGiftPromotion createProductQuantityThresholdFreeGiftPromotion(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Etourtravelb2bCoreConstants.TC.PRODUCTQUANTITYTHRESHOLDFREEGIFTPROMOTION );
			return (ProductQuantityThresholdFreeGiftPromotion)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductQuantityThresholdFreeGiftPromotion : "+e.getMessage(), 0 );
		}
	}
	
	public ProductQuantityThresholdFreeGiftPromotion createProductQuantityThresholdFreeGiftPromotion(final Map attributeValues)
	{
		return createProductQuantityThresholdFreeGiftPromotion( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.currentLocation</code> attribute.
	 * @return the currentLocation
	 */
	public String getCurrentLocation(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, Etourtravelb2bCoreConstants.Attributes.Customer.CURRENTLOCATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.currentLocation</code> attribute.
	 * @return the currentLocation
	 */
	public String getCurrentLocation(final Customer item)
	{
		return getCurrentLocation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.currentLocation</code> attribute. 
	 * @param value the currentLocation
	 */
	public void setCurrentLocation(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, Etourtravelb2bCoreConstants.Attributes.Customer.CURRENTLOCATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.currentLocation</code> attribute. 
	 * @param value the currentLocation
	 */
	public void setCurrentLocation(final Customer item, final String value)
	{
		setCurrentLocation( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return Etourtravelb2bCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productCustomerSatisfaction</code> attribute.
	 * @return the productCustomerSatisfaction - Customer Satisfaction of  the travel.
	 */
	public String getProductCustomerSatisfaction(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, Etourtravelb2bCoreConstants.Attributes.Product.PRODUCTCUSTOMERSATISFACTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productCustomerSatisfaction</code> attribute.
	 * @return the productCustomerSatisfaction - Customer Satisfaction of  the travel.
	 */
	public String getProductCustomerSatisfaction(final Product item)
	{
		return getProductCustomerSatisfaction( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productCustomerSatisfaction</code> attribute. 
	 * @param value the productCustomerSatisfaction - Customer Satisfaction of  the travel.
	 */
	public void setProductCustomerSatisfaction(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, Etourtravelb2bCoreConstants.Attributes.Product.PRODUCTCUSTOMERSATISFACTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productCustomerSatisfaction</code> attribute. 
	 * @param value the productCustomerSatisfaction - Customer Satisfaction of  the travel.
	 */
	public void setProductCustomerSatisfaction(final Product item, final String value)
	{
		setProductCustomerSatisfaction( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productRating</code> attribute.
	 * @return the productRating - Customer Rating of  the travel.
	 */
	public String getProductRating(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, Etourtravelb2bCoreConstants.Attributes.Product.PRODUCTRATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productRating</code> attribute.
	 * @return the productRating - Customer Rating of  the travel.
	 */
	public String getProductRating(final Product item)
	{
		return getProductRating( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productRating</code> attribute. 
	 * @param value the productRating - Customer Rating of  the travel.
	 */
	public void setProductRating(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, Etourtravelb2bCoreConstants.Attributes.Product.PRODUCTRATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productRating</code> attribute. 
	 * @param value the productRating - Customer Rating of  the travel.
	 */
	public void setProductRating(final Product item, final String value)
	{
		setProductRating( getSession().getSessionContext(), item, value );
	}
	
}
