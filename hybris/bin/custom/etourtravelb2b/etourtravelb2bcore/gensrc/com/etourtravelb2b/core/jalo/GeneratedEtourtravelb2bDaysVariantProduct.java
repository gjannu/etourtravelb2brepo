/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Oct 25, 2016 12:40:42 PM                    ---
 * ----------------------------------------------------------------
 */
package com.etourtravelb2b.core.jalo;

import com.etourtravelb2b.core.constants.Etourtravelb2bCoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.variants.jalo.VariantProduct;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.etourtravelb2b.core.jalo.Etourtravelb2bDaysVariantProduct Etourtravelb2bDaysVariantProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEtourtravelb2bDaysVariantProduct extends VariantProduct
{
	/** Qualifier of the <code>Etourtravelb2bDaysVariantProduct.days</code> attribute **/
	public static final String DAYS = "days";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(VariantProduct.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DAYS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Etourtravelb2bDaysVariantProduct.days</code> attribute.
	 * @return the days - No of Days the travel.
	 */
	public String getDays(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedEtourtravelb2bDaysVariantProduct.getDays requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Etourtravelb2bDaysVariantProduct.days</code> attribute.
	 * @return the days - No of Days the travel.
	 */
	public String getDays()
	{
		return getDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Etourtravelb2bDaysVariantProduct.days</code> attribute. 
	 * @return the localized days - No of Days the travel.
	 */
	public Map<Language,String> getAllDays(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DAYS,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Etourtravelb2bDaysVariantProduct.days</code> attribute. 
	 * @return the localized days - No of Days the travel.
	 */
	public Map<Language,String> getAllDays()
	{
		return getAllDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Etourtravelb2bDaysVariantProduct.days</code> attribute. 
	 * @param value the days - No of Days the travel.
	 */
	public void setDays(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedEtourtravelb2bDaysVariantProduct.setDays requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Etourtravelb2bDaysVariantProduct.days</code> attribute. 
	 * @param value the days - No of Days the travel.
	 */
	public void setDays(final String value)
	{
		setDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Etourtravelb2bDaysVariantProduct.days</code> attribute. 
	 * @param value the days - No of Days the travel.
	 */
	public void setAllDays(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Etourtravelb2bDaysVariantProduct.days</code> attribute. 
	 * @param value the days - No of Days the travel.
	 */
	public void setAllDays(final Map<Language,String> value)
	{
		setAllDays( getSession().getSessionContext(), value );
	}
	
}
