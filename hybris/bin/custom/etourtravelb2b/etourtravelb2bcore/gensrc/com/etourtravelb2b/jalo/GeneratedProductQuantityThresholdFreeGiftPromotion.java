/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Oct 25, 2016 12:40:42 PM                    ---
 * ----------------------------------------------------------------
 */
package com.etourtravelb2b.jalo;

import com.etourtravelb2b.core.constants.Etourtravelb2bCoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.promotions.jalo.ProductPromotion;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.etourtravelb2b.jalo.ProductQuantityThresholdFreeGiftPromotion ProductQuantityThresholdFreeGiftPromotion}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedProductQuantityThresholdFreeGiftPromotion extends ProductPromotion
{
	/** Qualifier of the <code>ProductQuantityThresholdFreeGiftPromotion.giftProduct</code> attribute **/
	public static final String GIFTPRODUCT = "giftProduct";
	/** Qualifier of the <code>ProductQuantityThresholdFreeGiftPromotion.qualifyingCount</code> attribute **/
	public static final String QUALIFYINGCOUNT = "qualifyingCount";
	/** Qualifier of the <code>ProductQuantityThresholdFreeGiftPromotion.messageFired</code> attribute **/
	public static final String MESSAGEFIRED = "messageFired";
	/** Qualifier of the <code>ProductQuantityThresholdFreeGiftPromotion.messageCouldHaveFired</code> attribute **/
	public static final String MESSAGECOULDHAVEFIRED = "messageCouldHaveFired";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(ProductPromotion.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(GIFTPRODUCT, AttributeMode.INITIAL);
		tmp.put(QUALIFYINGCOUNT, AttributeMode.INITIAL);
		tmp.put(MESSAGEFIRED, AttributeMode.INITIAL);
		tmp.put(MESSAGECOULDHAVEFIRED, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductQuantityThresholdFreeGiftPromotion.giftProduct</code> attribute.
	 * @return the giftProduct - The partner product.
	 */
	public Product getGiftProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, GIFTPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductQuantityThresholdFreeGiftPromotion.giftProduct</code> attribute.
	 * @return the giftProduct - The partner product.
	 */
	public Product getGiftProduct()
	{
		return getGiftProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductQuantityThresholdFreeGiftPromotion.giftProduct</code> attribute. 
	 * @param value the giftProduct - The partner product.
	 */
	public void setGiftProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, GIFTPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductQuantityThresholdFreeGiftPromotion.giftProduct</code> attribute. 
	 * @param value the giftProduct - The partner product.
	 */
	public void setGiftProduct(final Product value)
	{
		setGiftProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductQuantityThresholdFreeGiftPromotion.messageCouldHaveFired</code> attribute.
	 * @return the messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 */
	public String getMessageCouldHaveFired(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProductQuantityThresholdFreeGiftPromotion.getMessageCouldHaveFired requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, MESSAGECOULDHAVEFIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductQuantityThresholdFreeGiftPromotion.messageCouldHaveFired</code> attribute.
	 * @return the messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 */
	public String getMessageCouldHaveFired()
	{
		return getMessageCouldHaveFired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductQuantityThresholdFreeGiftPromotion.messageCouldHaveFired</code> attribute. 
	 * @return the localized messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 */
	public Map<Language,String> getAllMessageCouldHaveFired(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,MESSAGECOULDHAVEFIRED,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductQuantityThresholdFreeGiftPromotion.messageCouldHaveFired</code> attribute. 
	 * @return the localized messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 */
	public Map<Language,String> getAllMessageCouldHaveFired()
	{
		return getAllMessageCouldHaveFired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductQuantityThresholdFreeGiftPromotion.messageCouldHaveFired</code> attribute. 
	 * @param value the messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 */
	public void setMessageCouldHaveFired(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProductQuantityThresholdFreeGiftPromotion.setMessageCouldHaveFired requires a session language", 0 );
		}
		setLocalizedProperty(ctx, MESSAGECOULDHAVEFIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductQuantityThresholdFreeGiftPromotion.messageCouldHaveFired</code> attribute. 
	 * @param value the messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 */
	public void setMessageCouldHaveFired(final String value)
	{
		setMessageCouldHaveFired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductQuantityThresholdFreeGiftPromotion.messageCouldHaveFired</code> attribute. 
	 * @param value the messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 */
	public void setAllMessageCouldHaveFired(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,MESSAGECOULDHAVEFIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductQuantityThresholdFreeGiftPromotion.messageCouldHaveFired</code> attribute. 
	 * @param value the messageCouldHaveFired - The message to show when the promotion could have potentially fire.
	 */
	public void setAllMessageCouldHaveFired(final Map<Language,String> value)
	{
		setAllMessageCouldHaveFired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductQuantityThresholdFreeGiftPromotion.messageFired</code> attribute.
	 * @return the messageFired - The message to show when the promotion has fired.
	 */
	public String getMessageFired(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProductQuantityThresholdFreeGiftPromotion.getMessageFired requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, MESSAGEFIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductQuantityThresholdFreeGiftPromotion.messageFired</code> attribute.
	 * @return the messageFired - The message to show when the promotion has fired.
	 */
	public String getMessageFired()
	{
		return getMessageFired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductQuantityThresholdFreeGiftPromotion.messageFired</code> attribute. 
	 * @return the localized messageFired - The message to show when the promotion has fired.
	 */
	public Map<Language,String> getAllMessageFired(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,MESSAGEFIRED,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductQuantityThresholdFreeGiftPromotion.messageFired</code> attribute. 
	 * @return the localized messageFired - The message to show when the promotion has fired.
	 */
	public Map<Language,String> getAllMessageFired()
	{
		return getAllMessageFired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductQuantityThresholdFreeGiftPromotion.messageFired</code> attribute. 
	 * @param value the messageFired - The message to show when the promotion has fired.
	 */
	public void setMessageFired(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProductQuantityThresholdFreeGiftPromotion.setMessageFired requires a session language", 0 );
		}
		setLocalizedProperty(ctx, MESSAGEFIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductQuantityThresholdFreeGiftPromotion.messageFired</code> attribute. 
	 * @param value the messageFired - The message to show when the promotion has fired.
	 */
	public void setMessageFired(final String value)
	{
		setMessageFired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductQuantityThresholdFreeGiftPromotion.messageFired</code> attribute. 
	 * @param value the messageFired - The message to show when the promotion has fired.
	 */
	public void setAllMessageFired(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,MESSAGEFIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductQuantityThresholdFreeGiftPromotion.messageFired</code> attribute. 
	 * @param value the messageFired - The message to show when the promotion has fired.
	 */
	public void setAllMessageFired(final Map<Language,String> value)
	{
		setAllMessageFired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductQuantityThresholdFreeGiftPromotion.qualifyingCount</code> attribute.
	 * @return the qualifyingCount - The number of base products required to qualify for the free gift.
	 */
	public Integer getQualifyingCount(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, QUALIFYINGCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductQuantityThresholdFreeGiftPromotion.qualifyingCount</code> attribute.
	 * @return the qualifyingCount - The number of base products required to qualify for the free gift.
	 */
	public Integer getQualifyingCount()
	{
		return getQualifyingCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductQuantityThresholdFreeGiftPromotion.qualifyingCount</code> attribute. 
	 * @return the qualifyingCount - The number of base products required to qualify for the free gift.
	 */
	public int getQualifyingCountAsPrimitive(final SessionContext ctx)
	{
		Integer value = getQualifyingCount( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductQuantityThresholdFreeGiftPromotion.qualifyingCount</code> attribute. 
	 * @return the qualifyingCount - The number of base products required to qualify for the free gift.
	 */
	public int getQualifyingCountAsPrimitive()
	{
		return getQualifyingCountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductQuantityThresholdFreeGiftPromotion.qualifyingCount</code> attribute. 
	 * @param value the qualifyingCount - The number of base products required to qualify for the free gift.
	 */
	public void setQualifyingCount(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, QUALIFYINGCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductQuantityThresholdFreeGiftPromotion.qualifyingCount</code> attribute. 
	 * @param value the qualifyingCount - The number of base products required to qualify for the free gift.
	 */
	public void setQualifyingCount(final Integer value)
	{
		setQualifyingCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductQuantityThresholdFreeGiftPromotion.qualifyingCount</code> attribute. 
	 * @param value the qualifyingCount - The number of base products required to qualify for the free gift.
	 */
	public void setQualifyingCount(final SessionContext ctx, final int value)
	{
		setQualifyingCount( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductQuantityThresholdFreeGiftPromotion.qualifyingCount</code> attribute. 
	 * @param value the qualifyingCount - The number of base products required to qualify for the free gift.
	 */
	public void setQualifyingCount(final int value)
	{
		setQualifyingCount( getSession().getSessionContext(), value );
	}
	
}
